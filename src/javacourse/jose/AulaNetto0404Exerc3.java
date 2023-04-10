package javacourse.jose;
import java.util.Random; 



/**
 *
 * @author nathalietaylor
 */
public class AulaNetto0404Exerc3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/**
 * Exercício: Sorteie 10 números inteiros e armazene-os em um vetor; Percorra o vetor e encontre o menor elemento; Sorteie números entre 1 e 10.
 */

// 1) sortear os numeros: 

 Random random = new Random();


int sorteado = random.nextInt();

int[] vetorSorteados = new int[10];
int tamanho = vetorSorteados.length;

for (int i=0; i<tamanho; i++){
    vetorSorteados[i] = random.nextInt(10);
    System.out.println("O " + (i+1) + " numero sorteado e " + vetorSorteados[i]);

// encontrar o menor elemento:

/*if(menor < sorteado ){
  menor = sorteado.nextInt;
  
  
 // acrescentar variavel menor int 0
 //+ loop
}
  */ 
        }
 
    }

}