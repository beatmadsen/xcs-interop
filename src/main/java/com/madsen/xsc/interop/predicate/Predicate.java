package com.madsen.xsc.interop.predicate;

import com.madsen.xsc.interop.ParameterDto;
import com.madsen.xsc.interop.sensor.SensorValueStore;

/**
 * Created by erikmadsen2 on 20/03/15.
 */
public interface Predicate {

    boolean isMatch(ParameterDto parameters, SensorValueStore sensorValueStore);
}
