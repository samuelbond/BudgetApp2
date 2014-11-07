/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.co.platitech.budgetapp.component.security;

import uk.co.platitech.budgetapp.component.Component;
import uk.co.platitech.budgetapp.component.security.v1.SecurityImp;

/**
 *
 * @author samuel
 */
public class Security extends Component{
    
    @Override
    public SecurityImp loadComponent() {
        return new SecurityImp();
    }

    
    
    
   
    
}
