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

    public void setResponsible(Person responsible) {
        this.responsible = responsible;
    }

    public void setType(ResourceType type) {
        this.type = type;
    }

    public void setReservedBy(Person reservedBy) {
        this.reservedBy = reservedBy;
    }

    public void setSharable(Boolean sharable) {
        isSharable = sharable;
    }
}
