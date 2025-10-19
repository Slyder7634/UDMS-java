import java.util.Scanner;

class Login {
    public void loginTypes(String logType, Scanner sc) {

        Verification obj2 = new Verification();

        if (logType.equalsIgnoreCase("Student")) {

            Extrafeatures.clearConsole();
            System.out.println("Welcome Dear Student!!");
            System.out.println("Please login...");

            System.out.printf("Enter your ID: ");
            int userIdInput = sc.nextInt();
            if(obj2.s_id_verify(userIdInput) == 1){
                System.out.println("Enter your password");
                sc.nextLine();
                String userPassInput = sc.nextLine();

                if(obj2.pass_verify(userPassInput)==1){
                    Extrafeatures.clearConsole();
                    System.out.println("Login successful for " + logType + " with ID " + userIdInput);
                }
                else{
                    System.out.println("\nIncorrect password");;
                }
            }
            else{
                System.out.println("\nStudent ID not found !");
            }

        } else if (logType.equalsIgnoreCase("Teacher")) {

            System.out.println("Welcome Dear Teacher!!");
            System.out.println("Please login...");

            System.out.print("Enter your ID: ");
            int userIdInput = sc.nextInt();


            System.out.print("Enter your password: ");
            String userPassInput = sc.nextLine();

            System.out.println("Login successful for " + logType + " with ID " + userIdInput);

        } else if (logType.equalsIgnoreCase("Employee")) {

            System.out.println("Welcome Dear Employee!!");
            System.out.println("Please login...");

            System.out.print("Enter your ID: ");
            int userIdInput = sc.nextInt();

            System.out.print("Enter your password: ");
            String userPassInput = sc.nextLine();

            System.out.println("Login successful for " + logType + " with ID " + userIdInput);

        } else {
            System.out.println("Invalid login type!");
            return;
        }


    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login obj1 = new Login();

        System.out.println("==Enter login type==\n");
        System.out.println("> Student");
        System.out.println("> Teacher");
        System.out.println("> Employee");

        String loginInput = sc.nextLine();
        obj1.loginTypes(loginInput, sc);

        sc.close();
    }
}
