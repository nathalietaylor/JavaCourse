/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacourse;
import java.util.Scanner;

/**
 *
 * @author katerinelindawitkoski
 */
public class Aula1403JoseSwith {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===== Menu de opcoes =====");
        System.out.println(" 1 - Cadastrar produtos ==");
        System.out.println(" 2 - Lista de produtos ===");
        System.out.println(" 3 - Sair do sistema =====");
        System.out.println("=== Escolha uma opcao ====");
       
        Scanner entrada = new Scanner(System.in);
        
        int menu = entrada.nextInt();
        
        switch(menu){
            case 1:
                System.out.println("Voce escolher o menu 1");
                System.out.println("Que eh a opcao cadastrar produtos");
                break;
            case 2:
                System.out.println("Voce escolher o menu 1");
                System.out.println("Que eh a opcao cadastrar produtos");
                break;
            case 3:
                System.out.println("Voce escolher o menu 1");
                System.out.println("Que eh a opcao cadastrar produtos");
                break;
            default:
                System.out.println("Item de menu invalido");
        }
        
        entrada.close();
    }
    
}
