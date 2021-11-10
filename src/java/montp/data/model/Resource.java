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

    private Date startDate;

    private Date endDate;

    @Column(nullable = true)
    private Integer capacity = null;

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Boolean isSharable() {
        return capacity != null && isSharable;
    }

    public void setSharable(Boolean sharable) {
        isSharable = sharable;
    }
}
