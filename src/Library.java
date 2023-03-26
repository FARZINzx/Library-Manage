
import java.util.Scanner;
public class Library {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Loading...");
        System.out.print("Enter number of possible members: ");
        int arraySize = scanner.nextInt();
        long[] ids = new long[arraySize];
        long lastId = 0;
        String[] names = new String[arraySize];
        char[] genders = new char[arraySize];
        byte[] ages = new byte[arraySize];
        boolean[] filledElements = new boolean[arraySize];// initially: all false

        try {
            Thread.sleep(2000); // delay for 2 seconds
        } catch (InterruptedException e) {
            // handle exception
        }
        while(true){
            mainMenu();
            int choice = scanner.nextInt();
            if(choice >=1 && choice <=5){
               switch(choice){
                   case 1 :
                       addMember(ids , names , genders , ages , arraySize , scanner,filledElements,lastId);
                       lastId++;
                       break;
                   case 2 :
                       showMember(ids , names , genders , ages , arraySize , scanner,filledElements,lastId);
                       break;
                   case 3 :
                       editMember();
                       break;
                   case 4 :
                       deleteMember();
                       break;
                   case 5 :
                       exit();
                       break;
               }
            }else{
                System.out.println("Please select the correct number");
                System.out.print("\033[H\033[2J");
                continue;

            }
        }


    }
    public static void addMember(long[] ids , String[] names , char[] genders , byte[] ages , int arraySize , Scanner scanner,boolean[] filledElements , long lastId){
        int index;
        for(index =(int) lastId; index<filledElements.length;index++ ){
            if(filledElements[index]){
                break;
            }else{
                System.out.print("\033[H\033[2J");
                System.out.println("Name :");
                names[index]=scanner.next();
                System.out.println("Age :");
                ages[index] = scanner.nextByte();
                System.out.println("Gender : ");
                genders[index] = scanner.next().charAt(0);
                ids[index]=lastId;
                filledElements[index]=true;
                break;
            }

        }


    }
    public static void showMember(long[] ids , String[] names , char[] genders , byte[] ages , int arraySize , Scanner scanner,boolean[] filledElements , long lastId){
        int index;
        int count = 0;
        System.out.println("Please write the ID :");
        long idSelector = scanner.nextLong();
        for(index=0;index<ids.length;index++){
            count++;
            if(idSelector==ids[index]){
                System.out.println("ID :"+ids[index]);
                System.out.println("Name :"+names[(int) idSelector]);
                System.out.println("Age :"+ages[(int) idSelector]);
                System.out.println("Gender :"+genders[(int) idSelector]);
            }
        }
        if (count==arraySize){
            System.out.println("The user not found");
        }


    }
    public static void editMember(){}
    public static void deleteMember(){}
    public static void exit(){}
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