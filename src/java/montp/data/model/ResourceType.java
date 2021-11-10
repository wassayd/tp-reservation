package montp.data.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="RESOURCE_TYPE")
public class ResourceType extends GenericEntity {

    private String name;

    @OneToMany(mappedBy = "type")
    private List<Resource> resources = new ArrayList<>();

    public ResourceType(String name) {
        this.name = name;
    }

    public ResourceType() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
