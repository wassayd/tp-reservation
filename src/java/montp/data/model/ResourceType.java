package montp.data.model;

import javax.persistence.*;
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

    @Column(nullable = true)
    private Integer capacity = null;


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

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return name;
    }
}
