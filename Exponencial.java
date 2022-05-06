/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gabriel_prevato
 */
import java.util.Scanner;

public class Exponencial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Insira um numero: ");
       Scanner input= new Scanner(System.in);
       int n=input.nextInt();
       int quad,cubo;
       quad=n*n;
       cubo=n*n*n;
       System.out.println("O valor ao quadrado: "+quad+" O numero ao cubo: "+ cubo);
    }
    
}
