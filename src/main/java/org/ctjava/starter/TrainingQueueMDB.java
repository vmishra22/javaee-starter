/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ctjava.starter;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 *
 * @author V1A
 */
@MessageDriven(
       activationConfig = {
           @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
           @ActivationConfigProperty(propertyName = "destination", propertyValue = "trainingQueue")
       }
)
public class TrainingQueueMDB implements MessageListener{

    @Override
    public void onMessage(Message msg) {
        TextMessage tm = (TextMessage) msg;
        try {
            System.out.println("Miracle got a message: " + tm.getText());
        } catch (JMSException ex) {
            Logger.getLogger(TrainingQueueMDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
