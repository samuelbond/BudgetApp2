/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.co.platitech.budgetapp.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author samuel
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(uk.co.platitech.budgetapp.service.AccountBalanceFacadeREST.class);
        resources.add(uk.co.platitech.budgetapp.service.AccountTransactionsFacadeREST.class);
        resources.add(uk.co.platitech.budgetapp.service.BankAccountFacadeREST.class);
        resources.add(uk.co.platitech.budgetapp.service.TransactionCategoryFacadeREST.class);
        resources.add(uk.co.platitech.budgetapp.service.UsersFacadeREST.class);
    }
    
}
