/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez05;

import java.time.LocalDateTime;

/**
 *
 * @author tss
 */
public class Biglietto {

    private Utente utente;
    private Evento evento;
    private float costo;
    private LocalDateTime dataAcquisto;

    public void setDataAcquisto(LocalDateTime dataAcquisto) {
        this.dataAcquisto = dataAcquisto;
    }

    public LocalDateTime getDataAcquisto() {
        return dataAcquisto;
    }

    public Utente getUtente() {
        return utente;
    }

    public Evento getEvento() {
        return evento;
    }

    public float getCosto() {
        return costo;
    }

    public Biglietto(Utente utente, Evento evento, float costo) {
        this.utente = utente;
        this.evento = evento;
        this.costo = costo;
    }

    public void setUtente(Utente utente) {
        this.utente = utente;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

}
