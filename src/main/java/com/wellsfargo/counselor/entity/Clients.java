package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Client_ID")
    private Long clientId;

    @Column(name = "Advisor_ID", nullable = false)
    private Long advisorId;

    @Column(name = "First_Name", nullable = false)
    private String firstName;

    @Column(name = "Last_Name", nullable = false)
    private String lastName;

    @Column(name = "Email_Verified", nullable = false)
    private String email;

    @Column(name = "Phone_Number", nullable = false)
    private String phone;

    @Column(name = "Created_at", nullable = false)
    private String createdAt;

    @Column(name = "Updated_at", nullable = false)
    private String updatedAt;

    protected Clients() {
        // Default constructor for JPA
    }

    public Clients(long Advisor_Id, String First_Name, String Last_Name, String Email_Verified, String Phone_Number, String Created_at, String Updated_at) {
        this.advisorId = Advisor_Id;
        this.firstName = First_Name;
        this.lastName = Last_Name;
        this.email = Email_Verified;
        this.phone = Phone_Number;
        this.createdAt = Created_at;
        this.updatedAt = Updated_at;
    }

    // getters and setters below...

    public Long getClientId() {
        return clientId;
    }

    public Long getAdvisorId() {
        return advisorId;
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
