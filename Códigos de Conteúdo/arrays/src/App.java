public class App {

    public static void main(String[] args){
        User[] users = new User[10];
        // x | x | x | x | x |...

        for(int i=0; i < users.length;i++){
            User actual = new User();
            actual.setfirtsName("Nome " + i);
            actual.setlastName("Sobrenome " + i);
            users[i] = actual;
        }

        System.out.println(users[2].getfirtsName());
        System.out.println(users[2].getlastName());
    }
}
