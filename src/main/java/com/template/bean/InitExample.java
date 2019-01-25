package com.template.bean;

import java.util.ArrayList;
import java.util.List;

public class InitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InitExample() {
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

        public Criteria andInitIdIsNull() {
            addCriterion("init_id is null");
            return (Criteria) this;
        }

        public Criteria andInitIdIsNotNull() {
            addCriterion("init_id is not null");
            return (Criteria) this;
        }

        public Criteria andInitIdEqualTo(Integer value) {
            addCriterion("init_id =", value, "initId");
            return (Criteria) this;
        }

        public Criteria andInitIdNotEqualTo(Integer value) {
            addCriterion("init_id <>", value, "initId");
            return (Criteria) this;
        }

        public Criteria andInitIdGreaterThan(Integer value) {
            addCriterion("init_id >", value, "initId");
            return (Criteria) this;
        }

        public Criteria andInitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("init_id >=", value, "initId");
            return (Criteria) this;
        }

        public Criteria andInitIdLessThan(Integer value) {
            addCriterion("init_id <", value, "initId");
            return (Criteria) this;
        }

        public Criteria andInitIdLessThanOrEqualTo(Integer value) {
            addCriterion("init_id <=", value, "initId");
            return (Criteria) this;
        }

        public Criteria andInitIdIn(List<Integer> values) {
            addCriterion("init_id in", values, "initId");
            return (Criteria) this;
        }

        public Criteria andInitIdNotIn(List<Integer> values) {
            addCriterion("init_id not in", values, "initId");
            return (Criteria) this;
        }

        public Criteria andInitIdBetween(Integer value1, Integer value2) {
            addCriterion("init_id between", value1, value2, "initId");
            return (Criteria) this;
        }

        public Criteria andInitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("init_id not between", value1, value2, "initId");
            return (Criteria) this;
        }

        public Criteria andInitContentIsNull() {
            addCriterion("init_content is null");
            return (Criteria) this;
        }

        public Criteria andInitContentIsNotNull() {
            addCriterion("init_content is not null");
            return (Criteria) this;
        }

        public Criteria andInitContentEqualTo(String value) {
            addCriterion("init_content =", value, "initContent");
            return (Criteria) this;
        }

        public Criteria andInitContentNotEqualTo(String value) {
            addCriterion("init_content <>", value, "initContent");
            return (Criteria) this;
        }

        public Criteria andInitContentGreaterThan(String value) {
            addCriterion("init_content >", value, "initContent");
            return (Criteria) this;
        }

        public Criteria andInitContentGreaterThanOrEqualTo(String value) {
            addCriterion("init_content >=", value, "initContent");
            return (Criteria) this;
        }

        public Criteria andInitContentLessThan(String value) {
            addCriterion("init_content <", value, "initContent");
            return (Criteria) this;
        }

        public Criteria andInitContentLessThanOrEqualTo(String value) {
            addCriterion("init_content <=", value, "initContent");
            return (Criteria) this;
        }

        public Criteria andInitContentLike(String value) {
            addCriterion("init_content like", value, "initContent");
            return (Criteria) this;
        }

        public Criteria andInitContentNotLike(String value) {
            addCriterion("init_content not like", value, "initContent");
            return (Criteria) this;
        }

        public Criteria andInitContentIn(List<String> values) {
            addCriterion("init_content in", values, "initContent");
            return (Criteria) this;
        }

        public Criteria andInitContentNotIn(List<String> values) {
            addCriterion("init_content not in", values, "initContent");
            return (Criteria) this;
        }

        public Criteria andInitContentBetween(String value1, String value2) {
            addCriterion("init_content between", value1, value2, "initContent");
            return (Criteria) this;
        }

        public Criteria andInitContentNotBetween(String value1, String value2) {
            addCriterion("init_content not between", value1, value2, "initContent");
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