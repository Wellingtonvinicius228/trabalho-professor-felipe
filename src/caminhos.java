public class caminhos {
    int resposta;
    static void caminhoDireita()
    {
        String caminhoDireita =
                        """
                        você decidiu seguir pela direita, o caminho começou a ficar mais e mais curto, com as arvores da floresta cada vez mais densas,
                        o que parecia ser o começo de um pesadelo, se tornou diante de seus olhos a sua salvação, uma cabana na sua frente,
                        um lugar perfeito para repousar a noite, você decidiu entrar, não havia vestigio de ninguem lá, sem muitas opções decidiu passar
                        a noite lá, um tempo se passou, e você acordou com a luz do sol invadindo uma das janelas da cabana, você sobreviveu.
                        
                        final bom.
                        """;
        System.out.println(caminhoDireita);
    }
    static void inicio(){
        System.out.println("\n");
        String texto = """
                ***********************************************************************************
                +                       trabalho do professor felipe                              +
                +   integrantes: Wellington vinicius, davi de oliveira, davi de souza, valmir,    +
                +                henrique mosart, lucas theodoro, gabriel messias                 +
                +                                                                                 +
                +                            "perdido na floresta"                                +
                +                                                                                 +
                +                                     :)                                          +
                ***********************************************************************************
                
                
                
                
                
                você caminha diante do que parece ser uma floresta, densa, escura, o lugar é umido, e silencioso,
                você sente a impressão de que algo ruim pode acontecer a qualquer momento, o luar ilumina seu rosto,
                e revela adiante de seus olhos 3 caminhos.
                
                1. seguir a direita.
                2. seguir em frente.
                3. seguir a esquerda.
                """;
        System.out.println(texto);
        System.out.println("\n");

    }

    static void CaminhoFrente() {
        String Caminhofrente = """
                você decidiu continuar em frente, o caminho parecia ser o mais iluminado, mas conforme você avançava, parecia que o caminho ficava
                mais perigoso, pedras onde você teve que se equlibrar, e pular por cima de troncos, lugares a beira de um penhasco, tudo isso enquanto
                você seguia em frente, enfrentava o desconhecido como um soldado, até que você chega em um lugar, parecia ser um acampamento abandonado,
                quando chegou no local, mal teve tempo de analisar a situação, antes que um lobo derrepente aparecesse, com a boca toda ensanguentada,
                começou a ouivar, gritando por sua alcateia, rapidamente você toma uma decisão.
                
                1. sair correndo
                2. procurar algo para lutar
                """;
        System.out.println(Caminhofrente);
        System.out.println("\n");
    }
    static void CaminhoEsquerda(){
        String caminhoEsquerda = """
                        você seguiu pela esquerda, o caminho era calmo, e tranquilo, você até achou um rio, e decidiu o seguir, você demorou em torno de 2 horas
                        até achar uma cidade, você decidiu ir em direção a ela, até que chegou em um posto, com sede e fome, você pediu informação e qualquer coisa
                        de comer para um senhor que sentava naquele lugar com uma espingarda na mão, e ele te pergunta algo.
                        
                        "o que você andou fazendo para chegar até aqui? a floresta é estreitamente proibida a entrada, e como conseguiu sair de lá? não vi ninguem
                        entrar e sair vivo de lá"
                        
                        1. mentir
                        2. contar a verdade
                        """;
        System.out.println(caminhoEsquerda);
        System.out.println("\n");
    }
}
