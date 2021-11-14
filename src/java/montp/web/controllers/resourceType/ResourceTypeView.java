package montp.web.controllers.resourceType;

import montp.data.dao.ResourceTypeDAO;
import montp.data.model.ResourceType;
import montp.services.ResourceTypeService;
import montp.tools.Logger;
import montp.web.FacesTools;
import montp.web.controllers.AbstractDataTableView;
import org.primefaces.event.SelectEvent;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@ViewScoped
@Named("resourceTypeView")
public class ResourceTypeView extends AbstractDataTableView<ResourceType, ResourceTypeDAO, ResourceTypeService> {

    @Inject private ResourceTypeService resourceTypeService;
    @Inject private ResourceTypeDialog resourceTypeDialog;

    @PostConstruct
    public void init() {
        Logger.log(Logger.LogLevel.INFO, ResourceTypeView.class.getSimpleName(), "initializing resource type controller");
        datas = service.getAll();
    }

    public boolean canDelete(ResourceType resourceType) {
        return resourceTypeService.canDelete(resourceType);
    }

    public void modify(ResourceType resourceType) {
        resourceTypeDialog.setInstance(resourceType);
        FacesTools.addMessage(FacesMessage.SEVERITY_INFO, resourceType.toString());
    }
}