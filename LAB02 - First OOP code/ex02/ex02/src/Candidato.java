public class Candidato {

    private String nomeCompleto;
    private String dataNascimento;
    private String sexo;
    private String totalBens;
    private String reeleicao;
    private int partido;
    private String cargoPretendido;

    // Métodos Set (alterar valores)
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setTotalBens(String totalBens) {
        this.totalBens = totalBens;
    }

    public void setReeleicao(String reeleicao) {
        this.reeleicao = reeleicao;
    }

    public void setPartido(int partido) {
        this.partido = partido;
    }

    public void setCargoPretendido(String cargoPretendido) {
        this.cargoPretendido = cargoPretendido;
    }

    // Métodos Get (acessar valores)
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getTotalBens() {
        return totalBens;
    }

    public String getReeleicao() {
        return reeleicao;
    }

    public int getPartido() {
        return partido;
    }

    public String getCargoPretendido() {
        return cargoPretendido;
    }

    public void exibirInformacoes(){
        System.out.println("Nome Completo: " + getNomeCompleto());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Sexo: " + getSexo());
        System.out.println("Total de Bens: R$" + getTotalBens());
        System.out.println("Candidato à Reeleição: " + getReeleicao());
        System.out.println("Número do Partido: " + getPartido());
        System.out.println("Cargo Pretendido: " + getCargoPretendido());
        System.out.println("--------------------------------------");
    }

}
