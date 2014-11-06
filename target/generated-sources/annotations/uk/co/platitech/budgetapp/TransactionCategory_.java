package uk.co.platitech.budgetapp;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import uk.co.platitech.budgetapp.AccountTransactions;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-11-06T15:05:35")
@StaticMetamodel(TransactionCategory.class)
public class TransactionCategory_ { 

    public static volatile CollectionAttribute<TransactionCategory, AccountTransactions> accountTransactionsCollection;
    public static volatile SingularAttribute<TransactionCategory, Integer> id;
    public static volatile SingularAttribute<TransactionCategory, String> categoryName;

}