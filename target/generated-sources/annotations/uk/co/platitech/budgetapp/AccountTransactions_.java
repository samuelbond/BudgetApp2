package uk.co.platitech.budgetapp;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.co.platitech.budgetapp.BankAccount;
import uk.co.platitech.budgetapp.TransactionCategory;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-06T15:05:35")
@StaticMetamodel(AccountTransactions.class)
public class AccountTransactions_ { 

    public static volatile SingularAttribute<AccountTransactions, TransactionCategory> transactionType;
    public static volatile SingularAttribute<AccountTransactions, String> transactionAmount;
    public static volatile SingularAttribute<AccountTransactions, String> transactionDate;
    public static volatile SingularAttribute<AccountTransactions, String> transactionName;
    public static volatile SingularAttribute<AccountTransactions, String> transactionId;
    public static volatile SingularAttribute<AccountTransactions, BankAccount> account;

}