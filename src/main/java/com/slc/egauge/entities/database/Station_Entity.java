/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slc.egauge.entities.database;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity class to model Station table in eGauge database
 *
 * @author srostantkritikos06
 */

@Entity
@Table(name= "Station")
public class Station_Entity {
    @Id
    @Column (name = "StationId")
    private int stationId;
    
    @Column(name = "StationName")
    private int stationName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "stationId", fetch = FetchType.EAGER)
    private Set<Data_Entity> data;

    
    
    public Set<Data_Entity> getData() {
        return data;
    }

    public void setData(Set<Data_Entity> data) {
        this.data = data;
    }
    
    public int getStationId() {
        return stationId;
    }

    public void setStationId(int stationId) {
        this.stationId = stationId;
    }

    public int getStationName() {
        return stationName;
    }

    public void setStationName(int stationName) {
        this.stationName = stationName;
    }
    
    
    
}
