package com.madsen.xsc.interop;

import com.madsen.xsc.interop.action.Action;
import com.madsen.xsc.interop.predicate.Predicate;
import groovy.lang.GroovyClassLoader;

/**
 * Created by erikmadsen2 on 20/03/15.
 */
public final class Helper {

    private static final GroovyClassLoader loader = new GroovyClassLoader(Helper.class.getClassLoader());


    private Helper() {

    }


    @SuppressWarnings("unchecked")
    private static <T> T evalInner(final String groovyObject) {

        try {
            final Class groovyClass = loader.parseClass(groovyObject);
            return (T) groovyClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }


    public static Action evalAction(final String groovyAction) {

        return evalInner(groovyAction);
    }


    public static Predicate evalPredicate(final String groovyPredicate) {

        return evalInner(groovyPredicate);
    }
}
