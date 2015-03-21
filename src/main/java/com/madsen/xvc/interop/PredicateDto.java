package com.madsen.xvc.interop;

/**
 * Created by erikmadsen2 on 20/03/15.
 */
public class PredicateDto {

    public final long predicateId;
    public final ParameterDto parameters;


    public PredicateDto(long predicateId, ParameterDto parameters) {
        this.predicateId = predicateId;
        this.parameters = parameters;
    }
}
