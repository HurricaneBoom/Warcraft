package com.warcraft.pojo;

import java.io.Serializable;
import java.util.Date;

public class ManagerInfo implements Serializable{
    private Long managerId;

    private String managerUsername;

    private String managerPassword;

    private String managerPhone;

    private String managerEmail;

    private Date mangerCreated;

    private Date mangerUpdated;

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public String getManagerUsername() {
        return managerUsername;
    }

    public void setManagerUsername(String managerUsername) {
        this.managerUsername = managerUsername == null ? null : managerUsername.trim();
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword == null ? null : managerPassword.trim();
    }

    public String getManagerPhone() {
        return managerPhone;
    }

    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone == null ? null : managerPhone.trim();
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail == null ? null : managerEmail.trim();
    }

    public Date getMangerCreated() {
        return mangerCreated;
    }

    public void setMangerCreated(Date mangerCreated) {
        this.mangerCreated = mangerCreated;
    }

    public Date getMangerUpdated() {
        return mangerUpdated;
    }

    public void setMangerUpdated(Date mangerUpdated) {
        this.mangerUpdated = mangerUpdated;
    }
}