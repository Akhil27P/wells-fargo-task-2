package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Portfolio_ID")
    private Long portfolioId;

    @Column(name = "Client_ID", nullable = false)
    private Long clientId;

    @Column(name = "Type", nullable = false)
    private String type;

    @Column(name = "Total_Value", nullable = false)
    private String totalValue;

    @Column(name = "Created_at", nullable = false)
    private String createdAt;

    @Column(name = "Updated_at", nullable = false)
    private String updatedAt;

    protected Portfolio() {
        // Default constructor for JPA
    }

    public Portfolio(Long clientId, String type, String totalValue, String createdAt, String updatedAt) {
        this.clientId = clientId;
        this.type = type;
        this.totalValue = totalValue;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(String totalValue) {
        this.totalValue = totalValue;
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
