package montp.web.controllers.resource;

import montp.data.dao.ResourceDAO;
import montp.data.model.Resource;
import montp.locale.Messages;
import montp.services.ResourceService;
import montp.tools.Logger;
import montp.web.FacesTools;
import montp.web.controllers.AbstractCrud;
import montp.web.controllers.AbstractDataTableView;
import montp.web.controllers.AbstractDialog;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;

@ViewScoped
@Named("resourceEdit")
public class ResourceEdit extends AbstractCrud<Resource, ResourceDAO, ResourceService> {

    public void instanciate() {
        instance = new Resource();
    }

    @PostConstruct
    public void init() {
        System.out.println(instance);
    }
}