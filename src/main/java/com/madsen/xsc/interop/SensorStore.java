package com.madsen.xsc.interop;

/**
 * Created by erikmadsen on 20/04/2015.
 */
public interface SensorStore {

    <T> Sensor<T> lookup(String id);
}
