/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ctjava.starter;

import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

/**
 *
 * @author V1A
 */
@Singleton
@Startup
public class TestStartup {
    @EJB
    private UserService userService;
            
    @PostConstruct
    public void init(){ 
        System.out.println("Test startup!");
        System.out.println("Message: " + userService.getMessage());
    }
}
