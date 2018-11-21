package com.warcraft.pojo;

import java.util.Date;

public class Indent {
    private Long indentId;

    private Long buyerId;

    private Long shoppingId;

    private Long storeId;

    private Long delivererId;

    private Long trolleyId;

    private Date indentSingletime;

    private Date indentStarttime;

    private Date indentEndtime;

    private String indentStatus;

    public Long getIndentId() {
        return indentId;
    }

    public void setIndentId(Long indentId) {
        this.indentId = indentId;
    }

    public Long getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Long buyerId) {
        this.buyerId = buyerId;
    }

    public Long getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(Long shoppingId) {
        this.shoppingId = shoppingId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getDelivererId() {
        return delivererId;
    }

    public void setDelivererId(Long delivererId) {
        this.delivererId = delivererId;
    }

    public Long getTrolleyId() {
        return trolleyId;
    }

    public void setTrolleyId(Long trolleyId) {
        this.trolleyId = trolleyId;
    }

    public Date getIndentSingletime() {
        return indentSingletime;
    }

    public void setIndentSingletime(Date indentSingletime) {
        this.indentSingletime = indentSingletime;
    }

    public Date getIndentStarttime() {
        return indentStarttime;
    }

    public void setIndentStarttime(Date indentStarttime) {
        this.indentStarttime = indentStarttime;
    }

    public Date getIndentEndtime() {
        return indentEndtime;
    }

    public void setIndentEndtime(Date indentEndtime) {
        this.indentEndtime = indentEndtime;
    }

    public String getIndentStatus() {
        return indentStatus;
    }

    public void setIndentStatus(String indentStatus) {
        this.indentStatus = indentStatus == null ? null : indentStatus.trim();
    }
}