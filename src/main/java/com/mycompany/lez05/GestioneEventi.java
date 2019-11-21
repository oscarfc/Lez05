/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lez05;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author tss
 */
public class GestioneEventi {

    private static ArrayList<Utente> utenti;
    private static ArrayList<Evento> eventi;
    private static ArrayList<Biglietto> biglietti;

    public static void main(String[] args) {
        biglietti = new ArrayList<>();
        eventi = new ArrayList<>();
        utenti = new ArrayList<Utente>();
        String risposta;
        do {
            risposta = JOptionPane.showInputDialog(null, "Vuoi creare un (E)vento, un (U)tente oppure un (B)iglietto? \n(X) per terminare", "E");
            if (risposta.substring(0, 1).toUpperCase().compareTo("E") == 0) {
                new GestioneEventi().creaEvento();
            } else if (risposta.substring(0, 1).toUpperCase().compareTo("B") == 0) {
                new GestioneEventi().creaBiglietto();

            } else if (risposta.substring(0, 1).toUpperCase().compareTo("U") == 0) {
                new GestioneEventi().creaUtente();
            }
        } while (risposta.substring(0, 1).toUpperCase().compareTo("X") != 0);

        for (Utente ut : utenti) {
            String msg = ut.getCognome() + " " + ut.getNome() + " " + ut.getEmail() + " " + ut.getIndirizzo() + " ";
            JOptionPane.showMessageDialog(null, msg);
        }
    }

    private void creaEvento() {
        String descrEvento = JOptionPane.showInputDialog(null, "Descrizione evento:");
        String luogoEvento = JOptionPane.showInputDialog(null, "Luogo evento:");
        LocalDateTime dataEvento = LocalDateTime.now();
        eventi.add(new Evento(descrEvento, luogoEvento, dataEvento));
    }

    private void creaBiglietto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void creaUtente() {
        String cognome = JOptionPane.showInputDialog(null, "Cognome utente:");
        String nome = JOptionPane.showInputDialog(null, "Nome utente:");
        String telefono = JOptionPane.showInputDialog(null, "Telefono utente:");
        String email = JOptionPane.showInputDialog(null, "Email utente:");
        String user = JOptionPane.showInputDialog(null, "User utente:");
        String indirizzo = JOptionPane.showInputDialog(null, "Indirizzo utente:");
        utenti.add(new Utente(cognome, nome, telefono, email, user, indirizzo));
    }

}
