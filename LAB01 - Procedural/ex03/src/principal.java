import java.util.Scanner;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);
    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
    }

    public static void ex03() {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        for (int i = 0; i < 6; i++){
            System.out.printf("Informe o %d número: \n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são: ");
        for(int i = 0; i < 6; i++){
            System.out.printf("%d ", vet[i]);
        }

        System.out.println("\nOs valores lidos na ordem inversa: ");
        for(int i = 5; i >= 0; i--){
            System.out.printf("%d ", vet[i]);
        }
    }

    public static void ex04(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        int i = 0;

        while (i < 6){
            System.out.printf("Informe o %dº número par: \n", i + 1);
            int num = sc.nextInt();

            if (num % 2 == 0){
                vet[i] = num;
                i++;
            }else{
                System.out.println("Número inválido! Digite um número par");
            }
        }

        System.out.println("\nOs valores lidos são: ");
        for(i = 0; i < 6; i++){
            System.out.printf("%d ", vet[i]);
        }

        System.out.println("\n\nOs valores lidos na ordem inversa: ");
        for(i = 5; i >= 0; i--){
            System.out.printf("%d ", vet[i]);
        }

    }

    public static void ex05(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int maior, menor, i;
        double soma = 0;

        for(i = 0; i < 5; i++){
            System.out.printf("Informe o %dº número: ", i + 1);
            vet[i] = sc.nextInt();
            soma += vet[i];
        }

        maior = vet[0];
        menor = vet[0];

        for (i = 0; i < 5; i++){
            if(vet[i] > maior){
                maior = vet[i];
            }
            if(vet[i] < menor){
                menor = vet[i];
            }
        }

        double media = soma / 5;

        System.out.println("\nOs número digitados são: ");
        for(i = 0; i < 5; i++){
            System.out.printf("%d ", vet[i]);
        }

        System.out.printf("\n\nO maior valor é: %d", maior);
        System.out.printf("\nO menor valor é: %d", menor);
        System.out.printf("\nA média dos valores é: %f", media);
    }

    public static void ex06(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int maior, menor, i, indiceMaior, indiceMenor;
        double soma = 0;

        for(i = 0; i < 5; i++){
            System.out.printf("Informe o %dº número: ", i + 1);
            vet[i] = sc.nextInt();
            soma += vet[i];
        }

        maior = vet[0];
        menor = vet[0];
        indiceMaior = 0;
        indiceMenor = 0;

        for (i = 0; i < 5; i++){
            if(vet[i] > maior){
                maior = vet[i];
                indiceMaior = i;
            }
            if(vet[i] < menor){
                menor = vet[i];
                indiceMenor = i;
            }
        }

        double media = soma / 5;

        System.out.println("\nOs número digitados são: ");
        for(i = 0; i < 5; i++){
            System.out.printf("%d ", vet[i]);
        }

        System.out.printf("\n\nO maior valor é: %d, na posição %d do vetor", maior, indiceMaior);
        System.out.printf("\nO menor valor é: %d, na posição %d do vetor", menor, indiceMenor);
        System.out.printf("\nA média dos valores é: %.2f", media);

    }

    public static void ex07() {
        Scanner sc = new Scanner(System.in);
        int[] notas = new int[5];
        int maiorNota = 0;

        System.out.println("<<Normalizando as notas>>");
        for (int i = 0; i < 5; i++) {
            System.out.printf("Entre com a nota do aluno %d: ", i + 1);
            notas[i] = sc.nextInt();

            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }

        System.out.println("\nNotas normalizadas:");
        for (int i = 0; i < 5; i++) {
            int notaNormalizada = (notas[i] * 100) / maiorNota;
            System.out.printf("A nota do aluno %d é %d\n", i + 1, notaNormalizada);
        }
    }

    public static void ex08() {
        Scanner sc = new Scanner(System.in);
        double[] vet = new double[5];
        double soma = 0;
        int N = 5;

        System.out.println("<< Média e desvio-padrão >>");
        for (int i = 0; i < N; i++) {
            System.out.printf("Digite o valor %d: ", i + 1);
            vet[i] = sc.nextDouble();
            soma += vet[i];
        }

        double media = soma / N;

        double somaDesvios = 0;
        for (int i = 0; i < N; i++) {
            somaDesvios += Math.pow(vet[i] - media, 2);
        }

        double desvioPadrao = Math.sqrt(somaDesvios / (N - 1));

        System.out.printf("A média é %.2f e o desvio-padrão é %.14f\n", media, desvioPadrao);
    }

    public static void ex09(){
        Scanner sc = new Scanner(System.in);
        int  i;

        System.out.println("<< Média de n alunos.Máximo 100 alunos >>");

        System.out.println("\nQual é o número de alunos");
        int numAlunos = sc.nextInt();

        if (numAlunos > 100){
            System.out.println("Erro! O número mázimo de alunos permitidos é 100");
            return;
        }

        double[] notas = new double[numAlunos];
        double soma = 0;

        for(i = 0; i < numAlunos; i++){
            System.out.printf("Informe a nota do aluno %d: ", i + 1);
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double media = soma / numAlunos;

        System.out.println("\nRelatório de Notas");
        for(i = 0; i < numAlunos; i++){
            System.out.printf("A nota do aluno %d é: %.2f\n", i, notas[i]);
        }

        System.out.printf("\nA média da turma é: %.2f\n", media);
    }

    public static void ex10(){
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];
        int[] B = new int[3];
        int[] C = new int[3];
        int i;

        System.out.println("<< Subtração de vetores >>\n");

         for(i = 0; i < 3; i++){
             System.out.printf("Informe o valor %dº de A: ", i + 1);
             A[i] = sc.nextInt();
        }

        for(i = 0; i < 3; i++){
            System.out.printf("Informe o valor %dº de B: ", i + 1);
            B[i] = sc.nextInt();
        }

        for(i = 0; i < 3; i++){
            C[i] = A[i] - B[i];
        }

        System.out.println("\nO vetor C, definido como C = A - B, é:");
        for(i = 0; i < 3; i++){
            System.out.print(C[i]);
            if(i < 2){
                System.out.printf(", ");
            }
        }
    }

    public static void ex11(){
        Scanner sc = new Scanner(System.in);
        int[] v = new int[5];
        int[] v1 = new int[5];
        int[] v2 = new int[5];
        int countV1 = 0, countV2 = 0, i;

        System.out.println("<< Pares e ímpares>>\n");
        for(i = 0; i < 5; i++){
            System.out.printf("Digite o %dº valor: \n", i+1);
            v[i] = sc.nextInt();
        }

        for(i = 0; i < 5; i++){
            if(v[i] % 2 == 0){
                v2[countV2] = v[i];
                countV2++;
            }else{
                v1[countV1] = v[i];
                countV1++;
            }
        }

        System.out.println("\nÍmpares: ");
        for(i = 0; i < countV1; i++){
            System.out.print(v1[i]);
            if (i < countV1 - 1){
                System.out.print(", ");
            }
        }

        System.out.println("\nPares: ");
        for(i = 0; i < countV2; i++){
            System.out.print(v2[i]);
            if (i < countV2 - 1){
                System.out.print(", ");
            }
        }

    }

    public static void ex12() {
        Scanner sc = new Scanner(System.in);

        int verde, azul, amarela, vermelha, totalBolaas;

        System.out.println("Informe a quantidade de bolinas");
        System.out.print("Verde: ");
        verde = sc.nextInt();
        System.out.print("Azul: ");
        azul = sc.nextInt();
        System.out.print("Amarela: ");
        amarela = sc.nextInt();
        System.out.print("Vermelha:");
        vermelha = sc.nextInt();

        totalBolaas = verde + azul + amarela + vermelha;

        double probVerde = (verde / (double) totalBolaas)*100;
        double probAzul = (azul / (double) totalBolaas)*100;
        double probAmarela = (amarela / (double) totalBolaas)*100;
        double probVermelha = (vermelha / (double) totalBolaas)*100;

        System.out.println("\nProbabilidades");
        System.out.printf("Verde: %.2f%%\n", probVerde);
        System.out.printf("Azul: %.2f%%\n", probAzul);
        System.out.printf("Amarela: %.2f%%\n", probAmarela);
        System.out.printf("Vermelha: %.2f%%\n", probVermelha);

        String corMaiorProbabilidade = "Verde";
        double maiorProbabilidade = probVerde;

        if (probAzul > maiorProbabilidade) {
            corMaiorProbabilidade = "Azul";
            maiorProbabilidade = probAzul;
        }
        if (probAmarela > maiorProbabilidade) {
            corMaiorProbabilidade = "Amarela";
            maiorProbabilidade = probAmarela;
        }
        if (probVermelha > maiorProbabilidade) {
            corMaiorProbabilidade = "Vermelha";
            maiorProbabilidade = probVermelha;
        }

        // Exibir a maior probabilidade
        System.out.printf("<< Maior probabilidade: %s >>\n", corMaiorProbabilidade);

    }

    public static void ex13(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[5];
        int i;

        System.out.println("<< Zerando negativos >>");

        for(i = 0; i < 5; i++){
            System.out.printf("Informe o %dº número: ", i+1);
            vet[i] = sc.nextInt();
        }

        for(i = 0; i < 5; i++){
            if(vet[i] < 0){
                vet[i] = 0;
            }
        }
        System.out.println("\nZerando os negativos, obtém-se: ");
        for(i = 0; i < 5; i++){
            System.out.print(vet[i] + " ");
        }
    }

    public static void ex14(){
        Scanner sc = new Scanner(System.in);
        int maxAlunos = 10000;
        int i;

        System.out.println("<< Universidade X >>");
        System.out.print("Quantos alunos serão cadastrados: ");
        int numAlunos = sc.nextInt();


        if (numAlunos > maxAlunos) {
            System.out.println("O número máximo de alunos é 10.000.");
            return;
        }

        int[] matricula = new int[numAlunos];
        char[] classeSocial = new char[numAlunos];
        double[] cra = new double[numAlunos];


        for (i = 0; i < numAlunos; i++) {
            System.out.print("\nEntre com o número do aluno: ");
            matricula[i] = sc.nextInt();
            sc.nextLine();

            System.out.printf("Entre com a classe social do aluno %d (A, B, C, D, E): ", matricula[i]);
            classeSocial[i] = sc.next().charAt(0);

            System.out.printf("Entre com o CRA do aluno %d: ", matricula[i]);
            cra[i] = sc.nextDouble();
        }

        System.out.println("\n==== Alunos Cadastrados ====");
        for (i = 0; i < numAlunos; i++) {
            System.out.printf("Número: %d Classe Social: %c CRA: %.2f\n", matricula[i], classeSocial[i], cra[i]);
        }
    }

    public static void ex15(){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[8];
        boolean[] repetido = new boolean[8];

        System.out.println("<< Valores iguais >>");

        for (int i = 0; i < 8; i++) {
            System.out.printf("Entre com o número %d: ", i + 1);
            vetor[i] = sc.nextInt();
        }

        System.out.print("\nValores repetidos: ");


        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 8; j++) {
                if (vetor[i] == vetor[j] && !repetido[i]) {
                    System.out.print(vetor[i] + " ");
                    repetido[j] = true;
                    repetido[i] = true;
                    break;
                }
            }
        }

        System.out.println();
    }

    public static void ex16(){
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[8];
        boolean[] contado = new boolean[8];

        System.out.println("<< Valores iguais >>");

        for (int i = 0; i < 8; i++) {
            System.out.printf("Entre com o número %d: ", i + 1);
            vetor[i] = sc.nextInt();
        }

        System.out.println("\nValores repetidos:");

        for (int i = 0; i < 8; i++) {
            if (!contado[i]) {  // Se o valor ainda não foi contado
                int contagem = 1;
                for (int j = i + 1; j < 8; j++) {
                    if (vetor[i] == vetor[j]) {
                        contagem++;
                        contado[j] = true;  // Marca as posições já contadas
                    }
                }
                if (contagem > 1) {  // Se o número apareceu mais de uma vez
                    System.out.printf("%d aparece %d vezes\n", vetor[i], contagem);
                }
            }
        }
    }


    public static void main(String[] args) {
<<<<<<< HEAD
        // ex01();
        //ex02();
        //ex03();
        //ex04();
        //ex05();
        //ex06();
        //ex07();
        //ex08();
        //ex09();
        //ex10();
        //ex11();
        //ex12();
        //ex13();
        //ex14();
        //ex15();
        //ex16();
=======
        //ex01();
        ex02();
        //ex03();
>>>>>>> 410c8d194ee74c713f6bc5eb9b4c6d54659a1bed
    }

}
