package nl.plakbook.stamboom.datalayer.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BirthDate {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Long personId;

    private Integer year;
    private Integer month;
    private Integer day;

    protected BirthDate() {
    }

    public BirthDate(Long personId, Integer year, Integer month, Integer day) {
        this.personId = personId;
        this.year = year;
        this.month = month;
        this.day = day;
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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
}
