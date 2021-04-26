package com.testreport.bean;

import java.util.Date;

public class loadErrorRecord {
    private Integer id;

    private String identifyBoxNumber;

    private String actualBoxNumber;

    private String identifyVehicleNumber;

    private String actualVehicleNumber;

    private String identifyBay;

    private String actualBay;

    private String remarks;

    private String shipBridge;

    private String tallyMan;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdentifyBoxNumber() {
        return identifyBoxNumber;
    }

    public void setIdentifyBoxNumber(String identifyBoxNumber) {
        this.identifyBoxNumber = identifyBoxNumber == null ? null : identifyBoxNumber.trim();
    }

    public String getActualBoxNumber() {
        return actualBoxNumber;
    }

    public void setActualBoxNumber(String actualBoxNumber) {
        this.actualBoxNumber = actualBoxNumber == null ? null : actualBoxNumber.trim();
    }

    public String getIdentifyVehicleNumber() {
        return identifyVehicleNumber;
    }

    public void setIdentifyVehicleNumber(String identifyVehicleNumber) {
        this.identifyVehicleNumber = identifyVehicleNumber == null ? null : identifyVehicleNumber.trim();
    }

    public String getActualVehicleNumber() {
        return actualVehicleNumber;
    }

    public void setActualVehicleNumber(String actualVehicleNumber) {
        this.actualVehicleNumber = actualVehicleNumber == null ? null : actualVehicleNumber.trim();
    }

    public String getIdentifyBay() {
        return identifyBay;
    }

    public void setIdentifyBay(String identifyBay) {
        this.identifyBay = identifyBay == null ? null : identifyBay.trim();
    }

    public String getActualBay() {
        return actualBay;
    }

    public void setActualBay(String actualBay) {
        this.actualBay = actualBay == null ? null : actualBay.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    public String getShipBridge() {
        return shipBridge;
    }

    public void setShipBridge(String shipBridge) {
        this.shipBridge = shipBridge == null ? null : shipBridge.trim();
    }

    public String getTallyMan() {
        return tallyMan;
    }

    public void setTallyMan(String tallyMan) {
        this.tallyMan = tallyMan == null ? null : tallyMan.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}