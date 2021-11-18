package montp.web.controllers.resource;

import montp.data.dao.ResourceDAO;
import montp.data.model.Resource;
import montp.services.ResourceService;
import montp.tools.Logger;
import montp.web.ResourceDataModel;
import montp.web.controllers.AbstractDataTableView;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@ViewScoped
@Named("resourceView")
public class ResourceView extends AbstractDataTableView<Resource, ResourceDAO, ResourceService> {
    @Inject
    private ResourceDataModel resourceDataModel;

    @Override
    public void init() {

    }

    public boolean canDelete(Resource resource) {
        return service.canDelete(resource);
    }

    public ResourceDataModel getResourceDataModel() {
        return resourceDataModel;
    }

    public void setResourceDataModel(ResourceDataModel resourceDataModel) {
        this.resourceDataModel = resourceDataModel;
    }
}