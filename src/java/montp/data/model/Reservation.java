package montp.data.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "RESERVATION")
public class Reservation extends GenericEntity {
    @ManyToOne()
    private Person reservedBy;

    @ManyToOne()
    private Resource resource;

    private Date startDate;

    private Date endDate;

    private Integer nbShareable; // nombre de personne liées

    public Reservation() {

    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
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

    public Person getPerson() {
        return reservedBy;
    }

    public void setPerson(Person reservedBy) {
        this.reservedBy = reservedBy;
    }

    public Integer getNbShareable() {
        return nbShareable;
    }

    public void setNbShareable(Integer nbShareable) {
        this.nbShareable = nbShareable;
    }
}
