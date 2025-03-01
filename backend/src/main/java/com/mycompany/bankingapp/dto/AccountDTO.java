package com.mycompany.bankingapp.dto;

public class AccountDTO {

    private Long id;
    private String accountNumber;
    private double balance;

    // Constructors, getters, and setters

    public AccountDTO() {
    }

    public AccountDTO(Long id, String accountNumber, double balance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

