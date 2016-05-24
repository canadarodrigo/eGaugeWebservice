/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slc.egauge.entities.teamstat;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author srostantkritikos06
 */
@XmlRootElement(name = "available")
public class Available {
    
    private int value;

    
    @XmlValue
    public int getAvailable() {
        return value;
    }

    public void setAvailable(int available) {
        this.value = available;
    }
    
    
}
