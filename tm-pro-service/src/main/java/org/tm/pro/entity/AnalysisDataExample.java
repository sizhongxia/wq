package org.tm.pro.entity;

import java.util.ArrayList;
import java.util.List;

public class AnalysisDataExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AnalysisDataExample() {
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

        public Criteria andSmacIsNull() {
            addCriterion("smac is null");
            return (Criteria) this;
        }

        public Criteria andSmacIsNotNull() {
            addCriterion("smac is not null");
            return (Criteria) this;
        }

        public Criteria andSmacEqualTo(String value) {
            addCriterion("smac =", value, "smac");
            return (Criteria) this;
        }

        public Criteria andSmacNotEqualTo(String value) {
            addCriterion("smac <>", value, "smac");
            return (Criteria) this;
        }

        public Criteria andSmacGreaterThan(String value) {
            addCriterion("smac >", value, "smac");
            return (Criteria) this;
        }

        public Criteria andSmacGreaterThanOrEqualTo(String value) {
            addCriterion("smac >=", value, "smac");
            return (Criteria) this;
        }

        public Criteria andSmacLessThan(String value) {
            addCriterion("smac <", value, "smac");
            return (Criteria) this;
        }

        public Criteria andSmacLessThanOrEqualTo(String value) {
            addCriterion("smac <=", value, "smac");
            return (Criteria) this;
        }

        public Criteria andSmacLike(String value) {
            addCriterion("smac like", value, "smac");
            return (Criteria) this;
        }

        public Criteria andSmacNotLike(String value) {
            addCriterion("smac not like", value, "smac");
            return (Criteria) this;
        }

        public Criteria andSmacIn(List<String> values) {
            addCriterion("smac in", values, "smac");
            return (Criteria) this;
        }

        public Criteria andSmacNotIn(List<String> values) {
            addCriterion("smac not in", values, "smac");
            return (Criteria) this;
        }

        public Criteria andSmacBetween(String value1, String value2) {
            addCriterion("smac between", value1, value2, "smac");
            return (Criteria) this;
        }

        public Criteria andSmacNotBetween(String value1, String value2) {
            addCriterion("smac not between", value1, value2, "smac");
            return (Criteria) this;
        }

        public Criteria andDmacIsNull() {
            addCriterion("dmac is null");
            return (Criteria) this;
        }

        public Criteria andDmacIsNotNull() {
            addCriterion("dmac is not null");
            return (Criteria) this;
        }

        public Criteria andDmacEqualTo(String value) {
            addCriterion("dmac =", value, "dmac");
            return (Criteria) this;
        }

        public Criteria andDmacNotEqualTo(String value) {
            addCriterion("dmac <>", value, "dmac");
            return (Criteria) this;
        }

        public Criteria andDmacGreaterThan(String value) {
            addCriterion("dmac >", value, "dmac");
            return (Criteria) this;
        }

        public Criteria andDmacGreaterThanOrEqualTo(String value) {
            addCriterion("dmac >=", value, "dmac");
            return (Criteria) this;
        }

        public Criteria andDmacLessThan(String value) {
            addCriterion("dmac <", value, "dmac");
            return (Criteria) this;
        }

        public Criteria andDmacLessThanOrEqualTo(String value) {
            addCriterion("dmac <=", value, "dmac");
            return (Criteria) this;
        }

        public Criteria andDmacLike(String value) {
            addCriterion("dmac like", value, "dmac");
            return (Criteria) this;
        }

        public Criteria andDmacNotLike(String value) {
            addCriterion("dmac not like", value, "dmac");
            return (Criteria) this;
        }

        public Criteria andDmacIn(List<String> values) {
            addCriterion("dmac in", values, "dmac");
            return (Criteria) this;
        }

        public Criteria andDmacNotIn(List<String> values) {
            addCriterion("dmac not in", values, "dmac");
            return (Criteria) this;
        }

        public Criteria andDmacBetween(String value1, String value2) {
            addCriterion("dmac between", value1, value2, "dmac");
            return (Criteria) this;
        }

