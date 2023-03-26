
import java.util.Scanner;
public class Library {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Loading...");
        System.out.print("Enter number of possible members: ");
        int arraySize = scanner.nextInt();
        try {
            Thread.sleep(2000); // delay for 2 seconds
        } catch (InterruptedException e) {
            // handle exception
        }
        while(true){
            mainMenu();
            int choice = scanner.nextInt();
            if(choice <=1 && choice >=5){
               switch (choice){
                   case 1

               }
            }else{
                System.out.println("Please select the correct number");
                System.out.print("\033[H\033[2J");
                continue;

            }
        }


    }
      public static void mainMenu(){
            System.out.print("\033[H\033[2J");
            System.out.println("1) Add Member");
            System.out.println("2) Show Member");
            System.out.println("3) Edit Member");
            System.out.println("4) Delete Member");
            System.out.println("5) Exit");
            System.out.print("Please enter a number between 1 and 5 : ");
    }
}