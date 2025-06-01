package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientID;

    @Id
    @GeneratedValue()
    private long advisorID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String contactInfo;

    protected Client() {

    }

    public Client(String name, String contactInfo) {
        this.name = name;
        this.contactInfo = contactInfo;
    }

    public Long getClientID() {
        return clientID;
    }
    public Long getAdvisorID() {
        return advisorID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactInfo(){
      return contactInfo;
    }

    public void setContactInfo(String contactInfo){
      this.contactInfo = contactInfo;
    }
}
