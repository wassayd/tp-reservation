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
    private Person person;

    @ManyToOne()
    private Resource resource;

    private Date startDate;

    private Date endDate;

    private Integer nbShareable;

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
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Integer getNbShareable() {
        return nbShareable;
    }

    public void setNbShareable(Integer nbShareable) {
        this.nbShareable = nbShareable;
    }
}
