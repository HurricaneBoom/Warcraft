package com.warcraft.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TrolleyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TrolleyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andTrolleyIdIsNull() {
            addCriterion("trolley_id is null");
            return (Criteria) this;
        }

        public Criteria andTrolleyIdIsNotNull() {
            addCriterion("trolley_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrolleyIdEqualTo(Long value) {
            addCriterion("trolley_id =", value, "trolleyId");
            return (Criteria) this;
        }

        public Criteria andTrolleyIdNotEqualTo(Long value) {
            addCriterion("trolley_id <>", value, "trolleyId");
            return (Criteria) this;
        }

        public Criteria andTrolleyIdGreaterThan(Long value) {
            addCriterion("trolley_id >", value, "trolleyId");
            return (Criteria) this;
        }

        public Criteria andTrolleyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("trolley_id >=", value, "trolleyId");
            return (Criteria) this;
        }

        public Criteria andTrolleyIdLessThan(Long value) {
            addCriterion("trolley_id <", value, "trolleyId");
            return (Criteria) this;
        }

        public Criteria andTrolleyIdLessThanOrEqualTo(Long value) {
            addCriterion("trolley_id <=", value, "trolleyId");
            return (Criteria) this;
        }

        public Criteria andTrolleyIdIn(List<Long> values) {
            addCriterion("trolley_id in", values, "trolleyId");
            return (Criteria) this;
        }

        public Criteria andTrolleyIdNotIn(List<Long> values) {
            addCriterion("trolley_id not in", values, "trolleyId");
            return (Criteria) this;
        }

        public Criteria andTrolleyIdBetween(Long value1, Long value2) {
            addCriterion("trolley_id between", value1, value2, "trolleyId");
            return (Criteria) this;
        }

        public Criteria andTrolleyIdNotBetween(Long value1, Long value2) {
            addCriterion("trolley_id not between", value1, value2, "trolleyId");
            return (Criteria) this;
        }

        public Criteria andDietIdIsNull() {
            addCriterion("diet_id is null");
            return (Criteria) this;
        }

        public Criteria andDietIdIsNotNull() {
            addCriterion("diet_id is not null");
            return (Criteria) this;
        }

        public Criteria andDietIdEqualTo(Long value) {
            addCriterion("diet_id =", value, "dietId");
            return (Criteria) this;
        }

        public Criteria andDietIdNotEqualTo(Long value) {
            addCriterion("diet_id <>", value, "dietId");
            return (Criteria) this;
        }

        public Criteria andDietIdGreaterThan(Long value) {
            addCriterion("diet_id >", value, "dietId");
            return (Criteria) this;
        }

        public Criteria andDietIdGreaterThanOrEqualTo(Long value) {
            addCriterion("diet_id >=", value, "dietId");
            return (Criteria) this;
        }

        public Criteria andDietIdLessThan(Long value) {
            addCriterion("diet_id <", value, "dietId");
            return (Criteria) this;
        }

        public Criteria andDietIdLessThanOrEqualTo(Long value) {
            addCriterion("diet_id <=", value, "dietId");
            return (Criteria) this;
        }

        public Criteria andDietIdIn(List<Long> values) {
            addCriterion("diet_id in", values, "dietId");
            return (Criteria) this;
        }

        public Criteria andDietIdNotIn(List<Long> values) {
            addCriterion("diet_id not in", values, "dietId");
            return (Criteria) this;
        }

        public Criteria andDietIdBetween(Long value1, Long value2) {
            addCriterion("diet_id between", value1, value2, "dietId");
            return (Criteria) this;
        }

        public Criteria andDietIdNotBetween(Long value1, Long value2) {
            addCriterion("diet_id not between", value1, value2, "dietId");
            return (Criteria) this;
        }

        public Criteria andTrolleyNumIsNull() {
            addCriterion("trolley_num is null");
            return (Criteria) this;
        }

        public Criteria andTrolleyNumIsNotNull() {
            addCriterion("trolley_num is not null");
            return (Criteria) this;
        }

        public Criteria andTrolleyNumEqualTo(Integer value) {
            addCriterion("trolley_num =", value, "trolleyNum");
            return (Criteria) this;
        }

        public Criteria andTrolleyNumNotEqualTo(Integer value) {
            addCriterion("trolley_num <>", value, "trolleyNum");
            return (Criteria) this;
        }

        public Criteria andTrolleyNumGreaterThan(Integer value) {
            addCriterion("trolley_num >", value, "trolleyNum");
            return (Criteria) this;
        }

        public Criteria andTrolleyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("trolley_num >=", value, "trolleyNum");
            return (Criteria) this;
        }

        public Criteria andTrolleyNumLessThan(Integer value) {
            addCriterion("trolley_num <", value, "trolleyNum");
            return (Criteria) this;
        }

        public Criteria andTrolleyNumLessThanOrEqualTo(Integer value) {
            addCriterion("trolley_num <=", value, "trolleyNum");
            return (Criteria) this;
        }

        public Criteria andTrolleyNumIn(List<Integer> values) {
            addCriterion("trolley_num in", values, "trolleyNum");
            return (Criteria) this;
        }

        public Criteria andTrolleyNumNotIn(List<Integer> values) {
            addCriterion("trolley_num not in", values, "trolleyNum");
            return (Criteria) this;
        }

        public Criteria andTrolleyNumBetween(Integer value1, Integer value2) {
            addCriterion("trolley_num between", value1, value2, "trolleyNum");
            return (Criteria) this;
        }

        public Criteria andTrolleyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("trolley_num not between", value1, value2, "trolleyNum");
            return (Criteria) this;
        }

        public Criteria andTrolleyMoneyIsNull() {
            addCriterion("trolley_money is null");
            return (Criteria) this;
        }

        public Criteria andTrolleyMoneyIsNotNull() {
            addCriterion("trolley_money is not null");
            return (Criteria) this;
        }

        public Criteria andTrolleyMoneyEqualTo(BigDecimal value) {
            addCriterion("trolley_money =", value, "trolleyMoney");
            return (Criteria) this;
        }

        public Criteria andTrolleyMoneyNotEqualTo(BigDecimal value) {
            addCriterion("trolley_money <>", value, "trolleyMoney");
            return (Criteria) this;
        }

        public Criteria andTrolleyMoneyGreaterThan(BigDecimal value) {
            addCriterion("trolley_money >", value, "trolleyMoney");
            return (Criteria) this;
        }

        public Criteria andTrolleyMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("trolley_money >=", value, "trolleyMoney");
            return (Criteria) this;
        }

        public Criteria andTrolleyMoneyLessThan(BigDecimal value) {
            addCriterion("trolley_money <", value, "trolleyMoney");
            return (Criteria) this;
        }

        public Criteria andTrolleyMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("trolley_money <=", value, "trolleyMoney");
            return (Criteria) this;
        }

        public Criteria andTrolleyMoneyIn(List<BigDecimal> values) {
            addCriterion("trolley_money in", values, "trolleyMoney");
            return (Criteria) this;
        }

        public Criteria andTrolleyMoneyNotIn(List<BigDecimal> values) {
            addCriterion("trolley_money not in", values, "trolleyMoney");
            return (Criteria) this;
        }

        public Criteria andTrolleyMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trolley_money between", value1, value2, "trolleyMoney");
            return (Criteria) this;
        }

        public Criteria andTrolleyMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trolley_money not between", value1, value2, "trolleyMoney");
            return (Criteria) this;
        }

        public Criteria andTrolleyDiscountIsNull() {
            addCriterion("trolley_discount is null");
            return (Criteria) this;
        }

        public Criteria andTrolleyDiscountIsNotNull() {
            addCriterion("trolley_discount is not null");
            return (Criteria) this;
        }

        public Criteria andTrolleyDiscountEqualTo(BigDecimal value) {
            addCriterion("trolley_discount =", value, "trolleyDiscount");
            return (Criteria) this;
        }

        public Criteria andTrolleyDiscountNotEqualTo(BigDecimal value) {
            addCriterion("trolley_discount <>", value, "trolleyDiscount");
            return (Criteria) this;
        }

        public Criteria andTrolleyDiscountGreaterThan(BigDecimal value) {
            addCriterion("trolley_discount >", value, "trolleyDiscount");
            return (Criteria) this;
        }

        public Criteria andTrolleyDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("trolley_discount >=", value, "trolleyDiscount");
            return (Criteria) this;
        }

        public Criteria andTrolleyDiscountLessThan(BigDecimal value) {
            addCriterion("trolley_discount <", value, "trolleyDiscount");
            return (Criteria) this;
        }

        public Criteria andTrolleyDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("trolley_discount <=", value, "trolleyDiscount");
            return (Criteria) this;
        }

        public Criteria andTrolleyDiscountIn(List<BigDecimal> values) {
            addCriterion("trolley_discount in", values, "trolleyDiscount");
            return (Criteria) this;
        }

        public Criteria andTrolleyDiscountNotIn(List<BigDecimal> values) {
            addCriterion("trolley_discount not in", values, "trolleyDiscount");
            return (Criteria) this;
        }

        public Criteria andTrolleyDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trolley_discount between", value1, value2, "trolleyDiscount");
            return (Criteria) this;
        }

        public Criteria andTrolleyDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("trolley_discount not between", value1, value2, "trolleyDiscount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}