/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author Wendel
 */
public class Formatador {
    
    /**
     * Efetua a troca de virgulas por ponto
     * @param pValor
     * @return double
     */
    public double converteVirgulaParaPonto(String pValor){
        
        String retorno = new String();
        int tamanhoString = pValor.length();
      
        for (int i = 0; i < tamanhoString; i++) {
            if (pValor.charAt(i) == ',') {
                retorno += '.';
            }else{
                retorno += pValor.charAt(i);
            }   
        }
        return Double.parseDouble(retorno);
    }
    
}
