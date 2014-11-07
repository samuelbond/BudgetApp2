/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.co.platitech.budgetapp.component.security.model;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import uk.co.platitech.budgetapp.Apps;

/**
 *
 * @author samuel
 */
public class DataRepo {
    @PersistenceContext(unitName = "uk.co.platitech_BudgetApp_war_1.0-SNAPSHOTPU")
    private EntityManager em;
    
    public Apps getAppKey(String Key) throws NoResultException
    {
       Apps app = new Apps();
       app.setAppKey(Key);
       Query q = em.createNamedQuery("Apps.findByAppKey").setParameter("appKey", app);
       return (Apps) q.getSingleResult();
    }
    
    public boolean insertApp(Apps app)
    {
        try
        {
            em.persist(app);
        }catch(Exception ex)
        {
            return false;
        }
        
        return true;
    }
}
