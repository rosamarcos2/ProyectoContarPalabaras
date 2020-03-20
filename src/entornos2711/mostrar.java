/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos2711;

/**
 *
 * @author Usuario
 */
public class mostrar {
    public String textoCaracteresTotal(int contar){
            return "El total de caracteres es : " + contar ;
        }
    public String textoNumeroPalabras(int total){
        return "El total de numero de palabras es: " + total;
    }
    public String textoTodosCaracteres (char[] letras, int[] contador){
        String resultado="";
            for (int i=0;i<letras.length;i++){ 
            if (contador[i]>0){
                resultado+="Del caracter " + letras[i] + " hay una cantidad de : " + contador[i] + "\n";      
                }
            }
                 return resultado;
            
    }
}
