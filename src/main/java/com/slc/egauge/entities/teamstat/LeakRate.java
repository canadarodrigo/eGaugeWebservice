/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slc.egauge.entities.teamstat;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author srostantkritikos06
 */
@XmlRootElement(name = "leak_rate")
public class LeakRate {
    private long value;

    public LeakRate() {
    }

    @XmlValue
    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }
    
    
}
