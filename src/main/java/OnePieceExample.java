import java.util.Scanner;

public class OnePieceExample {public static void main(String[] args) {
    //My objective is for the computer to ask user to respond with who their favorite leader main is

    //create a scanner
    Scanner userInput=new Scanner(System.in);

    //computer will ask user what their favorite leader is in One Piece
    System.out.println("Do you have a favorite leader in the One Piece card game? yes or no?");
    String userResponse= userInput.next(); //user response (yes or no)

    if (userResponse.equalsIgnoreCase("Yes")) //Yes response
    { System.out.println("Who is your favorite leader? ");
        String userLeader=userInput.next();
        System.out.println("Your favorite leader is "+ userLeader); //computer prints out user favorite leader

    }else if (userResponse.equalsIgnoreCase("No")){ //no response
        System.out.println("Check out your nearest local game shop and play more!");

    }else System.out.println("Invalid response"); //if it is not yes or no computer will give user invalid response

    userInput.close(); //closes scanner
    //version 1
}
}
