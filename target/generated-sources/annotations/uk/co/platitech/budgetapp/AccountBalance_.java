package uk.co.platitech.budgetapp;

import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.co.platitech.budgetapp.BankAccount;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-06T15:05:35")
@StaticMetamodel(AccountBalance.class)
public class AccountBalance_ { 

    public static volatile SingularAttribute<AccountBalance, BigInteger> lastBalance;
    public static volatile SingularAttribute<AccountBalance, BankAccount> bankAccount;
    public static volatile SingularAttribute<AccountBalance, BigInteger> balance;
    public static volatile SingularAttribute<AccountBalance, Integer> account;

}