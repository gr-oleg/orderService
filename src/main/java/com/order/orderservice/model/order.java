package com.item.orderService.model;

import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class order {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "recipient")
    private String recipient;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "id_items")
    private int idItems;

    @Column(name = "total_price")
    private String totalPrice;

    @Column(name = "id_user")
    private int idUser;

    public order() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id; }

    public int getIdUser() { return idUser; }

    public void setIdUser(int idUser) { this.idUser = idUser; }

    public int getidItems() { return idItems; }

    public void setidItems(int idItems) { this.idItems = idItems; }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }
}