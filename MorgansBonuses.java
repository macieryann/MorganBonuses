/*this program asks a user to input the number of weeks they worked and how many positive reviews they received
 and then the program calculates their bonus.*/
import java.util.*;
class MorgansBonuses {
    public static void main(String[] args) {
        boolean didUserStop = true;
        double bonus[][] = {
                {5.0,9.0,16.0,22.0,30.0},
                {10.0,12.0,18.0,24.0,36.0},
                {20.0,25.0,32.0,42.0,53.0},
                {32.0,38.0,45.0,55.0,68.0},
                {46.0,54.0,65.0,77.0,90.0},
                {60.0,72.0,84.0,96.0,120.0},
                {85.0,100.0,120.0,140.0,175.0}
                };
        Scanner input = new Scanner(System.in);

        while(didUserStop){
            System.out.println("Enter number of weeks worked: ");
            int userWeeks = input.nextInt();
            if(userWeeks == 99){
                break;
            }
            System.out.println("Enter number of positive reviews: ");
            int userPosReviews = input.nextInt();
            if(userPosReviews == 99){
                break;
            }

            if(userWeeks > 6){
                userWeeks = 6;
                /*System.out.println("User weeks is too high. Try again: ");
                userWeeks = input.nextInt();*/
            }else if(userPosReviews > 4){
                userPosReviews = 4;
                /*System.out.println("Positive reviews is too high. Try again: ");
                userPosReviews = input.nextInt();*/
            }
            System.out.println("The bonus amount is $" + bonus[userWeeks][userPosReviews]);

        }
    }
}
