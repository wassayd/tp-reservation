package montp.data.dao;

import montp.data.model.Resource;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
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

    @SuppressWarnings("unchecked")
    public List<Resource> getAll(int first, int pageSize, String filter) {
        return em.createQuery("SELECT e FROM Resource e")
                .setFirstResult(first)
                .setMaxResults(pageSize)
                .getResultList();
    }
}
