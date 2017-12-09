package nl.plakbook.stamboom.datalayer.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Marriage {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

//    private MarriageDate marriageDate;
//    private MarriagePlace marriagePlace;
//    private MarriageDate mariageEndDate;
    private Long marriageDateId;
    private Long marriagePlaceId;
    private Long marriageEndDateId;

//    private Person person1;
//    private Person person2;
    private Long person1Id;
    private Long person2Id;

    public Marriage() {
    }

    public Marriage(Long marriageDateId, Long marriagePlaceId, Long mariageEndDateId, Long person1Id, Long person2Id) {
        this.marriageDateId = marriageDateId;
        this.marriagePlaceId = marriagePlaceId;
        this.marriageEndDateId = mariageEndDateId;
        this.person1Id = person1Id;
        this.person2Id = person2Id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMarriageDateId() {
        return marriageDateId;
    }

    public void setMarriageDate(Long marriageDateId) {
        this.marriageDateId = marriageDateId;
    }

    public Long getMarriagePlaceId() {
        return marriagePlaceId;
    }

    public void setMarriagePlaceId(Long marriagePlaceId) {
        this.marriagePlaceId = marriagePlaceId;
    }

    public Long getMarriageEndDateId() {
        return marriageEndDateId;
    }

    public void setMarriageEndDateId(Long marriageEndDateId) {
        this.marriageEndDateId = marriageEndDateId;
    }

    public Long getPerson1Id() {
        return person1Id;
    }

    public void setPerson1Id(Long person1Id) {
        this.person1Id = person1Id;
    }

    public Long getPerson2Id() {
        return person2Id;
    }

    public void setPerson2Id(Long person2Id) {
        this.person2Id = person2Id;
    }
}
