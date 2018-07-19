/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ctjava.starter;

import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author V1A
 */
@Singleton  
@Startup
public class StartupBean {
    @PostConstruct
    public void init(){
        Logger.getLogger("StartupBean").info("Hello World");
    }
    
}
