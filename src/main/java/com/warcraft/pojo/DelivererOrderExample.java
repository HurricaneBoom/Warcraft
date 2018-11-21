package com.warcraft.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DelivererOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DelivererOrderExample() {
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

        public Criteria andDelivererOrderStarttimeIsNull() {
            addCriterion("deliverer_order_starttime is null");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderStarttimeIsNotNull() {
            addCriterion("deliverer_order_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderStarttimeEqualTo(Date value) {
            addCriterion("deliverer_order_starttime =", value, "delivererOrderStarttime");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderStarttimeNotEqualTo(Date value) {
            addCriterion("deliverer_order_starttime <>", value, "delivererOrderStarttime");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderStarttimeGreaterThan(Date value) {
            addCriterion("deliverer_order_starttime >", value, "delivererOrderStarttime");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deliverer_order_starttime >=", value, "delivererOrderStarttime");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderStarttimeLessThan(Date value) {
            addCriterion("deliverer_order_starttime <", value, "delivererOrderStarttime");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("deliverer_order_starttime <=", value, "delivererOrderStarttime");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderStarttimeIn(List<Date> values) {
            addCriterion("deliverer_order_starttime in", values, "delivererOrderStarttime");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderStarttimeNotIn(List<Date> values) {
            addCriterion("deliverer_order_starttime not in", values, "delivererOrderStarttime");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderStarttimeBetween(Date value1, Date value2) {
            addCriterion("deliverer_order_starttime between", value1, value2, "delivererOrderStarttime");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("deliverer_order_starttime not between", value1, value2, "delivererOrderStarttime");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderEndtimeIsNull() {
            addCriterion("deliverer_order_endtime is null");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderEndtimeIsNotNull() {
            addCriterion("deliverer_order_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderEndtimeEqualTo(Date value) {
            addCriterion("deliverer_order_endtime =", value, "delivererOrderEndtime");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderEndtimeNotEqualTo(Date value) {
            addCriterion("deliverer_order_endtime <>", value, "delivererOrderEndtime");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderEndtimeGreaterThan(Date value) {
            addCriterion("deliverer_order_endtime >", value, "delivererOrderEndtime");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("deliverer_order_endtime >=", value, "delivererOrderEndtime");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderEndtimeLessThan(Date value) {
            addCriterion("deliverer_order_endtime <", value, "delivererOrderEndtime");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("deliverer_order_endtime <=", value, "delivererOrderEndtime");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderEndtimeIn(List<Date> values) {
            addCriterion("deliverer_order_endtime in", values, "delivererOrderEndtime");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderEndtimeNotIn(List<Date> values) {
            addCriterion("deliverer_order_endtime not in", values, "delivererOrderEndtime");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderEndtimeBetween(Date value1, Date value2) {
            addCriterion("deliverer_order_endtime between", value1, value2, "delivererOrderEndtime");
            return (Criteria) this;
        }

        public Criteria andDelivererOrderEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("deliverer_order_endtime not between", value1, value2, "delivererOrderEndtime");
            return (Criteria) this;
        }

        public Criteria andElivererOrderDateIsNull() {
            addCriterion("eliverer_order_date is null");
            return (Criteria) this;
        }

        public Criteria andElivererOrderDateIsNotNull() {
            addCriterion("eliverer_order_date is not null");
            return (Criteria) this;
        }

        public Criteria andElivererOrderDateEqualTo(Date value) {
            addCriterion("eliverer_order_date =", value, "elivererOrderDate");
            return (Criteria) this;
        }

        public Criteria andElivererOrderDateNotEqualTo(Date value) {
            addCriterion("eliverer_order_date <>", value, "elivererOrderDate");
            return (Criteria) this;
        }

        public Criteria andElivererOrderDateGreaterThan(Date value) {
            addCriterion("eliverer_order_date >", value, "elivererOrderDate");
            return (Criteria) this;
        }

        public Criteria andElivererOrderDateGreaterThanOrEqualTo(Date value) {
            addCriterion("eliverer_order_date >=", value, "elivererOrderDate");
            return (Criteria) this;
        }

        public Criteria andElivererOrderDateLessThan(Date value) {
            addCriterion("eliverer_order_date <", value, "elivererOrderDate");
            return (Criteria) this;
        }

        public Criteria andElivererOrderDateLessThanOrEqualTo(Date value) {
            addCriterion("eliverer_order_date <=", value, "elivererOrderDate");
            return (Criteria) this;
        }

        public Criteria andElivererOrderDateIn(List<Date> values) {
            addCriterion("eliverer_order_date in", values, "elivererOrderDate");
            return (Criteria) this;
        }

        public Criteria andElivererOrderDateNotIn(List<Date> values) {
            addCriterion("eliverer_order_date not in", values, "elivererOrderDate");
            return (Criteria) this;
        }

        public Criteria andElivererOrderDateBetween(Date value1, Date value2) {
            addCriterion("eliverer_order_date between", value1, value2, "elivererOrderDate");
            return (Criteria) this;
        }

        public Criteria andElivererOrderDateNotBetween(Date value1, Date value2) {
            addCriterion("eliverer_order_date not between", value1, value2, "elivererOrderDate");
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