        public Criteria andDmacNotBetween(String value1, String value2) {
            addCriterion("dmac not between", value1, value2, "dmac");
            return (Criteria) this;
        }

        public Criteria andRssiIsNull() {
            addCriterion("rssi is null");
            return (Criteria) this;
        }

        public Criteria andRssiIsNotNull() {
            addCriterion("rssi is not null");
            return (Criteria) this;
        }

        public Criteria andRssiEqualTo(Integer value) {
            addCriterion("rssi =", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiNotEqualTo(Integer value) {
            addCriterion("rssi <>", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiGreaterThan(Integer value) {
            addCriterion("rssi >", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiGreaterThanOrEqualTo(Integer value) {
            addCriterion("rssi >=", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiLessThan(Integer value) {
            addCriterion("rssi <", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiLessThanOrEqualTo(Integer value) {
            addCriterion("rssi <=", value, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiIn(List<Integer> values) {
            addCriterion("rssi in", values, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiNotIn(List<Integer> values) {
            addCriterion("rssi not in", values, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiBetween(Integer value1, Integer value2) {
            addCriterion("rssi between", value1, value2, "rssi");
            return (Criteria) this;
        }

        public Criteria andRssiNotBetween(Integer value1, Integer value2) {
            addCriterion("rssi not between", value1, value2, "rssi");
            return (Criteria) this;
        }

        public Criteria andTsIsNull() {
            addCriterion("ts is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("ts is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(Long value) {
            addCriterion("ts =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(Long value) {
            addCriterion("ts <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(Long value) {
            addCriterion("ts >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(Long value) {
            addCriterion("ts >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(Long value) {
            addCriterion("ts <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(Long value) {
            addCriterion("ts <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<Long> values) {
            addCriterion("ts in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<Long> values) {
            addCriterion("ts not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(Long value1, Long value2) {
            addCriterion("ts between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(Long value1, Long value2) {
            addCriterion("ts not between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andCtIsNull() {
            addCriterion("ct is null");
            return (Criteria) this;
        }

        public Criteria andCtIsNotNull() {
            addCriterion("ct is not null");
            return (Criteria) this;
        }

        public Criteria andCtEqualTo(Long value) {
            addCriterion("ct =", value, "ct");
            return (Criteria) this;
        }

        public Criteria andCtNotEqualTo(Long value) {
            addCriterion("ct <>", value, "ct");
            return (Criteria) this;
        }

        public Criteria andCtGreaterThan(Long value) {
            addCriterion("ct >", value, "ct");
            return (Criteria) this;
        }

        public Criteria andCtGreaterThanOrEqualTo(Long value) {
            addCriterion("ct >=", value, "ct");
            return (Criteria) this;
        }

        public Criteria andCtLessThan(Long value) {
            addCriterion("ct <", value, "ct");
            return (Criteria) this;
        }

        public Criteria andCtLessThanOrEqualTo(Long value) {
            addCriterion("ct <=", value, "ct");
            return (Criteria) this;
        }

        public Criteria andCtIn(List<Long> values) {
            addCriterion("ct in", values, "ct");
            return (Criteria) this;
        }

        public Criteria andCtNotIn(List<Long> values) {
            addCriterion("ct not in", values, "ct");
            return (Criteria) this;
        }

        public Criteria andCtBetween(Long value1, Long value2) {
            addCriterion("ct between", value1, value2, "ct");
            return (Criteria) this;
        }

        public Criteria andCtNotBetween(Long value1, Long value2) {
            addCriterion("ct not between", value1, value2, "ct");
            return (Criteria) this;
        }

        public Criteria andSmacLikeInsensitive(String value) {
            addCriterion("upper(smac) like", value.toUpperCase(), "smac");
            return (Criteria) this;
        }

        public Criteria andDmacLikeInsensitive(String value) {
            addCriterion("upper(dmac) like", value.toUpperCase(), "dmac");
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