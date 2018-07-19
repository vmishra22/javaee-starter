/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ctjava.starter;

import javax.annotation.PostConstruct;
import javax.ejb.DependsOn;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author V1A
 */
@Stateless
public class UserService {
    @EJB
    private SessionInitializer si;
    
    @PostConstruct
    public void init(){
        System.out.println("UserService is created");
    }
    
    public String getMessage(){
        return "*******Vinay " + si.isInitialized();
    } 
            
         
}
