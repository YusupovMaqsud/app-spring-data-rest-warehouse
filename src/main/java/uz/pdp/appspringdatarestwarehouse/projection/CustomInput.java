package uz.pdp.appspringdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appspringdatarestwarehouse.entity.Currency;
import uz.pdp.appspringdatarestwarehouse.entity.Input;
import uz.pdp.appspringdatarestwarehouse.entity.Supplier;
import uz.pdp.appspringdatarestwarehouse.entity.Warehouse;

import java.sql.Timestamp;

@Projection(types = Input.class)
public interface CustomInput {
    Integer getId();

    Timestamp getData();

    Warehouse getWarehouse();

    Supplier getSupplier();

    Currency getCurrency();

    String getFactureNumber();

    String getCode();
}
