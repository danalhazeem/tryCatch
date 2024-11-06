import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String validUsername = "Coded";
        String validPassword = "Coded123";

        boolean isAoth = false;

        int maxAttempts = 5;

//        while (!isAoth){
//            try{
//                System.out.println("Enter your User name");
//                String userName = scanner.nextLine();
//
//                System.out.println("Enter your password");
//                String password = scanner.nextLine();
//
//                if (userName.equals(validUsername) &&password.equals(validPassword)){
//                     isAoth = true;
//                }
//                else {
//                    System.out.println("Incorrect username or password. Please try again.");
//                }
//
//            } catch (Exception e) {
//                System.out.println("An error occurred. Please try again.");
//            }}

        for(int attempt = 1; attempt <= maxAttempts; attempt++){
            try{
                System.out.println("Enter your User name");
                String userName = scanner.nextLine();

                System.out.println("Enter your password");
                String password = scanner.nextLine();

                if (userName.equals(validUsername) &&password.equals(validPassword)){
                    break;

                }
                else {
                    System.out.println("Incorrect username or password. Please try again.\n");
                }

            } catch (Exception e) {
                System.out.println("An error occurred. Please try again.");
            }
        }


        scanner.close();
    }
}