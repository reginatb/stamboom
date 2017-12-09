package nl.plakbook.stamboom.datalayer.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Parents {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Long personId;

//    private Person parent1;
//    private Person parent2;

    private Long parent1Id;
    private Long parent2Id;

    private String remark;

    protected Parents() {
    }

    public Parents(Long personId, Long parent1Id, Long parent2Id, String remark) {
        this.personId = personId;
        this.parent1Id = parent1Id;
        this.parent2Id = parent2Id;
        this.remark = remark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPersonId() {
        return personId;
    }

    public void setPersonId(Long personId) {
        this.personId = personId;
    }

    public Long getParent1Id() {
        return parent1Id;
    }

    public void setParent1Id(Long parent1Id) {
        this.parent1Id = parent1Id;
    }

    public Long getParent2Id() {
        return parent2Id;
    }

    public void setParent2Id(Long parent2Id) {
        this.parent2Id = parent2Id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
