package montp.data.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RESOURCE")
public class Resource extends GenericEntity {

    private String name;

    @ManyToOne
    private ResourceType type;

    @ManyToOne()
    private Person responsible;

    @ManyToOne
    private Person reservedBy;

    private Boolean isSharable = false;

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

    public Person getReservedBy() {
        return reservedBy;
    }

    public void setReservedBy(Person reservedBy) {
        this.reservedBy = reservedBy;
    }

    public Boolean getSharable() {
        return isSharable;
    }

    public void setSharable(Boolean sharable) {
        isSharable = sharable;
    }

    @Override
    public String toString() {
        return name;
    }
}
