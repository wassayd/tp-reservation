package montp.services;

import montp.data.dao.PersonDAO;
import montp.data.model.Person;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class PersonService extends GenericService<Person, PersonDAO> {

    public List<Person> getPersons() {
        return dao.getPersons();
    }

}
