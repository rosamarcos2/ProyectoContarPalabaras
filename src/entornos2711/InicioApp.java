/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos2711;

/**
 *
 * @author alumno
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
    
    

    InicioApp(String frase) {
        this.frase=frase;
    }

    

    public int contarCaracteresTotal(){
        texto=this.frase.replace(" ","");
        resultado=texto.length();
        return resultado;
    }
    public int contarNumeroPalabras(){
        count=frase.split("\\s+|\n|,").length;
        return count;
        }
        
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
