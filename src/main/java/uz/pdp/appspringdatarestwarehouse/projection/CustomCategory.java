package uz.pdp.appspringdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appspringdatarestwarehouse.entity.Category;

@Projection(types = Category.class)
public interface CustomCategory {
     Integer getId();

     String getName();

     boolean getActive();

     Category getParentCategory();
}
