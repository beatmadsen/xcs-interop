package com.madsen.xsc.interop;

import java.util.List;

/**
 * Created by erikmadsen2 on 20/03/15.
 */
public class ParameterDto {

    private final List<Long> intParams;
    private final List<Double> floatParams;
    private final List<Boolean> boolParams;


    public ParameterDto(List<Long> intParams, List<Double> floatParams, List<Boolean> boolParams) {

        this.intParams = intParams;
        this.floatParams = floatParams;
        this.boolParams = boolParams;
    }


    public List<Long> getIntParams() {

        return intParams;
    }


    public List<Double> getFloatParams() {

        return floatParams;
    }


    public List<Boolean> getBoolParams() {

        return boolParams;
    }
}
