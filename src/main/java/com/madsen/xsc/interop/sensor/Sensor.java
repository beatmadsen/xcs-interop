package com.madsen.xsc.interop.sensor;

import java.util.function.Function;

/**
 * Created by erikmadsen on 20/04/2015.
 */
public interface Sensor<T> {

    /**
     * Register a callback on the sensor that will be invoked every time a new observation becomes available.
     * @param callback
     */
    void onNext(Function<T, Void> callback);

}
