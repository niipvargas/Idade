package idade;

import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
         Scanner entrada;
            int idade;
            entrada = new Scanner(System.in);
                       
                System.out.println("Informe a idade: ");
                idade = entrada.nextInt();
                       
                if(idade < 11){
                    System.out.println("Criança");
                        }
                if(idade >= 12 && idade <= 17){
                    System.out.println("Adolescente");
                        }
                if(idade > 18 && idade <= 59){
                    System.out.println("Adulto");
                        }
                 if(idade >= 60){
                    System.out.println("Idoso");
                        }
            }
} 
    
    

