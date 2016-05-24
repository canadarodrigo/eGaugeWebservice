/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slc.egauge.entities.teamstat;

import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author srostantkritikos06
 */
@XmlRootElement(name = "status")
public class Status {
    private Lag lag;
    private List<Reg> register;
    
    public Status() {
    }

    @XmlElement(name = "lag")
    public Lag getLag() {
        return lag;
    }

    public void setLag(Lag lag) {
        this.lag = lag;
    }    

    @XmlElement(name = "reg")
    public List<Reg> getRegister() {
        return register;
    }

    public void setRegister(List<Reg> register) {
        this.register = register;
    }
    
    
}
