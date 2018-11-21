package com.warcraft.pojo;

import java.math.BigDecimal;

public class Trolley {
    private Long trolleyId;

    private Long dietId;

    private Integer trolleyNum;

    private BigDecimal trolleyMoney;

    private BigDecimal trolleyDiscount;

    public Long getTrolleyId() {
        return trolleyId;
    }

    public void setTrolleyId(Long trolleyId) {
        this.trolleyId = trolleyId;
    }

    public Long getDietId() {
        return dietId;
    }

    public void setDietId(Long dietId) {
        this.dietId = dietId;
    }

    public Integer getTrolleyNum() {
        return trolleyNum;
    }

    public void setTrolleyNum(Integer trolleyNum) {
        this.trolleyNum = trolleyNum;
    }

    public BigDecimal getTrolleyMoney() {
        return trolleyMoney;
    }

    public void setTrolleyMoney(BigDecimal trolleyMoney) {
        this.trolleyMoney = trolleyMoney;
    }

    public BigDecimal getTrolleyDiscount() {
        return trolleyDiscount;
    }

    public void setTrolleyDiscount(BigDecimal trolleyDiscount) {
        this.trolleyDiscount = trolleyDiscount;
    }

	@Override
	public String toString() {
		return "Trolley [trolleyId=" + trolleyId + ", dietId=" + dietId + ", trolleyNum=" + trolleyNum
				+ ", trolleyMoney=" + trolleyMoney + ", trolleyDiscount=" + trolleyDiscount + "]";
	}
}