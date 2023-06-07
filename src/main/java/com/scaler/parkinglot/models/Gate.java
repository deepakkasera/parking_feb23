package com.scaler.parkinglot.models;

public class Gate extends BaseModel {
    private GateType gateType;
    private Operator operator;

    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }
}
