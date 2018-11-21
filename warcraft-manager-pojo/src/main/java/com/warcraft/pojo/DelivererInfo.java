package com.warcraft.pojo;

import java.io.Serializable;

public class DelivererInfo implements Serializable{
    private Long delivererId;

    private String delivererName;

    private String delivererPhone;

    private String delivererIdcard;

    private String delivererUsername;

    private String delivererPassword;

    private String delivererState;

    private Integer delivererCreditworthiness;

    private String delivererStatus;

    public Long getDelivererId() {
        return delivererId;
    }

    public void setDelivererId(Long delivererId) {
        this.delivererId = delivererId;
    }

    public String getDelivererName() {
        return delivererName;
    }

    public void setDelivererName(String delivererName) {
        this.delivererName = delivererName == null ? null : delivererName.trim();
    }

    public String getDelivererPhone() {
        return delivererPhone;
    }

    public void setDelivererPhone(String delivererPhone) {
        this.delivererPhone = delivererPhone == null ? null : delivererPhone.trim();
    }

    public String getDelivererIdcard() {
        return delivererIdcard;
    }

    public void setDelivererIdcard(String delivererIdcard) {
        this.delivererIdcard = delivererIdcard == null ? null : delivererIdcard.trim();
    }

    public String getDelivererUsername() {
        return delivererUsername;
    }

    public void setDelivererUsername(String delivererUsername) {
        this.delivererUsername = delivererUsername == null ? null : delivererUsername.trim();
    }

    public String getDelivererPassword() {
        return delivererPassword;
    }

    public void setDelivererPassword(String delivererPassword) {
        this.delivererPassword = delivererPassword == null ? null : delivererPassword.trim();
    }

    public String getDelivererState() {
        return delivererState;
    }

    public void setDelivererState(String delivererState) {
        this.delivererState = delivererState == null ? null : delivererState.trim();
    }

    public Integer getDelivererCreditworthiness() {
        return delivererCreditworthiness;
    }

    public void setDelivererCreditworthiness(Integer delivererCreditworthiness) {
        this.delivererCreditworthiness = delivererCreditworthiness;
    }

    public String getDelivererStatus() {
        return delivererStatus;
    }

    public void setDelivererStatus(String delivererStatus) {
        this.delivererStatus = delivererStatus == null ? null : delivererStatus.trim();
    }
}