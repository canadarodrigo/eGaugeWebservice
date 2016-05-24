/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slc.egauge.entities.teamstat;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 * @author srostantkritikos06
 */
@XmlRootElement(name = "reg")
@XmlType(propOrder = {"name", "available", "lastUpdate", "excess", "lastValue", "leakRate", "maxRate"})
public class Reg {
    
    private Available available;
    private Name name;
    private LastUpdate lastUpdate;
    private Excess excess;
    private LastValue lastValue;
    private LeakRate leakRate;
    private MaxRate maxRate;

    public Reg() {
    }
    
    @XmlElement(name = "available")
    public Available getAvailable() {
        return available;
    }

    public void setAvailable(Available available) {
        this.available = available;
    }

    @XmlElement(name = "name")
    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    @XmlElement(name = "last_update")
    public LastUpdate getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LastUpdate lsatUPdae) {
        this.lastUpdate = lsatUPdae;
    }

    @XmlElement(name = "excess")
    public Excess getExcess() {
        return excess;
    }

    public void setExcess(Excess excess) {
        this.excess = excess;
    }

    @XmlElement(name = "last_val")
    public LastValue getLastValue() {
        return lastValue;
    }

    public void setLastValue(LastValue lastValue) {
        this.lastValue = lastValue;
    }

    @XmlElement(name = "leak_rate")
    public LeakRate getLeakRate() {
        return leakRate;
    }

    public void setLeakRate(LeakRate leakRate) {
        this.leakRate = leakRate;
    }

    @XmlElement(name = "max_rate")
    public MaxRate getMaxRate() {
        return maxRate;
    }

    public void setMaxRate(MaxRate maxRate) {
        this.maxRate = maxRate;
    }
       
}
