package com.madsen.xsc.interop.action;

import com.madsen.xsc.interop.ParameterDto;
import com.madsen.xsc.interop.actuator.ActuatorStore;

/**
 * Created by erikmadsen2 on 20/03/15.
 */
public interface Action {

    void execute(ParameterDto parameters, ActuatorStore actuatorStore);
}
