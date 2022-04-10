import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Calendar1Test2 {
    public static void main(String[] args) {

        Calendar1 prac21 = new Calendar1("Week1","Monday","5:30-7:30 PM","OPEN","");
        System.out.println(prac21);
        Scanner input1 = new Scanner(System.in);
        String bookedby = input1.nextLine();
        prac21.setbookedby(bookedby);
        //System.out.println(prac21);
        Scanner input2 = new Scanner(System.in);
        String Status = input2.nextLine();
        prac21.setstatus(Status);
        System.out.println(prac21);
    }
}