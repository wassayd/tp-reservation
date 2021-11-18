package montp.services;

import montp.data.dao.ResourceDAO;
import montp.data.model.Resource;
import montp.web.UserSession;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class ResourceService extends GenericService<Resource, ResourceDAO> {
    @Inject
    UserSession userSession;

    @Override
    public boolean canDelete(Resource instance) {
        return instance.getReservations().size() == 0;
    }

    public List<Resource> getAll(int first, int pageSize, String filter) {
        return dao.getAll(first, pageSize, filter);
    }
}
