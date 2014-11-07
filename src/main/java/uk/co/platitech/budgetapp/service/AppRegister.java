package uk.co.platitech.budgetapp.service;

import java.util.HashMap;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import uk.co.platitech.budgetapp.component.security.Security;
import uk.co.platitech.budgetapp.component.security.v1.SecurityImp;

/**
 *
 * @author samuel
 */
@Stateless
@Path("uk.co.platitech.budgetapp.appregister")
public class AppRegister {

    private SecurityImp com = null;
    
    public AppRegister() {
        com = new Security().loadComponent();
    }
    
    
    
    
    @GET
    @Path("{appId}")
    @Produces({"application/json"})
    public HashMap<String, String> register(@PathParam("appId") String appId) {
        String key = null;
        HashMap hm = new HashMap<>();
        key = com.registerApplication(appId);
        
        if(key.equals(""))
        {
            hm.put("error", "failed to register application");
            hm.put("status", "error");
        }else
        {
            hm.put("status", "success");
            hm.put("key", key);
        }
     
        return hm;
    }
}
