package uk.co.platitech.budgetapp;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.co.platitech.budgetapp.BankAccount;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-06T15:05:35")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> password;
    public static volatile CollectionAttribute<Users, BankAccount> bankAccountCollection;
    public static volatile SingularAttribute<Users, String> fullname;
    public static volatile SingularAttribute<Users, String> userId;
    public static volatile SingularAttribute<Users, String> email;

}