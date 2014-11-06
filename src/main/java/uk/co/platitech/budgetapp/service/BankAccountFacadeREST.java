/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.co.platitech.budgetapp.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import uk.co.platitech.budgetapp.BankAccount;
import uk.co.platitech.budgetapp.Users;

/**
 *
 * @author samuel
 */
@Stateless
@Path("uk.co.platitech.budgetapp.bankaccount")
public class BankAccountFacadeREST extends AbstractFacade<BankAccount> {
    @PersistenceContext(unitName = "uk.co.platitech_BudgetApp_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    public BankAccountFacadeREST() {
        super(BankAccount.class);
    }

    @POST
    @Consumes({"application/json"})
    //@Consumes("application/x-www-form-urlencoded")
    @Produces({"application/json"})
    public BankAccount createAcc(BankAccount entity){//@FormParam("userId") String data) {
        //super.create(entity);
        return entity;
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") Integer id, BankAccount entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("/find/{id}")
    @Produces({"application/xml", "application/json"})
    public BankAccount find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Path("/getaccount/{id}")
    @Produces({"application/json"})
    public List<BankAccount> getAccount(@PathParam("id") String id) {
        return super.getUserAccounts(new Users(id));
    }
    
    @GET
    @Override
    @Produces({"application/json"})
    public List<BankAccount> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<BankAccount> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
