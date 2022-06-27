package uz.pdp.appspringdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appspringdatarestwarehouse.entity.Measurement;

@Projection(types = Measurement.class)
public interface CustomMeasurement {
    Integer getId();

    String getName();

    boolean getActive();
}
