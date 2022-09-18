import java.util.Random;

public class ExtraCredit
{
    public static void main(String[] args) {
       Random rand = new Random();
       int upperbound = 25;
       int int_random = rand.nextInt(upperbound);


        System.out.println("random Integer value 0 to" +(upperbound-1) + " : "+int_random);


        if(int_random% 2 ==0)
            System.out.println(int_random + "Your number is even");
        else
            System.out.println(int_random + "your number is odd");



    }
}
