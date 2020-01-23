import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //LOOPY
        String word;
        String sentence = "";

        for(int i=0; i<5; i++){
            System.out.print("Enter a word: ");
            word = input.nextLine();
            sentence += (word + " ");
        }

        System.out.println(sentence);


        //IFFY
        boolean redEyes = false;
        String repeat = "y";

        while(repeat.equalsIgnoreCase("y")) {
            //get user input
            System.out.print("Are your eyes red? ");
            String response = input.nextLine();

            //set redEyes value as true/false
            if (response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes")) {
                redEyes = true;
            } else if (response.equalsIgnoreCase("n") || response.equalsIgnoreCase("no")) {
                redEyes = false;
            } else {
                System.out.println("ERROR: invalid input");
            }

            //choose which message to display
            if (redEyes == true) {
                System.out.println("Get some sleep!");
            } else if (redEyes == false) {
                System.out.println("You look great!");
            }
            System.out.print("Do you want to try again? (Y/N): ");
            repeat = input.nextLine();
        }
    }
}
