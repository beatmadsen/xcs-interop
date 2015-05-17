package com.madsen.xsc.interop.sensor;

import java.util.Optional;

/**
 * Created by erikmadsen on 20/04/2015.
 */
public interface SensorValueStore {

    <T> Optional<T> latestValueOn(String sensorId);
}
