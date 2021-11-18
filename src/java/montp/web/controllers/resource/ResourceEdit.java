package montp.web.controllers.resource;

import montp.data.dao.ResourceDAO;
import montp.data.model.Person;
import montp.data.model.Resource;
import montp.data.model.ResourceType;
import montp.data.model.security.User;
import montp.locale.Messages;
import montp.services.PersonService;
import montp.services.ResourceService;
import montp.services.ResourceTypeService;
import montp.services.UserService;
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
import java.util.List;

@ViewScoped
@Named("resourceEdit")
public class ResourceEdit extends AbstractCrud<Resource, ResourceDAO, ResourceService> {
    @Inject
    PersonService personService;

    @Inject
    ResourceTypeService resourceTypeService;

    public void instanciate() {
        if(instance == null) {
            instance = new Resource();
        }
    }

    @PostConstruct
    public void init() {
        instanciate();
    }

    public List<Person> getUsers() {
        return personService.getAll();
    }

    public List<ResourceType> getResourceTypes() {
        return resourceTypeService.getAll();
    }
}