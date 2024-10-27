public class User {
    //Propriedades (private)
    private String firstName;
    private String lastName;

    //set - significa alterar
    //SETTERS
    public void setFirstName(String firstName){
        this.firstName = firstName.toUpperCase();
    }

    //GETTER
    public String getFirstName(){
        return firstName;
    }

}
