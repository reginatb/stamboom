package nl.plakbook.stamboom.datalayer.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BaptismPlace {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Long personId;

    private String city;
    private String county;
    private String provinceOrState;
    private String country;
    private String remark;

    public BaptismPlace() {
    }

    public BaptismPlace(Long personId, String city, String county, String provinceOrState, String country, String remark) {
        this.personId = personId;
        this.city = city;
        this.county = county;
        this.provinceOrState = provinceOrState;
        this.country = country;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getProvinceOrState() {
        return provinceOrState;
    }

    public void setProvinceOrState(String provinceOrState) {
        this.provinceOrState = provinceOrState;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
