package montp.web.controllers.resourceType;

import montp.data.dao.ResourceTypeDAO;
import montp.data.model.ResourceType;
import montp.services.ResourceTypeService;
import montp.tools.Logger;
import montp.web.controllers.AbstractDataTableView;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@ViewScoped
@Named("resourceType")
public class ResourceTypeView extends AbstractDataTableView<ResourceType, ResourceTypeDAO, ResourceTypeService> {

    @Inject private ResourceTypeService resourceTypeService;

    @PostConstruct
    public void init() {
        Logger.log(Logger.LogLevel.INFO, ResourceTypeView.class.getSimpleName(), "initializing resource type controller");
        datas = service.getAll();
    }

    public boolean canDelete(ResourceType resourceType) {
        return resourceTypeService.canDelete(resourceType);
    }
}
