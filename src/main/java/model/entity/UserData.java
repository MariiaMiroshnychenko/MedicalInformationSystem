package model.entity;

import java.sql.Date;
import java.util.Objects;

public class UserData {
    private Integer id;
    private String surname;
    private String name;
    private String patronymic;
    private Date birthDate;
    private Integer medCardId;
    private Integer attendingDoctor;
    private String medSpeciality;
    private String login;
    private String password;
    private String role;

    private MedicalCard medicalCard;

    public UserData(Integer id, String surname, String name, String patronymic,
                    Date birthDate, Integer medCardId, Integer attendingDoctor, String medSpeciality,
                    String login, String password, String role, MedicalCard medicalCard) {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthDate = birthDate;
        this.medCardId = medCardId;
        this.attendingDoctor = attendingDoctor;
        this.medSpeciality = medSpeciality;
        this.login = login;
        this.password = password;
        this.role = role;
        this.medicalCard = medicalCard;
    }

    public UserData() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getMedCardId() {
        return medCardId;
    }

    public void setMedCardId(Integer medCardId) {
        this.medCardId = medCardId;
    }

    public Integer getAttendingDoctor() {
        return attendingDoctor;
    }

    public void setAttendingDoctor(Integer attendingDoctor) {
        this.attendingDoctor = attendingDoctor;
    }

    public String getMedSpeciality() {
        return medSpeciality;
    }

    public void setMedSpeciality(String medSpeciality) {
        this.medSpeciality = medSpeciality;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public MedicalCard getMedicalCard() {
        return medicalCard;
    }

    public void setMedicalCard(MedicalCard medicalCard) {
        this.medicalCard = medicalCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserData userData = (UserData) o;
        return Objects.equals(id, userData.id) &&
                Objects.equals(surname, userData.surname) &&
                Objects.equals(name, userData.name) &&
                Objects.equals(patronymic, userData.patronymic) &&
                Objects.equals(birthDate, userData.birthDate) &&
                Objects.equals(medCardId, userData.medCardId) &&
                Objects.equals(attendingDoctor, userData.attendingDoctor) &&
                Objects.equals(medSpeciality, userData.medSpeciality) &&
                Objects.equals(login, userData.login) &&
                Objects.equals(password, userData.password) &&
                Objects.equals(role, userData.role) &&
                Objects.equals(medicalCard, userData.medicalCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, patronymic, birthDate, medCardId,
                attendingDoctor, medSpeciality, login, password, role, medicalCard);
    }

    @Override
    public String toString() {
        return "UserData{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", birthDate=" + birthDate +
                ", medCardId=" + medCardId +
                ", attendingDoctor=" + attendingDoctor +
                ", medSpeciality='" + medSpeciality + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", medicalCard=" + medicalCard +
                '}';
    }
}