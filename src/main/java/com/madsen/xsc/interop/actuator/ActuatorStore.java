package com.madsen.xsc.interop.actuator;

/**
 * Created by erikmadsen on 21/04/2015.
 */
public interface ActuatorStore {

    Actuator lookup(String id);
}
