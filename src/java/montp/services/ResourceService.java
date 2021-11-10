package montp.services;

import montp.data.dao.ResourceDAO;
import montp.data.model.Resource;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class ResourceService extends GenericService<Resource, ResourceDAO> {

    public List<Resource> getResources() {
        return dao.getResources();
    }

}
