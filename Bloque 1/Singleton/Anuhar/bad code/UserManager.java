public class UserManager {

    private User[] users = new User[10];
    private int userCount = 0;

    private static class User {
        private String username;
        private String password;

        public User(String username, String password) {
            this.username = username;
            this.password = password;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }

    public void registerUser(String username, String password) {
        if (userCount < users.length) {
            users[userCount++] = new User(username, password);
            System.out.println("Usuario registrado");
        } else {
            System.out.println("Usuario no registrado");
        }
    }

    private User getUser(String username) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUsername().equals(username)) {
                return users[i];
            }
        }
        return null;
    }

    public boolean authenticate(String username, String password) {
        User user = getUser(username);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println("Autenticacion completada :)");
            return true;
        } else {
            System.out.println("Autenticacion incorrecta");
            return false;
        }
    }

    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        userManager.registerUser("Emilio", "tamobarcita123");
        userManager.registerUser("Andrés", "hola132");

        userManager.authenticate("Emilio", "tamorealVARdrid123");
        userManager.authenticate("Emilio", "tamobarcita123");

    }
}