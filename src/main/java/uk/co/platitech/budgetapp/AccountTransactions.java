/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.co.platitech.budgetapp;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author samuel
 */
@Entity
@Table(name = "account_transactions")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccountTransactions.findAll", query = "SELECT a FROM AccountTransactions a"),
    @NamedQuery(name = "AccountTransactions.findByTransactionId", query = "SELECT a FROM AccountTransactions a WHERE a.transactionId = :transactionId"),
    @NamedQuery(name = "AccountTransactions.findByTransactionAmount", query = "SELECT a FROM AccountTransactions a WHERE a.transactionAmount = :transactionAmount"),
    @NamedQuery(name = "AccountTransactions.findByTransactionDate", query = "SELECT a FROM AccountTransactions a WHERE a.transactionDate = :transactionDate"),
    @NamedQuery(name = "AccountTransactions.findByTransactionName", query = "SELECT a FROM AccountTransactions a WHERE a.transactionName = :transactionName")})
public class AccountTransactions implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 65)
    @Column(name = "transaction_id")
    private String transactionId;
    @Size(max = 45)
    @Column(name = "transaction_amount")
    private String transactionAmount;
    @Size(max = 45)
    @Column(name = "transaction_date")
    private String transactionDate;
    @Size(max = 45)
    @Column(name = "transaction_name")
    private String transactionName;
    @JoinColumn(name = "account", referencedColumnName = "id")
    @ManyToOne
    private BankAccount account;
    @JoinColumn(name = "transaction_type", referencedColumnName = "id")
    @ManyToOne
    private TransactionCategory transactionType;

    public AccountTransactions() {
    }

    public AccountTransactions(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void setAccount(BankAccount account) {
        this.account = account;
    }

    public TransactionCategory getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionCategory transactionType) {
        this.transactionType = transactionType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (transactionId != null ? transactionId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountTransactions)) {
            return false;
        }
        AccountTransactions other = (AccountTransactions) object;
        if ((this.transactionId == null && other.transactionId != null) || (this.transactionId != null && !this.transactionId.equals(other.transactionId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uk.co.platitech.budgetapp.AccountTransactions[ transactionId=" + transactionId + " ]";
    }
    
}
