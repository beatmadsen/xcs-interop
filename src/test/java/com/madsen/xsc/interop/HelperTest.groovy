package com.madsen.xsc.interop

import com.madsen.xsc.interop.actuator.Actuator
import com.madsen.xsc.interop.actuator.ActuatorStore
import spock.lang.Specification

/**
 * Created by erikmadsen2 on 22/03/15.
 */
class HelperTest extends Specification {

    def "Evaluate an action"() {
        given:
        def outParams = [:]
        def actuatorStore = Mock(ActuatorStore)
        def abcActuator = Mock(Actuator)

        def actionString = getClass()
                .classLoader
                .getResourceAsStream("MockGroovyAction.groovy")
                .text


        when:
        def action = Helper.evalAction(actionString)

        def inParams = new ParameterDto(
                [1, 2],
                [1.1, 1.2],
                [true, true, false]
        )


        action.execute(inParams, actuatorStore)

        then:
        1 * actuatorStore.lookup("ABC") >> abcActuator
        1 * abcActuator.engage(_) >> { Collection args ->
            def map = args[0] as Map

            outParams << map
        }

        outParams.octopus == "1, 2, 1.1, 1.2, true, true, false"
        outParams.first == [1..16]
    }
}
