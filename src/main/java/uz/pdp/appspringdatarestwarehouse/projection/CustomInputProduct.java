package uz.pdp.appspringdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appspringdatarestwarehouse.entity.Input;
import uz.pdp.appspringdatarestwarehouse.entity.InputProduct;
import uz.pdp.appspringdatarestwarehouse.entity.Product;

import java.sql.Date;

@Projection(types = InputProduct.class)
public interface CustomInputProduct {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Date getExpireDate();

    Input getInput();
}
