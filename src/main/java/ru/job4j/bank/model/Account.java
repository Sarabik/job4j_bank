package ru.job4j.bank.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
@Data
public class Account extends Id {

    @EqualsAndHashCode.Include
    private String requisite;

    private double balance;

    @EqualsAndHashCode.Include
    private User user;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

}
