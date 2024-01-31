package com.example.demo6_bailam.model;

import javax.persistence.*;

@Entity
@Table(name = "PhongRoom")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String detail;
    private String status;
    private String price;
    private String numberOfPerson;
    private String numberBed;

    public Room(int id, String name, String detail, String status, String price, String numberOfPerson, String numberBed) {
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.status = status;
        this.price = price;
        this.numberOfPerson = numberOfPerson;
        this.numberBed = numberBed;
    }

    public Room() {
    }

    public Room(String name, String detail, String status, String price, String numberOfPerson, String numberBed) {
        this.name = name;
        this.detail = detail;
        this.status = status;
        this.price = price;
        this.numberOfPerson = numberOfPerson;
        this.numberBed = numberBed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(String numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public String getNumberBed() {
        return numberBed;
    }

    public void setNumberBed(String numberBed) {
        this.numberBed = numberBed;
    }
}
