package com.mycompany.salarios;

import java.util.Scanner;

public class Salarios {

    public static void main(String[] args) {
        classe ex = new classe();
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Bem vindo a calculadora de salários");
        System.out.println("Digite o seu salário atual");
       
        ex.salario = ler.nextDouble();
        
        if(ex.salario <= 280){
           
            ex.faixa1();
        
        }
        
        else if (ex.salario >280 && ex.salario <=700) {
            
            ex.faixa2();
        
        }
        
        else if (ex.salario >700 && ex.salario <1500) {
            
            ex.faixa3();
        
        }
        
        else if (ex.salario >=1500) {
            
            ex.faixa4();
        
        }
    }
}
