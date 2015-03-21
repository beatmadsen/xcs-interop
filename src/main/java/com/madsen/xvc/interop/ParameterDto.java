package com.madsen.xvc.interop;

import java.util.List;

/**
 * Created by erikmadsen2 on 20/03/15.
 */
public class ParameterDto {

    public final List<Integer> intParams;
    public final List<Double> doubleParams;
    public final List<Boolean> boolParams;


    public ParameterDto(List<Integer> intParams, List<Double> doubleParams, List<Boolean> boolParams) {
        this.intParams = intParams;
        this.doubleParams = doubleParams;
        this.boolParams = boolParams;
    }
}
