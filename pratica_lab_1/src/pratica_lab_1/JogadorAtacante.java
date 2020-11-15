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
public class JogadorAtacante extends Jogador{
    
    private int velocidade;
    private int tecnica;
    
    public JogadorAtacante(String pNome, int pIda, int pHab, int pVel, int pTec){
        super(pNome, pIda, pHab);
        this.velocidade = pVel;
        this.tecnica = pTec;
    }
    
    @Override
    public int getHabilidade(){
        return ((habilidade*5) + (velocidade*2) + (tecnica*3))/10;
    }

    @Override
    public String toString() {
        return "JogadorAtacante{" +this.getNome()+"}";
    }
    
}
