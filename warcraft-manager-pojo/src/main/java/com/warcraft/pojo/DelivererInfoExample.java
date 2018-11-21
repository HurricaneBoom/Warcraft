package com.warcraft.pojo;

import java.util.ArrayList;
import java.util.List;

public class DelivererInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DelivererInfoExample() {
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

        public Criteria andDelivererIdIsNull() {
            addCriterion("deliverer_id is null");
            return (Criteria) this;
        }

        public Criteria andDelivererIdIsNotNull() {
            addCriterion("deliverer_id is not null");
            return (Criteria) this;
        }

        public Criteria andDelivererIdEqualTo(Long value) {
            addCriterion("deliverer_id =", value, "delivererId");
            return (Criteria) this;
        }

        public Criteria andDelivererIdNotEqualTo(Long value) {
            addCriterion("deliverer_id <>", value, "delivererId");
            return (Criteria) this;
        }

        public Criteria andDelivererIdGreaterThan(Long value) {
            addCriterion("deliverer_id >", value, "delivererId");
            return (Criteria) this;
        }

        public Criteria andDelivererIdGreaterThanOrEqualTo(Long value) {
            addCriterion("deliverer_id >=", value, "delivererId");
            return (Criteria) this;
        }

        public Criteria andDelivererIdLessThan(Long value) {
            addCriterion("deliverer_id <", value, "delivererId");
            return (Criteria) this;
        }

        public Criteria andDelivererIdLessThanOrEqualTo(Long value) {
            addCriterion("deliverer_id <=", value, "delivererId");
            return (Criteria) this;
        }

        public Criteria andDelivererIdIn(List<Long> values) {
            addCriterion("deliverer_id in", values, "delivererId");
            return (Criteria) this;
        }

        public Criteria andDelivererIdNotIn(List<Long> values) {
            addCriterion("deliverer_id not in", values, "delivererId");
            return (Criteria) this;
        }

        public Criteria andDelivererIdBetween(Long value1, Long value2) {
            addCriterion("deliverer_id between", value1, value2, "delivererId");
            return (Criteria) this;
        }

        public Criteria andDelivererIdNotBetween(Long value1, Long value2) {
            addCriterion("deliverer_id not between", value1, value2, "delivererId");
            return (Criteria) this;
        }

        public Criteria andDelivererNameIsNull() {
            addCriterion("deliverer_name is null");
            return (Criteria) this;
        }

        public Criteria andDelivererNameIsNotNull() {
            addCriterion("deliverer_name is not null");
            return (Criteria) this;
        }

        public Criteria andDelivererNameEqualTo(String value) {
            addCriterion("deliverer_name =", value, "delivererName");
            return (Criteria) this;
        }

        public Criteria andDelivererNameNotEqualTo(String value) {
            addCriterion("deliverer_name <>", value, "delivererName");
            return (Criteria) this;
        }

        public Criteria andDelivererNameGreaterThan(String value) {
            addCriterion("deliverer_name >", value, "delivererName");
            return (Criteria) this;
        }

        public Criteria andDelivererNameGreaterThanOrEqualTo(String value) {
            addCriterion("deliverer_name >=", value, "delivererName");
            return (Criteria) this;
        }

        public Criteria andDelivererNameLessThan(String value) {
            addCriterion("deliverer_name <", value, "delivererName");
            return (Criteria) this;
        }

        public Criteria andDelivererNameLessThanOrEqualTo(String value) {
            addCriterion("deliverer_name <=", value, "delivererName");
            return (Criteria) this;
        }

        public Criteria andDelivererNameLike(String value) {
            addCriterion("deliverer_name like", value, "delivererName");
            return (Criteria) this;
        }

        public Criteria andDelivererNameNotLike(String value) {
            addCriterion("deliverer_name not like", value, "delivererName");
            return (Criteria) this;
        }

        public Criteria andDelivererNameIn(List<String> values) {
            addCriterion("deliverer_name in", values, "delivererName");
            return (Criteria) this;
        }

        public Criteria andDelivererNameNotIn(List<String> values) {
            addCriterion("deliverer_name not in", values, "delivererName");
            return (Criteria) this;
        }

