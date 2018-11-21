package com.warcraft.pojo;

import java.util.ArrayList;
import java.util.List;

public class BuyerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BuyerInfoExample() {
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

        public Criteria andBuyerIdIsNull() {
            addCriterion("buyer_id is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIsNotNull() {
            addCriterion("buyer_id is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerIdEqualTo(Long value) {
            addCriterion("buyer_id =", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotEqualTo(Long value) {
            addCriterion("buyer_id <>", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThan(Long value) {
            addCriterion("buyer_id >", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("buyer_id >=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThan(Long value) {
            addCriterion("buyer_id <", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdLessThanOrEqualTo(Long value) {
            addCriterion("buyer_id <=", value, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdIn(List<Long> values) {
            addCriterion("buyer_id in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotIn(List<Long> values) {
            addCriterion("buyer_id not in", values, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdBetween(Long value1, Long value2) {
            addCriterion("buyer_id between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerIdNotBetween(Long value1, Long value2) {
            addCriterion("buyer_id not between", value1, value2, "buyerId");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNull() {
            addCriterion("buyer_name is null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIsNotNull() {
            addCriterion("buyer_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerNameEqualTo(String value) {
            addCriterion("buyer_name =", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotEqualTo(String value) {
            addCriterion("buyer_name <>", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThan(String value) {
            addCriterion("buyer_name >", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_name >=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThan(String value) {
            addCriterion("buyer_name <", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLessThanOrEqualTo(String value) {
            addCriterion("buyer_name <=", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameLike(String value) {
            addCriterion("buyer_name like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotLike(String value) {
            addCriterion("buyer_name not like", value, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameIn(List<String> values) {
            addCriterion("buyer_name in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotIn(List<String> values) {
            addCriterion("buyer_name not in", values, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameBetween(String value1, String value2) {
            addCriterion("buyer_name between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerNameNotBetween(String value1, String value2) {
            addCriterion("buyer_name not between", value1, value2, "buyerName");
            return (Criteria) this;
        }

        public Criteria andBuyerGenderIsNull() {
            addCriterion("buyer_gender is null");
            return (Criteria) this;
        }

        public Criteria andBuyerGenderIsNotNull() {
            addCriterion("buyer_gender is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerGenderEqualTo(String value) {
            addCriterion("buyer_gender =", value, "buyerGender");
            return (Criteria) this;
        }

        public Criteria andBuyerGenderNotEqualTo(String value) {
            addCriterion("buyer_gender <>", value, "buyerGender");
            return (Criteria) this;
        }

        public Criteria andBuyerGenderGreaterThan(String value) {
            addCriterion("buyer_gender >", value, "buyerGender");
            return (Criteria) this;
        }

        public Criteria andBuyerGenderGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_gender >=", value, "buyerGender");
            return (Criteria) this;
        }

        public Criteria andBuyerGenderLessThan(String value) {
            addCriterion("buyer_gender <", value, "buyerGender");
            return (Criteria) this;
        }

        public Criteria andBuyerGenderLessThanOrEqualTo(String value) {
            addCriterion("buyer_gender <=", value, "buyerGender");
            return (Criteria) this;
        }

        public Criteria andBuyerGenderLike(String value) {
            addCriterion("buyer_gender like", value, "buyerGender");
            return (Criteria) this;
        }

        public Criteria andBuyerGenderNotLike(String value) {
            addCriterion("buyer_gender not like", value, "buyerGender");
            return (Criteria) this;
        }

        public Criteria andBuyerGenderIn(List<String> values) {
            addCriterion("buyer_gender in", values, "buyerGender");
            return (Criteria) this;
        }

        public Criteria andBuyerGenderNotIn(List<String> values) {
            addCriterion("buyer_gender not in", values, "buyerGender");
            return (Criteria) this;
        }

        public Criteria andBuyerGenderBetween(String value1, String value2) {
            addCriterion("buyer_gender between", value1, value2, "buyerGender");
            return (Criteria) this;
        }

        public Criteria andBuyerGenderNotBetween(String value1, String value2) {
            addCriterion("buyer_gender not between", value1, value2, "buyerGender");
            return (Criteria) this;
        }

        public Criteria andBuyerTelIsNull() {
            addCriterion("buyer_tel is null");
            return (Criteria) this;
        }

        public Criteria andBuyerTelIsNotNull() {
            addCriterion("buyer_tel is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerTelEqualTo(String value) {
            addCriterion("buyer_tel =", value, "buyerTel");
            return (Criteria) this;
        }

        public Criteria andBuyerTelNotEqualTo(String value) {
            addCriterion("buyer_tel <>", value, "buyerTel");
            return (Criteria) this;
        }

        public Criteria andBuyerTelGreaterThan(String value) {
            addCriterion("buyer_tel >", value, "buyerTel");
            return (Criteria) this;
        }

        public Criteria andBuyerTelGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_tel >=", value, "buyerTel");
            return (Criteria) this;
        }

        public Criteria andBuyerTelLessThan(String value) {
            addCriterion("buyer_tel <", value, "buyerTel");
            return (Criteria) this;
        }

        public Criteria andBuyerTelLessThanOrEqualTo(String value) {
            addCriterion("buyer_tel <=", value, "buyerTel");
            return (Criteria) this;
        }

        public Criteria andBuyerTelLike(String value) {
            addCriterion("buyer_tel like", value, "buyerTel");
            return (Criteria) this;
        }

        public Criteria andBuyerTelNotLike(String value) {
            addCriterion("buyer_tel not like", value, "buyerTel");
            return (Criteria) this;
        }

        public Criteria andBuyerTelIn(List<String> values) {
            addCriterion("buyer_tel in", values, "buyerTel");
            return (Criteria) this;
        }

        public Criteria andBuyerTelNotIn(List<String> values) {
            addCriterion("buyer_tel not in", values, "buyerTel");
            return (Criteria) this;
        }

        public Criteria andBuyerTelBetween(String value1, String value2) {
            addCriterion("buyer_tel between", value1, value2, "buyerTel");
            return (Criteria) this;
        }

        public Criteria andBuyerTelNotBetween(String value1, String value2) {
            addCriterion("buyer_tel not between", value1, value2, "buyerTel");
            return (Criteria) this;
        }

        public Criteria andBuyerAddrIsNull() {
            addCriterion("buyer_addr is null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddrIsNotNull() {
            addCriterion("buyer_addr is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerAddrEqualTo(String value) {
            addCriterion("buyer_addr =", value, "buyerAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerAddrNotEqualTo(String value) {
            addCriterion("buyer_addr <>", value, "buyerAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerAddrGreaterThan(String value) {
            addCriterion("buyer_addr >", value, "buyerAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerAddrGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_addr >=", value, "buyerAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerAddrLessThan(String value) {
            addCriterion("buyer_addr <", value, "buyerAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerAddrLessThanOrEqualTo(String value) {
            addCriterion("buyer_addr <=", value, "buyerAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerAddrLike(String value) {
            addCriterion("buyer_addr like", value, "buyerAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerAddrNotLike(String value) {
            addCriterion("buyer_addr not like", value, "buyerAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerAddrIn(List<String> values) {
            addCriterion("buyer_addr in", values, "buyerAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerAddrNotIn(List<String> values) {
            addCriterion("buyer_addr not in", values, "buyerAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerAddrBetween(String value1, String value2) {
            addCriterion("buyer_addr between", value1, value2, "buyerAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerAddrNotBetween(String value1, String value2) {
            addCriterion("buyer_addr not between", value1, value2, "buyerAddr");
            return (Criteria) this;
        }

        public Criteria andBuyerCardIsNull() {
            addCriterion("buyer_card is null");
            return (Criteria) this;
        }

        public Criteria andBuyerCardIsNotNull() {
            addCriterion("buyer_card is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerCardEqualTo(String value) {
            addCriterion("buyer_card =", value, "buyerCard");
            return (Criteria) this;
        }

        public Criteria andBuyerCardNotEqualTo(String value) {
            addCriterion("buyer_card <>", value, "buyerCard");
            return (Criteria) this;
        }

        public Criteria andBuyerCardGreaterThan(String value) {
            addCriterion("buyer_card >", value, "buyerCard");
            return (Criteria) this;
        }

        public Criteria andBuyerCardGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_card >=", value, "buyerCard");
            return (Criteria) this;
        }

        public Criteria andBuyerCardLessThan(String value) {
            addCriterion("buyer_card <", value, "buyerCard");
            return (Criteria) this;
        }

        public Criteria andBuyerCardLessThanOrEqualTo(String value) {
            addCriterion("buyer_card <=", value, "buyerCard");
            return (Criteria) this;
        }

        public Criteria andBuyerCardLike(String value) {
            addCriterion("buyer_card like", value, "buyerCard");
            return (Criteria) this;
        }

        public Criteria andBuyerCardNotLike(String value) {
            addCriterion("buyer_card not like", value, "buyerCard");
            return (Criteria) this;
        }

        public Criteria andBuyerCardIn(List<String> values) {
            addCriterion("buyer_card in", values, "buyerCard");
            return (Criteria) this;
        }

        public Criteria andBuyerCardNotIn(List<String> values) {
            addCriterion("buyer_card not in", values, "buyerCard");
            return (Criteria) this;
        }

        public Criteria andBuyerCardBetween(String value1, String value2) {
            addCriterion("buyer_card between", value1, value2, "buyerCard");
            return (Criteria) this;
        }

        public Criteria andBuyerCardNotBetween(String value1, String value2) {
            addCriterion("buyer_card not between", value1, value2, "buyerCard");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameIsNull() {
            addCriterion("buyer_username is null");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameIsNotNull() {
            addCriterion("buyer_username is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameEqualTo(String value) {
            addCriterion("buyer_username =", value, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameNotEqualTo(String value) {
            addCriterion("buyer_username <>", value, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameGreaterThan(String value) {
            addCriterion("buyer_username >", value, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_username >=", value, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameLessThan(String value) {
            addCriterion("buyer_username <", value, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameLessThanOrEqualTo(String value) {
            addCriterion("buyer_username <=", value, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameLike(String value) {
            addCriterion("buyer_username like", value, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameNotLike(String value) {
            addCriterion("buyer_username not like", value, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameIn(List<String> values) {
            addCriterion("buyer_username in", values, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameNotIn(List<String> values) {
            addCriterion("buyer_username not in", values, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameBetween(String value1, String value2) {
            addCriterion("buyer_username between", value1, value2, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerUsernameNotBetween(String value1, String value2) {
            addCriterion("buyer_username not between", value1, value2, "buyerUsername");
            return (Criteria) this;
        }

        public Criteria andBuyerPasswordIsNull() {
            addCriterion("buyer_password is null");
            return (Criteria) this;
        }

        public Criteria andBuyerPasswordIsNotNull() {
            addCriterion("buyer_password is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerPasswordEqualTo(String value) {
            addCriterion("buyer_password =", value, "buyerPassword");
            return (Criteria) this;
        }

        public Criteria andBuyerPasswordNotEqualTo(String value) {
            addCriterion("buyer_password <>", value, "buyerPassword");
            return (Criteria) this;
        }

        public Criteria andBuyerPasswordGreaterThan(String value) {
            addCriterion("buyer_password >", value, "buyerPassword");
            return (Criteria) this;
        }

        public Criteria andBuyerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_password >=", value, "buyerPassword");
            return (Criteria) this;
        }

        public Criteria andBuyerPasswordLessThan(String value) {
            addCriterion("buyer_password <", value, "buyerPassword");
            return (Criteria) this;
        }

        public Criteria andBuyerPasswordLessThanOrEqualTo(String value) {
            addCriterion("buyer_password <=", value, "buyerPassword");
            return (Criteria) this;
        }

        public Criteria andBuyerPasswordLike(String value) {
            addCriterion("buyer_password like", value, "buyerPassword");
            return (Criteria) this;
        }

        public Criteria andBuyerPasswordNotLike(String value) {
            addCriterion("buyer_password not like", value, "buyerPassword");
            return (Criteria) this;
        }

        public Criteria andBuyerPasswordIn(List<String> values) {
            addCriterion("buyer_password in", values, "buyerPassword");
            return (Criteria) this;
        }

        public Criteria andBuyerPasswordNotIn(List<String> values) {
            addCriterion("buyer_password not in", values, "buyerPassword");
            return (Criteria) this;
        }

        public Criteria andBuyerPasswordBetween(String value1, String value2) {
            addCriterion("buyer_password between", value1, value2, "buyerPassword");
            return (Criteria) this;
        }

        public Criteria andBuyerPasswordNotBetween(String value1, String value2) {
            addCriterion("buyer_password not between", value1, value2, "buyerPassword");
            return (Criteria) this;
        }

        public Criteria andBuyerStatusIsNull() {
            addCriterion("buyer_status is null");
            return (Criteria) this;
        }

        public Criteria andBuyerStatusIsNotNull() {
            addCriterion("buyer_status is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerStatusEqualTo(String value) {
            addCriterion("buyer_status =", value, "buyerStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerStatusNotEqualTo(String value) {
            addCriterion("buyer_status <>", value, "buyerStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerStatusGreaterThan(String value) {
            addCriterion("buyer_status >", value, "buyerStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerStatusGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_status >=", value, "buyerStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerStatusLessThan(String value) {
            addCriterion("buyer_status <", value, "buyerStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerStatusLessThanOrEqualTo(String value) {
            addCriterion("buyer_status <=", value, "buyerStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerStatusLike(String value) {
            addCriterion("buyer_status like", value, "buyerStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerStatusNotLike(String value) {
            addCriterion("buyer_status not like", value, "buyerStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerStatusIn(List<String> values) {
            addCriterion("buyer_status in", values, "buyerStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerStatusNotIn(List<String> values) {
            addCriterion("buyer_status not in", values, "buyerStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerStatusBetween(String value1, String value2) {
            addCriterion("buyer_status between", value1, value2, "buyerStatus");
            return (Criteria) this;
        }

        public Criteria andBuyerStatusNotBetween(String value1, String value2) {
            addCriterion("buyer_status not between", value1, value2, "buyerStatus");
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