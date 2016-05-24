/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slc.egauge.entities.teamstat;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlValue;

/**
 *
 * @author srostantkritikos06
 */
@XmlRootElement(name = "excess")
public class Excess {
    private BigInteger value;

    public Excess() {
    }

    @XmlValue
    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }
    
    
}
