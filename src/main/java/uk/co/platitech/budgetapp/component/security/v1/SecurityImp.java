package uk.co.platitech.budgetapp.component.security.v1;

import javax.persistence.NoResultException;
import uk.co.platitech.budgetapp.Apps;
import uk.co.platitech.budgetapp.component.security.Security;
import uk.co.platitech.budgetapp.component.security.SecurityInterface;
import uk.co.platitech.budgetapp.component.security.model.DataRepo;
import uk.co.platitech.budgetapp.helper.HashString;


/**
 *
 * @author samuel
 */
public class SecurityImp extends Security implements SecurityInterface{
 
    protected DataRepo data;

    public SecurityImp() {
        this.data = new DataRepo();
    }
    
    
    
    @Override
    public boolean authenticateConnection(String appKey) 
    {
       
        try
        {
            Apps app = this.data.getAppKey(appKey);
            
            if(app.getAppKey().equals(appKey))
            {
                return true;
            }
        }
        catch(NoResultException ex)
        {
            return false;
        }
        
        return false;
    }

    @Override
    public String registerApplication(String appId) {
        HashString hs = new HashString(appId);
        String key = hs.generateHash();
        return ((this.data.insertApp(new Apps(appId, key))) ? key : "");
    }
    
}
