package refactory;

public class Authenticator {
    
    public boolean authenticate(UserManager manager,String username, String password) {
        User user = manager.getUser(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Autenticacion completada :)");
            return true;
        } else {
            System.out.println("Autenticacion incorrecta");
            return false;
        }
    }

}
