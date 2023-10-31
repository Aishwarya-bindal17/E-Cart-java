import java.util.Scanner;

public class SignUp {
     int MAX_USERS = 10;
     String usernames[];
     String passwords[];
     int userCount;

    public SignUp() {
        usernames = new String[MAX_USERS];
        passwords = new String[MAX_USERS];
        userCount = 0;
    }

    // Method to register a new user
    public boolean registerUser(String username, String password) {
        if (username != null && !username.isEmpty() && password != null && !password.isEmpty()) {
            if (userCount < MAX_USERS) {
                // Check if the username is already taken
                for (int i = 0; i < userCount; i++) {
                    if (usernames[i].equals(username)) {
                        return false; // User already exists
                    }
                }
                usernames[userCount] = username;
                passwords[userCount] = password;
                userCount++;
                return true; // User registered successfully
            }
        }
        return false; // Invalid username or password, or maximum users reached
    }

    // Method to check if a user with the given username exists
    public boolean userExists(String username) {
        for (int i = 0; i < userCount; i++) {
            if (usernames[i].equals(username)) {
                return true;
            }
        }
        return false;
    }

    // Method to authenticate a user
    public boolean authenticateUser(String username, String password) {
        for (int i = 0; i < userCount; i++) {
            if (usernames[i].equals(username) && passwords[i].equals(password)) {
                return true; // User authenticated successfully
            }
        }
        return false; // Authentication failed
    }
    public void display() {
        SignUp signUp = new SignUp();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sign-Up Page!");

        while (true) {
            System.out.print("Enter a username (or 'exit' to quit): ");
            String username = scanner.nextLine();

            if (username.equals("exit")) {
                break;
            }

            System.out.print("Enter a password: ");
            String password = scanner.nextLine();

            
            Customers c=new Customers();
              c.getData();
              c.display();
            
            if (signUp.registerUser(username, password)) {
                System.out.println("User registered successfully.");
            } else {
                System.out.println("User registration failed. Try a different username or check the password.");
            }
        }
        
        
        
        
        
       System.out.print("Enter your username to log in: ");
        String username = scanner.nextLine();
        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (signUp.authenticateUser(username, password)) {
            System.out.println("User authenticated successfully.");
        } else {
            System.out.println("User authentication failed.");
            
        }
    }
}
