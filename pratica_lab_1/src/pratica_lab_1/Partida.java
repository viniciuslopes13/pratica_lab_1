/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica_lab_1;

import java.util.Date;

/**
 *
 * @author viniciuslopes
 */
public class Partida {
    
    private Date data;
    private Time timeCasa;
    private Time timeVisitante;
    private int placarCasa;
    private int placarVisitante;
    
    public Partida(Date d, Time casa, Time visitante){
        this.data = d;
        this.timeCasa = casa;
        this.timeVisitante = visitante;
    }
    
    public void golCasa(){
        this.placarCasa++;
    }
    
    public void golVisitante(){
        this.placarVisitante++;
    }
    
    public String getPlacar(){
        return timeCasa.getNome()+" "+this.placarCasa+" X "+this.placarVisitante+" "+timeVisitante.getNome();
    }
}
