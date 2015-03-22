package com.madsen.xsc.interop;

/**
 * Created by erikmadsen2 on 20/03/15.
 */
public class RuleDto {

    public final PredicateDto predicateDto;
    public final ActionDto actionDto;


    public RuleDto(PredicateDto predicateDto, ActionDto actionDto) {
        this.predicateDto = predicateDto;
        this.actionDto = actionDto;
    }
}
