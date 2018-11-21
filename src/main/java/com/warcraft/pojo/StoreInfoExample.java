package com.warcraft.pojo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StoreInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreInfoExample() {
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

        public Criteria andStoreNameIsNull() {
            addCriterion("store_name is null");
            return (Criteria) this;
        }

        public Criteria andStoreNameIsNotNull() {
            addCriterion("store_name is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNameEqualTo(String value) {
            addCriterion("store_name =", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotEqualTo(String value) {
            addCriterion("store_name <>", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThan(String value) {
            addCriterion("store_name >", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameGreaterThanOrEqualTo(String value) {
            addCriterion("store_name >=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThan(String value) {
            addCriterion("store_name <", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLessThanOrEqualTo(String value) {
            addCriterion("store_name <=", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameLike(String value) {
            addCriterion("store_name like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotLike(String value) {
            addCriterion("store_name not like", value, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameIn(List<String> values) {
            addCriterion("store_name in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotIn(List<String> values) {
            addCriterion("store_name not in", values, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameBetween(String value1, String value2) {
            addCriterion("store_name between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreNameNotBetween(String value1, String value2) {
            addCriterion("store_name not between", value1, value2, "storeName");
            return (Criteria) this;
        }

        public Criteria andStoreAddrIsNull() {
            addCriterion("store_addr is null");
            return (Criteria) this;
        }

        public Criteria andStoreAddrIsNotNull() {
            addCriterion("store_addr is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAddrEqualTo(String value) {
            addCriterion("store_addr =", value, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrNotEqualTo(String value) {
            addCriterion("store_addr <>", value, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrGreaterThan(String value) {
            addCriterion("store_addr >", value, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrGreaterThanOrEqualTo(String value) {
            addCriterion("store_addr >=", value, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrLessThan(String value) {
            addCriterion("store_addr <", value, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrLessThanOrEqualTo(String value) {
            addCriterion("store_addr <=", value, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrLike(String value) {
            addCriterion("store_addr like", value, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrNotLike(String value) {
            addCriterion("store_addr not like", value, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrIn(List<String> values) {
            addCriterion("store_addr in", values, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrNotIn(List<String> values) {
            addCriterion("store_addr not in", values, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrBetween(String value1, String value2) {
            addCriterion("store_addr between", value1, value2, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreAddrNotBetween(String value1, String value2) {
            addCriterion("store_addr not between", value1, value2, "storeAddr");
            return (Criteria) this;
        }

        public Criteria andStoreCalIsNull() {
            addCriterion("store_cal is null");
            return (Criteria) this;
        }

        public Criteria andStoreCalIsNotNull() {
            addCriterion("store_cal is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCalEqualTo(String value) {
            addCriterion("store_cal =", value, "storeCal");
            return (Criteria) this;
        }

        public Criteria andStoreCalNotEqualTo(String value) {
            addCriterion("store_cal <>", value, "storeCal");
            return (Criteria) this;
        }

        public Criteria andStoreCalGreaterThan(String value) {
            addCriterion("store_cal >", value, "storeCal");
            return (Criteria) this;
        }

        public Criteria andStoreCalGreaterThanOrEqualTo(String value) {
            addCriterion("store_cal >=", value, "storeCal");
            return (Criteria) this;
        }

        public Criteria andStoreCalLessThan(String value) {
            addCriterion("store_cal <", value, "storeCal");
            return (Criteria) this;
        }

        public Criteria andStoreCalLessThanOrEqualTo(String value) {
            addCriterion("store_cal <=", value, "storeCal");
            return (Criteria) this;
        }

        public Criteria andStoreCalLike(String value) {
            addCriterion("store_cal like", value, "storeCal");
            return (Criteria) this;
        }

        public Criteria andStoreCalNotLike(String value) {
            addCriterion("store_cal not like", value, "storeCal");
            return (Criteria) this;
        }

        public Criteria andStoreCalIn(List<String> values) {
            addCriterion("store_cal in", values, "storeCal");
            return (Criteria) this;
        }

        public Criteria andStoreCalNotIn(List<String> values) {
            addCriterion("store_cal not in", values, "storeCal");
            return (Criteria) this;
        }

        public Criteria andStoreCalBetween(String value1, String value2) {
            addCriterion("store_cal between", value1, value2, "storeCal");
            return (Criteria) this;
        }

        public Criteria andStoreCalNotBetween(String value1, String value2) {
            addCriterion("store_cal not between", value1, value2, "storeCal");
            return (Criteria) this;
        }

        public Criteria andStoreNoticeIsNull() {
            addCriterion("store_notice is null");
            return (Criteria) this;
        }

        public Criteria andStoreNoticeIsNotNull() {
            addCriterion("store_notice is not null");
            return (Criteria) this;
        }

        public Criteria andStoreNoticeEqualTo(String value) {
            addCriterion("store_notice =", value, "storeNotice");
            return (Criteria) this;
        }

        public Criteria andStoreNoticeNotEqualTo(String value) {
            addCriterion("store_notice <>", value, "storeNotice");
            return (Criteria) this;
        }

        public Criteria andStoreNoticeGreaterThan(String value) {
            addCriterion("store_notice >", value, "storeNotice");
            return (Criteria) this;
        }

        public Criteria andStoreNoticeGreaterThanOrEqualTo(String value) {
            addCriterion("store_notice >=", value, "storeNotice");
            return (Criteria) this;
        }

        public Criteria andStoreNoticeLessThan(String value) {
            addCriterion("store_notice <", value, "storeNotice");
            return (Criteria) this;
        }

        public Criteria andStoreNoticeLessThanOrEqualTo(String value) {
            addCriterion("store_notice <=", value, "storeNotice");
            return (Criteria) this;
        }

        public Criteria andStoreNoticeLike(String value) {
            addCriterion("store_notice like", value, "storeNotice");
            return (Criteria) this;
        }

        public Criteria andStoreNoticeNotLike(String value) {
            addCriterion("store_notice not like", value, "storeNotice");
            return (Criteria) this;
        }

        public Criteria andStoreNoticeIn(List<String> values) {
            addCriterion("store_notice in", values, "storeNotice");
            return (Criteria) this;
        }

        public Criteria andStoreNoticeNotIn(List<String> values) {
            addCriterion("store_notice not in", values, "storeNotice");
            return (Criteria) this;
        }

        public Criteria andStoreNoticeBetween(String value1, String value2) {
            addCriterion("store_notice between", value1, value2, "storeNotice");
            return (Criteria) this;
        }

        public Criteria andStoreNoticeNotBetween(String value1, String value2) {
            addCriterion("store_notice not between", value1, value2, "storeNotice");
            return (Criteria) this;
        }

        public Criteria andStoreTimeIsNull() {
            addCriterion("store_time is null");
            return (Criteria) this;
        }

        public Criteria andStoreTimeIsNotNull() {
            addCriterion("store_time is not null");
            return (Criteria) this;
        }

        public Criteria andStoreTimeEqualTo(String value) {
            addCriterion("store_time =", value, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeNotEqualTo(String value) {
            addCriterion("store_time <>", value, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeGreaterThan(String value) {
            addCriterion("store_time >", value, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeGreaterThanOrEqualTo(String value) {
            addCriterion("store_time >=", value, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeLessThan(String value) {
            addCriterion("store_time <", value, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeLessThanOrEqualTo(String value) {
            addCriterion("store_time <=", value, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeLike(String value) {
            addCriterion("store_time like", value, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeNotLike(String value) {
            addCriterion("store_time not like", value, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeIn(List<String> values) {
            addCriterion("store_time in", values, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeNotIn(List<String> values) {
            addCriterion("store_time not in", values, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeBetween(String value1, String value2) {
            addCriterion("store_time between", value1, value2, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStoreTimeNotBetween(String value1, String value2) {
            addCriterion("store_time not between", value1, value2, "storeTime");
            return (Criteria) this;
        }

        public Criteria andStorePicIsNull() {
            addCriterion("store_pic is null");
            return (Criteria) this;
        }

        public Criteria andStorePicIsNotNull() {
            addCriterion("store_pic is not null");
            return (Criteria) this;
        }

        public Criteria andStorePicEqualTo(String value) {
            addCriterion("store_pic =", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicNotEqualTo(String value) {
            addCriterion("store_pic <>", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicGreaterThan(String value) {
            addCriterion("store_pic >", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicGreaterThanOrEqualTo(String value) {
            addCriterion("store_pic >=", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicLessThan(String value) {
            addCriterion("store_pic <", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicLessThanOrEqualTo(String value) {
            addCriterion("store_pic <=", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicLike(String value) {
            addCriterion("store_pic like", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicNotLike(String value) {
            addCriterion("store_pic not like", value, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicIn(List<String> values) {
            addCriterion("store_pic in", values, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicNotIn(List<String> values) {
            addCriterion("store_pic not in", values, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicBetween(String value1, String value2) {
            addCriterion("store_pic between", value1, value2, "storePic");
            return (Criteria) this;
        }

        public Criteria andStorePicNotBetween(String value1, String value2) {
            addCriterion("store_pic not between", value1, value2, "storePic");
            return (Criteria) this;
        }

        public Criteria andStoreHeadIsNull() {
            addCriterion("store_head is null");
            return (Criteria) this;
        }

        public Criteria andStoreHeadIsNotNull() {
            addCriterion("store_head is not null");
            return (Criteria) this;
        }

        public Criteria andStoreHeadEqualTo(String value) {
            addCriterion("store_head =", value, "storeHead");
            return (Criteria) this;
        }

        public Criteria andStoreHeadNotEqualTo(String value) {
            addCriterion("store_head <>", value, "storeHead");
            return (Criteria) this;
        }

        public Criteria andStoreHeadGreaterThan(String value) {
            addCriterion("store_head >", value, "storeHead");
            return (Criteria) this;
        }

        public Criteria andStoreHeadGreaterThanOrEqualTo(String value) {
            addCriterion("store_head >=", value, "storeHead");
            return (Criteria) this;
        }

        public Criteria andStoreHeadLessThan(String value) {
            addCriterion("store_head <", value, "storeHead");
            return (Criteria) this;
        }

        public Criteria andStoreHeadLessThanOrEqualTo(String value) {
            addCriterion("store_head <=", value, "storeHead");
            return (Criteria) this;
        }

        public Criteria andStoreHeadLike(String value) {
            addCriterion("store_head like", value, "storeHead");
            return (Criteria) this;
        }

        public Criteria andStoreHeadNotLike(String value) {
            addCriterion("store_head not like", value, "storeHead");
            return (Criteria) this;
        }

        public Criteria andStoreHeadIn(List<String> values) {
            addCriterion("store_head in", values, "storeHead");
            return (Criteria) this;
        }

        public Criteria andStoreHeadNotIn(List<String> values) {
            addCriterion("store_head not in", values, "storeHead");
            return (Criteria) this;
        }

        public Criteria andStoreHeadBetween(String value1, String value2) {
            addCriterion("store_head between", value1, value2, "storeHead");
            return (Criteria) this;
        }

        public Criteria andStoreHeadNotBetween(String value1, String value2) {
            addCriterion("store_head not between", value1, value2, "storeHead");
            return (Criteria) this;
        }

        public Criteria andStoreStateIsNull() {
            addCriterion("store_state is null");
            return (Criteria) this;
        }

        public Criteria andStoreStateIsNotNull() {
            addCriterion("store_state is not null");
            return (Criteria) this;
        }

        public Criteria andStoreStateEqualTo(String value) {
            addCriterion("store_state =", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotEqualTo(String value) {
            addCriterion("store_state <>", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateGreaterThan(String value) {
            addCriterion("store_state >", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateGreaterThanOrEqualTo(String value) {
            addCriterion("store_state >=", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateLessThan(String value) {
            addCriterion("store_state <", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateLessThanOrEqualTo(String value) {
            addCriterion("store_state <=", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateLike(String value) {
            addCriterion("store_state like", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotLike(String value) {
            addCriterion("store_state not like", value, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateIn(List<String> values) {
            addCriterion("store_state in", values, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotIn(List<String> values) {
            addCriterion("store_state not in", values, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateBetween(String value1, String value2) {
            addCriterion("store_state between", value1, value2, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreStateNotBetween(String value1, String value2) {
            addCriterion("store_state not between", value1, value2, "storeState");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountIsNull() {
            addCriterion("store_discount is null");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountIsNotNull() {
            addCriterion("store_discount is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountEqualTo(String value) {
            addCriterion("store_discount =", value, "storeDiscount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountNotEqualTo(String value) {
            addCriterion("store_discount <>", value, "storeDiscount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountGreaterThan(String value) {
            addCriterion("store_discount >", value, "storeDiscount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("store_discount >=", value, "storeDiscount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountLessThan(String value) {
            addCriterion("store_discount <", value, "storeDiscount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountLessThanOrEqualTo(String value) {
            addCriterion("store_discount <=", value, "storeDiscount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountLike(String value) {
            addCriterion("store_discount like", value, "storeDiscount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountNotLike(String value) {
            addCriterion("store_discount not like", value, "storeDiscount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountIn(List<String> values) {
            addCriterion("store_discount in", values, "storeDiscount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountNotIn(List<String> values) {
            addCriterion("store_discount not in", values, "storeDiscount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountBetween(String value1, String value2) {
            addCriterion("store_discount between", value1, value2, "storeDiscount");
            return (Criteria) this;
        }

        public Criteria andStoreDiscountNotBetween(String value1, String value2) {
            addCriterion("store_discount not between", value1, value2, "storeDiscount");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverypriceIsNull() {
            addCriterion("store_deliveryprice is null");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverypriceIsNotNull() {
            addCriterion("store_deliveryprice is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverypriceEqualTo(BigDecimal value) {
            addCriterion("store_deliveryprice =", value, "storeDeliveryprice");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverypriceNotEqualTo(BigDecimal value) {
            addCriterion("store_deliveryprice <>", value, "storeDeliveryprice");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverypriceGreaterThan(BigDecimal value) {
            addCriterion("store_deliveryprice >", value, "storeDeliveryprice");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverypriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("store_deliveryprice >=", value, "storeDeliveryprice");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverypriceLessThan(BigDecimal value) {
            addCriterion("store_deliveryprice <", value, "storeDeliveryprice");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverypriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("store_deliveryprice <=", value, "storeDeliveryprice");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverypriceIn(List<BigDecimal> values) {
            addCriterion("store_deliveryprice in", values, "storeDeliveryprice");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverypriceNotIn(List<BigDecimal> values) {
            addCriterion("store_deliveryprice not in", values, "storeDeliveryprice");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverypriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_deliveryprice between", value1, value2, "storeDeliveryprice");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverypriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("store_deliveryprice not between", value1, value2, "storeDeliveryprice");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryrangeIsNull() {
            addCriterion("store_deliveryrange is null");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryrangeIsNotNull() {
            addCriterion("store_deliveryrange is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryrangeEqualTo(String value) {
            addCriterion("store_deliveryrange =", value, "storeDeliveryrange");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryrangeNotEqualTo(String value) {
            addCriterion("store_deliveryrange <>", value, "storeDeliveryrange");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryrangeGreaterThan(String value) {
            addCriterion("store_deliveryrange >", value, "storeDeliveryrange");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryrangeGreaterThanOrEqualTo(String value) {
            addCriterion("store_deliveryrange >=", value, "storeDeliveryrange");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryrangeLessThan(String value) {
            addCriterion("store_deliveryrange <", value, "storeDeliveryrange");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryrangeLessThanOrEqualTo(String value) {
            addCriterion("store_deliveryrange <=", value, "storeDeliveryrange");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryrangeLike(String value) {
            addCriterion("store_deliveryrange like", value, "storeDeliveryrange");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryrangeNotLike(String value) {
            addCriterion("store_deliveryrange not like", value, "storeDeliveryrange");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryrangeIn(List<String> values) {
            addCriterion("store_deliveryrange in", values, "storeDeliveryrange");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryrangeNotIn(List<String> values) {
            addCriterion("store_deliveryrange not in", values, "storeDeliveryrange");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryrangeBetween(String value1, String value2) {
            addCriterion("store_deliveryrange between", value1, value2, "storeDeliveryrange");
            return (Criteria) this;
        }

        public Criteria andStoreDeliveryrangeNotBetween(String value1, String value2) {
            addCriterion("store_deliveryrange not between", value1, value2, "storeDeliveryrange");
            return (Criteria) this;
        }

        public Criteria andStoreDelivertimeIsNull() {
            addCriterion("store_delivertime is null");
            return (Criteria) this;
        }

        public Criteria andStoreDelivertimeIsNotNull() {
            addCriterion("store_delivertime is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDelivertimeEqualTo(String value) {
            addCriterion("store_delivertime =", value, "storeDelivertime");
            return (Criteria) this;
        }

        public Criteria andStoreDelivertimeNotEqualTo(String value) {
            addCriterion("store_delivertime <>", value, "storeDelivertime");
            return (Criteria) this;
        }

        public Criteria andStoreDelivertimeGreaterThan(String value) {
            addCriterion("store_delivertime >", value, "storeDelivertime");
            return (Criteria) this;
        }

        public Criteria andStoreDelivertimeGreaterThanOrEqualTo(String value) {
            addCriterion("store_delivertime >=", value, "storeDelivertime");
            return (Criteria) this;
        }

        public Criteria andStoreDelivertimeLessThan(String value) {
            addCriterion("store_delivertime <", value, "storeDelivertime");
            return (Criteria) this;
        }

        public Criteria andStoreDelivertimeLessThanOrEqualTo(String value) {
            addCriterion("store_delivertime <=", value, "storeDelivertime");
            return (Criteria) this;
        }

        public Criteria andStoreDelivertimeLike(String value) {
            addCriterion("store_delivertime like", value, "storeDelivertime");
            return (Criteria) this;
        }

        public Criteria andStoreDelivertimeNotLike(String value) {
            addCriterion("store_delivertime not like", value, "storeDelivertime");
            return (Criteria) this;
        }

        public Criteria andStoreDelivertimeIn(List<String> values) {
            addCriterion("store_delivertime in", values, "storeDelivertime");
            return (Criteria) this;
        }

        public Criteria andStoreDelivertimeNotIn(List<String> values) {
            addCriterion("store_delivertime not in", values, "storeDelivertime");
            return (Criteria) this;
        }

        public Criteria andStoreDelivertimeBetween(String value1, String value2) {
            addCriterion("store_delivertime between", value1, value2, "storeDelivertime");
            return (Criteria) this;
        }

        public Criteria andStoreDelivertimeNotBetween(String value1, String value2) {
            addCriterion("store_delivertime not between", value1, value2, "storeDelivertime");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverystateIsNull() {
            addCriterion("store_deliverystate is null");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverystateIsNotNull() {
            addCriterion("store_deliverystate is not null");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverystateEqualTo(String value) {
            addCriterion("store_deliverystate =", value, "storeDeliverystate");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverystateNotEqualTo(String value) {
            addCriterion("store_deliverystate <>", value, "storeDeliverystate");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverystateGreaterThan(String value) {
            addCriterion("store_deliverystate >", value, "storeDeliverystate");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverystateGreaterThanOrEqualTo(String value) {
            addCriterion("store_deliverystate >=", value, "storeDeliverystate");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverystateLessThan(String value) {
            addCriterion("store_deliverystate <", value, "storeDeliverystate");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverystateLessThanOrEqualTo(String value) {
            addCriterion("store_deliverystate <=", value, "storeDeliverystate");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverystateLike(String value) {
            addCriterion("store_deliverystate like", value, "storeDeliverystate");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverystateNotLike(String value) {
            addCriterion("store_deliverystate not like", value, "storeDeliverystate");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverystateIn(List<String> values) {
            addCriterion("store_deliverystate in", values, "storeDeliverystate");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverystateNotIn(List<String> values) {
            addCriterion("store_deliverystate not in", values, "storeDeliverystate");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverystateBetween(String value1, String value2) {
            addCriterion("store_deliverystate between", value1, value2, "storeDeliverystate");
            return (Criteria) this;
        }

        public Criteria andStoreDeliverystateNotBetween(String value1, String value2) {
            addCriterion("store_deliverystate not between", value1, value2, "storeDeliverystate");
            return (Criteria) this;
        }

        public Criteria andStoreCreditworthinessIsNull() {
            addCriterion("store_creditworthiness is null");
            return (Criteria) this;
        }

        public Criteria andStoreCreditworthinessIsNotNull() {
            addCriterion("store_creditworthiness is not null");
            return (Criteria) this;
        }

        public Criteria andStoreCreditworthinessEqualTo(Integer value) {
            addCriterion("store_creditworthiness =", value, "storeCreditworthiness");
            return (Criteria) this;
        }

        public Criteria andStoreCreditworthinessNotEqualTo(Integer value) {
            addCriterion("store_creditworthiness <>", value, "storeCreditworthiness");
            return (Criteria) this;
        }

        public Criteria andStoreCreditworthinessGreaterThan(Integer value) {
            addCriterion("store_creditworthiness >", value, "storeCreditworthiness");
            return (Criteria) this;
        }

        public Criteria andStoreCreditworthinessGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_creditworthiness >=", value, "storeCreditworthiness");
            return (Criteria) this;
        }

        public Criteria andStoreCreditworthinessLessThan(Integer value) {
            addCriterion("store_creditworthiness <", value, "storeCreditworthiness");
            return (Criteria) this;
        }

        public Criteria andStoreCreditworthinessLessThanOrEqualTo(Integer value) {
            addCriterion("store_creditworthiness <=", value, "storeCreditworthiness");
            return (Criteria) this;
        }

        public Criteria andStoreCreditworthinessIn(List<Integer> values) {
            addCriterion("store_creditworthiness in", values, "storeCreditworthiness");
            return (Criteria) this;
        }

        public Criteria andStoreCreditworthinessNotIn(List<Integer> values) {
            addCriterion("store_creditworthiness not in", values, "storeCreditworthiness");
            return (Criteria) this;
        }

        public Criteria andStoreCreditworthinessBetween(Integer value1, Integer value2) {
            addCriterion("store_creditworthiness between", value1, value2, "storeCreditworthiness");
            return (Criteria) this;
        }

        public Criteria andStoreCreditworthinessNotBetween(Integer value1, Integer value2) {
            addCriterion("store_creditworthiness not between", value1, value2, "storeCreditworthiness");
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