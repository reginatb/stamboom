package nl.plakbook.stamboom.datalayer.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MarriagePlace {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private Long mariageId;

    private String city;
    private String county;
    private String provinceOrState;
    private String country;
    private String remark;

    public MarriagePlace() {
    }

    public MarriagePlace(Long mariageId, String city, String county, String provinceOrState, String country, String remark) {
        this.mariageId = mariageId;
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

    public Long getMariageId() {
        return mariageId;
    }

    public void setMariageId(Long mariageId) {
        this.mariageId = mariageId;
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
