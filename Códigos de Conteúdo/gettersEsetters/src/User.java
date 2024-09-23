public class User {

    //Propriedades (Private)
    private String firstName;
    private String lastName;

    //Setter: Função para alterar o conteúdo de uma variável
    public void setfirstName(String firstName){
        this.firstName = firstName.toUpperCase();
    }

    //Getter
    public String getfirstName(){
        return firstName;
    }
}


