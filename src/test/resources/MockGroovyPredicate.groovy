import com.madsen.xsc.interop.ParameterDto
import com.madsen.xsc.interop.predicate.Predicate
import com.madsen.xsc.interop.sensor.SensorValueStore



class MockGroovyPredicate implements Predicate {

    @Override
    boolean isMatch(final ParameterDto parameters, final SensorValueStore sensorValueStore) {

        final s = parameters
                .with { [] + intParams + floatParams + boolParams }
                .join(", ")

        final Optional<String> value = sensorValueStore.latestValueOn("ABC")


        return value.get() == s
    }
}