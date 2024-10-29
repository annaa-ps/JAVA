public class Professor extends Pessoa {
    //Atributos
    private double salario;
    private String nomeCurso;

    //Getters
    public String getNomeCurso() {return nomeCurso;}
    public double getSalario() {return salario;}

    //Setters
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public double calcularSalarioLiquido(){
        return 0;
    }
}
