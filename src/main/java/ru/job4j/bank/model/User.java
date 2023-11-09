package ru.job4j.bank.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class User extends Id {

    @EqualsAndHashCode.Include
    private String passport;

    private String username;

    private List<Account> accounts = new CopyOnWriteArrayList<>();

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }
}
