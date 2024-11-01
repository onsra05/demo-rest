package vn.edu.iuh.fit.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import vn.edu.iuh.fit.entity.Account;

import java.util.List;

public class AccountModel {
    @PersistenceContext(unitName = "demo")
    private EntityManager entityManager;

    public List<Account> listAccount() {
        TypedQuery<Account> q = entityManager.createQuery("SELECT a FROM Account a", Account.class);
        return q.getResultList();
    }


}
