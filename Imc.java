/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author gabriel_prevato
 */
public class Imc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
       double alt,peso;
        System.out.println("Insira sua altura e peso: ");
        alt=input.nextDouble();
        peso=input.nextDouble();
        double imc=peso/(alt*alt);
        if(imc<18.5){
             System.out.println("abaixo do peso");
        }else if(imc>=18.5 && imc<=24.9){
             System.out.println("normal");
        }else if(imc >=25 && imc<=29.9){
             System.out.println("sobrepeso");
        }else{
             System.out.println("obeso");
        }
    }
    
}
