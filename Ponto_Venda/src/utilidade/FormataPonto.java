/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidade;

/**
 *
 * @author Faculdade
 */
public class FormataPonto {
    
    /**
     * CONVERTE VÍRGULA PARA PONTO
     * @param string
     * @return 
     */
    public double converteVirgulaparaPonto(String string){
        String retorno = new String();
        int tamanhoString = string.length();
        for(int i = 0; i < tamanhoString; i++){
            if(string.charAt(i) == ','){
                retorno += '.';
            }else{
                retorno += string.charAt(i);
            }
        }
        return Double.parseDouble(retorno);
    }
}
