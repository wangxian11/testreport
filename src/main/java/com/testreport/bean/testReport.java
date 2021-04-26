package com.testreport.bean;

import java.util.Date;

public class testReport {
    private Integer id;

    private String testDate;

    private String weather;

    private String classes;

    private String shoreBridge;

    private String shipType;

    private String testSituation;

    private String loadOrDischarge;

    private String typesOfTrade;

    private String nameOfVessel;

    private String voyageNumber;

    private String time;

    private String tester;

    private Integer totalCases;

    private Integer totalTruck;

    private Integer totalBoxOnTruck;

    private Integer bayIdentificationCases;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTestDate() {
        return testDate;
    }

    public void setTestDate(String testDate) {
        this.testDate = testDate == null ? null : testDate.trim();
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather == null ? null : weather.trim();
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes == null ? null : classes.trim();
    }

    public String getShoreBridge() {
        return shoreBridge;
    }

    public void setShoreBridge(String shoreBridge) {
        this.shoreBridge = shoreBridge == null ? null : shoreBridge.trim();
    }

    public String getShipType() {
        return shipType;
    }

    public void setShipType(String shipType) {
        this.shipType = shipType == null ? null : shipType.trim();
    }

    public String getTestSituation() {
        return testSituation;
    }

    public void setTestSituation(String testSituation) {
        this.testSituation = testSituation == null ? null : testSituation.trim();
    }

    public String getLoadOrDischarge() {
        return loadOrDischarge;
    }

    public void setLoadOrDischarge(String loadOrDischarge) {
        this.loadOrDischarge = loadOrDischarge == null ? null : loadOrDischarge.trim();
    }

    public String getTypesOfTrade() {
        return typesOfTrade;
    }

    public void setTypesOfTrade(String typesOfTrade) {
        this.typesOfTrade = typesOfTrade == null ? null : typesOfTrade.trim();
    }

    public String getNameOfVessel() {
        return nameOfVessel;
    }

    public void setNameOfVessel(String nameOfVessel) {
        this.nameOfVessel = nameOfVessel == null ? null : nameOfVessel.trim();
    }

    public String getVoyageNumber() {
        return voyageNumber;
    }

    public void setVoyageNumber(String voyageNumber) {
        this.voyageNumber = voyageNumber == null ? null : voyageNumber.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getTester() {
        return tester;
    }

    public void setTester(String tester) {
        this.tester = tester == null ? null : tester.trim();
    }

    public Integer getTotalCases() {
        return totalCases;
    }

    public void setTotalCases(Integer totalCases) {
        this.totalCases = totalCases;
    }

    public Integer getTotalTruck() {
        return totalTruck;
    }

    public void setTotalTruck(Integer totalTruck) {
        this.totalTruck = totalTruck;
    }

    public Integer getTotalBoxOnTruck() {
        return totalBoxOnTruck;
    }

    public void setTotalBoxOnTruck(Integer totalBoxOnTruck) {
        this.totalBoxOnTruck = totalBoxOnTruck;
    }

    public Integer getBayIdentificationCases() {
        return bayIdentificationCases;
    }

    public void setBayIdentificationCases(Integer bayIdentificationCases) {
        this.bayIdentificationCases = bayIdentificationCases;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}