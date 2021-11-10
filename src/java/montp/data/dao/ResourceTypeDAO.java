package montp.data.dao;

import montp.data.model.ResourceType;
import montp.data.model.security.Group;
import montp.data.model.security.User;
import montp.tools.Tools;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import java.util.List;

@ApplicationScoped
public class ResourceTypeDAO extends GenericDAO<ResourceType> {

    public ResourceTypeDAO() {
        super(ResourceType.class);
    }

    @SuppressWarnings("unchecked")
    public List<ResourceType> getResources() {
        return em.createQuery("SELECT r FROM ResourceType r").getResultList();
    }
}
