package uz.pdp.appspringdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appspringdatarestwarehouse.entity.Input;
import uz.pdp.appspringdatarestwarehouse.entity.Output;
import uz.pdp.appspringdatarestwarehouse.entity.OutputProduct;
import uz.pdp.appspringdatarestwarehouse.entity.Product;

import java.sql.Date;

@Projection(types = OutputProduct.class)
public interface CustomOutputProduct {
    Integer getId();

    Product getProduct();

    Double getAmount();

    Double getPrice();

    Output getOutput();
}
