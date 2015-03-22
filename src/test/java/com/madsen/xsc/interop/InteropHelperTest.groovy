package com.madsen.xsc.interop

import spock.lang.Specification

/**
 * Created by erikmadsen2 on 22/03/15.
 */
class InteropHelperTest extends Specification {

    def "Evaluate an action"() {
        given:
        def actionString = getClass()
                .classLoader
                .getResourceAsStream("MockGroovyAction.groovy")
                .text

        when:
        def action = InteropHelper.evalAction(actionString)
        action.execute(new ParameterDto(
                [1, 2],
                [1.1, 1.2],
                [true, true, false]
        ))

        then:
        true
    }
}
