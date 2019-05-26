package model.entity;

import java.util.List;
import java.util.Objects;

public class MedicalCard {
    private Integer id;
    private Integer patientId;
    private Integer visitId;
    private Integer refResultId;
    private String finalDiagnosis;
    private String discharge;

    private UserData userData;
    private List<PatientVisit> patientVisit;
    private List<ExamResultByReferral> examResultByReferrals;

    public MedicalCard(Integer id, Integer patientId, Integer visitId, Integer refResultId,
                       String finalDiagnosis, String discharge, UserData userData,
                       List<PatientVisit> patientVisit, List<ExamResultByReferral> examResultByReferrals) {
        this.id = id;
        this.patientId = patientId;
        this.visitId = visitId;
        this.refResultId = refResultId;
        this.finalDiagnosis = finalDiagnosis;
        this.discharge = discharge;
        this.userData = userData;
        this.patientVisit = patientVisit;
        this.examResultByReferrals = examResultByReferrals;
    }

    public MedicalCard() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getVisitId() {
        return visitId;
    }

    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }

    public Integer getRefResultId() {
        return refResultId;
    }

    public void setRefResultId(Integer refResultId) {
        this.refResultId = refResultId;
    }

    public String getFinalDiagnosis() {
        return finalDiagnosis;
    }

    public void setFinalDiagnosis(String finalDiagnosis) {
        this.finalDiagnosis = finalDiagnosis;
    }

    public String getDischarge() {
        return discharge;
    }

    public void setDischarge(String discharge) {
        this.discharge = discharge;
    }

    public UserData getUserData() {
        return userData;
    }

    public void setUserData(UserData userData) {
        this.userData = userData;
    }

    public List<PatientVisit> getPatientVisit() {
        return patientVisit;
    }

    public void setPatientVisit(List<PatientVisit> patientVisit) {
        this.patientVisit = patientVisit;
    }

    public List<ExamResultByReferral> getExamResultByReferrals() {
        return examResultByReferrals;
    }

    public void setExamResultByReferrals(List<ExamResultByReferral> examResultByReferrals) {
        this.examResultByReferrals = examResultByReferrals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalCard that = (MedicalCard) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(patientId, that.patientId) &&
                Objects.equals(visitId, that.visitId) &&
                Objects.equals(refResultId, that.refResultId) &&
                Objects.equals(finalDiagnosis, that.finalDiagnosis) &&
                Objects.equals(discharge, that.discharge) &&
                Objects.equals(userData, that.userData) &&
                Objects.equals(patientVisit, that.patientVisit) &&
                Objects.equals(examResultByReferrals, that.examResultByReferrals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, patientId, visitId, refResultId, finalDiagnosis,
                discharge, userData, patientVisit, examResultByReferrals);
    }

    @Override
    public String toString() {
        return "MedicalCard{" +
                "id=" + id +
                ", patientId=" + patientId +
                ", visitId=" + visitId +
                ", refResultId=" + refResultId +
                ", finalDiagnosis='" + finalDiagnosis + '\'' +
                ", discharge='" + discharge + '\'' +
                ", userData=" + userData +
                ", patientVisit=" + patientVisit +
                ", examResultByReferrals=" + examResultByReferrals +
                '}';
    }
}