/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp.problema.pkg08;
import java.util.*;
public class FpProblema08 {

    /**
     8.	Realiza un programa que reciba dos catetos y devuelva la hipotenusa.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a,b;
       double h;
       
       Scanner entradaTeclado= new Scanner(System.in);
        System.out.println("Introduce el cateto 1:");
        a= entradaTeclado.nextInt();
        System.out.println("Introduce cateto 2: ");
        b=entradaTeclado.nextInt();
        h=Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.println("La hipotenusa es:" + h);
       
    }
    }
    

