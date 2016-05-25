/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slc.egauge.entities.database;

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author srostantkritikos06
 */
@Entity
@Table(name = "Data")
public class Data_Entity {
    @Id
    @Column
    private int dataId;
    
    @Column(name = "Power")
    private BigInteger power;
    
    @Column(name = "RateOfChange")
    private float rateOfChange;
    
    @ManyToOne
    @JoinColumn(name = "StationId", referencedColumnName="StationId")
    private Station_Entity station;
    

    public Station_Entity getStation() {
        return station;
    }

    public void setStation(Station_Entity station) {
        this.station = station;
    }

    public int getDataId() {
        return dataId;
    }

    public void setDataId(int dataId) {
        this.dataId = dataId;
    }

    public BigInteger getPower() {
        return power;
    }

    public void setPower(BigInteger power) {
        this.power = power;
    }

    public float getRateOfChange() {
        return rateOfChange;
    }

    public void setRateOfChange(float rateOfChange) {
        this.rateOfChange = rateOfChange;
    }
    
    
}
