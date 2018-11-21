package com.warcraft.pojo;

import java.io.Serializable;
import java.util.Date;

public class BossInfo implements Serializable{
    private Long bossId;

    private Long storeId;

    private String bossUsername;

    private String bossPassword;

    private String bossName;

    private String bossIdcard;

    private String bossLicensename;

    private String bossLicenseregistnumber;

    private String bossLicenseregistaddr;

    private String bossLicenseid;

    private Date bossLicensetime;

    public Long getBossId() {
        return bossId;
    }

    public void setBossId(Long bossId) {
        this.bossId = bossId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public String getBossUsername() {
        return bossUsername;
    }

    public void setBossUsername(String bossUsername) {
        this.bossUsername = bossUsername == null ? null : bossUsername.trim();
    }

    public String getBossPassword() {
        return bossPassword;
    }

    public void setBossPassword(String bossPassword) {
        this.bossPassword = bossPassword == null ? null : bossPassword.trim();
    }

    public String getBossName() {
        return bossName;
    }

    public void setBossName(String bossName) {
        this.bossName = bossName == null ? null : bossName.trim();
    }

    public String getBossIdcard() {
        return bossIdcard;
    }

    public void setBossIdcard(String bossIdcard) {
        this.bossIdcard = bossIdcard == null ? null : bossIdcard.trim();
    }

    public String getBossLicensename() {
        return bossLicensename;
    }

    public void setBossLicensename(String bossLicensename) {
        this.bossLicensename = bossLicensename == null ? null : bossLicensename.trim();
    }

    public String getBossLicenseregistnumber() {
        return bossLicenseregistnumber;
    }

    public void setBossLicenseregistnumber(String bossLicenseregistnumber) {
        this.bossLicenseregistnumber = bossLicenseregistnumber == null ? null : bossLicenseregistnumber.trim();
    }

    public String getBossLicenseregistaddr() {
        return bossLicenseregistaddr;
    }

    public void setBossLicenseregistaddr(String bossLicenseregistaddr) {
        this.bossLicenseregistaddr = bossLicenseregistaddr == null ? null : bossLicenseregistaddr.trim();
    }

    public String getBossLicenseid() {
        return bossLicenseid;
    }

    public void setBossLicenseid(String bossLicenseid) {
        this.bossLicenseid = bossLicenseid == null ? null : bossLicenseid.trim();
    }

    public Date getBossLicensetime() {
        return bossLicensetime;
    }

    public void setBossLicensetime(Date bossLicensetime) {
        this.bossLicensetime = bossLicensetime;
    }
}