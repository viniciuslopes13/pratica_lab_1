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
public class Jogador {
    
    private String nome;
    protected int idade;
    protected int habilidade;
    private int gols;
    private int camisa;
    
    public Jogador(String pNome, int pIda, int pHa){
        this.nome = pNome;
        this.idade = pIda;
        this.habilidade = pHa;
        this.gols = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getHabilidade() {
        return habilidade;
    }

    public int getGols() {
        return gols;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void somaGol(){
        this.gols++;
    }

    @Override
    public String toString() {
        return "Jogador{" + "nome=" + nome + '}';
    }
    
    
}
