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

    @OneToMany(mappedBy = "reservedBy", cascade = CascadeType.PERSIST)
    private List<Reservation> reservations = new ArrayList<>();

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

    public List<Resource> getResponsibleOf() {
        return responsibleOf;
    }

    public void setResponsibleOf(List<Resource> responsibleOf) {
        this.responsibleOf = responsibleOf;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
