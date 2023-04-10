package javacourse.bruno.POO;

/*
Atributos - características: 
- nome (string)
- ra (integrer)
- curso (string)
- notas (a1, a2, a3) (double)
- presença (booleano ou double)

Métodos - Ações: (fora para dentro do objeto)
- criar aluno - criarAluno()
    como argumentos/parâmetros:
    - fornecer o seu nome (getNome - string)
    - fornecer o seu RA (getRA - integrer)
    - fornecer o curso (getCurso - string)
- pegar as notas (getA1, setA1 (para A2 e A3 também))
    - getNotas() - vai retornar A1, A2, A3
- pegar as presenças - (getPresenca, setPresenca)
- identificar se está aprovado ou não (getAprovadoouNao)

 @author katerinelindawitkoski
 */
public class Aula1004BrunoPOO {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 
        Aluno joaozinho = new Aluno("Joaozinho", 1235645677, "CC");
        Aluno maria = new Aluno("Maria", 1637283928, "ADS");
      
        System.out.println(joaozinho.getNome());
        
    }
    
    
}
