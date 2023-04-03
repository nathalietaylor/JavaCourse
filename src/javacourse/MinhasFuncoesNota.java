/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javacourse;

/**
 *
 * @author katerinelindawitkoski
 */
public class MinhasFuncoesNota {
    // função que verifica a validade da nota:
    public static boolean verificaNota(double nota){ // variavel dentro da funcao
        if((nota < 0) || (nota > 10)){
            return false;
        } else {
            return true;
        }    
    }
    
    // função que calcula a media
    public static double calculaMedia(double[] notas, double[] peso){ 
        double notaFinal = 0;// variavel dentro da funcao
        for(int i = 0; i < 3; i ++){
            notaFinal = notaFinal + notas[i]*peso[i];
        }
        return notaFinal;
    }
}
