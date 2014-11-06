package uk.co.platitech.budgetapp;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.co.platitech.budgetapp.AccountBalance;
import uk.co.platitech.budgetapp.AccountTransactions;
import uk.co.platitech.budgetapp.Users;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-06T15:05:35")
@StaticMetamodel(BankAccount.class)
public class BankAccount_ { 

    public static volatile SingularAttribute<BankAccount, String> accountName;
    public static volatile CollectionAttribute<BankAccount, AccountTransactions> accountTransactionsCollection;
    public static volatile SingularAttribute<BankAccount, Integer> id;
    public static volatile SingularAttribute<BankAccount, Integer> accountNumber;
    public static volatile SingularAttribute<BankAccount, AccountBalance> accountBalance;
    public static volatile SingularAttribute<BankAccount, Users> userId;

}