        public Criteria andDelivererNameBetween(String value1, String value2) {
            addCriterion("deliverer_name between", value1, value2, "delivererName");
            return (Criteria) this;
        }

        public Criteria andDelivererNameNotBetween(String value1, String value2) {
            addCriterion("deliverer_name not between", value1, value2, "delivererName");
            return (Criteria) this;
        }

        public Criteria andDelivererPhoneIsNull() {
            addCriterion("deliverer_phone is null");
            return (Criteria) this;
        }

        public Criteria andDelivererPhoneIsNotNull() {
            addCriterion("deliverer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDelivererPhoneEqualTo(String value) {
            addCriterion("deliverer_phone =", value, "delivererPhone");
            return (Criteria) this;
        }

        public Criteria andDelivererPhoneNotEqualTo(String value) {
            addCriterion("deliverer_phone <>", value, "delivererPhone");
            return (Criteria) this;
        }

        public Criteria andDelivererPhoneGreaterThan(String value) {
            addCriterion("deliverer_phone >", value, "delivererPhone");
            return (Criteria) this;
        }

        public Criteria andDelivererPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("deliverer_phone >=", value, "delivererPhone");
            return (Criteria) this;
        }

        public Criteria andDelivererPhoneLessThan(String value) {
            addCriterion("deliverer_phone <", value, "delivererPhone");
            return (Criteria) this;
        }

        public Criteria andDelivererPhoneLessThanOrEqualTo(String value) {
            addCriterion("deliverer_phone <=", value, "delivererPhone");
            return (Criteria) this;
        }

        public Criteria andDelivererPhoneLike(String value) {
            addCriterion("deliverer_phone like", value, "delivererPhone");
            return (Criteria) this;
        }

        public Criteria andDelivererPhoneNotLike(String value) {
            addCriterion("deliverer_phone not like", value, "delivererPhone");
            return (Criteria) this;
        }

        public Criteria andDelivererPhoneIn(List<String> values) {
            addCriterion("deliverer_phone in", values, "delivererPhone");
            return (Criteria) this;
        }

        public Criteria andDelivererPhoneNotIn(List<String> values) {
            addCriterion("deliverer_phone not in", values, "delivererPhone");
            return (Criteria) this;
        }

        public Criteria andDelivererPhoneBetween(String value1, String value2) {
            addCriterion("deliverer_phone between", value1, value2, "delivererPhone");
            return (Criteria) this;
        }

        public Criteria andDelivererPhoneNotBetween(String value1, String value2) {
            addCriterion("deliverer_phone not between", value1, value2, "delivererPhone");
            return (Criteria) this;
        }

        public Criteria andDelivererIdcardIsNull() {
            addCriterion("deliverer_idcard is null");
            return (Criteria) this;
        }

        public Criteria andDelivererIdcardIsNotNull() {
            addCriterion("deliverer_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andDelivererIdcardEqualTo(String value) {
            addCriterion("deliverer_idcard =", value, "delivererIdcard");
            return (Criteria) this;
        }

        public Criteria andDelivererIdcardNotEqualTo(String value) {
            addCriterion("deliverer_idcard <>", value, "delivererIdcard");
            return (Criteria) this;
        }

        public Criteria andDelivererIdcardGreaterThan(String value) {
            addCriterion("deliverer_idcard >", value, "delivererIdcard");
            return (Criteria) this;
        }

        public Criteria andDelivererIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("deliverer_idcard >=", value, "delivererIdcard");
            return (Criteria) this;
        }

        public Criteria andDelivererIdcardLessThan(String value) {
            addCriterion("deliverer_idcard <", value, "delivererIdcard");
            return (Criteria) this;
        }

        public Criteria andDelivererIdcardLessThanOrEqualTo(String value) {
            addCriterion("deliverer_idcard <=", value, "delivererIdcard");
            return (Criteria) this;
        }

        public Criteria andDelivererIdcardLike(String value) {
            addCriterion("deliverer_idcard like", value, "delivererIdcard");
            return (Criteria) this;
        }

        public Criteria andDelivererIdcardNotLike(String value) {
            addCriterion("deliverer_idcard not like", value, "delivererIdcard");
            return (Criteria) this;
        }

