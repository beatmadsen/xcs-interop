package com.madsen.xsc.interop;

import java.util.List;

/**
 * Created by erikmadsen2 on 20/03/15.
 */
public class ParameterDto {

    public final List<Long> intParams;
    public final List<Double> floatParams;
    public final List<Boolean> boolParams;


    public ParameterDto(List<Long> intParams, List<Double> floatParams, List<Boolean> boolParams) {
        this.intParams = intParams;
        this.floatParams = floatParams;
        this.boolParams = boolParams;
    }
}
