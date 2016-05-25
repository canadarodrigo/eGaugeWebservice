/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.slc.egauge.quartz.InstDataScheduler;

/**
 *
 * @author srostantkritikos06
 */
public class quartztesting {
    public static void main(String[] args)
    {
        InstDataScheduler schduler = new InstDataScheduler();
        schduler.getData();
    }
}
