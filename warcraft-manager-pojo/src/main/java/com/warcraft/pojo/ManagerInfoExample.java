package com.warcraft.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManagerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagerInfoExample() {
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

        public Criteria andManagerIdIsNull() {
            addCriterion("manager_id is null");
            return (Criteria) this;
        }

        public Criteria andManagerIdIsNotNull() {
            addCriterion("manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andManagerIdEqualTo(Long value) {
            addCriterion("manager_id =", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotEqualTo(Long value) {
            addCriterion("manager_id <>", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThan(Long value) {
            addCriterion("manager_id >", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("manager_id >=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThan(Long value) {
            addCriterion("manager_id <", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdLessThanOrEqualTo(Long value) {
            addCriterion("manager_id <=", value, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdIn(List<Long> values) {
            addCriterion("manager_id in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotIn(List<Long> values) {
            addCriterion("manager_id not in", values, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdBetween(Long value1, Long value2) {
            addCriterion("manager_id between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerIdNotBetween(Long value1, Long value2) {
            addCriterion("manager_id not between", value1, value2, "managerId");
            return (Criteria) this;
        }

        public Criteria andManagerUsernameIsNull() {
            addCriterion("manager_username is null");
            return (Criteria) this;
        }

        public Criteria andManagerUsernameIsNotNull() {
            addCriterion("manager_username is not null");
            return (Criteria) this;
        }

        public Criteria andManagerUsernameEqualTo(String value) {
            addCriterion("manager_username =", value, "managerUsername");
            return (Criteria) this;
        }

        public Criteria andManagerUsernameNotEqualTo(String value) {
            addCriterion("manager_username <>", value, "managerUsername");
            return (Criteria) this;
        }

        public Criteria andManagerUsernameGreaterThan(String value) {
            addCriterion("manager_username >", value, "managerUsername");
            return (Criteria) this;
        }

        public Criteria andManagerUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("manager_username >=", value, "managerUsername");
            return (Criteria) this;
        }

        public Criteria andManagerUsernameLessThan(String value) {
            addCriterion("manager_username <", value, "managerUsername");
            return (Criteria) this;
        }

        public Criteria andManagerUsernameLessThanOrEqualTo(String value) {
            addCriterion("manager_username <=", value, "managerUsername");
            return (Criteria) this;
        }

        public Criteria andManagerUsernameLike(String value) {
            addCriterion("manager_username like", value, "managerUsername");
            return (Criteria) this;
        }

        public Criteria andManagerUsernameNotLike(String value) {
            addCriterion("manager_username not like", value, "managerUsername");
            return (Criteria) this;
        }

        public Criteria andManagerUsernameIn(List<String> values) {
            addCriterion("manager_username in", values, "managerUsername");
            return (Criteria) this;
        }

        public Criteria andManagerUsernameNotIn(List<String> values) {
            addCriterion("manager_username not in", values, "managerUsername");
            return (Criteria) this;
        }

        public Criteria andManagerUsernameBetween(String value1, String value2) {
            addCriterion("manager_username between", value1, value2, "managerUsername");
            return (Criteria) this;
        }

        public Criteria andManagerUsernameNotBetween(String value1, String value2) {
            addCriterion("manager_username not between", value1, value2, "managerUsername");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordIsNull() {
            addCriterion("manager_password is null");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordIsNotNull() {
            addCriterion("manager_password is not null");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordEqualTo(String value) {
            addCriterion("manager_password =", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordNotEqualTo(String value) {
            addCriterion("manager_password <>", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordGreaterThan(String value) {
            addCriterion("manager_password >", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("manager_password >=", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordLessThan(String value) {
            addCriterion("manager_password <", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordLessThanOrEqualTo(String value) {
            addCriterion("manager_password <=", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordLike(String value) {
            addCriterion("manager_password like", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordNotLike(String value) {
            addCriterion("manager_password not like", value, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordIn(List<String> values) {
            addCriterion("manager_password in", values, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordNotIn(List<String> values) {
            addCriterion("manager_password not in", values, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordBetween(String value1, String value2) {
            addCriterion("manager_password between", value1, value2, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPasswordNotBetween(String value1, String value2) {
            addCriterion("manager_password not between", value1, value2, "managerPassword");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneIsNull() {
            addCriterion("manager_phone is null");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneIsNotNull() {
            addCriterion("manager_phone is not null");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneEqualTo(String value) {
            addCriterion("manager_phone =", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneNotEqualTo(String value) {
            addCriterion("manager_phone <>", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneGreaterThan(String value) {
            addCriterion("manager_phone >", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("manager_phone >=", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneLessThan(String value) {
            addCriterion("manager_phone <", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneLessThanOrEqualTo(String value) {
            addCriterion("manager_phone <=", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneLike(String value) {
            addCriterion("manager_phone like", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneNotLike(String value) {
            addCriterion("manager_phone not like", value, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneIn(List<String> values) {
            addCriterion("manager_phone in", values, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneNotIn(List<String> values) {
            addCriterion("manager_phone not in", values, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneBetween(String value1, String value2) {
            addCriterion("manager_phone between", value1, value2, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerPhoneNotBetween(String value1, String value2) {
            addCriterion("manager_phone not between", value1, value2, "managerPhone");
            return (Criteria) this;
        }

        public Criteria andManagerEmailIsNull() {
            addCriterion("manager_email is null");
            return (Criteria) this;
        }

        public Criteria andManagerEmailIsNotNull() {
            addCriterion("manager_email is not null");
            return (Criteria) this;
        }

        public Criteria andManagerEmailEqualTo(String value) {
            addCriterion("manager_email =", value, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailNotEqualTo(String value) {
            addCriterion("manager_email <>", value, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailGreaterThan(String value) {
            addCriterion("manager_email >", value, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailGreaterThanOrEqualTo(String value) {
            addCriterion("manager_email >=", value, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailLessThan(String value) {
            addCriterion("manager_email <", value, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailLessThanOrEqualTo(String value) {
            addCriterion("manager_email <=", value, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailLike(String value) {
            addCriterion("manager_email like", value, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailNotLike(String value) {
            addCriterion("manager_email not like", value, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailIn(List<String> values) {
            addCriterion("manager_email in", values, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailNotIn(List<String> values) {
            addCriterion("manager_email not in", values, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailBetween(String value1, String value2) {
            addCriterion("manager_email between", value1, value2, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andManagerEmailNotBetween(String value1, String value2) {
            addCriterion("manager_email not between", value1, value2, "managerEmail");
            return (Criteria) this;
        }

        public Criteria andMangerCreatedIsNull() {
            addCriterion("manger_created is null");
            return (Criteria) this;
        }

        public Criteria andMangerCreatedIsNotNull() {
            addCriterion("manger_created is not null");
            return (Criteria) this;
        }

        public Criteria andMangerCreatedEqualTo(Date value) {
            addCriterion("manger_created =", value, "mangerCreated");
            return (Criteria) this;
        }

        public Criteria andMangerCreatedNotEqualTo(Date value) {
            addCriterion("manger_created <>", value, "mangerCreated");
            return (Criteria) this;
        }

        public Criteria andMangerCreatedGreaterThan(Date value) {
            addCriterion("manger_created >", value, "mangerCreated");
            return (Criteria) this;
        }

        public Criteria andMangerCreatedGreaterThanOrEqualTo(Date value) {
            addCriterion("manger_created >=", value, "mangerCreated");
            return (Criteria) this;
        }

        public Criteria andMangerCreatedLessThan(Date value) {
            addCriterion("manger_created <", value, "mangerCreated");
            return (Criteria) this;
        }

        public Criteria andMangerCreatedLessThanOrEqualTo(Date value) {
            addCriterion("manger_created <=", value, "mangerCreated");
            return (Criteria) this;
        }

        public Criteria andMangerCreatedIn(List<Date> values) {
            addCriterion("manger_created in", values, "mangerCreated");
            return (Criteria) this;
        }

        public Criteria andMangerCreatedNotIn(List<Date> values) {
            addCriterion("manger_created not in", values, "mangerCreated");
            return (Criteria) this;
        }

        public Criteria andMangerCreatedBetween(Date value1, Date value2) {
            addCriterion("manger_created between", value1, value2, "mangerCreated");
            return (Criteria) this;
        }

        public Criteria andMangerCreatedNotBetween(Date value1, Date value2) {
            addCriterion("manger_created not between", value1, value2, "mangerCreated");
            return (Criteria) this;
        }

        public Criteria andMangerUpdatedIsNull() {
            addCriterion("manger_updated is null");
            return (Criteria) this;
        }

        public Criteria andMangerUpdatedIsNotNull() {
            addCriterion("manger_updated is not null");
            return (Criteria) this;
        }

        public Criteria andMangerUpdatedEqualTo(Date value) {
            addCriterion("manger_updated =", value, "mangerUpdated");
            return (Criteria) this;
        }

        public Criteria andMangerUpdatedNotEqualTo(Date value) {
            addCriterion("manger_updated <>", value, "mangerUpdated");
            return (Criteria) this;
        }

        public Criteria andMangerUpdatedGreaterThan(Date value) {
            addCriterion("manger_updated >", value, "mangerUpdated");
            return (Criteria) this;
        }

        public Criteria andMangerUpdatedGreaterThanOrEqualTo(Date value) {
            addCriterion("manger_updated >=", value, "mangerUpdated");
            return (Criteria) this;
        }

        public Criteria andMangerUpdatedLessThan(Date value) {
            addCriterion("manger_updated <", value, "mangerUpdated");
            return (Criteria) this;
        }

        public Criteria andMangerUpdatedLessThanOrEqualTo(Date value) {
            addCriterion("manger_updated <=", value, "mangerUpdated");
            return (Criteria) this;
        }

        public Criteria andMangerUpdatedIn(List<Date> values) {
            addCriterion("manger_updated in", values, "mangerUpdated");
            return (Criteria) this;
        }

        public Criteria andMangerUpdatedNotIn(List<Date> values) {
            addCriterion("manger_updated not in", values, "mangerUpdated");
            return (Criteria) this;
        }

        public Criteria andMangerUpdatedBetween(Date value1, Date value2) {
            addCriterion("manger_updated between", value1, value2, "mangerUpdated");
            return (Criteria) this;
        }

        public Criteria andMangerUpdatedNotBetween(Date value1, Date value2) {
            addCriterion("manger_updated not between", value1, value2, "mangerUpdated");
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