package montp.data.model;

import montp.data.model.security.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="PERSON")
public class Person extends User {
    private String firstname;
    private String lastName;
    private String status;

    @OneToMany(mappedBy = "reservedBy", cascade = CascadeType.PERSIST)
    private List<Resource> resources = new ArrayList<>();

    @OneToMany(mappedBy = "responsible", cascade = CascadeType.PERSIST)
    private List<Resource> responsibleOf = new ArrayList<>();

    public Person() {

    }

    public Person(String firstname, String lastName, String username) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.userName = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public Person addResource(Resource resource) {
        if (!this.resources.contains(resource)) {
            this.resources.add(resource);
        }

        return this;
    }

    public List<Resource> getResponsibleOf() {
        return responsibleOf;
    }

    public void setResponsibleOf(List<Resource> responsibleOf) {
        this.responsibleOf = responsibleOf;
    }
}
