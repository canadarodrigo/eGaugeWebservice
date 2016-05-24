/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slc.egauge.entities.storeddata;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author srostantkritikos06
 */
@XmlRootElement(name  = "data")
public class Data {
    private List<CName> cName;
    private List<Row> row;
    private String collums;
    private String timeStamp;
    private String time_delta;
    private String epoch;

    public Data() {
    }

    @XmlElement(name = "cname")
    public List<CName> getcName() {
        return cName;
    }

    public void setcName(List<CName> cName) {
        this.cName = cName;
    }

    @XmlElement(name = "r")
    public List<Row> getRow() {
        return row;
    }


    public void setRow(List<Row> row) {
        this.row = row;
    }

    @XmlAttribute(name = "columns")
    public String getCollums() {
        return collums;
    }

    public void setCollums(String collums) {
        this.collums = collums;
    }

    @XmlAttribute(name = "time_stamp")
    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
    
    @XmlAttribute(name = "time_delta")
    public String getTime_delta() {
        return time_delta;
    }

    public void setTime_delta(String time_delta) {
        this.time_delta = time_delta;
    }

    @XmlAttribute(name = "epoch")
    public String getEpoch() {
        return epoch;
    }

    public void setEpoch(String epoch) {
        this.epoch = epoch;
    }
    
}
