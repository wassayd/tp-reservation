package montp.web.controllers.resourceType;

import montp.data.dao.ResourceTypeDAO;
import montp.data.model.ResourceType;
import montp.services.ResourceTypeService;
import montp.tools.Logger;
import montp.web.controllers.AbstractDataTableView;
import montp.web.controllers.AbstractDialog;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@ViewScoped
@Named("resourceTypeDialog")
public class ResourceTypeDialog extends AbstractDialog<ResourceType, ResourceTypeDAO, ResourceTypeService> {

    @Override
    public void instanciate() {
        instance = new ResourceType();
    }
}
