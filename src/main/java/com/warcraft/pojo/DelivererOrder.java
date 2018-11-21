package com.warcraft.pojo;

import java.util.Date;

public class DelivererOrder {
    private Long delivererId;

    private Date delivererOrderStarttime;

    private Date delivererOrderEndtime;

    private Date elivererOrderDate;

    private Long indentId;

    public Long getDelivererId() {
        return delivererId;
    }

    public void setDelivererId(Long delivererId) {
        this.delivererId = delivererId;
    }

    public Date getDelivererOrderStarttime() {
        return delivererOrderStarttime;
    }

    public void setDelivererOrderStarttime(Date delivererOrderStarttime) {
        this.delivererOrderStarttime = delivererOrderStarttime;
    }

    public Date getDelivererOrderEndtime() {
        return delivererOrderEndtime;
    }

    public void setDelivererOrderEndtime(Date delivererOrderEndtime) {
        this.delivererOrderEndtime = delivererOrderEndtime;
    }

    public Date getElivererOrderDate() {
        return elivererOrderDate;
    }

    public void setElivererOrderDate(Date elivererOrderDate) {
        this.elivererOrderDate = elivererOrderDate;
    }

    public Long getIndentId() {
        return indentId;
    }

    public void setIndentId(Long indentId) {
        this.indentId = indentId;
    }
}