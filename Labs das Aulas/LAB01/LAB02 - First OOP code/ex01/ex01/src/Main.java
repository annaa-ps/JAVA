import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Candidato candidato1 = new Candidato();
        Candidato candidato2 = new Candidato();
        Candidato candidato3 = new Candidato();S


        //Informações do primeiro candidato
        candidato1.nomeCompleto = "WESLEY CORDEIRO DE SOUZA";
        candidato1.dataNascimento = "05/11/1978";
        candidato1.sexo = "Masculino";
        candidato1.totalBens = "249.675,08";
        candidato1.reileicao = "Não";
        candidato1.partido = 55;
        candidato1.cargoPretendido = "Prefeito";

        //Informações do segundo candidato
        candidato2.nomeCompleto = "ALCIONI DE OLIVEIRA LOBO CANDIDO";
        candidato2.dataNascimento = "18/03/1967";
        candidato2.sexo = "Feminino";
        candidato2.totalBens = "10.000,00";
        candidato2.reileicao = "Não";
        candidato2.partido = 44234;
        candidato2.cargoPretendido = "Vereadora";

        //Informações do terceiro candidato
        candidato3.nomeCompleto = "FERNANDA DO JOAQUIM";
        candidato3.dataNascimento = "13/01/1984";
        candidato3.sexo = "Feminino";
        candidato3.totalBens = "11.000,00";
        candidato3.reileicao = "Sim";
        candidato3.partido = 55555;
        candidato3.cargoPretendido = "Vereadora";


        //Exibindo informações da cidade referente ao codigo
        System.out.println("\nInformações da Cidade dos Candidatos:");
        System.out.println("----------------------------------------------");
        System.out.println("Matrícula: 1221BCC046");
        System.out.println("Código: [046]");
        System.out.println("Cidade: Astolfo Dutra/MG - Código: 3104601");
        System.out.println("----------------------------------------------");

        //Exibindo informações dos candidatos
        System.out.println("\nInformações dos candidatos:");
        candidato1.exibirInformacoes();
        candidato2.exibirInformacoes();;
        candidato3.exibirInformacoes();

    }
}
