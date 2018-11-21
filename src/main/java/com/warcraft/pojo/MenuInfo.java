package com.warcraft.pojo;

import java.math.BigDecimal;

public class MenuInfo {
    private Long dietId;

    private Long storeId;

    private String dietName;

    private BigDecimal dietPrice;

    private String dietDescription;

    private String dietPicture;

    private String dietStatus;

    public Long getDietId() {
        return dietId;
    }

    public void setDietId(Long dietId) {
        this.dietId = dietId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getDietName() {
        return dietName;
    }

    public void setDietName(String dietName) {
        this.dietName = dietName == null ? null : dietName.trim();
    }

    public BigDecimal getDietPrice() {
        return dietPrice;
    }

    public void setDietPrice(BigDecimal dietPrice) {
        this.dietPrice = dietPrice;
    }

    public String getDietDescription() {
        return dietDescription;
    }

    public void setDietDescription(String dietDescription) {
        this.dietDescription = dietDescription == null ? null : dietDescription.trim();
    }

    public String getDietPicture() {
        return dietPicture;
    }

    public void setDietPicture(String dietPicture) {
        this.dietPicture = dietPicture == null ? null : dietPicture.trim();
    }

    public String getDietStatus() {
        return dietStatus;
    }

    public void setDietStatus(String dietStatus) {
        this.dietStatus = dietStatus == null ? null : dietStatus.trim();
    }
}