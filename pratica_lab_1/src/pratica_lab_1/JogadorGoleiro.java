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
public class JogadorGoleiro extends Jogador {
    
    private int reflexos;
    private float altura;
    
    public JogadorGoleiro(String pNome, int pIda, int pHa, int refle, float alt) {
        super(pNome, pIda, pHa);
        this.reflexos = refle;
        this.altura = alt;
    }
    
    @Override
    public int getHabilidade(){
        return ((habilidade*5) + (((int)(altura*100))*2) + (reflexos*3))/10;
    }

    @Override
    public String toString() {
        return "JogadorGoleiro{" + this.getNome()+ "}";
    }
    
    
    
}
