public class Main {
    public static void main(String[] args) {
        Candidato candidato1 = new Candidato();
        Candidato candidato2 = new Candidato();
        Candidato candidato3 = new Candidato();

        // Usando os métodos "set" para definir as informações dos candidatos

        // Informações do primeiro candidato
        candidato1.setNomeCompleto("WESLEY CORDEIRO DE SOUZA");
        candidato1.setDataNascimento("05/11/1978");
        candidato1.setSexo("Masculino");
        candidato1.setTotalBens("249.675,08");
        candidato1.setReeleicao("Não");
        candidato1.setPartido(55);
        candidato1.setCargoPretendido("Prefeito");

        // Informações do segundo candidato
        candidato2.setNomeCompleto("ALCIONI DE OLIVEIRA LOBO CANDIDO");
        candidato2.setDataNascimento("18/03/1967");
        candidato2.setSexo("Feminino");
        candidato2.setTotalBens("10.000,00");
        candidato2.setReeleicao("Não");
        candidato2.setPartido(44234);
        candidato2.setCargoPretendido("Vereadora");

        // Informações do terceiro candidato
        candidato3.setNomeCompleto("FERNANDA DO JOAQUIM");
        candidato3.setDataNascimento("13/01/1984");
        candidato3.setSexo("Feminino");
        candidato3.setTotalBens("11.000,00");
        candidato3.setReeleicao("Sim");
        candidato3.setPartido(55555);
        candidato3.setCargoPretendido("Vereadora");

        // Exibindo informações da cidade referente ao código
        System.out.println("\nInformações da Cidade dos Candidatos:");
        System.out.println("----------------------------------------------");
        System.out.println("Matrícula: 1221BCC046");
        System.out.println("Código: [046]");
        System.out.println("Cidade: Astolfo Dutra/MG - Código: 3104601");
        System.out.println("----------------------------------------------");

        // Exibindo informações dos candidatos
        System.out.println("\nInformações dos candidatos:");
        candidato1.exibirInformacoes();
        candidato2.exibirInformacoes();
        candidato3.exibirInformacoes();
    }
}
