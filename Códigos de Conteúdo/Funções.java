public class Funcoes {

    public static void main (String[] args){
        sum(10, 5); //(argumentos)
    }

    //Função para fazer operações com números
    //static void -> declaração padrão
    //sum -> Nome da função (poderia ser qualquer outro nome)
    //() -> Parenteses usamos para definir o que chegará naquela função(parametros) 
    //(Tipo nomeDaVariável)
    // {} -> bloco de código que será executado
    static void sum(int x, int y){
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
    }

}
