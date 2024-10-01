
package com.mycompany.salarios;

public class classe {
    
    public double salario, salarioNovo, aumentoReal;
    
    public void faixa1(){
        
        aumentoReal = salario * 0.2;
        salarioNovo= salario + (aumentoReal);
        System.out.println("Seu salário vai ser reajustado em 20%");
        System.out.println("O valor do aumento será de: R$"+ aumentoReal);
        System.out.println("O seu novo salário será: R$" + salarioNovo);
        
    }
    
    public void faixa2(){
    
        aumentoReal = salario * 0.15;
        salarioNovo= salario + (aumentoReal);
        System.out.println("Seu salário vai ser reajustado em 15%");
        System.out.println("O valor do aumento será de: R$" + aumentoReal);
        System.out.println("O seu novo salário será: R$" + salarioNovo);
    }
    
    public void faixa3(){
        
        aumentoReal = (salario*0.1);
        salarioNovo= salario + (aumentoReal);
        System.out.println("Seu salário vai ser reajustado em 10%");
        System.out.println("O valor do aumento será de: R$"+ aumentoReal);
        System.out.println("O seu novo salário será: R$" + salarioNovo);
    }
    
    public void faixa4(){
    
        aumentoReal = (salario*0.05);
        salarioNovo= salario + (aumentoReal);
        System.out.println("Digite o seu salário");
        System.out.println("Seu salário vai ser reajustado em 5%");
        System.out.println("O valor do aumento será de: R$"+ aumentoReal);
        System.out.println("O seu novo salário será: R$" + salarioNovo);
    }
}
