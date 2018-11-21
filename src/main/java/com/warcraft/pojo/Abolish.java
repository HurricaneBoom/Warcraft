package com.warcraft.pojo;

import java.util.Date;

public class Abolish {
    private Long abolishId;

    private Long indentId;

    private Date abolishTime;

    private String abolishReason;

    public Long getAbolishId() {
        return abolishId;
    }

    public void setAbolishId(Long abolishId) {
        this.abolishId = abolishId;
    }

    public Long getIndentId() {
        return indentId;
    }

    public void setIndentId(Long indentId) {
        this.indentId = indentId;
    }

    public Date getAbolishTime() {
        return abolishTime;
    }

    public void setAbolishTime(Date abolishTime) {
        this.abolishTime = abolishTime;
    }

    public String getAbolishReason() {
        return abolishReason;
    }

    public void setAbolishReason(String abolishReason) {
        this.abolishReason = abolishReason == null ? null : abolishReason.trim();
    }
}