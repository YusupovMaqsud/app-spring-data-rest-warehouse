package uz.pdp.appspringdatarestwarehouse.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pdp.appspringdatarestwarehouse.entity.Attachment;

@Projection(types = Attachment.class)
public interface CustomAttachment {
    Integer getId();

    String getName();

    long getSize();

    String getContentType();
}
