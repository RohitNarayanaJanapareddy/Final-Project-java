import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Calendar2Test2 {

    public static void main(String[] args) {

        Calendar2 prac1 = new Calendar2("Week1","Monday","5:30-7:30 PM","OPEN");
        System.out.println(prac1);
        Scanner input = new Scanner(System.in);
        String  Status= input.nextLine();
        prac1.setStatus(Status);
        System.out.println(prac1);

    }

}