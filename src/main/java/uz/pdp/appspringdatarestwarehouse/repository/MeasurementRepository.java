package uz.pdp.appspringdatarestwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appspringdatarestwarehouse.entity.Measurement;
import uz.pdp.appspringdatarestwarehouse.projection.CustomMeasurement;

@RepositoryRestResource(path = "measurement",excerptProjection = CustomMeasurement.class)
public interface MeasurementRepository extends JpaRepository<Measurement,Integer> {
}
