package uet.springframework.identist.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Table
@Entity(name = "record")
public class Record extends BaseEntity{
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "dentistId")
    private Visit visit;

    @Column(name = "symptoms")
    @NotEmpty
    private String symptoms;

    @Column(name = "diagnoses")
    @NotEmpty
    private String diagnoses;

    @Column(name = "treatment")
    @NotEmpty
    private String treatment;

    @Column(name = "prescription")
    @NotEmpty
    private String prescription;

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDiagnoses() {
        return diagnoses;
    }

    public void setDiagnoses(String diagnoses) {
        this.diagnoses = diagnoses;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
}
