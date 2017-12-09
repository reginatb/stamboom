package nl.plakbook.stamboom.datalayer.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String patronyme;
    private String lastName;
    private Gender gender;
    private String remark;

//    @OneToOne(optional=false)
//    @JoinColumn(name = "personId")
//    private BirthDate birthDate;
//    @OneToOne(optional=false)
//    @JoinColumn(name = "personId")
//    private BirthPlace birthPlace;

//    @OneToOne(optional=false)
//    @JoinColumn(name = "personId")
//    private List<Parents> parents;
//    private List<Person> children;

//    @OneToOne(optional=false)
//    @JoinColumn(name = "personId")
//    private BaptismDate baptismDate;
//    @OneToOne(optional=false)
//    @JoinColumn(name = "personId")
//    private BaptismPlace baptismPlace;

//    @OneToOne(optional=false)
//    @JoinColumn(name = "personId")
//    private DeathDate deathDate;
//    @OneToOne(optional=false)
//    @JoinColumn(name = "personId")
//    private BurialPlace burialPlace;
//
//    private List<Marriage> marriages;

    public Person() {
    }

    public Person(String firstName, String patronyme, String lastName, Gender gender, String remark) {
        this.firstName = firstName;
        this.patronyme = patronyme;
        this.lastName = lastName;
        this.gender = gender;
        this.remark = remark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronyme() {
        return patronyme;
    }

    public void setPatronyme(String patronyme) {
        this.patronyme = patronyme;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
