package com.madsen.xsc.interop.sensor;

/**
 * Created by erikmadsen on 20/04/2015.
 */
public interface SensorValueStore {

    <T> T latestValueOn(String sensorId);
}
