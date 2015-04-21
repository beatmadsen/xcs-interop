package com.madsen.xsc.interop.sensor;

import java.util.Optional;

/**
 * Created by erikmadsen on 20/04/2015.
 */
public interface Sensor<T> {

    /**
     * Get the next reading. Non-blocking.
     * @return
     */
    Optional<T> next();
}
