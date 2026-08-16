import java.util.Scanner;

public class principal {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        caminhos.inicio();
        int resposta = scanner.nextInt();
            if        (resposta == 1) {
            caminhos.caminhoDireita();
            } else if (resposta == 2) {
                caminhos.CaminhoFrente();
                int caminhofrente2 = scanner.nextInt();
                if (caminhofrente2 == 1){
                   String s = """
                            Você decide sair correndo, suas pernas nunca se mecheram tão rapído, a adrenalina no seu corpo fazendo com que você
                            quase consiga correr mais rapido do que os lobos atrás de você, mas conforme você corria, mais perto eles ficavam, então,
                            mais dois caminhos apareceram diante de você.
                            
                            1. seguir a direita.
                            2. seguir a esquerda.
                            """;
                   int caminhoFrente3 = scanner.nextInt();
                   if (caminhoFrente3 == 1){
                       String caminho3 = """
                               você vira a direita rapidamente, na esperança de despistar os lobos atrás de você, mas você se encontra encuralado
                               diante de um penhasco, você está diante de 6 lobos, você sabia que ia perder, então você se joga.
                               
                               final do penhasco.
                               """;
                   } else if (caminhoFrente3 == 2) {
                       String caminho3 = """
                               você decide virar a esquerda, o q    ue parecia não ser o melhor caminho a seguir se mostrou ser o certo, dois guardas
                               armados estavam procurando da onde vinha aquele barulho, e quando te viram, correndo daqueles lobos, logo começaram
                               a atirar neles, você via os tiros passar por você, e finalmente, depois de uma longa conversa com os guardas, você 
                               estava a salvo.
                               
                               final da corrida.
                               """;
                   }

                    System.out.println(s);
                    scanner.nextInt();
                }else if (caminhofrente2 == 2){
                    String s = """
                            você rapidamente vasculha o local apenas com os olhos, você vê uma arma dentro de uma cabana, e você rapidamente se equipa
                            com ela, você atira repetidamente, dois lobos caem, e o resto se assusta com o som de tiro, depois de um tempo, o barulho 
                            dos tiros atraem um guarda florestal local, que te leva junto a ele para a cabana dele, depois de uma noite mal dormida, 
                            você finalmente está seguro.
                            
                            final da arma.
                            """;
                    System.out.println(s);
                }
            } else if (resposta == 3) {
                caminhos.CaminhoEsquerda();
                int caminhoEsquerda2 = scanner.nextInt();
                if (caminhoEsquerda2 == 1){
                    String s = """
                            você - "eu estava andando por lá atrás de um amigo meu que desapareceu, mas infelizmente não achei ele, e consegui 
                            voltar em segurança para cá, mas a floresta é bem perigosa nesse horario, mas acho que agora está tudo bem"
                            
                            senhor - "hmm não sei se acredito em você, um homen adulto, correndo pela floresta sozinho, onde estão as outras pessoas
                            que estavam com você?"
                            
                            você - "todos eles ficaram lá, agora, se você puder me ajudar a me recuperar, talvez amanhã eu posso olhar por eles, 
                            você faria esse favor a mim?
                            
                            senhor - "hm, sei, vou te ajudar moloque, mas não ache que eu vou fazer isso de novo ouviu?"
                            
                            você - "muito obrigado"
                            
                            final da mentira
                            """;
                    System.out.println(s);
                } else if (caminhoEsquerda2 == 2) {
                    String s = """
                            você - eu matei alguem, dentro da floresta, eu matei meu amigo.
                            
                            senhor - ... por que? por que você fez isso!?
                            
                            você - ele me traiu, ele sacrificou nossa amizade, ele fez algo que não deveria, e eu o puni com minhas proprias mãos
                            
                            senhor - Deus do céu, saia daqui agora!
                            o senhor fala isso apontando a sua espingarda na sua cara.
                            
                            você ri, e sai andando do local, você sabe o que fez, você sabe, muito bem como você o matou.
                            
                            final da verdade
                            """;

                }
            }
    }
}

