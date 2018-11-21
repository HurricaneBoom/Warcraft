package com.warcraft.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IndentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IndentExample() {
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

        public Criteria andShoppingIdIsNull() {
            addCriterion("shopping_id is null");
            return (Criteria) this;
        }

        public Criteria andShoppingIdIsNotNull() {
            addCriterion("shopping_id is not null");
            return (Criteria) this;
        }

        public Criteria andShoppingIdEqualTo(Long value) {
            addCriterion("shopping_id =", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdNotEqualTo(Long value) {
            addCriterion("shopping_id <>", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdGreaterThan(Long value) {
            addCriterion("shopping_id >", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("shopping_id >=", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdLessThan(Long value) {
            addCriterion("shopping_id <", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdLessThanOrEqualTo(Long value) {
            addCriterion("shopping_id <=", value, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdIn(List<Long> values) {
            addCriterion("shopping_id in", values, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdNotIn(List<Long> values) {
            addCriterion("shopping_id not in", values, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdBetween(Long value1, Long value2) {
            addCriterion("shopping_id between", value1, value2, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andShoppingIdNotBetween(Long value1, Long value2) {
            addCriterion("shopping_id not between", value1, value2, "shoppingId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNull() {
            addCriterion("store_id is null");
            return (Criteria) this;
        }

        public Criteria andStoreIdIsNotNull() {
            addCriterion("store_id is not null");
            return (Criteria) this;
        }

        public Criteria andStoreIdEqualTo(Long value) {
            addCriterion("store_id =", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotEqualTo(Long value) {
            addCriterion("store_id <>", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThan(Long value) {
            addCriterion("store_id >", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("store_id >=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThan(Long value) {
            addCriterion("store_id <", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdLessThanOrEqualTo(Long value) {
            addCriterion("store_id <=", value, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdIn(List<Long> values) {
            addCriterion("store_id in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotIn(List<Long> values) {
            addCriterion("store_id not in", values, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdBetween(Long value1, Long value2) {
            addCriterion("store_id between", value1, value2, "storeId");
            return (Criteria) this;
        }

        public Criteria andStoreIdNotBetween(Long value1, Long value2) {
            addCriterion("store_id not between", value1, value2, "storeId");
            return (Criteria) this;
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

        public Criteria andIndentSingletimeIsNull() {
            addCriterion("indent_singletime is null");
            return (Criteria) this;
        }

        public Criteria andIndentSingletimeIsNotNull() {
            addCriterion("indent_singletime is not null");
            return (Criteria) this;
        }

        public Criteria andIndentSingletimeEqualTo(Date value) {
            addCriterion("indent_singletime =", value, "indentSingletime");
            return (Criteria) this;
        }

        public Criteria andIndentSingletimeNotEqualTo(Date value) {
            addCriterion("indent_singletime <>", value, "indentSingletime");
            return (Criteria) this;
        }

        public Criteria andIndentSingletimeGreaterThan(Date value) {
            addCriterion("indent_singletime >", value, "indentSingletime");
            return (Criteria) this;
        }

        public Criteria andIndentSingletimeGreaterThanOrEqualTo(Date value) {
            addCriterion("indent_singletime >=", value, "indentSingletime");
            return (Criteria) this;
        }

        public Criteria andIndentSingletimeLessThan(Date value) {
            addCriterion("indent_singletime <", value, "indentSingletime");
            return (Criteria) this;
        }

        public Criteria andIndentSingletimeLessThanOrEqualTo(Date value) {
            addCriterion("indent_singletime <=", value, "indentSingletime");
            return (Criteria) this;
        }

        public Criteria andIndentSingletimeIn(List<Date> values) {
            addCriterion("indent_singletime in", values, "indentSingletime");
            return (Criteria) this;
        }

        public Criteria andIndentSingletimeNotIn(List<Date> values) {
            addCriterion("indent_singletime not in", values, "indentSingletime");
            return (Criteria) this;
        }

        public Criteria andIndentSingletimeBetween(Date value1, Date value2) {
            addCriterion("indent_singletime between", value1, value2, "indentSingletime");
            return (Criteria) this;
        }

        public Criteria andIndentSingletimeNotBetween(Date value1, Date value2) {
            addCriterion("indent_singletime not between", value1, value2, "indentSingletime");
            return (Criteria) this;
        }

        public Criteria andIndentStarttimeIsNull() {
            addCriterion("indent_starttime is null");
            return (Criteria) this;
        }

        public Criteria andIndentStarttimeIsNotNull() {
            addCriterion("indent_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andIndentStarttimeEqualTo(Date value) {
            addCriterion("indent_starttime =", value, "indentStarttime");
            return (Criteria) this;
        }

        public Criteria andIndentStarttimeNotEqualTo(Date value) {
            addCriterion("indent_starttime <>", value, "indentStarttime");
            return (Criteria) this;
        }

        public Criteria andIndentStarttimeGreaterThan(Date value) {
            addCriterion("indent_starttime >", value, "indentStarttime");
            return (Criteria) this;
        }

        public Criteria andIndentStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("indent_starttime >=", value, "indentStarttime");
            return (Criteria) this;
        }

        public Criteria andIndentStarttimeLessThan(Date value) {
            addCriterion("indent_starttime <", value, "indentStarttime");
            return (Criteria) this;
        }

        public Criteria andIndentStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("indent_starttime <=", value, "indentStarttime");
            return (Criteria) this;
        }

        public Criteria andIndentStarttimeIn(List<Date> values) {
            addCriterion("indent_starttime in", values, "indentStarttime");
            return (Criteria) this;
        }

        public Criteria andIndentStarttimeNotIn(List<Date> values) {
            addCriterion("indent_starttime not in", values, "indentStarttime");
            return (Criteria) this;
        }

        public Criteria andIndentStarttimeBetween(Date value1, Date value2) {
            addCriterion("indent_starttime between", value1, value2, "indentStarttime");
            return (Criteria) this;
        }

        public Criteria andIndentStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("indent_starttime not between", value1, value2, "indentStarttime");
            return (Criteria) this;
        }

        public Criteria andIndentEndtimeIsNull() {
            addCriterion("indent_endtime is null");
            return (Criteria) this;
        }

        public Criteria andIndentEndtimeIsNotNull() {
            addCriterion("indent_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andIndentEndtimeEqualTo(Date value) {
            addCriterion("indent_endtime =", value, "indentEndtime");
            return (Criteria) this;
        }

        public Criteria andIndentEndtimeNotEqualTo(Date value) {
            addCriterion("indent_endtime <>", value, "indentEndtime");
            return (Criteria) this;
        }

        public Criteria andIndentEndtimeGreaterThan(Date value) {
            addCriterion("indent_endtime >", value, "indentEndtime");
            return (Criteria) this;
        }

        public Criteria andIndentEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("indent_endtime >=", value, "indentEndtime");
            return (Criteria) this;
        }

        public Criteria andIndentEndtimeLessThan(Date value) {
            addCriterion("indent_endtime <", value, "indentEndtime");
            return (Criteria) this;
        }

        public Criteria andIndentEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("indent_endtime <=", value, "indentEndtime");
            return (Criteria) this;
        }

        public Criteria andIndentEndtimeIn(List<Date> values) {
            addCriterion("indent_endtime in", values, "indentEndtime");
            return (Criteria) this;
        }

        public Criteria andIndentEndtimeNotIn(List<Date> values) {
            addCriterion("indent_endtime not in", values, "indentEndtime");
            return (Criteria) this;
        }

        public Criteria andIndentEndtimeBetween(Date value1, Date value2) {
            addCriterion("indent_endtime between", value1, value2, "indentEndtime");
            return (Criteria) this;
        }

        public Criteria andIndentEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("indent_endtime not between", value1, value2, "indentEndtime");
            return (Criteria) this;
        }

        public Criteria andIndentStatusIsNull() {
            addCriterion("indent_status is null");
            return (Criteria) this;
        }

        public Criteria andIndentStatusIsNotNull() {
            addCriterion("indent_status is not null");
            return (Criteria) this;
        }

        public Criteria andIndentStatusEqualTo(String value) {
            addCriterion("indent_status =", value, "indentStatus");
            return (Criteria) this;
        }

        public Criteria andIndentStatusNotEqualTo(String value) {
            addCriterion("indent_status <>", value, "indentStatus");
            return (Criteria) this;
        }

        public Criteria andIndentStatusGreaterThan(String value) {
            addCriterion("indent_status >", value, "indentStatus");
            return (Criteria) this;
        }

        public Criteria andIndentStatusGreaterThanOrEqualTo(String value) {
            addCriterion("indent_status >=", value, "indentStatus");
            return (Criteria) this;
        }

        public Criteria andIndentStatusLessThan(String value) {
            addCriterion("indent_status <", value, "indentStatus");
            return (Criteria) this;
        }

        public Criteria andIndentStatusLessThanOrEqualTo(String value) {
            addCriterion("indent_status <=", value, "indentStatus");
            return (Criteria) this;
        }

        public Criteria andIndentStatusLike(String value) {
            addCriterion("indent_status like", value, "indentStatus");
            return (Criteria) this;
        }

        public Criteria andIndentStatusNotLike(String value) {
            addCriterion("indent_status not like", value, "indentStatus");
            return (Criteria) this;
        }

        public Criteria andIndentStatusIn(List<String> values) {
            addCriterion("indent_status in", values, "indentStatus");
            return (Criteria) this;
        }

        public Criteria andIndentStatusNotIn(List<String> values) {
            addCriterion("indent_status not in", values, "indentStatus");
            return (Criteria) this;
        }

        public Criteria andIndentStatusBetween(String value1, String value2) {
            addCriterion("indent_status between", value1, value2, "indentStatus");
            return (Criteria) this;
        }

        public Criteria andIndentStatusNotBetween(String value1, String value2) {
            addCriterion("indent_status not between", value1, value2, "indentStatus");
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