        public Criteria andDelivererIdcardIn(List<String> values) {
            addCriterion("deliverer_idcard in", values, "delivererIdcard");
            return (Criteria) this;
        }

        public Criteria andDelivererIdcardNotIn(List<String> values) {
            addCriterion("deliverer_idcard not in", values, "delivererIdcard");
            return (Criteria) this;
        }

        public Criteria andDelivererIdcardBetween(String value1, String value2) {
            addCriterion("deliverer_idcard between", value1, value2, "delivererIdcard");
            return (Criteria) this;
        }

        public Criteria andDelivererIdcardNotBetween(String value1, String value2) {
            addCriterion("deliverer_idcard not between", value1, value2, "delivererIdcard");
            return (Criteria) this;
        }

        public Criteria andDelivererUsernameIsNull() {
            addCriterion("deliverer_username is null");
            return (Criteria) this;
        }

        public Criteria andDelivererUsernameIsNotNull() {
            addCriterion("deliverer_username is not null");
            return (Criteria) this;
        }

        public Criteria andDelivererUsernameEqualTo(String value) {
            addCriterion("deliverer_username =", value, "delivererUsername");
            return (Criteria) this;
        }

        public Criteria andDelivererUsernameNotEqualTo(String value) {
            addCriterion("deliverer_username <>", value, "delivererUsername");
            return (Criteria) this;
        }

        public Criteria andDelivererUsernameGreaterThan(String value) {
            addCriterion("deliverer_username >", value, "delivererUsername");
            return (Criteria) this;
        }

