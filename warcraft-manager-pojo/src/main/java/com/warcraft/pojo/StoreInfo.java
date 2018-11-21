package com.warcraft.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class StoreInfo implements Serializable{
    private Long storeId;

    private String storeName;

    private String storeAddr;

    private String storeCal;

    private String storeNotice;

    private String storeTime;

    private String storePic;

    private String storeHead;

    private String storeState;

    private String storeDiscount;

    private BigDecimal storeDeliveryprice;

    private String storeDeliveryrange;

    private String storeDelivertime;

    private String storeDeliverystate;

    private Integer storeCreditworthiness;

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreAddr() {
        return storeAddr;
    }

    public void setStoreAddr(String storeAddr) {
        this.storeAddr = storeAddr == null ? null : storeAddr.trim();
    }

    public String getStoreCal() {
        return storeCal;
    }

    public void setStoreCal(String storeCal) {
        this.storeCal = storeCal == null ? null : storeCal.trim();
    }

    public String getStoreNotice() {
        return storeNotice;
    }

    public void setStoreNotice(String storeNotice) {
        this.storeNotice = storeNotice == null ? null : storeNotice.trim();
    }

    public String getStoreTime() {
        return storeTime;
    }

    public void setStoreTime(String storeTime) {
        this.storeTime = storeTime == null ? null : storeTime.trim();
    }

    public String getStorePic() {
        return storePic;
    }

    public void setStorePic(String storePic) {
        this.storePic = storePic == null ? null : storePic.trim();
    }

    public String getStoreHead() {
        return storeHead;
    }

    public void setStoreHead(String storeHead) {
        this.storeHead = storeHead == null ? null : storeHead.trim();
    }

    public String getStoreState() {
        return storeState;
    }

    public void setStoreState(String storeState) {
        this.storeState = storeState == null ? null : storeState.trim();
    }

    public String getStoreDiscount() {
        return storeDiscount;
    }

    public void setStoreDiscount(String storeDiscount) {
        this.storeDiscount = storeDiscount == null ? null : storeDiscount.trim();
    }

    public BigDecimal getStoreDeliveryprice() {
        return storeDeliveryprice;
    }

    public void setStoreDeliveryprice(BigDecimal storeDeliveryprice) {
        this.storeDeliveryprice = storeDeliveryprice;
    }

    public String getStoreDeliveryrange() {
        return storeDeliveryrange;
    }

    public void setStoreDeliveryrange(String storeDeliveryrange) {
        this.storeDeliveryrange = storeDeliveryrange == null ? null : storeDeliveryrange.trim();
    }

    public String getStoreDelivertime() {
        return storeDelivertime;
    }

    public void setStoreDelivertime(String storeDelivertime) {
        this.storeDelivertime = storeDelivertime == null ? null : storeDelivertime.trim();
    }

    public String getStoreDeliverystate() {
        return storeDeliverystate;
    }

    public void setStoreDeliverystate(String storeDeliverystate) {
        this.storeDeliverystate = storeDeliverystate == null ? null : storeDeliverystate.trim();
    }

    public Integer getStoreCreditworthiness() {
        return storeCreditworthiness;
    }

    public void setStoreCreditworthiness(Integer storeCreditworthiness) {
        this.storeCreditworthiness = storeCreditworthiness;
    }
}