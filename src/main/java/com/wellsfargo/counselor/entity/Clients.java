package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Clients {

    @Id
    @GeneratedValue
    private long client_Id;

    @Column(nullable = false)
    private long Advisor_Id;

    @Column(nullable = false)
    private String First_Name;

    @Column(nullable = false)
    private String Last_name;

    @Column(nullable = false)
    private String Email_verified;

    @Column(nullable = false)
    private String Phone_Number;

    @Column(nullable = false)
    private String Created_at;

    @Column(nullable = false)
    private String Updated_at;

    protected Clients() {
    }

    public Client(long Advisor_Id, String First_Name, String Last_name, String Email_verified, String Phone_Number, String Created_at, String Updated_at) {
        this.advisorId = Advisor_ID;
        this.firstName = First_Name;
        this.lastName = Last_name;
        this.email = Email_verified;
        this.phone = Phone_Number;
        this.createdAt = Created_at;
        this.updatedAt = Updated_at;
    }

    public Long getClientId() {
        return client_Id;
    }

    public Long getAdvisorId() {
        return Advisor_ID;
    }

    public void setAdvisorId(Long advisorId) {
        this.advisorId = advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
