/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos2711;

/**
 *
 * @author Rosa
 * @version 1.3
 */
public class InicioApp {
    
    private String frase;
    int count;
    int resultado;
    String texto;
    
    public String getFrase() {
        return frase;
    }
    public void setFrase(String frase) {
        this.frase = frase;
    }
    /**
     * 
     * @param frase 
     */
    public InicioApp(String frase) {
        this.frase=frase;
    }
    /**
     * 
     * @return total de caracteres
     */
    public int contarCaracteresTotal(){
        texto=this.frase.replace(" ","");
        resultado=texto.length();
        return resultado;
    }
    /**
     * 
     * @return total de palabras
     */
    public int contarNumeroPalabras(){
        count=frase.split("\\s+|\n|,").length;
        return count;
        }    
    /**
     * 
     * @param letras
     * @param contador
     * @return contador de letras
     */
    public int[] contarTodosCaracteres(char[] letras,int[] contador){
        int solu=0;
        for (int i=0;i<letras.length;i++){  
            char letrita=letras[i];
         for (int j=0;j<texto.length();j++){
         
            char letra = texto.charAt(j);
            
            if (letrita==letra){
                solu=solu+1;
                contador[i]=solu;
                }
           }
           solu=0;
        }
        return contador;
    }
    
    
    
}
