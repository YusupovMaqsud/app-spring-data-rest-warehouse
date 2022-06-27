package uz.pdp.appspringdatarestwarehouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.appspringdatarestwarehouse.entity.Attachment;
import uz.pdp.appspringdatarestwarehouse.projection.CustomAttachment;

@RepositoryRestResource(path = "attachment",excerptProjection = CustomAttachment.class)
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
}
