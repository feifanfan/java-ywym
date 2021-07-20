package com.hackerff.code.model;

import java.util.ArrayList;
import java.util.List;

public class YwymActionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public YwymActionExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andActionIsNull() {
            addCriterion("action is null");
            return (Criteria) this;
        }

        public Criteria andActionIsNotNull() {
            addCriterion("action is not null");
            return (Criteria) this;
        }

        public Criteria andActionEqualTo(String value) {
            addCriterion("action =", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotEqualTo(String value) {
            addCriterion("action <>", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThan(String value) {
            addCriterion("action >", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionGreaterThanOrEqualTo(String value) {
            addCriterion("action >=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThan(String value) {
            addCriterion("action <", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLessThanOrEqualTo(String value) {
            addCriterion("action <=", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionLike(String value) {
            addCriterion("action like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotLike(String value) {
            addCriterion("action not like", value, "action");
            return (Criteria) this;
        }

        public Criteria andActionIn(List<String> values) {
            addCriterion("action in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotIn(List<String> values) {
            addCriterion("action not in", values, "action");
            return (Criteria) this;
        }

        public Criteria andActionBetween(String value1, String value2) {
            addCriterion("action between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionNotBetween(String value1, String value2) {
            addCriterion("action not between", value1, value2, "action");
            return (Criteria) this;
        }

        public Criteria andActionlinkIsNull() {
            addCriterion("actionLink is null");
            return (Criteria) this;
        }

        public Criteria andActionlinkIsNotNull() {
            addCriterion("actionLink is not null");
            return (Criteria) this;
        }

        public Criteria andActionlinkEqualTo(String value) {
            addCriterion("actionLink =", value, "actionlink");
            return (Criteria) this;
        }

        public Criteria andActionlinkNotEqualTo(String value) {
            addCriterion("actionLink <>", value, "actionlink");
            return (Criteria) this;
        }

        public Criteria andActionlinkGreaterThan(String value) {
            addCriterion("actionLink >", value, "actionlink");
            return (Criteria) this;
        }

        public Criteria andActionlinkGreaterThanOrEqualTo(String value) {
            addCriterion("actionLink >=", value, "actionlink");
            return (Criteria) this;
        }

        public Criteria andActionlinkLessThan(String value) {
            addCriterion("actionLink <", value, "actionlink");
            return (Criteria) this;
        }

        public Criteria andActionlinkLessThanOrEqualTo(String value) {
            addCriterion("actionLink <=", value, "actionlink");
            return (Criteria) this;
        }

        public Criteria andActionlinkLike(String value) {
            addCriterion("actionLink like", value, "actionlink");
            return (Criteria) this;
        }

        public Criteria andActionlinkNotLike(String value) {
            addCriterion("actionLink not like", value, "actionlink");
            return (Criteria) this;
        }

        public Criteria andActionlinkIn(List<String> values) {
            addCriterion("actionLink in", values, "actionlink");
            return (Criteria) this;
        }

        public Criteria andActionlinkNotIn(List<String> values) {
            addCriterion("actionLink not in", values, "actionlink");
            return (Criteria) this;
        }

        public Criteria andActionlinkBetween(String value1, String value2) {
            addCriterion("actionLink between", value1, value2, "actionlink");
            return (Criteria) this;
        }

        public Criteria andActionlinkNotBetween(String value1, String value2) {
            addCriterion("actionLink not between", value1, value2, "actionlink");
            return (Criteria) this;
        }

        public Criteria andActionnameIsNull() {
            addCriterion("actionName is null");
            return (Criteria) this;
        }

        public Criteria andActionnameIsNotNull() {
            addCriterion("actionName is not null");
            return (Criteria) this;
        }

        public Criteria andActionnameEqualTo(String value) {
            addCriterion("actionName =", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameNotEqualTo(String value) {
            addCriterion("actionName <>", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameGreaterThan(String value) {
            addCriterion("actionName >", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameGreaterThanOrEqualTo(String value) {
            addCriterion("actionName >=", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameLessThan(String value) {
            addCriterion("actionName <", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameLessThanOrEqualTo(String value) {
            addCriterion("actionName <=", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameLike(String value) {
            addCriterion("actionName like", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameNotLike(String value) {
            addCriterion("actionName not like", value, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameIn(List<String> values) {
            addCriterion("actionName in", values, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameNotIn(List<String> values) {
            addCriterion("actionName not in", values, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameBetween(String value1, String value2) {
            addCriterion("actionName between", value1, value2, "actionname");
            return (Criteria) this;
        }

        public Criteria andActionnameNotBetween(String value1, String value2) {
            addCriterion("actionName not between", value1, value2, "actionname");
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