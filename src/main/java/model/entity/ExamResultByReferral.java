package model.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class ExamResultByReferral {
    private Integer id;
    private Integer refId;
    private LocalDateTime resDate;
    private String resultText;
    private Integer respDoctorId;

    public ExamResultByReferral(Integer id, Integer refId, LocalDateTime resDate,
                                String resultText, Integer respDoctorId) {
        this.id = id;
        this.refId = refId;
        this.resDate = resDate;
        this.resultText = resultText;
        this.respDoctorId = respDoctorId;
    }

    public ExamResultByReferral() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRefId() {
        return refId;
    }

    public void setRefId(Integer refId) {
        this.refId = refId;
    }

    public LocalDateTime getResDate() {
        return resDate;
    }

    public void setResDate(LocalDateTime resDate) {
        this.resDate = resDate;
    }

    public String getResultText() {
        return resultText;
    }

    public void setResultText(String resultText) {
        this.resultText = resultText;
    }

    public Integer getRespDoctorId() {
        return respDoctorId;
    }

    public void setRespDoctorId(Integer respDoctorId) {
        this.respDoctorId = respDoctorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExamResultByReferral that = (ExamResultByReferral) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(refId, that.refId) &&
                Objects.equals(resDate, that.resDate) &&
                Objects.equals(resultText, that.resultText) &&
                Objects.equals(respDoctorId, that.respDoctorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, refId, resDate, resultText, respDoctorId);
    }
}
