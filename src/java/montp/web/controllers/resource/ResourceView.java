package montp.web.controllers.resource;

import montp.data.dao.ResourceDAO;
import montp.data.model.Resource;
import montp.services.ResourceService;
import montp.tools.Logger;
import montp.web.controllers.AbstractDataTableView;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@ViewScoped
@Named("resourceView")
public class ResourceView extends AbstractDataTableView<Resource, ResourceDAO, ResourceService> {

    @PostConstruct
    public void init() {
        Logger.log(Logger.LogLevel.INFO, ResourceView.class.getSimpleName(), "initializing resource controller");
        datas = service.getAll();
    }

    public boolean canDelete(Resource resource) {
        return service.canDelete(resource);
    }

}