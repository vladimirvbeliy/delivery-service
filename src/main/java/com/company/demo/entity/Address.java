package com.company.demo.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

@Entity
@Table(name = "ADDRESS")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "ADDRESS_LINE_1")
    private String address1;

    @Column(name = "ADDRESS_LINE_2")
    private String address2;

    @Column(name = "TOWN")
    private String town;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "POSTCODE")
    private String postCode;

    public Address() {
    }

    public Address(String address1, String address2, String town, String country, String postCode) {
        this.address1 = address1;
        this.address2 = address2;
        this.town = town;
        this.country = country;
        this.postCode = postCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
