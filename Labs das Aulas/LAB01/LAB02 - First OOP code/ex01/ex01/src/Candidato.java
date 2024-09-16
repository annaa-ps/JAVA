public class Candidato {
        String nomeCompleto;
        String dataNascimento; // Mantido como int, mas note que não é o ideal para armazenar datas
        String sexo;        // Mantido como "sexo"
        String totalBens;
        String reileicao;   // Mantido como String
        int partido;
        String cargoPretendido;


        // Método para exibir as informações do candidato
        public void exibirInformacoes() {
                System.out.println("Nome Completo: " + nomeCompleto);
                System.out.println("Data de Nascimento: " + dataNascimento);
                System.out.println("Sexo: " + sexo);
                System.out.println("Total de Bens: R$" + totalBens);
                System.out.println("Candidato à Reeleição: " + reileicao);
                System.out.println("Número do Partido: " + partido);
                System.out.println("Cargo Pretendido: " + cargoPretendido);
                System.out.println("--------------------------------------");
        }
}

