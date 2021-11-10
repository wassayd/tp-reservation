package montp.data.dao;

import montp.data.model.Resource;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ResourceDAO extends GenericDAO<Resource> {

    public ResourceDAO() {
        super(Resource.class);
    }

    @SuppressWarnings("unchecked")
    public List<Resource> getResources() {
        return em.createQuery("SELECT r FROM Resource r").getResultList();
    }
}
