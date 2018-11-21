package com.warcraft.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MenuInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuInfoExample() {
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

        public Criteria andDietNameIsNull() {
            addCriterion("diet_name is null");
            return (Criteria) this;
        }

        public Criteria andDietNameIsNotNull() {
            addCriterion("diet_name is not null");
            return (Criteria) this;
        }

        public Criteria andDietNameEqualTo(String value) {
            addCriterion("diet_name =", value, "dietName");
            return (Criteria) this;
        }

        public Criteria andDietNameNotEqualTo(String value) {
            addCriterion("diet_name <>", value, "dietName");
            return (Criteria) this;
        }

        public Criteria andDietNameGreaterThan(String value) {
            addCriterion("diet_name >", value, "dietName");
            return (Criteria) this;
        }

        public Criteria andDietNameGreaterThanOrEqualTo(String value) {
            addCriterion("diet_name >=", value, "dietName");
            return (Criteria) this;
        }

        public Criteria andDietNameLessThan(String value) {
            addCriterion("diet_name <", value, "dietName");
            return (Criteria) this;
        }

        public Criteria andDietNameLessThanOrEqualTo(String value) {
            addCriterion("diet_name <=", value, "dietName");
            return (Criteria) this;
        }

        public Criteria andDietNameLike(String value) {
            addCriterion("diet_name like", value, "dietName");
            return (Criteria) this;
        }

        public Criteria andDietNameNotLike(String value) {
            addCriterion("diet_name not like", value, "dietName");
            return (Criteria) this;
        }

        public Criteria andDietNameIn(List<String> values) {
            addCriterion("diet_name in", values, "dietName");
            return (Criteria) this;
        }

        public Criteria andDietNameNotIn(List<String> values) {
            addCriterion("diet_name not in", values, "dietName");
            return (Criteria) this;
        }

        public Criteria andDietNameBetween(String value1, String value2) {
            addCriterion("diet_name between", value1, value2, "dietName");
            return (Criteria) this;
        }

        public Criteria andDietNameNotBetween(String value1, String value2) {
            addCriterion("diet_name not between", value1, value2, "dietName");
            return (Criteria) this;
        }

        public Criteria andDietPriceIsNull() {
            addCriterion("diet_price is null");
            return (Criteria) this;
        }

        public Criteria andDietPriceIsNotNull() {
            addCriterion("diet_price is not null");
            return (Criteria) this;
        }

        public Criteria andDietPriceEqualTo(BigDecimal value) {
            addCriterion("diet_price =", value, "dietPrice");
            return (Criteria) this;
        }

        public Criteria andDietPriceNotEqualTo(BigDecimal value) {
            addCriterion("diet_price <>", value, "dietPrice");
            return (Criteria) this;
        }

        public Criteria andDietPriceGreaterThan(BigDecimal value) {
            addCriterion("diet_price >", value, "dietPrice");
            return (Criteria) this;
        }

        public Criteria andDietPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("diet_price >=", value, "dietPrice");
            return (Criteria) this;
        }

        public Criteria andDietPriceLessThan(BigDecimal value) {
            addCriterion("diet_price <", value, "dietPrice");
            return (Criteria) this;
        }

        public Criteria andDietPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("diet_price <=", value, "dietPrice");
            return (Criteria) this;
        }

        public Criteria andDietPriceIn(List<BigDecimal> values) {
            addCriterion("diet_price in", values, "dietPrice");
            return (Criteria) this;
        }

        public Criteria andDietPriceNotIn(List<BigDecimal> values) {
            addCriterion("diet_price not in", values, "dietPrice");
            return (Criteria) this;
        }

        public Criteria andDietPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("diet_price between", value1, value2, "dietPrice");
            return (Criteria) this;
        }

        public Criteria andDietPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("diet_price not between", value1, value2, "dietPrice");
            return (Criteria) this;
        }

        public Criteria andDietDescriptionIsNull() {
            addCriterion("diet_description is null");
            return (Criteria) this;
        }

        public Criteria andDietDescriptionIsNotNull() {
            addCriterion("diet_description is not null");
            return (Criteria) this;
        }

        public Criteria andDietDescriptionEqualTo(String value) {
            addCriterion("diet_description =", value, "dietDescription");
            return (Criteria) this;
        }

        public Criteria andDietDescriptionNotEqualTo(String value) {
            addCriterion("diet_description <>", value, "dietDescription");
            return (Criteria) this;
        }

        public Criteria andDietDescriptionGreaterThan(String value) {
            addCriterion("diet_description >", value, "dietDescription");
            return (Criteria) this;
        }

        public Criteria andDietDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("diet_description >=", value, "dietDescription");
            return (Criteria) this;
        }

        public Criteria andDietDescriptionLessThan(String value) {
            addCriterion("diet_description <", value, "dietDescription");
            return (Criteria) this;
        }

        public Criteria andDietDescriptionLessThanOrEqualTo(String value) {
            addCriterion("diet_description <=", value, "dietDescription");
            return (Criteria) this;
        }

        public Criteria andDietDescriptionLike(String value) {
            addCriterion("diet_description like", value, "dietDescription");
            return (Criteria) this;
        }

        public Criteria andDietDescriptionNotLike(String value) {
            addCriterion("diet_description not like", value, "dietDescription");
            return (Criteria) this;
        }

        public Criteria andDietDescriptionIn(List<String> values) {
            addCriterion("diet_description in", values, "dietDescription");
            return (Criteria) this;
        }

        public Criteria andDietDescriptionNotIn(List<String> values) {
            addCriterion("diet_description not in", values, "dietDescription");
            return (Criteria) this;
        }

        public Criteria andDietDescriptionBetween(String value1, String value2) {
            addCriterion("diet_description between", value1, value2, "dietDescription");
            return (Criteria) this;
        }

        public Criteria andDietDescriptionNotBetween(String value1, String value2) {
            addCriterion("diet_description not between", value1, value2, "dietDescription");
            return (Criteria) this;
        }

        public Criteria andDietPictureIsNull() {
            addCriterion("diet_picture is null");
            return (Criteria) this;
        }

        public Criteria andDietPictureIsNotNull() {
            addCriterion("diet_picture is not null");
            return (Criteria) this;
        }

        public Criteria andDietPictureEqualTo(String value) {
            addCriterion("diet_picture =", value, "dietPicture");
            return (Criteria) this;
        }

        public Criteria andDietPictureNotEqualTo(String value) {
            addCriterion("diet_picture <>", value, "dietPicture");
            return (Criteria) this;
        }

        public Criteria andDietPictureGreaterThan(String value) {
            addCriterion("diet_picture >", value, "dietPicture");
            return (Criteria) this;
        }

        public Criteria andDietPictureGreaterThanOrEqualTo(String value) {
            addCriterion("diet_picture >=", value, "dietPicture");
            return (Criteria) this;
        }

        public Criteria andDietPictureLessThan(String value) {
            addCriterion("diet_picture <", value, "dietPicture");
            return (Criteria) this;
        }

        public Criteria andDietPictureLessThanOrEqualTo(String value) {
            addCriterion("diet_picture <=", value, "dietPicture");
            return (Criteria) this;
        }

        public Criteria andDietPictureLike(String value) {
            addCriterion("diet_picture like", value, "dietPicture");
            return (Criteria) this;
        }

        public Criteria andDietPictureNotLike(String value) {
            addCriterion("diet_picture not like", value, "dietPicture");
            return (Criteria) this;
        }

        public Criteria andDietPictureIn(List<String> values) {
            addCriterion("diet_picture in", values, "dietPicture");
            return (Criteria) this;
        }

        public Criteria andDietPictureNotIn(List<String> values) {
            addCriterion("diet_picture not in", values, "dietPicture");
            return (Criteria) this;
        }

        public Criteria andDietPictureBetween(String value1, String value2) {
            addCriterion("diet_picture between", value1, value2, "dietPicture");
            return (Criteria) this;
        }

        public Criteria andDietPictureNotBetween(String value1, String value2) {
            addCriterion("diet_picture not between", value1, value2, "dietPicture");
            return (Criteria) this;
        }

        public Criteria andDietStatusIsNull() {
            addCriterion("diet_status is null");
            return (Criteria) this;
        }

        public Criteria andDietStatusIsNotNull() {
            addCriterion("diet_status is not null");
            return (Criteria) this;
        }

        public Criteria andDietStatusEqualTo(String value) {
            addCriterion("diet_status =", value, "dietStatus");
            return (Criteria) this;
        }

        public Criteria andDietStatusNotEqualTo(String value) {
            addCriterion("diet_status <>", value, "dietStatus");
            return (Criteria) this;
        }

        public Criteria andDietStatusGreaterThan(String value) {
            addCriterion("diet_status >", value, "dietStatus");
            return (Criteria) this;
        }

        public Criteria andDietStatusGreaterThanOrEqualTo(String value) {
            addCriterion("diet_status >=", value, "dietStatus");
            return (Criteria) this;
        }

        public Criteria andDietStatusLessThan(String value) {
            addCriterion("diet_status <", value, "dietStatus");
            return (Criteria) this;
        }

        public Criteria andDietStatusLessThanOrEqualTo(String value) {
            addCriterion("diet_status <=", value, "dietStatus");
            return (Criteria) this;
        }

        public Criteria andDietStatusLike(String value) {
            addCriterion("diet_status like", value, "dietStatus");
            return (Criteria) this;
        }

        public Criteria andDietStatusNotLike(String value) {
            addCriterion("diet_status not like", value, "dietStatus");
            return (Criteria) this;
        }

        public Criteria andDietStatusIn(List<String> values) {
            addCriterion("diet_status in", values, "dietStatus");
            return (Criteria) this;
        }

        public Criteria andDietStatusNotIn(List<String> values) {
            addCriterion("diet_status not in", values, "dietStatus");
            return (Criteria) this;
        }

        public Criteria andDietStatusBetween(String value1, String value2) {
            addCriterion("diet_status between", value1, value2, "dietStatus");
            return (Criteria) this;
        }

        public Criteria andDietStatusNotBetween(String value1, String value2) {
            addCriterion("diet_status not between", value1, value2, "dietStatus");
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