        public Criteria andDelivererUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("deliverer_username >=", value, "delivererUsername");
            return (Criteria) this;
        }

        public Criteria andDelivererUsernameLessThan(String value) {
            addCriterion("deliverer_username <", value, "delivererUsername");
            return (Criteria) this;
        }

        public Criteria andDelivererUsernameLessThanOrEqualTo(String value) {
            addCriterion("deliverer_username <=", value, "delivererUsername");
            return (Criteria) this;
        }

        public Criteria andDelivererUsernameLike(String value) {
            addCriterion("deliverer_username like", value, "delivererUsername");
            return (Criteria) this;
        }

        public Criteria andDelivererUsernameNotLike(String value) {
            addCriterion("deliverer_username not like", value, "delivererUsername");
            return (Criteria) this;
        }

        public Criteria andDelivererUsernameIn(List<String> values) {
            addCriterion("deliverer_username in", values, "delivererUsername");
            return (Criteria) this;
        }

        public Criteria andDelivererUsernameNotIn(List<String> values) {
            addCriterion("deliverer_username not in", values, "delivererUsername");
            return (Criteria) this;
        }

        public Criteria andDelivererUsernameBetween(String value1, String value2) {
            addCriterion("deliverer_username between", value1, value2, "delivererUsername");
            return (Criteria) this;
        }

        public Criteria andDelivererUsernameNotBetween(String value1, String value2) {
            addCriterion("deliverer_username not between", value1, value2, "delivererUsername");
            return (Criteria) this;
        }

        public Criteria andDelivererPasswordIsNull() {
            addCriterion("deliverer_password is null");
            return (Criteria) this;
        }

        public Criteria andDelivererPasswordIsNotNull() {
            addCriterion("deliverer_password is not null");
            return (Criteria) this;
        }

        public Criteria andDelivererPasswordEqualTo(String value) {
            addCriterion("deliverer_password =", value, "delivererPassword");
            return (Criteria) this;
        }

        public Criteria andDelivererPasswordNotEqualTo(String value) {
            addCriterion("deliverer_password <>", value, "delivererPassword");
            return (Criteria) this;
        }

        public Criteria andDelivererPasswordGreaterThan(String value) {
            addCriterion("deliverer_password >", value, "delivererPassword");
            return (Criteria) this;
        }

        public Criteria andDelivererPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("deliverer_password >=", value, "delivererPassword");
            return (Criteria) this;
        }

        public Criteria andDelivererPasswordLessThan(String value) {
            addCriterion("deliverer_password <", value, "delivererPassword");
            return (Criteria) this;
        }

        public Criteria andDelivererPasswordLessThanOrEqualTo(String value) {
            addCriterion("deliverer_password <=", value, "delivererPassword");
            return (Criteria) this;
        }

        public Criteria andDelivererPasswordLike(String value) {
            addCriterion("deliverer_password like", value, "delivererPassword");
            return (Criteria) this;
        }

        public Criteria andDelivererPasswordNotLike(String value) {
            addCriterion("deliverer_password not like", value, "delivererPassword");
            return (Criteria) this;
        }

        public Criteria andDelivererPasswordIn(List<String> values) {
            addCriterion("deliverer_password in", values, "delivererPassword");
            return (Criteria) this;
        }

        public Criteria andDelivererPasswordNotIn(List<String> values) {
            addCriterion("deliverer_password not in", values, "delivererPassword");
            return (Criteria) this;
        }

        public Criteria andDelivererPasswordBetween(String value1, String value2) {
            addCriterion("deliverer_password between", value1, value2, "delivererPassword");
            return (Criteria) this;
        }

        public Criteria andDelivererPasswordNotBetween(String value1, String value2) {
            addCriterion("deliverer_password not between", value1, value2, "delivererPassword");
            return (Criteria) this;
        }

        public Criteria andDelivererStateIsNull() {
            addCriterion("deliverer_state is null");
            return (Criteria) this;
        }

        public Criteria andDelivererStateIsNotNull() {
            addCriterion("deliverer_state is not null");
            return (Criteria) this;
        }

        public Criteria andDelivererStateEqualTo(String value) {
            addCriterion("deliverer_state =", value, "delivererState");
            return (Criteria) this;
        }

        public Criteria andDelivererStateNotEqualTo(String value) {
            addCriterion("deliverer_state <>", value, "delivererState");
            return (Criteria) this;
        }

        public Criteria andDelivererStateGreaterThan(String value) {
            addCriterion("deliverer_state >", value, "delivererState");
            return (Criteria) this;
        }

        public Criteria andDelivererStateGreaterThanOrEqualTo(String value) {
            addCriterion("deliverer_state >=", value, "delivererState");
            return (Criteria) this;
        }

        public Criteria andDelivererStateLessThan(String value) {
            addCriterion("deliverer_state <", value, "delivererState");
            return (Criteria) this;
        }

        public Criteria andDelivererStateLessThanOrEqualTo(String value) {
            addCriterion("deliverer_state <=", value, "delivererState");
            return (Criteria) this;
        }

        public Criteria andDelivererStateLike(String value) {
            addCriterion("deliverer_state like", value, "delivererState");
            return (Criteria) this;
        }

        public Criteria andDelivererStateNotLike(String value) {
            addCriterion("deliverer_state not like", value, "delivererState");
            return (Criteria) this;
        }

        public Criteria andDelivererStateIn(List<String> values) {
            addCriterion("deliverer_state in", values, "delivererState");
            return (Criteria) this;
        }

        public Criteria andDelivererStateNotIn(List<String> values) {
            addCriterion("deliverer_state not in", values, "delivererState");
            return (Criteria) this;
        }

        public Criteria andDelivererStateBetween(String value1, String value2) {
            addCriterion("deliverer_state between", value1, value2, "delivererState");
            return (Criteria) this;
        }

        public Criteria andDelivererStateNotBetween(String value1, String value2) {
            addCriterion("deliverer_state not between", value1, value2, "delivererState");
            return (Criteria) this;
        }

        public Criteria andDelivererCreditworthinessIsNull() {
            addCriterion("deliverer_creditworthiness is null");
            return (Criteria) this;
        }

        public Criteria andDelivererCreditworthinessIsNotNull() {
            addCriterion("deliverer_creditworthiness is not null");
            return (Criteria) this;
        }

        public Criteria andDelivererCreditworthinessEqualTo(Integer value) {
            addCriterion("deliverer_creditworthiness =", value, "delivererCreditworthiness");
            return (Criteria) this;
        }

        public Criteria andDelivererCreditworthinessNotEqualTo(Integer value) {
            addCriterion("deliverer_creditworthiness <>", value, "delivererCreditworthiness");
            return (Criteria) this;
        }

        public Criteria andDelivererCreditworthinessGreaterThan(Integer value) {
            addCriterion("deliverer_creditworthiness >", value, "delivererCreditworthiness");
            return (Criteria) this;
        }

        public Criteria andDelivererCreditworthinessGreaterThanOrEqualTo(Integer value) {
            addCriterion("deliverer_creditworthiness >=", value, "delivererCreditworthiness");
            return (Criteria) this;
        }

        public Criteria andDelivererCreditworthinessLessThan(Integer value) {
            addCriterion("deliverer_creditworthiness <", value, "delivererCreditworthiness");
            return (Criteria) this;
        }

        public Criteria andDelivererCreditworthinessLessThanOrEqualTo(Integer value) {
            addCriterion("deliverer_creditworthiness <=", value, "delivererCreditworthiness");
            return (Criteria) this;
        }

        public Criteria andDelivererCreditworthinessIn(List<Integer> values) {
            addCriterion("deliverer_creditworthiness in", values, "delivererCreditworthiness");
            return (Criteria) this;
        }

        public Criteria andDelivererCreditworthinessNotIn(List<Integer> values) {
            addCriterion("deliverer_creditworthiness not in", values, "delivererCreditworthiness");
            return (Criteria) this;
        }

        public Criteria andDelivererCreditworthinessBetween(Integer value1, Integer value2) {
            addCriterion("deliverer_creditworthiness between", value1, value2, "delivererCreditworthiness");
            return (Criteria) this;
        }

        public Criteria andDelivererCreditworthinessNotBetween(Integer value1, Integer value2) {
            addCriterion("deliverer_creditworthiness not between", value1, value2, "delivererCreditworthiness");
            return (Criteria) this;
        }

        public Criteria andDelivererStatusIsNull() {
            addCriterion("deliverer_status is null");
            return (Criteria) this;
        }

        public Criteria andDelivererStatusIsNotNull() {
            addCriterion("deliverer_status is not null");
            return (Criteria) this;
        }

        public Criteria andDelivererStatusEqualTo(String value) {
            addCriterion("deliverer_status =", value, "delivererStatus");
            return (Criteria) this;
        }

        public Criteria andDelivererStatusNotEqualTo(String value) {
            addCriterion("deliverer_status <>", value, "delivererStatus");
            return (Criteria) this;
        }

        public Criteria andDelivererStatusGreaterThan(String value) {
            addCriterion("deliverer_status >", value, "delivererStatus");
            return (Criteria) this;
        }

        public Criteria andDelivererStatusGreaterThanOrEqualTo(String value) {
            addCriterion("deliverer_status >=", value, "delivererStatus");
            return (Criteria) this;
        }

        public Criteria andDelivererStatusLessThan(String value) {
            addCriterion("deliverer_status <", value, "delivererStatus");
            return (Criteria) this;
        }

        public Criteria andDelivererStatusLessThanOrEqualTo(String value) {
            addCriterion("deliverer_status <=", value, "delivererStatus");
            return (Criteria) this;
        }

        public Criteria andDelivererStatusLike(String value) {
            addCriterion("deliverer_status like", value, "delivererStatus");
            return (Criteria) this;
        }

        public Criteria andDelivererStatusNotLike(String value) {
            addCriterion("deliverer_status not like", value, "delivererStatus");
            return (Criteria) this;
        }

        public Criteria andDelivererStatusIn(List<String> values) {
            addCriterion("deliverer_status in", values, "delivererStatus");
            return (Criteria) this;
        }

        public Criteria andDelivererStatusNotIn(List<String> values) {
            addCriterion("deliverer_status not in", values, "delivererStatus");
            return (Criteria) this;
        }

        public Criteria andDelivererStatusBetween(String value1, String value2) {
            addCriterion("deliverer_status between", value1, value2, "delivererStatus");
            return (Criteria) this;
        }

        public Criteria andDelivererStatusNotBetween(String value1, String value2) {
            addCriterion("deliverer_status not between", value1, value2, "delivererStatus");
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