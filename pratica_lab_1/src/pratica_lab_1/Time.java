/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica_lab_1;

/**
 *
 * @author viniciuslopes
 */
public class Time {
    
    private String nome;
    private Jogador jogadores[]= new Jogador[5];
    private int vitorias;
    private int derrotas;
    private int empates;
    private int contador=0;
    
    public Time(String pNome){
        this.nome = pNome;
        this.vitorias = 0;
        this.empates = 0;
        this.derrotas = 0;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getResultados(){
        return this.vitorias + " V - "+this.empates+" E - "+this.derrotas+" D";
    }
    
    public void imprimeJogadores(){
        for(Jogador i:jogadores){
            System.out.println(i);
        }
    }
    
    public void somaVitoria(){
        this.vitorias++;
    }
    
    public void somaDerrota(){
        this.derrotas++;
    }
    
    public void somaEmpates(){
        this.empates++;
    }
    
    public void insJogador(Jogador p){
        if(contador<5){
            jogadores[contador] = p;
            contador++;   
        }else{
            System.out.println("O time já está completo!");
        }
    }
}
