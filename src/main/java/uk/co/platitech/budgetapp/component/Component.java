package uk.co.platitech.budgetapp.component;

import java.util.List;

/**
 *
 * @author samuel
 */
public abstract class Component {
    
    protected static Component component = null;
    
    protected String version = "1.0";
    
    protected List<String> availableVersions;

    public Component()
    {
        this.availableVersions.add(this.version);
    }
    
    
    public void setVersion(String version)
    {
        if(availableVersions.contains(version))
        {
            this.version = version;
        }
    }
    
    public List<String> getAvailableVersions()
    {
        return this.availableVersions;
    }
    
    public abstract Component loadComponent();
    
    
    
    
}
