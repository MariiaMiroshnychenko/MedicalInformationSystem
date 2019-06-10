package model.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Referral {
    private Integer id;
    private String refType;
    private String actTitle;
    private LocalDateTime refDate;
    private Integer patientId;
    private Integer doctorId;
    private Integer examResultId;

    private PersonalRegData personalRegData;
    private ExamResultByReferral examResultByReferral;

    public Referral(Integer id, String refType, String actTitle, LocalDateTime refDate,
                    Integer patientId, Integer doctorId, Integer examResultId,
                    PersonalRegData personalRegData, ExamResultByReferral examResultByReferral) {
        this.id = id;
        this.refType = refType;
        this.actTitle = actTitle;
        this.refDate = refDate;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.examResultId = examResultId;
        this.personalRegData = personalRegData;
        this.examResultByReferral = examResultByReferral;
    }

    public Referral() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRefType() {
        return refType;
    }

    public void setRefType(String refType) {
        this.refType = refType;
    }

    public String getActTitle() {
        return actTitle;
    }

    public void setActTitle(String actTitle) {
        this.actTitle = actTitle;
    }

    public LocalDateTime getRefDate() {
        return refDate;
    }

    public void setRefDate(LocalDateTime refDate) {
        this.refDate = refDate;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getExamResultId() {
        return examResultId;
    }

    public void setExamResultId(Integer examResultId) {
        this.examResultId = examResultId;
    }

    public PersonalRegData getPersonalRegData() {
        return personalRegData;
    }

    public void setPersonalRegData(PersonalRegData personalRegData) {
        this.personalRegData = personalRegData;
    }

    public ExamResultByReferral getExamResultByReferral() {
        return examResultByReferral;
    }

    public void setExamResultByReferral(ExamResultByReferral examResultByReferral) {
        this.examResultByReferral = examResultByReferral;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Referral referral = (Referral) o;
        return Objects.equals(id, referral.id) &&
                Objects.equals(refType, referral.refType) &&
                Objects.equals(actTitle, referral.actTitle) &&
                Objects.equals(refDate, referral.refDate) &&
                Objects.equals(patientId, referral.patientId) &&
                Objects.equals(doctorId, referral.doctorId) &&
                Objects.equals(examResultId, referral.examResultId) &&
                Objects.equals(personalRegData, referral.personalRegData) &&
                Objects.equals(examResultByReferral, referral.examResultByReferral);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, refType, actTitle, refDate, patientId, doctorId,
                examResultId, personalRegData, examResultByReferral);
    }

    @Override
    public String toString() {
        return "Referral{" +
                "id=" + id +
                ", refType='" + refType + '\'' +
                ", actTitle='" + actTitle + '\'' +
                ", refDate=" + refDate +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                ", examResultId=" + examResultId +
                ", personalRegData=" + personalRegData +
                ", examResultByReferral=" + examResultByReferral +
                '}';
    }
}
