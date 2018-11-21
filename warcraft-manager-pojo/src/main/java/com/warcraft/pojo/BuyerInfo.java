package com.warcraft.pojo;

import java.io.Serializable;

public class BuyerInfo implements Serializable{
    private Long buyerId;

    private String buyerName;

    private String buyerGender;

    private String buyerTel;

    private String buyerAddr;

    private String buyerCard;

    private String buyerUsername;

    private String buyerPassword;

    private String buyerStatus;

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    public String getBuyerGender() {
        return buyerGender;
    }

    public void setBuyerGender(String buyerGender) {
        this.buyerGender = buyerGender == null ? null : buyerGender.trim();
    }

    public String getBuyerTel() {
        return buyerTel;
    }

    public void setBuyerTel(String buyerTel) {
        this.buyerTel = buyerTel == null ? null : buyerTel.trim();
    }

    public String getBuyerAddr() {
        return buyerAddr;
    }

    public void setBuyerAddr(String buyerAddr) {
        this.buyerAddr = buyerAddr == null ? null : buyerAddr.trim();
    }

    public String getBuyerCard() {
        return buyerCard;
    }

    public void setBuyerCard(String buyerCard) {
        this.buyerCard = buyerCard == null ? null : buyerCard.trim();
    }

    public String getBuyerUsername() {
        return buyerUsername;
    }

    public void setBuyerUsername(String buyerUsername) {
        this.buyerUsername = buyerUsername == null ? null : buyerUsername.trim();
    }

    public String getBuyerPassword() {
        return buyerPassword;
    }

    public void setBuyerPassword(String buyerPassword) {
        this.buyerPassword = buyerPassword == null ? null : buyerPassword.trim();
    }

    public String getBuyerStatus() {
        return buyerStatus;
    }

    public void setBuyerStatus(String buyerStatus) {
        this.buyerStatus = buyerStatus == null ? null : buyerStatus.trim();
    }

	@Override
	public String toString() {
		return "BuyerInfo [buyerId=" + buyerId + ", buyerName=" + buyerName + ", buyerGender=" + buyerGender
				+ ", buyerTel=" + buyerTel + ", buyerAddr=" + buyerAddr + ", buyerCard=" + buyerCard
				+ ", buyerUsername=" + buyerUsername + ", buyerPassword=" + buyerPassword + ", buyerStatus="
				+ buyerStatus + "]";
	}
    
}