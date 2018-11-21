package com.warcraft.pojo;

public class Address {
    private Long addressId;

    private Long buyerId;

    private String addressCon;

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public String getAddressCon() {
        return addressCon;
    }

    public void setAddressCon(String addressCon) {
        this.addressCon = addressCon == null ? null : addressCon.trim();
    }
}