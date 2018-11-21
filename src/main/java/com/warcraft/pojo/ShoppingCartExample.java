package com.warcraft.pojo;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShoppingCartExample() {
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