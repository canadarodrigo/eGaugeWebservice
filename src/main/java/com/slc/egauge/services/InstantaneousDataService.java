/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slc.egauge.services;

import com.slc.egauge.entities.instataneous.Data;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 *
 * @author srostantkritikos06
 */
public class InstantaneousDataService implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        getInstData();
    }

    private void getInstData() {
        try {
            URL url = new URL("http://egauge5593.egaug.es/cgi-bin/egauge?inst");
            JAXBContext jc = JAXBContext.newInstance(Data.class);
            
            Unmarshaller um = jc.createUnmarshaller();
            Data data = (Data) um.unmarshal(url);
            
            //For testing
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(data, System.out);
            
            
        } catch (MalformedURLException | JAXBException ex) {
            Logger.getLogger(InstantaneousDataService.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Inst data service error thrown");
        }
    }
    
}
