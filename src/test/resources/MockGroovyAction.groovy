import com.madsen.xsc.interop.Action
import com.madsen.xsc.interop.ParameterDto



class MockGroovyAction implements Action {

    @Override
    void execute(ParameterDto parameters) {
        final s = parameters
                .with { [] + intParams + floatParams + boolParams }
                .join(", ")

        println s
    }
}