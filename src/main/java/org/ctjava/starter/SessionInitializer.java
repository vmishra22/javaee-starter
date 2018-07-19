/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ctjava.starter;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.DependsOn;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author V1A
 */
@Singleton
@Startup
@DependsOn("StartupBean")
public class SessionInitializer {
    @PostConstruct
    public void init() {
        System.out.println("I should appear after startup");
    }
    
    public boolean isInitialized(){
        return true;
    }
    
    @PreDestroy
    public void destroy() {
        System.out.println("Destroying");
    }
}
