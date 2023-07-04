package com.example.dashboardmanagement;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//c'est la classe qui représente la table
//entity est utilisable pour dire que la classe correspond a une table de la base de données
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private final String name;
    private final String email;
    public Users(String name, String email) {
        this.name = name;
        this.email = email;
    }


    public Users() {
        this.name = null;
        this.email = null;
    }
    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
