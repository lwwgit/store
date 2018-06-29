package com.cloud.store.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class UserStoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserStoreExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andDirIsNull() {
            addCriterion("dir is null");
            return (Criteria) this;
        }

        public Criteria andDirIsNotNull() {
            addCriterion("dir is not null");
            return (Criteria) this;
        }

        public Criteria andDirEqualTo(String value) {
            addCriterion("dir =", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirNotEqualTo(String value) {
            addCriterion("dir <>", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirGreaterThan(String value) {
            addCriterion("dir >", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirGreaterThanOrEqualTo(String value) {
            addCriterion("dir >=", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirLessThan(String value) {
            addCriterion("dir <", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirLessThanOrEqualTo(String value) {
            addCriterion("dir <=", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirLike(String value) {
            addCriterion("dir like", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirNotLike(String value) {
            addCriterion("dir not like", value, "dir");
            return (Criteria) this;
        }

        public Criteria andDirIn(List<String> values) {
            addCriterion("dir in", values, "dir");
            return (Criteria) this;
        }

        public Criteria andDirNotIn(List<String> values) {
            addCriterion("dir not in", values, "dir");
            return (Criteria) this;
        }

        public Criteria andDirBetween(String value1, String value2) {
            addCriterion("dir between", value1, value2, "dir");
            return (Criteria) this;
        }

        public Criteria andDirNotBetween(String value1, String value2) {
            addCriterion("dir not between", value1, value2, "dir");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityIsNull() {
            addCriterion("available_capacity is null");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityIsNotNull() {
            addCriterion("available_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityEqualTo(String value) {
            addCriterion("available_capacity =", value, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityNotEqualTo(String value) {
            addCriterion("available_capacity <>", value, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityGreaterThan(String value) {
            addCriterion("available_capacity >", value, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityGreaterThanOrEqualTo(String value) {
            addCriterion("available_capacity >=", value, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityLessThan(String value) {
            addCriterion("available_capacity <", value, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityLessThanOrEqualTo(String value) {
            addCriterion("available_capacity <=", value, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityLike(String value) {
            addCriterion("available_capacity like", value, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityNotLike(String value) {
            addCriterion("available_capacity not like", value, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityIn(List<String> values) {
            addCriterion("available_capacity in", values, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityNotIn(List<String> values) {
            addCriterion("available_capacity not in", values, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityBetween(String value1, String value2) {
            addCriterion("available_capacity between", value1, value2, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityNotBetween(String value1, String value2) {
            addCriterion("available_capacity not between", value1, value2, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityIsNull() {
            addCriterion("used_capacity is null");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityIsNotNull() {
            addCriterion("used_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityEqualTo(String value) {
            addCriterion("used_capacity =", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityNotEqualTo(String value) {
            addCriterion("used_capacity <>", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityGreaterThan(String value) {
            addCriterion("used_capacity >", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityGreaterThanOrEqualTo(String value) {
            addCriterion("used_capacity >=", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityLessThan(String value) {
            addCriterion("used_capacity <", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityLessThanOrEqualTo(String value) {
            addCriterion("used_capacity <=", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityLike(String value) {
            addCriterion("used_capacity like", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityNotLike(String value) {
            addCriterion("used_capacity not like", value, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityIn(List<String> values) {
            addCriterion("used_capacity in", values, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityNotIn(List<String> values) {
            addCriterion("used_capacity not in", values, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityBetween(String value1, String value2) {
            addCriterion("used_capacity between", value1, value2, "usedCapacity");
            return (Criteria) this;
        }

        public Criteria andUsedCapacityNotBetween(String value1, String value2) {
            addCriterion("used_capacity not between", value1, value2, "usedCapacity");
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