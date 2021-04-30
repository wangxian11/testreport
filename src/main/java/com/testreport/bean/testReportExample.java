package com.testreport.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TestReportExample() {
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

        public Criteria andTestDateIsNull() {
            addCriterion("test_date is null");
            return (Criteria) this;
        }

        public Criteria andTestDateIsNotNull() {
            addCriterion("test_date is not null");
            return (Criteria) this;
        }

        public Criteria andTestDateEqualTo(String value) {
            addCriterion("test_date =", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotEqualTo(String value) {
            addCriterion("test_date <>", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateGreaterThan(String value) {
            addCriterion("test_date >", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateGreaterThanOrEqualTo(String value) {
            addCriterion("test_date >=", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateLessThan(String value) {
            addCriterion("test_date <", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateLessThanOrEqualTo(String value) {
            addCriterion("test_date <=", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateLike(String value) {
            addCriterion("test_date like", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotLike(String value) {
            addCriterion("test_date not like", value, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateIn(List<String> values) {
            addCriterion("test_date in", values, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotIn(List<String> values) {
            addCriterion("test_date not in", values, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateBetween(String value1, String value2) {
            addCriterion("test_date between", value1, value2, "testDate");
            return (Criteria) this;
        }

        public Criteria andTestDateNotBetween(String value1, String value2) {
            addCriterion("test_date not between", value1, value2, "testDate");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNull() {
            addCriterion("weather is null");
            return (Criteria) this;
        }

        public Criteria andWeatherIsNotNull() {
            addCriterion("weather is not null");
            return (Criteria) this;
        }

        public Criteria andWeatherEqualTo(String value) {
            addCriterion("weather =", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotEqualTo(String value) {
            addCriterion("weather <>", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThan(String value) {
            addCriterion("weather >", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherGreaterThanOrEqualTo(String value) {
            addCriterion("weather >=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThan(String value) {
            addCriterion("weather <", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLessThanOrEqualTo(String value) {
            addCriterion("weather <=", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherLike(String value) {
            addCriterion("weather like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotLike(String value) {
            addCriterion("weather not like", value, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherIn(List<String> values) {
            addCriterion("weather in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotIn(List<String> values) {
            addCriterion("weather not in", values, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherBetween(String value1, String value2) {
            addCriterion("weather between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andWeatherNotBetween(String value1, String value2) {
            addCriterion("weather not between", value1, value2, "weather");
            return (Criteria) this;
        }

        public Criteria andClassesIsNull() {
            addCriterion("classes is null");
            return (Criteria) this;
        }

        public Criteria andClassesIsNotNull() {
            addCriterion("classes is not null");
            return (Criteria) this;
        }

        public Criteria andClassesEqualTo(String value) {
            addCriterion("classes =", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotEqualTo(String value) {
            addCriterion("classes <>", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThan(String value) {
            addCriterion("classes >", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesGreaterThanOrEqualTo(String value) {
            addCriterion("classes >=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThan(String value) {
            addCriterion("classes <", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLessThanOrEqualTo(String value) {
            addCriterion("classes <=", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesLike(String value) {
            addCriterion("classes like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotLike(String value) {
            addCriterion("classes not like", value, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesIn(List<String> values) {
            addCriterion("classes in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotIn(List<String> values) {
            addCriterion("classes not in", values, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesBetween(String value1, String value2) {
            addCriterion("classes between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andClassesNotBetween(String value1, String value2) {
            addCriterion("classes not between", value1, value2, "classes");
            return (Criteria) this;
        }

        public Criteria andShoreBridgeIsNull() {
            addCriterion("shore_bridge is null");
            return (Criteria) this;
        }

        public Criteria andShoreBridgeIsNotNull() {
            addCriterion("shore_bridge is not null");
            return (Criteria) this;
        }

        public Criteria andShoreBridgeEqualTo(String value) {
            addCriterion("shore_bridge =", value, "shoreBridge");
            return (Criteria) this;
        }

        public Criteria andShoreBridgeNotEqualTo(String value) {
            addCriterion("shore_bridge <>", value, "shoreBridge");
            return (Criteria) this;
        }

        public Criteria andShoreBridgeGreaterThan(String value) {
            addCriterion("shore_bridge >", value, "shoreBridge");
            return (Criteria) this;
        }

        public Criteria andShoreBridgeGreaterThanOrEqualTo(String value) {
            addCriterion("shore_bridge >=", value, "shoreBridge");
            return (Criteria) this;
        }

        public Criteria andShoreBridgeLessThan(String value) {
            addCriterion("shore_bridge <", value, "shoreBridge");
            return (Criteria) this;
        }

        public Criteria andShoreBridgeLessThanOrEqualTo(String value) {
            addCriterion("shore_bridge <=", value, "shoreBridge");
            return (Criteria) this;
        }

        public Criteria andShoreBridgeLike(String value) {
            addCriterion("shore_bridge like", value, "shoreBridge");
            return (Criteria) this;
        }

        public Criteria andShoreBridgeNotLike(String value) {
            addCriterion("shore_bridge not like", value, "shoreBridge");
            return (Criteria) this;
        }

        public Criteria andShoreBridgeIn(List<String> values) {
            addCriterion("shore_bridge in", values, "shoreBridge");
            return (Criteria) this;
        }

        public Criteria andShoreBridgeNotIn(List<String> values) {
            addCriterion("shore_bridge not in", values, "shoreBridge");
            return (Criteria) this;
        }

        public Criteria andShoreBridgeBetween(String value1, String value2) {
            addCriterion("shore_bridge between", value1, value2, "shoreBridge");
            return (Criteria) this;
        }

        public Criteria andShoreBridgeNotBetween(String value1, String value2) {
            addCriterion("shore_bridge not between", value1, value2, "shoreBridge");
            return (Criteria) this;
        }

        public Criteria andShipTypeIsNull() {
            addCriterion("ship_type is null");
            return (Criteria) this;
        }

        public Criteria andShipTypeIsNotNull() {
            addCriterion("ship_type is not null");
            return (Criteria) this;
        }

        public Criteria andShipTypeEqualTo(String value) {
            addCriterion("ship_type =", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotEqualTo(String value) {
            addCriterion("ship_type <>", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeGreaterThan(String value) {
            addCriterion("ship_type >", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ship_type >=", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeLessThan(String value) {
            addCriterion("ship_type <", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeLessThanOrEqualTo(String value) {
            addCriterion("ship_type <=", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeLike(String value) {
            addCriterion("ship_type like", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotLike(String value) {
            addCriterion("ship_type not like", value, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeIn(List<String> values) {
            addCriterion("ship_type in", values, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotIn(List<String> values) {
            addCriterion("ship_type not in", values, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeBetween(String value1, String value2) {
            addCriterion("ship_type between", value1, value2, "shipType");
            return (Criteria) this;
        }

        public Criteria andShipTypeNotBetween(String value1, String value2) {
            addCriterion("ship_type not between", value1, value2, "shipType");
            return (Criteria) this;
        }

        public Criteria andTestSituationIsNull() {
            addCriterion("test_situation is null");
            return (Criteria) this;
        }

        public Criteria andTestSituationIsNotNull() {
            addCriterion("test_situation is not null");
            return (Criteria) this;
        }

        public Criteria andTestSituationEqualTo(String value) {
            addCriterion("test_situation =", value, "testSituation");
            return (Criteria) this;
        }

        public Criteria andTestSituationNotEqualTo(String value) {
            addCriterion("test_situation <>", value, "testSituation");
            return (Criteria) this;
        }

        public Criteria andTestSituationGreaterThan(String value) {
            addCriterion("test_situation >", value, "testSituation");
            return (Criteria) this;
        }

        public Criteria andTestSituationGreaterThanOrEqualTo(String value) {
            addCriterion("test_situation >=", value, "testSituation");
            return (Criteria) this;
        }

        public Criteria andTestSituationLessThan(String value) {
            addCriterion("test_situation <", value, "testSituation");
            return (Criteria) this;
        }

        public Criteria andTestSituationLessThanOrEqualTo(String value) {
            addCriterion("test_situation <=", value, "testSituation");
            return (Criteria) this;
        }

        public Criteria andTestSituationLike(String value) {
            addCriterion("test_situation like", value, "testSituation");
            return (Criteria) this;
        }

        public Criteria andTestSituationNotLike(String value) {
            addCriterion("test_situation not like", value, "testSituation");
            return (Criteria) this;
        }

        public Criteria andTestSituationIn(List<String> values) {
            addCriterion("test_situation in", values, "testSituation");
            return (Criteria) this;
        }

        public Criteria andTestSituationNotIn(List<String> values) {
            addCriterion("test_situation not in", values, "testSituation");
            return (Criteria) this;
        }

        public Criteria andTestSituationBetween(String value1, String value2) {
            addCriterion("test_situation between", value1, value2, "testSituation");
            return (Criteria) this;
        }

        public Criteria andTestSituationNotBetween(String value1, String value2) {
            addCriterion("test_situation not between", value1, value2, "testSituation");
            return (Criteria) this;
        }

        public Criteria andLoadOrDischargeIsNull() {
            addCriterion("load_or_discharge is null");
            return (Criteria) this;
        }

        public Criteria andLoadOrDischargeIsNotNull() {
            addCriterion("load_or_discharge is not null");
            return (Criteria) this;
        }

        public Criteria andLoadOrDischargeEqualTo(String value) {
            addCriterion("load_or_discharge =", value, "loadOrDischarge");
            return (Criteria) this;
        }

        public Criteria andLoadOrDischargeNotEqualTo(String value) {
            addCriterion("load_or_discharge <>", value, "loadOrDischarge");
            return (Criteria) this;
        }

        public Criteria andLoadOrDischargeGreaterThan(String value) {
            addCriterion("load_or_discharge >", value, "loadOrDischarge");
            return (Criteria) this;
        }

        public Criteria andLoadOrDischargeGreaterThanOrEqualTo(String value) {
            addCriterion("load_or_discharge >=", value, "loadOrDischarge");
            return (Criteria) this;
        }

        public Criteria andLoadOrDischargeLessThan(String value) {
            addCriterion("load_or_discharge <", value, "loadOrDischarge");
            return (Criteria) this;
        }

        public Criteria andLoadOrDischargeLessThanOrEqualTo(String value) {
            addCriterion("load_or_discharge <=", value, "loadOrDischarge");
            return (Criteria) this;
        }

        public Criteria andLoadOrDischargeLike(String value) {
            addCriterion("load_or_discharge like", value, "loadOrDischarge");
            return (Criteria) this;
        }

        public Criteria andLoadOrDischargeNotLike(String value) {
            addCriterion("load_or_discharge not like", value, "loadOrDischarge");
            return (Criteria) this;
        }

        public Criteria andLoadOrDischargeIn(List<String> values) {
            addCriterion("load_or_discharge in", values, "loadOrDischarge");
            return (Criteria) this;
        }

        public Criteria andLoadOrDischargeNotIn(List<String> values) {
            addCriterion("load_or_discharge not in", values, "loadOrDischarge");
            return (Criteria) this;
        }

        public Criteria andLoadOrDischargeBetween(String value1, String value2) {
            addCriterion("load_or_discharge between", value1, value2, "loadOrDischarge");
            return (Criteria) this;
        }

        public Criteria andLoadOrDischargeNotBetween(String value1, String value2) {
            addCriterion("load_or_discharge not between", value1, value2, "loadOrDischarge");
            return (Criteria) this;
        }

        public Criteria andTypesOfTradeIsNull() {
            addCriterion("types_of_trade is null");
            return (Criteria) this;
        }

        public Criteria andTypesOfTradeIsNotNull() {
            addCriterion("types_of_trade is not null");
            return (Criteria) this;
        }

        public Criteria andTypesOfTradeEqualTo(String value) {
            addCriterion("types_of_trade =", value, "typesOfTrade");
            return (Criteria) this;
        }

        public Criteria andTypesOfTradeNotEqualTo(String value) {
            addCriterion("types_of_trade <>", value, "typesOfTrade");
            return (Criteria) this;
        }

        public Criteria andTypesOfTradeGreaterThan(String value) {
            addCriterion("types_of_trade >", value, "typesOfTrade");
            return (Criteria) this;
        }

        public Criteria andTypesOfTradeGreaterThanOrEqualTo(String value) {
            addCriterion("types_of_trade >=", value, "typesOfTrade");
            return (Criteria) this;
        }

        public Criteria andTypesOfTradeLessThan(String value) {
            addCriterion("types_of_trade <", value, "typesOfTrade");
            return (Criteria) this;
        }

        public Criteria andTypesOfTradeLessThanOrEqualTo(String value) {
            addCriterion("types_of_trade <=", value, "typesOfTrade");
            return (Criteria) this;
        }

        public Criteria andTypesOfTradeLike(String value) {
            addCriterion("types_of_trade like", value, "typesOfTrade");
            return (Criteria) this;
        }

        public Criteria andTypesOfTradeNotLike(String value) {
            addCriterion("types_of_trade not like", value, "typesOfTrade");
            return (Criteria) this;
        }

        public Criteria andTypesOfTradeIn(List<String> values) {
            addCriterion("types_of_trade in", values, "typesOfTrade");
            return (Criteria) this;
        }

        public Criteria andTypesOfTradeNotIn(List<String> values) {
            addCriterion("types_of_trade not in", values, "typesOfTrade");
            return (Criteria) this;
        }

        public Criteria andTypesOfTradeBetween(String value1, String value2) {
            addCriterion("types_of_trade between", value1, value2, "typesOfTrade");
            return (Criteria) this;
        }

        public Criteria andTypesOfTradeNotBetween(String value1, String value2) {
            addCriterion("types_of_trade not between", value1, value2, "typesOfTrade");
            return (Criteria) this;
        }

        public Criteria andNameOfVesselIsNull() {
            addCriterion("name_of_vessel is null");
            return (Criteria) this;
        }

        public Criteria andNameOfVesselIsNotNull() {
            addCriterion("name_of_vessel is not null");
            return (Criteria) this;
        }

        public Criteria andNameOfVesselEqualTo(String value) {
            addCriterion("name_of_vessel =", value, "nameOfVessel");
            return (Criteria) this;
        }

        public Criteria andNameOfVesselNotEqualTo(String value) {
            addCriterion("name_of_vessel <>", value, "nameOfVessel");
            return (Criteria) this;
        }

        public Criteria andNameOfVesselGreaterThan(String value) {
            addCriterion("name_of_vessel >", value, "nameOfVessel");
            return (Criteria) this;
        }

        public Criteria andNameOfVesselGreaterThanOrEqualTo(String value) {
            addCriterion("name_of_vessel >=", value, "nameOfVessel");
            return (Criteria) this;
        }

        public Criteria andNameOfVesselLessThan(String value) {
            addCriterion("name_of_vessel <", value, "nameOfVessel");
            return (Criteria) this;
        }

        public Criteria andNameOfVesselLessThanOrEqualTo(String value) {
            addCriterion("name_of_vessel <=", value, "nameOfVessel");
            return (Criteria) this;
        }

        public Criteria andNameOfVesselLike(String value) {
            addCriterion("name_of_vessel like", value, "nameOfVessel");
            return (Criteria) this;
        }

        public Criteria andNameOfVesselNotLike(String value) {
            addCriterion("name_of_vessel not like", value, "nameOfVessel");
            return (Criteria) this;
        }

        public Criteria andNameOfVesselIn(List<String> values) {
            addCriterion("name_of_vessel in", values, "nameOfVessel");
            return (Criteria) this;
        }

        public Criteria andNameOfVesselNotIn(List<String> values) {
            addCriterion("name_of_vessel not in", values, "nameOfVessel");
            return (Criteria) this;
        }

        public Criteria andNameOfVesselBetween(String value1, String value2) {
            addCriterion("name_of_vessel between", value1, value2, "nameOfVessel");
            return (Criteria) this;
        }

        public Criteria andNameOfVesselNotBetween(String value1, String value2) {
            addCriterion("name_of_vessel not between", value1, value2, "nameOfVessel");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberIsNull() {
            addCriterion("voyage_number is null");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberIsNotNull() {
            addCriterion("voyage_number is not null");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberEqualTo(String value) {
            addCriterion("voyage_number =", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotEqualTo(String value) {
            addCriterion("voyage_number <>", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberGreaterThan(String value) {
            addCriterion("voyage_number >", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberGreaterThanOrEqualTo(String value) {
            addCriterion("voyage_number >=", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberLessThan(String value) {
            addCriterion("voyage_number <", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberLessThanOrEqualTo(String value) {
            addCriterion("voyage_number <=", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberLike(String value) {
            addCriterion("voyage_number like", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotLike(String value) {
            addCriterion("voyage_number not like", value, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberIn(List<String> values) {
            addCriterion("voyage_number in", values, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotIn(List<String> values) {
            addCriterion("voyage_number not in", values, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberBetween(String value1, String value2) {
            addCriterion("voyage_number between", value1, value2, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andVoyageNumberNotBetween(String value1, String value2) {
            addCriterion("voyage_number not between", value1, value2, "voyageNumber");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(String value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(String value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(String value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(String value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(String value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(String value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLike(String value) {
            addCriterion("time like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotLike(String value) {
            addCriterion("time not like", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<String> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<String> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(String value1, String value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(String value1, String value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTesterIsNull() {
            addCriterion("tester is null");
            return (Criteria) this;
        }

        public Criteria andTesterIsNotNull() {
            addCriterion("tester is not null");
            return (Criteria) this;
        }

        public Criteria andTesterEqualTo(String value) {
            addCriterion("tester =", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterNotEqualTo(String value) {
            addCriterion("tester <>", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterGreaterThan(String value) {
            addCriterion("tester >", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterGreaterThanOrEqualTo(String value) {
            addCriterion("tester >=", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterLessThan(String value) {
            addCriterion("tester <", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterLessThanOrEqualTo(String value) {
            addCriterion("tester <=", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterLike(String value) {
            addCriterion("tester like", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterNotLike(String value) {
            addCriterion("tester not like", value, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterIn(List<String> values) {
            addCriterion("tester in", values, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterNotIn(List<String> values) {
            addCriterion("tester not in", values, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterBetween(String value1, String value2) {
            addCriterion("tester between", value1, value2, "tester");
            return (Criteria) this;
        }

        public Criteria andTesterNotBetween(String value1, String value2) {
            addCriterion("tester not between", value1, value2, "tester");
            return (Criteria) this;
        }

        public Criteria andTotalCasesIsNull() {
            addCriterion("total_cases is null");
            return (Criteria) this;
        }

        public Criteria andTotalCasesIsNotNull() {
            addCriterion("total_cases is not null");
            return (Criteria) this;
        }

        public Criteria andTotalCasesEqualTo(Integer value) {
            addCriterion("total_cases =", value, "totalCases");
            return (Criteria) this;
        }

        public Criteria andTotalCasesNotEqualTo(Integer value) {
            addCriterion("total_cases <>", value, "totalCases");
            return (Criteria) this;
        }

        public Criteria andTotalCasesGreaterThan(Integer value) {
            addCriterion("total_cases >", value, "totalCases");
            return (Criteria) this;
        }

        public Criteria andTotalCasesGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_cases >=", value, "totalCases");
            return (Criteria) this;
        }

        public Criteria andTotalCasesLessThan(Integer value) {
            addCriterion("total_cases <", value, "totalCases");
            return (Criteria) this;
        }

        public Criteria andTotalCasesLessThanOrEqualTo(Integer value) {
            addCriterion("total_cases <=", value, "totalCases");
            return (Criteria) this;
        }

        public Criteria andTotalCasesIn(List<Integer> values) {
            addCriterion("total_cases in", values, "totalCases");
            return (Criteria) this;
        }

        public Criteria andTotalCasesNotIn(List<Integer> values) {
            addCriterion("total_cases not in", values, "totalCases");
            return (Criteria) this;
        }

        public Criteria andTotalCasesBetween(Integer value1, Integer value2) {
            addCriterion("total_cases between", value1, value2, "totalCases");
            return (Criteria) this;
        }

        public Criteria andTotalCasesNotBetween(Integer value1, Integer value2) {
            addCriterion("total_cases not between", value1, value2, "totalCases");
            return (Criteria) this;
        }

        public Criteria andTotalTruckIsNull() {
            addCriterion("total_truck is null");
            return (Criteria) this;
        }

        public Criteria andTotalTruckIsNotNull() {
            addCriterion("total_truck is not null");
            return (Criteria) this;
        }

        public Criteria andTotalTruckEqualTo(Integer value) {
            addCriterion("total_truck =", value, "totalTruck");
            return (Criteria) this;
        }

        public Criteria andTotalTruckNotEqualTo(Integer value) {
            addCriterion("total_truck <>", value, "totalTruck");
            return (Criteria) this;
        }

        public Criteria andTotalTruckGreaterThan(Integer value) {
            addCriterion("total_truck >", value, "totalTruck");
            return (Criteria) this;
        }

        public Criteria andTotalTruckGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_truck >=", value, "totalTruck");
            return (Criteria) this;
        }

        public Criteria andTotalTruckLessThan(Integer value) {
            addCriterion("total_truck <", value, "totalTruck");
            return (Criteria) this;
        }

        public Criteria andTotalTruckLessThanOrEqualTo(Integer value) {
            addCriterion("total_truck <=", value, "totalTruck");
            return (Criteria) this;
        }

        public Criteria andTotalTruckIn(List<Integer> values) {
            addCriterion("total_truck in", values, "totalTruck");
            return (Criteria) this;
        }

        public Criteria andTotalTruckNotIn(List<Integer> values) {
            addCriterion("total_truck not in", values, "totalTruck");
            return (Criteria) this;
        }

        public Criteria andTotalTruckBetween(Integer value1, Integer value2) {
            addCriterion("total_truck between", value1, value2, "totalTruck");
            return (Criteria) this;
        }

        public Criteria andTotalTruckNotBetween(Integer value1, Integer value2) {
            addCriterion("total_truck not between", value1, value2, "totalTruck");
            return (Criteria) this;
        }

        public Criteria andTotalBoxOnTruckIsNull() {
            addCriterion("total_box_on_truck is null");
            return (Criteria) this;
        }

        public Criteria andTotalBoxOnTruckIsNotNull() {
            addCriterion("total_box_on_truck is not null");
            return (Criteria) this;
        }

        public Criteria andTotalBoxOnTruckEqualTo(Integer value) {
            addCriterion("total_box_on_truck =", value, "totalBoxOnTruck");
            return (Criteria) this;
        }

        public Criteria andTotalBoxOnTruckNotEqualTo(Integer value) {
            addCriterion("total_box_on_truck <>", value, "totalBoxOnTruck");
            return (Criteria) this;
        }

        public Criteria andTotalBoxOnTruckGreaterThan(Integer value) {
            addCriterion("total_box_on_truck >", value, "totalBoxOnTruck");
            return (Criteria) this;
        }

        public Criteria andTotalBoxOnTruckGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_box_on_truck >=", value, "totalBoxOnTruck");
            return (Criteria) this;
        }

        public Criteria andTotalBoxOnTruckLessThan(Integer value) {
            addCriterion("total_box_on_truck <", value, "totalBoxOnTruck");
            return (Criteria) this;
        }

        public Criteria andTotalBoxOnTruckLessThanOrEqualTo(Integer value) {
            addCriterion("total_box_on_truck <=", value, "totalBoxOnTruck");
            return (Criteria) this;
        }

        public Criteria andTotalBoxOnTruckIn(List<Integer> values) {
            addCriterion("total_box_on_truck in", values, "totalBoxOnTruck");
            return (Criteria) this;
        }

        public Criteria andTotalBoxOnTruckNotIn(List<Integer> values) {
            addCriterion("total_box_on_truck not in", values, "totalBoxOnTruck");
            return (Criteria) this;
        }

        public Criteria andTotalBoxOnTruckBetween(Integer value1, Integer value2) {
            addCriterion("total_box_on_truck between", value1, value2, "totalBoxOnTruck");
            return (Criteria) this;
        }

        public Criteria andTotalBoxOnTruckNotBetween(Integer value1, Integer value2) {
            addCriterion("total_box_on_truck not between", value1, value2, "totalBoxOnTruck");
            return (Criteria) this;
        }

        public Criteria andBayIdentificationCasesIsNull() {
            addCriterion("bay_identification_cases is null");
            return (Criteria) this;
        }

        public Criteria andBayIdentificationCasesIsNotNull() {
            addCriterion("bay_identification_cases is not null");
            return (Criteria) this;
        }

        public Criteria andBayIdentificationCasesEqualTo(Integer value) {
            addCriterion("bay_identification_cases =", value, "bayIdentificationCases");
            return (Criteria) this;
        }

        public Criteria andBayIdentificationCasesNotEqualTo(Integer value) {
            addCriterion("bay_identification_cases <>", value, "bayIdentificationCases");
            return (Criteria) this;
        }

        public Criteria andBayIdentificationCasesGreaterThan(Integer value) {
            addCriterion("bay_identification_cases >", value, "bayIdentificationCases");
            return (Criteria) this;
        }

        public Criteria andBayIdentificationCasesGreaterThanOrEqualTo(Integer value) {
            addCriterion("bay_identification_cases >=", value, "bayIdentificationCases");
            return (Criteria) this;
        }

        public Criteria andBayIdentificationCasesLessThan(Integer value) {
            addCriterion("bay_identification_cases <", value, "bayIdentificationCases");
            return (Criteria) this;
        }

        public Criteria andBayIdentificationCasesLessThanOrEqualTo(Integer value) {
            addCriterion("bay_identification_cases <=", value, "bayIdentificationCases");
            return (Criteria) this;
        }

        public Criteria andBayIdentificationCasesIn(List<Integer> values) {
            addCriterion("bay_identification_cases in", values, "bayIdentificationCases");
            return (Criteria) this;
        }

        public Criteria andBayIdentificationCasesNotIn(List<Integer> values) {
            addCriterion("bay_identification_cases not in", values, "bayIdentificationCases");
            return (Criteria) this;
        }

        public Criteria andBayIdentificationCasesBetween(Integer value1, Integer value2) {
            addCriterion("bay_identification_cases between", value1, value2, "bayIdentificationCases");
            return (Criteria) this;
        }

        public Criteria andBayIdentificationCasesNotBetween(Integer value1, Integer value2) {
            addCriterion("bay_identification_cases not between", value1, value2, "bayIdentificationCases");
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