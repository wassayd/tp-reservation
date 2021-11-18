package montp.data.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "RESOURCE")
public class Resource extends GenericEntity {

    private String name;

    @ManyToOne
    private ResourceType type;

    @ManyToOne()
    private Person responsible;

    private Boolean isSharable = false;

    @OneToMany(mappedBy = "resource")
    private List<Reservation> reservations = new ArrayList<>();

    public Resource(String name, ResourceType type) {
        this.name = name;
        this.type = type;
    }

    public Resource() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceType getType() {
        return type;
    }

    public void setType(ResourceType type) {
        this.type = type;
    }

    public Person getResponsible() {
        return responsible;
    }

    public void setResponsible(Person responsible) {
        this.responsible = responsible;
    }

    public Boolean getSharable() {
        return isSharable;
    }

    public void setSharable(Boolean sharable) {
        isSharable = sharable;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    @Override
    public String toString() {
        return name;
    }
}
