package dazhi.admin.base.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="sys_organization")
public class Organization implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String priority;//显示顺序
    @ManyToOne
    @JoinColumn(name = "parent_id")
    private Organization parent_id;//父编号
    private Boolean available;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public Organization getParent_id() {
        return parent_id;
    }

    public void setParent_id(Organization parent_id) {
        this.parent_id = parent_id;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }
}
