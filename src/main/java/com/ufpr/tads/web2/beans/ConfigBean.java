/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ufpr.tads.web2.beans;

import java.io.Serializable;

/**
 *
 * @author jeffe
 */
public class ConfigBean implements Serializable{
    
    public String emailAdm;

    public ConfigBean(String emailAdm) {
        this.emailAdm = emailAdm;
    }

    public String getEmailAdm() {
        return emailAdm;
    }

    public void setEmailAdm(String emailAdm) {
        this.emailAdm = emailAdm;
    }
    
    
    
}
