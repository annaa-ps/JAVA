import java.util.Random;

public class MegaSena {

    public static void main(String[] args){
        Random generate = new Random();

        //while(true) -> looping infinito
        //while(com expressão) -> looping com saída

        int i = 0;
        while(i < 6){
            //Gerando numero aleatório até 60 e armazenando na variável number
            int number = generate.nextInt(60);
            System.out.println(number);
            i++; // é igual a i = i+1
        }

        //Também é possível fazer o conceito de looping utilizando for
        //int i = 0;
        //for(i = 0;i<6; i++){
            //Gerando numero aleatório até 60 e armazenando na variável number
            //int number = generate.nextInt(60);
            //System.out.println(number);
        //}
    }
}
