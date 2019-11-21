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
public class Evento {

    private int idEvento;
    private String descrEvento;
    private String luogoEvento;
    private LocalDateTime dataEvento;

    public Evento(String descrEvento, String luogoEvento, LocalDateTime dataEvento) {
        this.descrEvento = descrEvento;
        this.luogoEvento = luogoEvento;
        this.dataEvento = dataEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public void setDescrEvento(String descrEvento) {
        this.descrEvento = descrEvento;
    }

    public void setLuogoEvento(String luogoEvento) {
        this.luogoEvento = luogoEvento;
    }

    public void setDataEvento(LocalDateTime dataEvento) {
        this.dataEvento = dataEvento;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public String getDescrEvento() {
        return descrEvento;
    }

    public String getLuogoEvento() {
        return luogoEvento;
    }

    public LocalDateTime getDataEvento() {
        return dataEvento;
    }

}
