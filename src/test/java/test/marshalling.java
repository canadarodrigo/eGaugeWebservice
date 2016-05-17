/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.slc.egauge.entities.instataneous.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

/**
 *
 * @author srostantkritikos06
 */
public class marshalling {
    public static void main(String[] args) throws JAXBException
    {
        JAXBContext jc = JAXBContext.newInstance(Data.class);
        List<Register> registers = new ArrayList<Register>();
        Data data = new Data();
        data.setSerial("189731");
        TimeStamp timeStamp =  new TimeStamp();
        timeStamp.setTime(1234456789L);
        Register register =  new Register();
        register.setType("P");
        register.setName("SOLAR");
        Value value =  new Value();
        value.setValue(new BigInteger("1234566"));
        RateOfChange roc = new RateOfChange();
        roc.setRate(new BigInteger("12312414124"));
        register.setValue(value);
        register.setRate(roc);
        registers.add(register);
        data.setTimeStamp(timeStamp);
        data.setRegisters(registers);
        
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(data, System.out);
        
    }
}
