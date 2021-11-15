package montp.data;

import montp.data.model.Person;
import montp.data.model.Resource;
import montp.data.model.ResourceType;
import montp.data.model.security.Group;
import montp.data.model.security.User;
import montp.services.PersonService;
import montp.services.ResourceTypeService;
import montp.services.ResourceService;
import montp.services.UserService;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Singleton
@Startup
public class Seeder {
    
    @Inject
    private UserService userService;

    @Inject
    private ResourceTypeService resourceTypeService;

    @Inject
    private ResourceService resourceService;

    @Inject
    private PersonService personService;

    @PersistenceContext
    private EntityManager em;
    
    @PostConstruct
    public void init() {
        if (userService.getGroup("USER") == null) {
            Group groupUser = new Group("USER");
            em.persist(groupUser);
            Group groupAdmin = new Group("ADMIN");
            em.persist(groupAdmin);
            User userUser1 = new User("user1", "user1");
            List<Group> groupes = new ArrayList<>();
            groupes.add(groupUser);
            userUser1.setGroups(groupes);
            userService.insert(userUser1);
            User userAdmin = new User("admin", "admin");
            groupes.add(groupAdmin);
            userAdmin.setGroups(groupes);
            userService.insert(userAdmin);

            ResourceType resourceType = new ResourceType("Salle de réunion");
            resourceTypeService.insert(resourceType);

            Person person = new Person("Said", "Waskar", "saidWaskar");
            personService.insert(person);

            for (int i = 0; i < 100; i++) {
                Resource resource = new Resource("Salle A"+i , resourceType);
                resourceService.insert(resource);
                resource.setResponsible(person);
            }
        }
    }
}
