/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entornos2711;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Entornos2711 {
static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] letras={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C',
        'D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z',',','.',':','?','¿','<','>','!','¡'};
        int [] contador= new int[letras.length];
        System.out.println("Introduce una frase: ");
        String frase=sc.nextLine();
        InicioApp frase1= new InicioApp(frase);
        int total=frase1.contarCaracteresTotal();
        int cont=frase1.contarNumeroPalabras();
        System.out.println(frase1.textoCaracteresTotal(total));      
        System.out.println(frase1.textoNumeroPalabras(cont)); 
        frase1.contarTodosCaracteres(letras, contador);
        System.out.println(frase1.textoTodosCaracteres(letras,contador));
        
        }
       
}
