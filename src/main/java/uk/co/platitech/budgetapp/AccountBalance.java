/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.co.platitech.budgetapp;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author samuel
 */
@Entity
@Table(name = "account_balance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccountBalance.findAll", query = "SELECT a FROM AccountBalance a"),
    @NamedQuery(name = "AccountBalance.findByAccount", query = "SELECT a FROM AccountBalance a WHERE a.account = :account"),
    @NamedQuery(name = "AccountBalance.findByBalance", query = "SELECT a FROM AccountBalance a WHERE a.balance = :balance"),
    @NamedQuery(name = "AccountBalance.findByLastBalance", query = "SELECT a FROM AccountBalance a WHERE a.lastBalance = :lastBalance")})
public class AccountBalance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "account")
    private Integer account;
    @Basic(optional = false)
    @NotNull
    @Column(name = "balance")
    private BigInteger balance;
    @Basic(optional = false)
    @NotNull
    @Column(name = "last_balance")
    private BigInteger lastBalance;
    @JoinColumn(name = "account", referencedColumnName = "id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private BankAccount bankAccount;

    public AccountBalance() {
    }

    public AccountBalance(Integer account) {
        this.account = account;
    }

    public AccountBalance(Integer account, BigInteger balance, BigInteger lastBalance) {
        this.account = account;
        this.balance = balance;
        this.lastBalance = lastBalance;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public BigInteger getBalance() {
        return balance;
    }

    public void setBalance(BigInteger balance) {
        this.balance = balance;
    }

    public BigInteger getLastBalance() {
        return lastBalance;
    }

    public void setLastBalance(BigInteger lastBalance) {
        this.lastBalance = lastBalance;
    }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (account != null ? account.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccountBalance)) {
            return false;
        }
        AccountBalance other = (AccountBalance) object;
        if ((this.account == null && other.account != null) || (this.account != null && !this.account.equals(other.account))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uk.co.platitech.budgetapp.AccountBalance[ account=" + account + " ]";
    }
    
}
