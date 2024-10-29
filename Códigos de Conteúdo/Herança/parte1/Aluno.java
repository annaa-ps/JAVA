public class Aluno extends Pessoa {
    //Atributos
    private String curso;
    private double[] notas;

    //Getters
    public double[] getNotas() { return notas;}
    public String getCurso() {return curso;}

    //Setters

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        return 0;
    }
    public boolean verificarAprovado(){
        return true;
    }
}
