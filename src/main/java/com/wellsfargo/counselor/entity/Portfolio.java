package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private long portfolioId;

    @Column(nullable = false)
    private long clientId;

    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private String portfolioCategory;

    @Column(nullable = false)
    private String portfolioStatus;

    protected Portfolio() {
    }

    public Portfolio(long clientId, String portfolioName, String portfolioCategory, String portfolioStatus) {
        this.clientId = clientId;
        this.portfolioName = portfolioName;
        this.portfolioCategory = portfolioCategory;
        this.portfolioStatus = portfolioStatus;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public long getClientId() {
        return clientId;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public String getPortfolioCategory() {
        return portfolioCategory;
    }

    public String getPortfolioStatus() {
        return portfolioStatus;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public void setPortfolioCategory(String portfolioCategory) {
        this.portfolioCategory = portfolioCategory;
    }

    public void setPortfolioStatus(String portfolioStatus) {
        this.portfolioStatus = portfolioStatus;
    }
}

