package com.warcraft.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AbolishExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AbolishExample() {
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

        public Criteria andAbolishIdIsNull() {
            addCriterion("abolish_id is null");
            return (Criteria) this;
        }

        public Criteria andAbolishIdIsNotNull() {
            addCriterion("abolish_id is not null");
            return (Criteria) this;
        }

        public Criteria andAbolishIdEqualTo(Long value) {
            addCriterion("abolish_id =", value, "abolishId");
            return (Criteria) this;
        }

        public Criteria andAbolishIdNotEqualTo(Long value) {
            addCriterion("abolish_id <>", value, "abolishId");
            return (Criteria) this;
        }

        public Criteria andAbolishIdGreaterThan(Long value) {
            addCriterion("abolish_id >", value, "abolishId");
            return (Criteria) this;
        }

        public Criteria andAbolishIdGreaterThanOrEqualTo(Long value) {
            addCriterion("abolish_id >=", value, "abolishId");
            return (Criteria) this;
        }

        public Criteria andAbolishIdLessThan(Long value) {
            addCriterion("abolish_id <", value, "abolishId");
            return (Criteria) this;
        }

        public Criteria andAbolishIdLessThanOrEqualTo(Long value) {
            addCriterion("abolish_id <=", value, "abolishId");
            return (Criteria) this;
        }

        public Criteria andAbolishIdIn(List<Long> values) {
            addCriterion("abolish_id in", values, "abolishId");
            return (Criteria) this;
        }

        public Criteria andAbolishIdNotIn(List<Long> values) {
            addCriterion("abolish_id not in", values, "abolishId");
            return (Criteria) this;
        }

        public Criteria andAbolishIdBetween(Long value1, Long value2) {
            addCriterion("abolish_id between", value1, value2, "abolishId");
            return (Criteria) this;
        }

        public Criteria andAbolishIdNotBetween(Long value1, Long value2) {
            addCriterion("abolish_id not between", value1, value2, "abolishId");
            return (Criteria) this;
        }

        public Criteria andIndentIdIsNull() {
            addCriterion("indent_id is null");
            return (Criteria) this;
        }

        public Criteria andIndentIdIsNotNull() {
            addCriterion("indent_id is not null");
            return (Criteria) this;
        }

        public Criteria andIndentIdEqualTo(Long value) {
            addCriterion("indent_id =", value, "indentId");
            return (Criteria) this;
        }

        public Criteria andIndentIdNotEqualTo(Long value) {
            addCriterion("indent_id <>", value, "indentId");
            return (Criteria) this;
        }

        public Criteria andIndentIdGreaterThan(Long value) {
            addCriterion("indent_id >", value, "indentId");
            return (Criteria) this;
        }

        public Criteria andIndentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("indent_id >=", value, "indentId");
            return (Criteria) this;
        }

        public Criteria andIndentIdLessThan(Long value) {
            addCriterion("indent_id <", value, "indentId");
            return (Criteria) this;
        }

        public Criteria andIndentIdLessThanOrEqualTo(Long value) {
            addCriterion("indent_id <=", value, "indentId");
            return (Criteria) this;
        }

        public Criteria andIndentIdIn(List<Long> values) {
            addCriterion("indent_id in", values, "indentId");
            return (Criteria) this;
        }

        public Criteria andIndentIdNotIn(List<Long> values) {
            addCriterion("indent_id not in", values, "indentId");
            return (Criteria) this;
        }

        public Criteria andIndentIdBetween(Long value1, Long value2) {
            addCriterion("indent_id between", value1, value2, "indentId");
            return (Criteria) this;
        }

        public Criteria andIndentIdNotBetween(Long value1, Long value2) {
            addCriterion("indent_id not between", value1, value2, "indentId");
            return (Criteria) this;
        }

        public Criteria andAbolishTimeIsNull() {
            addCriterion("abolish_time is null");
            return (Criteria) this;
        }

        public Criteria andAbolishTimeIsNotNull() {
            addCriterion("abolish_time is not null");
            return (Criteria) this;
        }

        public Criteria andAbolishTimeEqualTo(Date value) {
            addCriterion("abolish_time =", value, "abolishTime");
            return (Criteria) this;
        }

        public Criteria andAbolishTimeNotEqualTo(Date value) {
            addCriterion("abolish_time <>", value, "abolishTime");
            return (Criteria) this;
        }

        public Criteria andAbolishTimeGreaterThan(Date value) {
            addCriterion("abolish_time >", value, "abolishTime");
            return (Criteria) this;
        }

        public Criteria andAbolishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("abolish_time >=", value, "abolishTime");
            return (Criteria) this;
        }

        public Criteria andAbolishTimeLessThan(Date value) {
            addCriterion("abolish_time <", value, "abolishTime");
            return (Criteria) this;
        }

        public Criteria andAbolishTimeLessThanOrEqualTo(Date value) {
            addCriterion("abolish_time <=", value, "abolishTime");
            return (Criteria) this;
        }

        public Criteria andAbolishTimeIn(List<Date> values) {
            addCriterion("abolish_time in", values, "abolishTime");
            return (Criteria) this;
        }

        public Criteria andAbolishTimeNotIn(List<Date> values) {
            addCriterion("abolish_time not in", values, "abolishTime");
            return (Criteria) this;
        }

        public Criteria andAbolishTimeBetween(Date value1, Date value2) {
            addCriterion("abolish_time between", value1, value2, "abolishTime");
            return (Criteria) this;
        }

        public Criteria andAbolishTimeNotBetween(Date value1, Date value2) {
            addCriterion("abolish_time not between", value1, value2, "abolishTime");
            return (Criteria) this;
        }

        public Criteria andAbolishReasonIsNull() {
            addCriterion("abolish_reason is null");
            return (Criteria) this;
        }

        public Criteria andAbolishReasonIsNotNull() {
            addCriterion("abolish_reason is not null");
            return (Criteria) this;
        }

        public Criteria andAbolishReasonEqualTo(String value) {
            addCriterion("abolish_reason =", value, "abolishReason");
            return (Criteria) this;
        }

        public Criteria andAbolishReasonNotEqualTo(String value) {
            addCriterion("abolish_reason <>", value, "abolishReason");
            return (Criteria) this;
        }

        public Criteria andAbolishReasonGreaterThan(String value) {
            addCriterion("abolish_reason >", value, "abolishReason");
            return (Criteria) this;
        }

        public Criteria andAbolishReasonGreaterThanOrEqualTo(String value) {
            addCriterion("abolish_reason >=", value, "abolishReason");
            return (Criteria) this;
        }

        public Criteria andAbolishReasonLessThan(String value) {
            addCriterion("abolish_reason <", value, "abolishReason");
            return (Criteria) this;
        }

        public Criteria andAbolishReasonLessThanOrEqualTo(String value) {
            addCriterion("abolish_reason <=", value, "abolishReason");
            return (Criteria) this;
        }

        public Criteria andAbolishReasonLike(String value) {
            addCriterion("abolish_reason like", value, "abolishReason");
            return (Criteria) this;
        }

        public Criteria andAbolishReasonNotLike(String value) {
            addCriterion("abolish_reason not like", value, "abolishReason");
            return (Criteria) this;
        }

        public Criteria andAbolishReasonIn(List<String> values) {
            addCriterion("abolish_reason in", values, "abolishReason");
            return (Criteria) this;
        }

        public Criteria andAbolishReasonNotIn(List<String> values) {
            addCriterion("abolish_reason not in", values, "abolishReason");
            return (Criteria) this;
        }

        public Criteria andAbolishReasonBetween(String value1, String value2) {
            addCriterion("abolish_reason between", value1, value2, "abolishReason");
            return (Criteria) this;
        }

        public Criteria andAbolishReasonNotBetween(String value1, String value2) {
            addCriterion("abolish_reason not between", value1, value2, "abolishReason");
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