package com.warcraft.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BossInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BossInfoExample() {
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

        public Criteria andBossIdIsNull() {
            addCriterion("boss_id is null");
            return (Criteria) this;
        }

        public Criteria andBossIdIsNotNull() {
            addCriterion("boss_id is not null");
            return (Criteria) this;
        }

        public Criteria andBossIdEqualTo(Long value) {
            addCriterion("boss_id =", value, "bossId");
            return (Criteria) this;
        }

        public Criteria andBossIdNotEqualTo(Long value) {
            addCriterion("boss_id <>", value, "bossId");
            return (Criteria) this;
        }

        public Criteria andBossIdGreaterThan(Long value) {
            addCriterion("boss_id >", value, "bossId");
            return (Criteria) this;
        }

        public Criteria andBossIdGreaterThanOrEqualTo(Long value) {
            addCriterion("boss_id >=", value, "bossId");
            return (Criteria) this;
        }

        public Criteria andBossIdLessThan(Long value) {
            addCriterion("boss_id <", value, "bossId");
            return (Criteria) this;
        }

        public Criteria andBossIdLessThanOrEqualTo(Long value) {
            addCriterion("boss_id <=", value, "bossId");
            return (Criteria) this;
        }

        public Criteria andBossIdIn(List<Long> values) {
            addCriterion("boss_id in", values, "bossId");
            return (Criteria) this;
        }

        public Criteria andBossIdNotIn(List<Long> values) {
            addCriterion("boss_id not in", values, "bossId");
            return (Criteria) this;
        }

        public Criteria andBossIdBetween(Long value1, Long value2) {
            addCriterion("boss_id between", value1, value2, "bossId");
            return (Criteria) this;
        }

        public Criteria andBossIdNotBetween(Long value1, Long value2) {
            addCriterion("boss_id not between", value1, value2, "bossId");
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

        public Criteria andBossUsernameIsNull() {
            addCriterion("boss_username is null");
            return (Criteria) this;
        }

        public Criteria andBossUsernameIsNotNull() {
            addCriterion("boss_username is not null");
            return (Criteria) this;
        }

        public Criteria andBossUsernameEqualTo(String value) {
            addCriterion("boss_username =", value, "bossUsername");
            return (Criteria) this;
        }

        public Criteria andBossUsernameNotEqualTo(String value) {
            addCriterion("boss_username <>", value, "bossUsername");
            return (Criteria) this;
        }

        public Criteria andBossUsernameGreaterThan(String value) {
            addCriterion("boss_username >", value, "bossUsername");
            return (Criteria) this;
        }

        public Criteria andBossUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("boss_username >=", value, "bossUsername");
            return (Criteria) this;
        }

        public Criteria andBossUsernameLessThan(String value) {
            addCriterion("boss_username <", value, "bossUsername");
            return (Criteria) this;
        }

        public Criteria andBossUsernameLessThanOrEqualTo(String value) {
            addCriterion("boss_username <=", value, "bossUsername");
            return (Criteria) this;
        }

        public Criteria andBossUsernameLike(String value) {
            addCriterion("boss_username like", value, "bossUsername");
            return (Criteria) this;
        }

        public Criteria andBossUsernameNotLike(String value) {
            addCriterion("boss_username not like", value, "bossUsername");
            return (Criteria) this;
        }

        public Criteria andBossUsernameIn(List<String> values) {
            addCriterion("boss_username in", values, "bossUsername");
            return (Criteria) this;
        }

        public Criteria andBossUsernameNotIn(List<String> values) {
            addCriterion("boss_username not in", values, "bossUsername");
            return (Criteria) this;
        }

        public Criteria andBossUsernameBetween(String value1, String value2) {
            addCriterion("boss_username between", value1, value2, "bossUsername");
            return (Criteria) this;
        }

        public Criteria andBossUsernameNotBetween(String value1, String value2) {
            addCriterion("boss_username not between", value1, value2, "bossUsername");
            return (Criteria) this;
        }

        public Criteria andBossPasswordIsNull() {
            addCriterion("boss_password is null");
            return (Criteria) this;
        }

        public Criteria andBossPasswordIsNotNull() {
            addCriterion("boss_password is not null");
            return (Criteria) this;
        }

        public Criteria andBossPasswordEqualTo(String value) {
            addCriterion("boss_password =", value, "bossPassword");
            return (Criteria) this;
        }

        public Criteria andBossPasswordNotEqualTo(String value) {
            addCriterion("boss_password <>", value, "bossPassword");
            return (Criteria) this;
        }

        public Criteria andBossPasswordGreaterThan(String value) {
            addCriterion("boss_password >", value, "bossPassword");
            return (Criteria) this;
        }

        public Criteria andBossPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("boss_password >=", value, "bossPassword");
            return (Criteria) this;
        }

        public Criteria andBossPasswordLessThan(String value) {
            addCriterion("boss_password <", value, "bossPassword");
            return (Criteria) this;
        }

        public Criteria andBossPasswordLessThanOrEqualTo(String value) {
            addCriterion("boss_password <=", value, "bossPassword");
            return (Criteria) this;
        }

        public Criteria andBossPasswordLike(String value) {
            addCriterion("boss_password like", value, "bossPassword");
            return (Criteria) this;
        }

        public Criteria andBossPasswordNotLike(String value) {
            addCriterion("boss_password not like", value, "bossPassword");
            return (Criteria) this;
        }

        public Criteria andBossPasswordIn(List<String> values) {
            addCriterion("boss_password in", values, "bossPassword");
            return (Criteria) this;
        }

        public Criteria andBossPasswordNotIn(List<String> values) {
            addCriterion("boss_password not in", values, "bossPassword");
            return (Criteria) this;
        }

        public Criteria andBossPasswordBetween(String value1, String value2) {
            addCriterion("boss_password between", value1, value2, "bossPassword");
            return (Criteria) this;
        }

        public Criteria andBossPasswordNotBetween(String value1, String value2) {
            addCriterion("boss_password not between", value1, value2, "bossPassword");
            return (Criteria) this;
        }

        public Criteria andBossNameIsNull() {
            addCriterion("boss_name is null");
            return (Criteria) this;
        }

        public Criteria andBossNameIsNotNull() {
            addCriterion("boss_name is not null");
            return (Criteria) this;
        }

        public Criteria andBossNameEqualTo(String value) {
            addCriterion("boss_name =", value, "bossName");
            return (Criteria) this;
        }

        public Criteria andBossNameNotEqualTo(String value) {
            addCriterion("boss_name <>", value, "bossName");
            return (Criteria) this;
        }

        public Criteria andBossNameGreaterThan(String value) {
            addCriterion("boss_name >", value, "bossName");
            return (Criteria) this;
        }

        public Criteria andBossNameGreaterThanOrEqualTo(String value) {
            addCriterion("boss_name >=", value, "bossName");
            return (Criteria) this;
        }

        public Criteria andBossNameLessThan(String value) {
            addCriterion("boss_name <", value, "bossName");
            return (Criteria) this;
        }

        public Criteria andBossNameLessThanOrEqualTo(String value) {
            addCriterion("boss_name <=", value, "bossName");
            return (Criteria) this;
        }

        public Criteria andBossNameLike(String value) {
            addCriterion("boss_name like", value, "bossName");
            return (Criteria) this;
        }

        public Criteria andBossNameNotLike(String value) {
            addCriterion("boss_name not like", value, "bossName");
            return (Criteria) this;
        }

        public Criteria andBossNameIn(List<String> values) {
            addCriterion("boss_name in", values, "bossName");
            return (Criteria) this;
        }

        public Criteria andBossNameNotIn(List<String> values) {
            addCriterion("boss_name not in", values, "bossName");
            return (Criteria) this;
        }

        public Criteria andBossNameBetween(String value1, String value2) {
            addCriterion("boss_name between", value1, value2, "bossName");
            return (Criteria) this;
        }

        public Criteria andBossNameNotBetween(String value1, String value2) {
            addCriterion("boss_name not between", value1, value2, "bossName");
            return (Criteria) this;
        }

        public Criteria andBossIdcardIsNull() {
            addCriterion("boss_idcard is null");
            return (Criteria) this;
        }

        public Criteria andBossIdcardIsNotNull() {
            addCriterion("boss_idcard is not null");
            return (Criteria) this;
        }

        public Criteria andBossIdcardEqualTo(String value) {
            addCriterion("boss_idcard =", value, "bossIdcard");
            return (Criteria) this;
        }

        public Criteria andBossIdcardNotEqualTo(String value) {
            addCriterion("boss_idcard <>", value, "bossIdcard");
            return (Criteria) this;
        }

        public Criteria andBossIdcardGreaterThan(String value) {
            addCriterion("boss_idcard >", value, "bossIdcard");
            return (Criteria) this;
        }

        public Criteria andBossIdcardGreaterThanOrEqualTo(String value) {
            addCriterion("boss_idcard >=", value, "bossIdcard");
            return (Criteria) this;
        }

        public Criteria andBossIdcardLessThan(String value) {
            addCriterion("boss_idcard <", value, "bossIdcard");
            return (Criteria) this;
        }

        public Criteria andBossIdcardLessThanOrEqualTo(String value) {
            addCriterion("boss_idcard <=", value, "bossIdcard");
            return (Criteria) this;
        }

        public Criteria andBossIdcardLike(String value) {
            addCriterion("boss_idcard like", value, "bossIdcard");
            return (Criteria) this;
        }

        public Criteria andBossIdcardNotLike(String value) {
            addCriterion("boss_idcard not like", value, "bossIdcard");
            return (Criteria) this;
        }

        public Criteria andBossIdcardIn(List<String> values) {
            addCriterion("boss_idcard in", values, "bossIdcard");
            return (Criteria) this;
        }

        public Criteria andBossIdcardNotIn(List<String> values) {
            addCriterion("boss_idcard not in", values, "bossIdcard");
            return (Criteria) this;
        }

        public Criteria andBossIdcardBetween(String value1, String value2) {
            addCriterion("boss_idcard between", value1, value2, "bossIdcard");
            return (Criteria) this;
        }

        public Criteria andBossIdcardNotBetween(String value1, String value2) {
            addCriterion("boss_idcard not between", value1, value2, "bossIdcard");
            return (Criteria) this;
        }

        public Criteria andBossLicensenameIsNull() {
            addCriterion("boss_licensename is null");
            return (Criteria) this;
        }

        public Criteria andBossLicensenameIsNotNull() {
            addCriterion("boss_licensename is not null");
            return (Criteria) this;
        }

        public Criteria andBossLicensenameEqualTo(String value) {
            addCriterion("boss_licensename =", value, "bossLicensename");
            return (Criteria) this;
        }

        public Criteria andBossLicensenameNotEqualTo(String value) {
            addCriterion("boss_licensename <>", value, "bossLicensename");
            return (Criteria) this;
        }

        public Criteria andBossLicensenameGreaterThan(String value) {
            addCriterion("boss_licensename >", value, "bossLicensename");
            return (Criteria) this;
        }

        public Criteria andBossLicensenameGreaterThanOrEqualTo(String value) {
            addCriterion("boss_licensename >=", value, "bossLicensename");
            return (Criteria) this;
        }

        public Criteria andBossLicensenameLessThan(String value) {
            addCriterion("boss_licensename <", value, "bossLicensename");
            return (Criteria) this;
        }

        public Criteria andBossLicensenameLessThanOrEqualTo(String value) {
            addCriterion("boss_licensename <=", value, "bossLicensename");
            return (Criteria) this;
        }

        public Criteria andBossLicensenameLike(String value) {
            addCriterion("boss_licensename like", value, "bossLicensename");
            return (Criteria) this;
        }

        public Criteria andBossLicensenameNotLike(String value) {
            addCriterion("boss_licensename not like", value, "bossLicensename");
            return (Criteria) this;
        }

        public Criteria andBossLicensenameIn(List<String> values) {
            addCriterion("boss_licensename in", values, "bossLicensename");
            return (Criteria) this;
        }

        public Criteria andBossLicensenameNotIn(List<String> values) {
            addCriterion("boss_licensename not in", values, "bossLicensename");
            return (Criteria) this;
        }

        public Criteria andBossLicensenameBetween(String value1, String value2) {
            addCriterion("boss_licensename between", value1, value2, "bossLicensename");
            return (Criteria) this;
        }

        public Criteria andBossLicensenameNotBetween(String value1, String value2) {
            addCriterion("boss_licensename not between", value1, value2, "bossLicensename");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistnumberIsNull() {
            addCriterion("boss_licenseregistnumber is null");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistnumberIsNotNull() {
            addCriterion("boss_licenseregistnumber is not null");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistnumberEqualTo(String value) {
            addCriterion("boss_licenseregistnumber =", value, "bossLicenseregistnumber");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistnumberNotEqualTo(String value) {
            addCriterion("boss_licenseregistnumber <>", value, "bossLicenseregistnumber");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistnumberGreaterThan(String value) {
            addCriterion("boss_licenseregistnumber >", value, "bossLicenseregistnumber");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistnumberGreaterThanOrEqualTo(String value) {
            addCriterion("boss_licenseregistnumber >=", value, "bossLicenseregistnumber");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistnumberLessThan(String value) {
            addCriterion("boss_licenseregistnumber <", value, "bossLicenseregistnumber");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistnumberLessThanOrEqualTo(String value) {
            addCriterion("boss_licenseregistnumber <=", value, "bossLicenseregistnumber");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistnumberLike(String value) {
            addCriterion("boss_licenseregistnumber like", value, "bossLicenseregistnumber");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistnumberNotLike(String value) {
            addCriterion("boss_licenseregistnumber not like", value, "bossLicenseregistnumber");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistnumberIn(List<String> values) {
            addCriterion("boss_licenseregistnumber in", values, "bossLicenseregistnumber");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistnumberNotIn(List<String> values) {
            addCriterion("boss_licenseregistnumber not in", values, "bossLicenseregistnumber");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistnumberBetween(String value1, String value2) {
            addCriterion("boss_licenseregistnumber between", value1, value2, "bossLicenseregistnumber");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistnumberNotBetween(String value1, String value2) {
            addCriterion("boss_licenseregistnumber not between", value1, value2, "bossLicenseregistnumber");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistaddrIsNull() {
            addCriterion("boss_licenseregistaddr is null");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistaddrIsNotNull() {
            addCriterion("boss_licenseregistaddr is not null");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistaddrEqualTo(String value) {
            addCriterion("boss_licenseregistaddr =", value, "bossLicenseregistaddr");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistaddrNotEqualTo(String value) {
            addCriterion("boss_licenseregistaddr <>", value, "bossLicenseregistaddr");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistaddrGreaterThan(String value) {
            addCriterion("boss_licenseregistaddr >", value, "bossLicenseregistaddr");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistaddrGreaterThanOrEqualTo(String value) {
            addCriterion("boss_licenseregistaddr >=", value, "bossLicenseregistaddr");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistaddrLessThan(String value) {
            addCriterion("boss_licenseregistaddr <", value, "bossLicenseregistaddr");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistaddrLessThanOrEqualTo(String value) {
            addCriterion("boss_licenseregistaddr <=", value, "bossLicenseregistaddr");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistaddrLike(String value) {
            addCriterion("boss_licenseregistaddr like", value, "bossLicenseregistaddr");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistaddrNotLike(String value) {
            addCriterion("boss_licenseregistaddr not like", value, "bossLicenseregistaddr");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistaddrIn(List<String> values) {
            addCriterion("boss_licenseregistaddr in", values, "bossLicenseregistaddr");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistaddrNotIn(List<String> values) {
            addCriterion("boss_licenseregistaddr not in", values, "bossLicenseregistaddr");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistaddrBetween(String value1, String value2) {
            addCriterion("boss_licenseregistaddr between", value1, value2, "bossLicenseregistaddr");
            return (Criteria) this;
        }

        public Criteria andBossLicenseregistaddrNotBetween(String value1, String value2) {
            addCriterion("boss_licenseregistaddr not between", value1, value2, "bossLicenseregistaddr");
            return (Criteria) this;
        }

        public Criteria andBossLicenseidIsNull() {
            addCriterion("boss_licenseid is null");
            return (Criteria) this;
        }

        public Criteria andBossLicenseidIsNotNull() {
            addCriterion("boss_licenseid is not null");
            return (Criteria) this;
        }

        public Criteria andBossLicenseidEqualTo(String value) {
            addCriterion("boss_licenseid =", value, "bossLicenseid");
            return (Criteria) this;
        }

        public Criteria andBossLicenseidNotEqualTo(String value) {
            addCriterion("boss_licenseid <>", value, "bossLicenseid");
            return (Criteria) this;
        }

        public Criteria andBossLicenseidGreaterThan(String value) {
            addCriterion("boss_licenseid >", value, "bossLicenseid");
            return (Criteria) this;
        }

        public Criteria andBossLicenseidGreaterThanOrEqualTo(String value) {
            addCriterion("boss_licenseid >=", value, "bossLicenseid");
            return (Criteria) this;
        }

        public Criteria andBossLicenseidLessThan(String value) {
            addCriterion("boss_licenseid <", value, "bossLicenseid");
            return (Criteria) this;
        }

        public Criteria andBossLicenseidLessThanOrEqualTo(String value) {
            addCriterion("boss_licenseid <=", value, "bossLicenseid");
            return (Criteria) this;
        }

        public Criteria andBossLicenseidLike(String value) {
            addCriterion("boss_licenseid like", value, "bossLicenseid");
            return (Criteria) this;
        }

        public Criteria andBossLicenseidNotLike(String value) {
            addCriterion("boss_licenseid not like", value, "bossLicenseid");
            return (Criteria) this;
        }

        public Criteria andBossLicenseidIn(List<String> values) {
            addCriterion("boss_licenseid in", values, "bossLicenseid");
            return (Criteria) this;
        }

        public Criteria andBossLicenseidNotIn(List<String> values) {
            addCriterion("boss_licenseid not in", values, "bossLicenseid");
            return (Criteria) this;
        }

        public Criteria andBossLicenseidBetween(String value1, String value2) {
            addCriterion("boss_licenseid between", value1, value2, "bossLicenseid");
            return (Criteria) this;
        }

        public Criteria andBossLicenseidNotBetween(String value1, String value2) {
            addCriterion("boss_licenseid not between", value1, value2, "bossLicenseid");
            return (Criteria) this;
        }

        public Criteria andBossLicensetimeIsNull() {
            addCriterion("boss_licensetime is null");
            return (Criteria) this;
        }

        public Criteria andBossLicensetimeIsNotNull() {
            addCriterion("boss_licensetime is not null");
            return (Criteria) this;
        }

        public Criteria andBossLicensetimeEqualTo(Date value) {
            addCriterion("boss_licensetime =", value, "bossLicensetime");
            return (Criteria) this;
        }

        public Criteria andBossLicensetimeNotEqualTo(Date value) {
            addCriterion("boss_licensetime <>", value, "bossLicensetime");
            return (Criteria) this;
        }

        public Criteria andBossLicensetimeGreaterThan(Date value) {
            addCriterion("boss_licensetime >", value, "bossLicensetime");
            return (Criteria) this;
        }

        public Criteria andBossLicensetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("boss_licensetime >=", value, "bossLicensetime");
            return (Criteria) this;
        }

        public Criteria andBossLicensetimeLessThan(Date value) {
            addCriterion("boss_licensetime <", value, "bossLicensetime");
            return (Criteria) this;
        }

        public Criteria andBossLicensetimeLessThanOrEqualTo(Date value) {
            addCriterion("boss_licensetime <=", value, "bossLicensetime");
            return (Criteria) this;
        }

        public Criteria andBossLicensetimeIn(List<Date> values) {
            addCriterion("boss_licensetime in", values, "bossLicensetime");
            return (Criteria) this;
        }

        public Criteria andBossLicensetimeNotIn(List<Date> values) {
            addCriterion("boss_licensetime not in", values, "bossLicensetime");
            return (Criteria) this;
        }

        public Criteria andBossLicensetimeBetween(Date value1, Date value2) {
            addCriterion("boss_licensetime between", value1, value2, "bossLicensetime");
            return (Criteria) this;
        }

        public Criteria andBossLicensetimeNotBetween(Date value1, Date value2) {
            addCriterion("boss_licensetime not between", value1, value2, "bossLicensetime");
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