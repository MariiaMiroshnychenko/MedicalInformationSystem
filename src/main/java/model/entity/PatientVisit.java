package model.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PatientVisit {
    private Integer id;
    private Integer idReferralToDoctor;
    private Integer patientId;
    private Date visitDate;
    private String diagnosis;
    private String appointment;
    private Integer doctorId;

    private List<PersonalRegData> personalRegData = new ArrayList<>();

    public PatientVisit(Integer id, Integer idReferralToDoctor, Integer patientId,
                        Date visitDate, String diagnosis, String appointment,
                        Integer doctorId, List<PersonalRegData> personalRegData) {
        this.id = id;
        this.idReferralToDoctor = idReferralToDoctor;
        this.patientId = patientId;
        this.visitDate = visitDate;
        this.diagnosis = diagnosis;
        this.appointment = appointment;
        this.doctorId = doctorId;
        this.personalRegData = personalRegData;
    }

    public PatientVisit() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdReferralToDoctor() {
        return idReferralToDoctor;
    }

    public void setIdReferralToDoctor(Integer idReferralToDoctor) {
        this.idReferralToDoctor = idReferralToDoctor;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Date getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(Date visitDate) {
        this.visitDate = visitDate;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public List<PersonalRegData> getPersonalRegData() {
        return personalRegData;
    }

    public void setPersonalRegData(List<PersonalRegData> personalRegData) {
        this.personalRegData = personalRegData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PatientVisit that = (PatientVisit) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idReferralToDoctor, that.idReferralToDoctor) &&
                Objects.equals(patientId, that.patientId) &&
                Objects.equals(visitDate, that.visitDate) &&
                Objects.equals(diagnosis, that.diagnosis) &&
                Objects.equals(appointment, that.appointment) &&
                Objects.equals(doctorId, that.doctorId) &&
                Objects.equals(personalRegData, that.personalRegData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, idReferralToDoctor, patientId, visitDate,
                diagnosis, appointment, doctorId, personalRegData);
    }

    @Override
    public String toString() {
        return "PatientVisitDao{" +
                "id=" + id +
                ", idReferralToDoctor=" + idReferralToDoctor +
                ", patientId=" + patientId +
                ", visitDate=" + visitDate +
                ", diagnosis='" + diagnosis + '\'' +
                ", appointment='" + appointment + '\'' +
                ", doctorId=" + doctorId +
                ", personalRegData=" + personalRegData +
                '}';
    }
}