package nl.plakbook.stamboom.datalayer.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MarriageDate {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Long mariageId;

    private Integer year;
    private Integer month;
    private Integer day;

    private boolean startOfMariage = true;

    public MarriageDate() {
    }

    public MarriageDate(Long mariageId, Integer year, Integer month, Integer day, boolean startOfMariage) {
        this.mariageId = mariageId;
        this.year = year;
        this.month = month;
        this.day = day;
        this.startOfMariage = startOfMariage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMariageId() {
        return mariageId;
    }

    public void setMariageId(Long mariageId) {
        this.mariageId = mariageId;
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

    public boolean isStartOfMariage() {
        return startOfMariage;
    }

    public void setStartOfMariage(boolean startOfMariage) {
        this.startOfMariage = startOfMariage;
    }
}
