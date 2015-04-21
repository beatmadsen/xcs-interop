import com.madsen.xsc.interop.ParameterDto
import com.madsen.xsc.interop.action.Action
import com.madsen.xsc.interop.actuator.ActuatorStore

class MockGroovyAction implements Action {

    @Override
    void execute(final ParameterDto parameters, final ActuatorStore actuatorStore) {

        final s = parameters
                .with { [] + intParams + floatParams + boolParams }
                .join(", ")

        final actuator = actuatorStore.lookup("ABC")
        final actuatorParameters = [
                first: [1..16],
                octopus: s,
        ]

        actuator.engage(actuatorParameters)
    }


}