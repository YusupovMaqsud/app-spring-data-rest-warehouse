package uz.pdp.appspringdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appspringdatarestwarehouse.entity.Attachment;
import uz.pdp.appspringdatarestwarehouse.entity.Category;
import uz.pdp.appspringdatarestwarehouse.entity.Measurement;
import uz.pdp.appspringdatarestwarehouse.entity.Product;

@Projection(types = Product.class)
public interface CustomProduct {
    Integer getId();

    String getName();

    boolean getActive();

    Category getCategory();

    Attachment getPhoto();

    String getCode();

    Measurement getMeasurement();
}
