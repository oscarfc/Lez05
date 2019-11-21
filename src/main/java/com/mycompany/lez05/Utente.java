/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez05;

/**
 *
 * @author tss
 */
public class Utente {

    private String cognome;
    private String nome;
    private String telefono;
    private String email;
    private String user;
    private String indirizzo;

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getUser() {
        return user;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public Utente(String cognome, String nome, String telefono, String email, String user, String indirizzo) {
        this.cognome = cognome;
        this.nome = nome;
        this.telefono = telefono;
        this.email = email;
        this.user = user;
        this.indirizzo = indirizzo;
    }

}
