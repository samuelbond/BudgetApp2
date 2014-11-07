/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.co.platitech.budgetapp.component.security;

/**
 *
 * @author samuel
 */
public interface SecurityInterface {
    
    public boolean authenticateConnection(String appKey);
    
    public String registerApplication(String appId);
    
    
}
