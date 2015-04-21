import com.madsen.xsc.interop.ParameterDto
import com.madsen.xsc.interop.predicate.Predicate
import com.madsen.xsc.interop.sensor.Sensor
import com.madsen.xsc.interop.sensor.SensorStore

class MockGroovyPredicate implements Predicate {

    @Override
    boolean isMatch(final ParameterDto parameters, final SensorStore sensorStore) {

        final s = parameters
                .with { [] + intParams + floatParams + boolParams }
                .join(", ")

        final Sensor<String> sensor = sensorStore.lookup("ABC")

        final observation = sensor.next().get()

        return observation == s
    }
}