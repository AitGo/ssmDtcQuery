package com.xtool.query.po;

import java.util.ArrayList;
import java.util.List;

public class CarExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CarExample() {
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

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNull() {
            addCriterion("ctype is null");
            return (Criteria) this;
        }

        public Criteria andCtypeIsNotNull() {
            addCriterion("ctype is not null");
            return (Criteria) this;
        }

        public Criteria andCtypeEqualTo(String value) {
            addCriterion("ctype =", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotEqualTo(String value) {
            addCriterion("ctype <>", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThan(String value) {
            addCriterion("ctype >", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ctype >=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThan(String value) {
            addCriterion("ctype <", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLessThanOrEqualTo(String value) {
            addCriterion("ctype <=", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeLike(String value) {
            addCriterion("ctype like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotLike(String value) {
            addCriterion("ctype not like", value, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeIn(List<String> values) {
            addCriterion("ctype in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotIn(List<String> values) {
            addCriterion("ctype not in", values, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeBetween(String value1, String value2) {
            addCriterion("ctype between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCtypeNotBetween(String value1, String value2) {
            addCriterion("ctype not between", value1, value2, "ctype");
            return (Criteria) this;
        }

        public Criteria andCproductIsNull() {
            addCriterion("cproduct is null");
            return (Criteria) this;
        }

        public Criteria andCproductIsNotNull() {
            addCriterion("cproduct is not null");
            return (Criteria) this;
        }

        public Criteria andCproductEqualTo(String value) {
            addCriterion("cproduct =", value, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductNotEqualTo(String value) {
            addCriterion("cproduct <>", value, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductGreaterThan(String value) {
            addCriterion("cproduct >", value, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductGreaterThanOrEqualTo(String value) {
            addCriterion("cproduct >=", value, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductLessThan(String value) {
            addCriterion("cproduct <", value, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductLessThanOrEqualTo(String value) {
            addCriterion("cproduct <=", value, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductLike(String value) {
            addCriterion("cproduct like", value, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductNotLike(String value) {
            addCriterion("cproduct not like", value, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductIn(List<String> values) {
            addCriterion("cproduct in", values, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductNotIn(List<String> values) {
            addCriterion("cproduct not in", values, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductBetween(String value1, String value2) {
            addCriterion("cproduct between", value1, value2, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCproductNotBetween(String value1, String value2) {
            addCriterion("cproduct not between", value1, value2, "cproduct");
            return (Criteria) this;
        }

        public Criteria andCdisplacementIsNull() {
            addCriterion("cdisplacement is null");
            return (Criteria) this;
        }

        public Criteria andCdisplacementIsNotNull() {
            addCriterion("cdisplacement is not null");
            return (Criteria) this;
        }

        public Criteria andCdisplacementEqualTo(String value) {
            addCriterion("cdisplacement =", value, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementNotEqualTo(String value) {
            addCriterion("cdisplacement <>", value, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementGreaterThan(String value) {
            addCriterion("cdisplacement >", value, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementGreaterThanOrEqualTo(String value) {
            addCriterion("cdisplacement >=", value, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementLessThan(String value) {
            addCriterion("cdisplacement <", value, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementLessThanOrEqualTo(String value) {
            addCriterion("cdisplacement <=", value, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementLike(String value) {
            addCriterion("cdisplacement like", value, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementNotLike(String value) {
            addCriterion("cdisplacement not like", value, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementIn(List<String> values) {
            addCriterion("cdisplacement in", values, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementNotIn(List<String> values) {
            addCriterion("cdisplacement not in", values, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementBetween(String value1, String value2) {
            addCriterion("cdisplacement between", value1, value2, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCdisplacementNotBetween(String value1, String value2) {
            addCriterion("cdisplacement not between", value1, value2, "cdisplacement");
            return (Criteria) this;
        }

        public Criteria andCuidIsNull() {
            addCriterion("cuid is null");
            return (Criteria) this;
        }

        public Criteria andCuidIsNotNull() {
            addCriterion("cuid is not null");
            return (Criteria) this;
        }

        public Criteria andCuidEqualTo(Integer value) {
            addCriterion("cuid =", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotEqualTo(Integer value) {
            addCriterion("cuid <>", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidGreaterThan(Integer value) {
            addCriterion("cuid >", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cuid >=", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLessThan(Integer value) {
            addCriterion("cuid <", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidLessThanOrEqualTo(Integer value) {
            addCriterion("cuid <=", value, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidIn(List<Integer> values) {
            addCriterion("cuid in", values, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotIn(List<Integer> values) {
            addCriterion("cuid not in", values, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidBetween(Integer value1, Integer value2) {
            addCriterion("cuid between", value1, value2, "cuid");
            return (Criteria) this;
        }

        public Criteria andCuidNotBetween(Integer value1, Integer value2) {
            addCriterion("cuid not between", value1, value2, "cuid");
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