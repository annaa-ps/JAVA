public class User {

    private String firstName;
    private String lastName;

    //Construtor
    public User(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Setters
    public void setFirstName(String firstName){
        this.firstName = firstName.toUpperCase();
    }

    public void setLastName(String lastName){
        this.lastName = lastName.toUpperCase();
    }

    //Getters
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
}
