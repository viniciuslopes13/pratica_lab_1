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
public class Demo {
    
    public static void main(String[] args){
        Time time1 = new Time("Corinthians");
        Time time2 = new Time("Palmeiras");
        Jogador jog1 = new JogadorAtacante("Chico", 20, 20, 20, 23);
        Jogador jog2 = new JogadorAtacante("Mario", 20, 20, 20, 23);
        Jogador jog3 = new JogadorDefesa("Pablo", 32, 15, 20,23);
        Jogador jog4 = new JogadorDefesa("Mariano", 24, 22, 21, 23);
        Jogador jog5 = new JogadorGoleiro("Joao", 22, 21, 20, (float) 1.8);
        
        Jogador jog6 = new JogadorAtacante("Tita", 22, 23, 23, 28);
        Jogador jog7 = new JogadorAtacante("Bruno", 20, 20, 20, 23);
        Jogador jog8 = new JogadorDefesa("Filho", 32, 15, 20,23);
        Jogador jog9 = new JogadorDefesa("Segundo", 24, 22, 21, 23);
        Jogador jog10 = new JogadorGoleiro("Wesley", 22, 21, 20, (float) 1.8);
        
        time1.insJogador(jog1);
        time1.insJogador(jog2);
        time1.insJogador(jog3);
        time1.insJogador(jog4);
        time1.insJogador(jog5);
        
        time2.insJogador(jog6);
        time2.insJogador(jog7);
        time2.insJogador(jog8);
        time2.insJogador(jog9);
        time2.insJogador(jog10);
        
        
        System.out.println("Escalação time 1: ");
        time1.imprimeJogadores();
        System.out.println();
        System.out.println("Escalação time 2: ");
        time2.imprimeJogadores();
       
        Date d = new Date("22/12/2020");
        
        Partida p1 = new Partida(d, time1, time2);
        System.out.println();
        System.out.println("Inicio de Jogo");
        System.out.println(p1.getPlacar());
        p1.golCasa();
        p1.golCasa();
        p1.golCasa();
        p1.golVisitante();
        System.out.println(p1.getPlacar());
        
    }
    
}
