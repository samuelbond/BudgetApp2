
package uk.co.platitech.budgetapp.helper;



import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
*
* @author samuelbond
*/
public class HashString 
{
    private MessageDigest md;
    private final String stringToHash;
    private String algorithim = "SHA-512";

    public HashString(String stringToHash) 
    {
        this.stringToHash = stringToHash;
    }

    public HashString(String stringToHash, String algorithim) 
    {
        this.stringToHash = stringToHash;
        this.algorithim = algorithim;
    }

    public String generateHash()
    {
       try 
       {
            md= MessageDigest.getInstance(algorithim);
            md.update(stringToHash.getBytes());
            byte[] mb = md.digest();
            String out = "";
            for (int i = 0; i < mb.length; i++) 
            {
                byte temp = mb[i];
                String s = Integer.toHexString(new Byte(temp));
                while (s.length() < 2) 
                {
                    s = "0" + s;
                }
                s = s.substring(s.length() - 2);
                out += s;
            }
            return out;
       } 
       catch (NoSuchAlgorithmException e) 
       {
            return e.getMessage();
       }
    }
    
    
}