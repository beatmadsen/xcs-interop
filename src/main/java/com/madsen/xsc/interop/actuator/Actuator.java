package com.madsen.xsc.interop.actuator;

import java.util.Map;

/**
 * Created by erikmadsen on 21/04/2015.
 */
public interface Actuator {

    void engage(Map<String, Object> parameters);
}
