/*
Palavra secreta = bruno
- n letras; n tentativas; n acertos (6 tentativas)
Passos para o jogo:
- Digita 1 letra (scanner)
- Verifica se a letra existe (eu vou ter que criar um vetor tipo palavra "char" e testar)
- Se existe mostra na resposta (vetor resposta, precisa comparar com equals ou ==)
- Senão perde 1 tentativa
- Até acertar tudo ou perder tudo

 */
package javacourse.bruno;
import java.util.Scanner;

/**
 *
 * @author katerinelindawitkoski
 */
public class Aula0805BrunoForca {

    public static char[] carregaPalavra(){
        String[] listaPalavras = new String[10]; // matriz de caracteres

        listaPalavras[0] = "bruno";
        listaPalavras[1] = "artes";
        listaPalavras[2] = "carro";
        listaPalavras[3] = "prova";
        listaPalavras[4] = "vidro";

        int linha = (int)(4*Math.random()); // converter para inteiro pq a resposta do math.random é real.

        char[] resposta = new char[5];

        for (int i = 0; i < 5; i++){
            resposta[i] = listaPalavras[linha].charAt(i);
        }

        return resposta;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] palavra = carregaPalavra(); // palavra certa
        char[] resposta = new char[palavra.length]; // pega sempre o novo tamanho da palavra
        for (int i = 0; i < palavra.length; i++){
            resposta[i] = '-';
        }

        char letra = ' '; // char é aspas simples

        int nLetras = palavra.length; // conta o número de letras em palavra
        int nErros = 6;
        int nAcertos = 0;


        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Digite uma letra: ");
            letra = ler.nextLine().charAt(0);
            int temp = 0; // para testar o número de erros

            for (int i = 0; i < nLetras; i++){
                if(letra == palavra[i] && (letra != resposta[i])){
                    nAcertos = nAcertos + 1;
                    resposta[i] = letra;
                }else {
                    temp = temp + 1;
                }
            }
            if (temp ==nLetras){
                nErros = nErros -1;
                System.out.println("Você errou!!");
            }else {
                System.out.println("Acertou!!");
            }// primeiro eu declado o i (inicialização) e testo ele (condição do for) ; e o i++ (é o contador, ele adiciona)
            // --- para cada jogada percorra o vetor
            System.out.println(resposta);
            System.out.println("Número de erros disponiveis: " +nErros);
        }while((nErros > 0) && (nAcertos < nLetras)); // enquanto o cara não puder tentar de novo e for menor que o número de letras
        
    }
    
}
