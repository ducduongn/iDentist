package uet.springframework.identist.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@MappedSuperclass
@Table
@Entity(name = "dentist")
public class Dentist extends Person{
    @Column(name = "speciality")
    @NotNull
    private String speciality;

    @Column(name = "degree")
    @NotNull
    private String degree;

    @Column(name = "experience")
    @NotNull
    private String experience;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
