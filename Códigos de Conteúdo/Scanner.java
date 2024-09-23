import java.util.Scanner;

public class MegaSena {

    public static void main(String[] args){
        //o Scanner é uma classe/objeto do Java que permite a interação com ele
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome:");

        //O nextLine espera que o usuário faz o input de um novo dado
        String name = scanner.nextLine();
        
        //O + concatena o texto mais o conteúdo da variável
        System.out.println("Olá, " + name);
    }
}
