package com.testreport.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DischargeErrorRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DischargeErrorRecordExample() {
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

        public Criteria andIdentifyBoxNumberIsNull() {
            addCriterion("identify_box_number is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyBoxNumberIsNotNull() {
            addCriterion("identify_box_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyBoxNumberEqualTo(String value) {
            addCriterion("identify_box_number =", value, "identifyBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyBoxNumberNotEqualTo(String value) {
            addCriterion("identify_box_number <>", value, "identifyBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyBoxNumberGreaterThan(String value) {
            addCriterion("identify_box_number >", value, "identifyBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyBoxNumberGreaterThanOrEqualTo(String value) {
            addCriterion("identify_box_number >=", value, "identifyBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyBoxNumberLessThan(String value) {
            addCriterion("identify_box_number <", value, "identifyBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyBoxNumberLessThanOrEqualTo(String value) {
            addCriterion("identify_box_number <=", value, "identifyBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyBoxNumberLike(String value) {
            addCriterion("identify_box_number like", value, "identifyBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyBoxNumberNotLike(String value) {
            addCriterion("identify_box_number not like", value, "identifyBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyBoxNumberIn(List<String> values) {
            addCriterion("identify_box_number in", values, "identifyBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyBoxNumberNotIn(List<String> values) {
            addCriterion("identify_box_number not in", values, "identifyBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyBoxNumberBetween(String value1, String value2) {
            addCriterion("identify_box_number between", value1, value2, "identifyBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyBoxNumberNotBetween(String value1, String value2) {
            addCriterion("identify_box_number not between", value1, value2, "identifyBoxNumber");
            return (Criteria) this;
        }

        public Criteria andActualBoxNumberIsNull() {
            addCriterion("actual_box_number is null");
            return (Criteria) this;
        }

        public Criteria andActualBoxNumberIsNotNull() {
            addCriterion("actual_box_number is not null");
            return (Criteria) this;
        }

        public Criteria andActualBoxNumberEqualTo(String value) {
            addCriterion("actual_box_number =", value, "actualBoxNumber");
            return (Criteria) this;
        }

        public Criteria andActualBoxNumberNotEqualTo(String value) {
            addCriterion("actual_box_number <>", value, "actualBoxNumber");
            return (Criteria) this;
        }

        public Criteria andActualBoxNumberGreaterThan(String value) {
            addCriterion("actual_box_number >", value, "actualBoxNumber");
            return (Criteria) this;
        }

        public Criteria andActualBoxNumberGreaterThanOrEqualTo(String value) {
            addCriterion("actual_box_number >=", value, "actualBoxNumber");
            return (Criteria) this;
        }

        public Criteria andActualBoxNumberLessThan(String value) {
            addCriterion("actual_box_number <", value, "actualBoxNumber");
            return (Criteria) this;
        }

        public Criteria andActualBoxNumberLessThanOrEqualTo(String value) {
            addCriterion("actual_box_number <=", value, "actualBoxNumber");
            return (Criteria) this;
        }

        public Criteria andActualBoxNumberLike(String value) {
            addCriterion("actual_box_number like", value, "actualBoxNumber");
            return (Criteria) this;
        }

        public Criteria andActualBoxNumberNotLike(String value) {
            addCriterion("actual_box_number not like", value, "actualBoxNumber");
            return (Criteria) this;
        }

        public Criteria andActualBoxNumberIn(List<String> values) {
            addCriterion("actual_box_number in", values, "actualBoxNumber");
            return (Criteria) this;
        }

        public Criteria andActualBoxNumberNotIn(List<String> values) {
            addCriterion("actual_box_number not in", values, "actualBoxNumber");
            return (Criteria) this;
        }

        public Criteria andActualBoxNumberBetween(String value1, String value2) {
            addCriterion("actual_box_number between", value1, value2, "actualBoxNumber");
            return (Criteria) this;
        }

        public Criteria andActualBoxNumberNotBetween(String value1, String value2) {
            addCriterion("actual_box_number not between", value1, value2, "actualBoxNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyVehicleNumberIsNull() {
            addCriterion("identify_vehicle_number is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyVehicleNumberIsNotNull() {
            addCriterion("identify_vehicle_number is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyVehicleNumberEqualTo(String value) {
            addCriterion("identify_vehicle_number =", value, "identifyVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyVehicleNumberNotEqualTo(String value) {
            addCriterion("identify_vehicle_number <>", value, "identifyVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyVehicleNumberGreaterThan(String value) {
            addCriterion("identify_vehicle_number >", value, "identifyVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyVehicleNumberGreaterThanOrEqualTo(String value) {
            addCriterion("identify_vehicle_number >=", value, "identifyVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyVehicleNumberLessThan(String value) {
            addCriterion("identify_vehicle_number <", value, "identifyVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyVehicleNumberLessThanOrEqualTo(String value) {
            addCriterion("identify_vehicle_number <=", value, "identifyVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyVehicleNumberLike(String value) {
            addCriterion("identify_vehicle_number like", value, "identifyVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyVehicleNumberNotLike(String value) {
            addCriterion("identify_vehicle_number not like", value, "identifyVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyVehicleNumberIn(List<String> values) {
            addCriterion("identify_vehicle_number in", values, "identifyVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyVehicleNumberNotIn(List<String> values) {
            addCriterion("identify_vehicle_number not in", values, "identifyVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyVehicleNumberBetween(String value1, String value2) {
            addCriterion("identify_vehicle_number between", value1, value2, "identifyVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyVehicleNumberNotBetween(String value1, String value2) {
            addCriterion("identify_vehicle_number not between", value1, value2, "identifyVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andActualVehicleNumberIsNull() {
            addCriterion("actual_vehicle_number is null");
            return (Criteria) this;
        }

        public Criteria andActualVehicleNumberIsNotNull() {
            addCriterion("actual_vehicle_number is not null");
            return (Criteria) this;
        }

        public Criteria andActualVehicleNumberEqualTo(String value) {
            addCriterion("actual_vehicle_number =", value, "actualVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andActualVehicleNumberNotEqualTo(String value) {
            addCriterion("actual_vehicle_number <>", value, "actualVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andActualVehicleNumberGreaterThan(String value) {
            addCriterion("actual_vehicle_number >", value, "actualVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andActualVehicleNumberGreaterThanOrEqualTo(String value) {
            addCriterion("actual_vehicle_number >=", value, "actualVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andActualVehicleNumberLessThan(String value) {
            addCriterion("actual_vehicle_number <", value, "actualVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andActualVehicleNumberLessThanOrEqualTo(String value) {
            addCriterion("actual_vehicle_number <=", value, "actualVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andActualVehicleNumberLike(String value) {
            addCriterion("actual_vehicle_number like", value, "actualVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andActualVehicleNumberNotLike(String value) {
            addCriterion("actual_vehicle_number not like", value, "actualVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andActualVehicleNumberIn(List<String> values) {
            addCriterion("actual_vehicle_number in", values, "actualVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andActualVehicleNumberNotIn(List<String> values) {
            addCriterion("actual_vehicle_number not in", values, "actualVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andActualVehicleNumberBetween(String value1, String value2) {
            addCriterion("actual_vehicle_number between", value1, value2, "actualVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andActualVehicleNumberNotBetween(String value1, String value2) {
            addCriterion("actual_vehicle_number not between", value1, value2, "actualVehicleNumber");
            return (Criteria) this;
        }

        public Criteria andIdentifyLocationIsNull() {
            addCriterion("identify_location is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyLocationIsNotNull() {
            addCriterion("identify_location is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyLocationEqualTo(String value) {
            addCriterion("identify_location =", value, "identifyLocation");
            return (Criteria) this;
        }

        public Criteria andIdentifyLocationNotEqualTo(String value) {
            addCriterion("identify_location <>", value, "identifyLocation");
            return (Criteria) this;
        }

        public Criteria andIdentifyLocationGreaterThan(String value) {
            addCriterion("identify_location >", value, "identifyLocation");
            return (Criteria) this;
        }

        public Criteria andIdentifyLocationGreaterThanOrEqualTo(String value) {
            addCriterion("identify_location >=", value, "identifyLocation");
            return (Criteria) this;
        }

        public Criteria andIdentifyLocationLessThan(String value) {
            addCriterion("identify_location <", value, "identifyLocation");
            return (Criteria) this;
        }

        public Criteria andIdentifyLocationLessThanOrEqualTo(String value) {
            addCriterion("identify_location <=", value, "identifyLocation");
            return (Criteria) this;
        }

        public Criteria andIdentifyLocationLike(String value) {
            addCriterion("identify_location like", value, "identifyLocation");
            return (Criteria) this;
        }

        public Criteria andIdentifyLocationNotLike(String value) {
            addCriterion("identify_location not like", value, "identifyLocation");
            return (Criteria) this;
        }

        public Criteria andIdentifyLocationIn(List<String> values) {
            addCriterion("identify_location in", values, "identifyLocation");
            return (Criteria) this;
        }

        public Criteria andIdentifyLocationNotIn(List<String> values) {
            addCriterion("identify_location not in", values, "identifyLocation");
            return (Criteria) this;
        }

        public Criteria andIdentifyLocationBetween(String value1, String value2) {
            addCriterion("identify_location between", value1, value2, "identifyLocation");
            return (Criteria) this;
        }

        public Criteria andIdentifyLocationNotBetween(String value1, String value2) {
            addCriterion("identify_location not between", value1, value2, "identifyLocation");
            return (Criteria) this;
        }

        public Criteria andActualLocationIsNull() {
            addCriterion("actual_location is null");
            return (Criteria) this;
        }

        public Criteria andActualLocationIsNotNull() {
            addCriterion("actual_location is not null");
            return (Criteria) this;
        }

        public Criteria andActualLocationEqualTo(String value) {
            addCriterion("actual_location =", value, "actualLocation");
            return (Criteria) this;
        }

        public Criteria andActualLocationNotEqualTo(String value) {
            addCriterion("actual_location <>", value, "actualLocation");
            return (Criteria) this;
        }

        public Criteria andActualLocationGreaterThan(String value) {
            addCriterion("actual_location >", value, "actualLocation");
            return (Criteria) this;
        }

        public Criteria andActualLocationGreaterThanOrEqualTo(String value) {
            addCriterion("actual_location >=", value, "actualLocation");
            return (Criteria) this;
        }

        public Criteria andActualLocationLessThan(String value) {
            addCriterion("actual_location <", value, "actualLocation");
            return (Criteria) this;
        }

        public Criteria andActualLocationLessThanOrEqualTo(String value) {
            addCriterion("actual_location <=", value, "actualLocation");
            return (Criteria) this;
        }

        public Criteria andActualLocationLike(String value) {
            addCriterion("actual_location like", value, "actualLocation");
            return (Criteria) this;
        }

        public Criteria andActualLocationNotLike(String value) {
            addCriterion("actual_location not like", value, "actualLocation");
            return (Criteria) this;
        }

        public Criteria andActualLocationIn(List<String> values) {
            addCriterion("actual_location in", values, "actualLocation");
            return (Criteria) this;
        }

        public Criteria andActualLocationNotIn(List<String> values) {
            addCriterion("actual_location not in", values, "actualLocation");
            return (Criteria) this;
        }

        public Criteria andActualLocationBetween(String value1, String value2) {
            addCriterion("actual_location between", value1, value2, "actualLocation");
            return (Criteria) this;
        }

        public Criteria andActualLocationNotBetween(String value1, String value2) {
            addCriterion("actual_location not between", value1, value2, "actualLocation");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNull() {
            addCriterion("remarks is null");
            return (Criteria) this;
        }

        public Criteria andRemarksIsNotNull() {
            addCriterion("remarks is not null");
            return (Criteria) this;
        }

        public Criteria andRemarksEqualTo(String value) {
            addCriterion("remarks =", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotEqualTo(String value) {
            addCriterion("remarks <>", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThan(String value) {
            addCriterion("remarks >", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksGreaterThanOrEqualTo(String value) {
            addCriterion("remarks >=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThan(String value) {
            addCriterion("remarks <", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLessThanOrEqualTo(String value) {
            addCriterion("remarks <=", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksLike(String value) {
            addCriterion("remarks like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotLike(String value) {
            addCriterion("remarks not like", value, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksIn(List<String> values) {
            addCriterion("remarks in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotIn(List<String> values) {
            addCriterion("remarks not in", values, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksBetween(String value1, String value2) {
            addCriterion("remarks between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andRemarksNotBetween(String value1, String value2) {
            addCriterion("remarks not between", value1, value2, "remarks");
            return (Criteria) this;
        }

        public Criteria andShipBridgeIsNull() {
            addCriterion("ship_bridge is null");
            return (Criteria) this;
        }

        public Criteria andShipBridgeIsNotNull() {
            addCriterion("ship_bridge is not null");
            return (Criteria) this;
        }

        public Criteria andShipBridgeEqualTo(String value) {
            addCriterion("ship_bridge =", value, "shipBridge");
            return (Criteria) this;
        }

        public Criteria andShipBridgeNotEqualTo(String value) {
            addCriterion("ship_bridge <>", value, "shipBridge");
            return (Criteria) this;
        }

        public Criteria andShipBridgeGreaterThan(String value) {
            addCriterion("ship_bridge >", value, "shipBridge");
            return (Criteria) this;
        }

        public Criteria andShipBridgeGreaterThanOrEqualTo(String value) {
            addCriterion("ship_bridge >=", value, "shipBridge");
            return (Criteria) this;
        }

        public Criteria andShipBridgeLessThan(String value) {
            addCriterion("ship_bridge <", value, "shipBridge");
            return (Criteria) this;
        }

        public Criteria andShipBridgeLessThanOrEqualTo(String value) {
            addCriterion("ship_bridge <=", value, "shipBridge");
            return (Criteria) this;
        }

        public Criteria andShipBridgeLike(String value) {
            addCriterion("ship_bridge like", value, "shipBridge");
            return (Criteria) this;
        }

        public Criteria andShipBridgeNotLike(String value) {
            addCriterion("ship_bridge not like", value, "shipBridge");
            return (Criteria) this;
        }

        public Criteria andShipBridgeIn(List<String> values) {
            addCriterion("ship_bridge in", values, "shipBridge");
            return (Criteria) this;
        }

        public Criteria andShipBridgeNotIn(List<String> values) {
            addCriterion("ship_bridge not in", values, "shipBridge");
            return (Criteria) this;
        }

        public Criteria andShipBridgeBetween(String value1, String value2) {
            addCriterion("ship_bridge between", value1, value2, "shipBridge");
            return (Criteria) this;
        }

        public Criteria andShipBridgeNotBetween(String value1, String value2) {
            addCriterion("ship_bridge not between", value1, value2, "shipBridge");
            return (Criteria) this;
        }

        public Criteria andTallyManIsNull() {
            addCriterion("tally_man is null");
            return (Criteria) this;
        }

        public Criteria andTallyManIsNotNull() {
            addCriterion("tally_man is not null");
            return (Criteria) this;
        }

        public Criteria andTallyManEqualTo(String value) {
            addCriterion("tally_man =", value, "tallyMan");
            return (Criteria) this;
        }

        public Criteria andTallyManNotEqualTo(String value) {
            addCriterion("tally_man <>", value, "tallyMan");
            return (Criteria) this;
        }

        public Criteria andTallyManGreaterThan(String value) {
            addCriterion("tally_man >", value, "tallyMan");
            return (Criteria) this;
        }

        public Criteria andTallyManGreaterThanOrEqualTo(String value) {
            addCriterion("tally_man >=", value, "tallyMan");
            return (Criteria) this;
        }

        public Criteria andTallyManLessThan(String value) {
            addCriterion("tally_man <", value, "tallyMan");
            return (Criteria) this;
        }

        public Criteria andTallyManLessThanOrEqualTo(String value) {
            addCriterion("tally_man <=", value, "tallyMan");
            return (Criteria) this;
        }

        public Criteria andTallyManLike(String value) {
            addCriterion("tally_man like", value, "tallyMan");
            return (Criteria) this;
        }

        public Criteria andTallyManNotLike(String value) {
            addCriterion("tally_man not like", value, "tallyMan");
            return (Criteria) this;
        }

        public Criteria andTallyManIn(List<String> values) {
            addCriterion("tally_man in", values, "tallyMan");
            return (Criteria) this;
        }

        public Criteria andTallyManNotIn(List<String> values) {
            addCriterion("tally_man not in", values, "tallyMan");
            return (Criteria) this;
        }

        public Criteria andTallyManBetween(String value1, String value2) {
            addCriterion("tally_man between", value1, value2, "tallyMan");
            return (Criteria) this;
        }

        public Criteria andTallyManNotBetween(String value1, String value2) {
            addCriterion("tally_man not between", value1, value2, "tallyMan");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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