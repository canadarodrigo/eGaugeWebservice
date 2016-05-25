/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.slc.egauge.entities.instataneous.Data;
import com.slc.egauge.entities.instataneous.Register;
import com.slc.egauge.entities.storeddata.Group;
import com.slc.egauge.entities.teamstat.Status;
import java.io.StringReader;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

/**
 *
 * @author srostantkritikos06
 */
public class marshalling {
    public static void main(String[] args) throws JAXBException
    {
        JAXBContext jc = JAXBContext.newInstance(Data.class);
 //       List<Register> registers = new ArrayList<Register>();
//        Data data = new Data();
//        data.setSerial("189731");
//        TimeStamp timeStamp =  new TimeStamp();
//        timeStamp.setTime(1234456789L);
//        Register register =  new Register();
//        register.setType("P");
//        register.setName("SOLAR");
//        Value value =  new Value();
//        value.setValue(new BigInteger("1234566"));
//        RateOfChange roc = new RateOfChange();
//        roc.setRate(new BigInteger("12312414124"));
//        register.setValue(value);
//        register.setRate(roc);
//        registers.add(register);
//        data.setTimeStamp(timeStamp);
//        data.setRegisters(registers);

//        Available available =  new Available();
//        available.setAvailable(1);
//        Name name = new Name();
//        name.setName("Grid");
//        MaxRate rate =  new MaxRate();
//        rate.setValue(123980123L);
//        LastUpdate lastUp =  new LastUpdate();
//        lastUp.setValue(123123123L);
//        LastValue lastVal = new LastValue();
//        lastVal.setValue(new BigInteger("123156"));
//        LeakRate leak =  new LeakRate();
//        leak.setValue(12312983);
//        Excess excess = new Excess();
//        excess.setValue(new BigInteger("12312312312"));
//        Reg register = new Reg();
//        register.setAvailable(available);
//        register.setExcess(excess);
//        register.setLastUpdate(lastUp);
//        register.setLastValue(lastVal);
//        register.setLeakRate(leak);
//        register.setMaxRate(rate);
//        register.setName(name);
//        Lag lag = new Lag();
//        lag.setUnit("ms");
//        lag.setValue(123);
//        Status status =  new Status();
//        status.setRegister(register);
//        status.setLag(lag);
//        
//        
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//        marshaller.marshal(status, System.out);
        
        // TESTING UNMARSHALLING
        Unmarshaller um = jc.createUnmarshaller();
        Data data = null; // for inst requests
        Group group = null; // for stored data request
        Status status =  null; // for noteam reuquest
        
        //FROM STRINGS
        StringBuffer xmlStr =  new StringBuffer("");
        
        //FROM URLS
        try {

            URL url = new URL("http://egauge5593.egaug.es/cgi-bin/egauge?inst");
            data = (Data) um.unmarshal(url);
            } catch (MalformedURLException ex) {
            Logger.getLogger(marshalling.class.getName()).log(Level.SEVERE, null, ex);
        } 
       
        marshaller.marshal(data, System.out);
        
        
    }
}
