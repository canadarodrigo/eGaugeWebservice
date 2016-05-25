/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slc.egauge.controllers;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 *
 * @author srostantkritikos06
 */
public class InstataniousControler implements Job{

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Do a request to the URL with inst parameter
     * 
     * build the entity 
     *
     * using entity build Database entity.
     * store database entity into dataase 
     * 
     * TODO: Automate process - Quartz
     *
     */
    
    
    
    
}
