package recursos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PropriedadesDeUmNumero {
    
    private int numero;
    Scanner in = new Scanner(System.in);
    
    public void executar(){

        System.out.println("-----------------------------------------");
        System.out.println("---------------VERIFICADOR---------------");
        System.out.println("---PAR ou ÍMPAR e POSITIVO ou NEGATIVO---");
        System.out.println("-----------------------------------------\n");

        try{

            System.out.print("Digite um número: ");
            numero=in.nextInt();
            if(numero%2==0){
                System.out.print("\nO número ["+numero+"] é PAR");
            }else{
                System.out.print("\nO número ["+numero+"] é ÍMPAR");
            }
    
            if(numero<0){
                System.out.println(" e NEGATIVO!\n");
            }else{
                System.out.println(" e POSITIVO!\n");
            }
            
        }catch(InputMismatchException e){

            System.out.println("\nTalvez você não tenha digitado um número."+
            "Tente novamente.\n");

        }catch(Exception e){
            
            System.out.println("\nAlguma informação foi digitada indevidamente."+
            "Tente novamente.\n");

        }    
    }
}
