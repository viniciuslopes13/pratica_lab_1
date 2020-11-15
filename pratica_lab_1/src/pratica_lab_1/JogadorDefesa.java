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
public class JogadorDefesa extends Jogador{
    
    private int desarme;
    private int cobertura;
    
    public JogadorDefesa(String pNome, int pIda, int pHa, int pCob, int pDes) {
        super(pNome, pIda, pHa);   
        this.cobertura = pCob;
        this.desarme = pDes;
    }
    
    @Override
    public int getHabilidade(){
        return ((habilidade*5) + (cobertura*3) + (desarme*2))/10;
    }

    @Override
    public String toString() {
        return "JogadorDefesa{" + this.getNome()+ "}";
    }
    
}
