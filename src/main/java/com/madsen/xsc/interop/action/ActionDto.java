package com.madsen.xsc.interop.action;

import com.madsen.xsc.interop.ParameterDto;

/**
 * Created by erikmadsen2 on 20/03/15.
 */
public class ActionDto {

    public final long actionId;
    public final ParameterDto parameters;


    public ActionDto(long actionId, ParameterDto parameters) {
        this.actionId = actionId;
        this.parameters = parameters;
    }
}
