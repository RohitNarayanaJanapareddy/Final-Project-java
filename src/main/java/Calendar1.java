    import java.io.*;
    import java.util.Scanner;

    public class Calendar1 {
        String Week;
        String Day;
        String Timeslot;
        String Status;
        String bookedby;


        @Override
        public String toString() {
            return "Calendar1{" +
                    "Week='" + Week + '\'' +
                    ", Day='" + Day + '\'' +
                    ", Timeslot='" + Timeslot + '\'' +
                    ", Status='" + Status + '\'' +
                    ", bookedby='" + bookedby + '\'' +
                    '}';
        }

        public Calendar1(String week, String day, String timeslot, String status, String bookedby) {
            Week = week;
            Day = day;
            Timeslot = timeslot;
            Status = status;
            this.bookedby = bookedby;
        }

        public Calendar1() {

        }

        public void setbookedby(String bookedby){
            this.bookedby=bookedby;
        }
        public void setstatus(String status){
            this.Status=status;
        }


    }

    class Calendar2 extends Calendar1 {

        String Week;
        String Day;
        String Timeslot;
        String Status;


        public Calendar2(String week, String day, String timeslot, String status) {
            super();

            this.Week = week;
            this.Day = day;
            this.Timeslot = timeslot;
            this.Status = status;

        }


        //Setting up calendar that can gets generated on console and also can be printed to file for I/O.

        public static void main(String[] args) throws FileNotFoundException {
            Calendar2 prac0 = new Calendar2("Week","day","00","OPEN/CLOSE");
            Calendar2 prac1 = new Calendar2("Week1", "Monday", "5:30-7:30 PM", "OPEN");
            Calendar2 prac2 = new Calendar2("Week1", "Tuesday", "7:30-8:30 PM", "Booked");
            Calendar2 prac3 = new Calendar2("Week1", "Wednesday", "12:30-1:30 PM", "OPEN");
            Calendar2 prac4 = new Calendar2("Week1", "Thursday", "2:30-3:30 PM", "OPEN");
            Calendar2 prac5 = new Calendar2("Week1", "Friday", "5:30-6:30 PM", "OPEN");
            Calendar2 prac6 = new Calendar2("Week2", "Monday", "5:30-7:30 PM", "OPEN");
            Calendar2 prac7 = new Calendar2("Week2", "Tuesday", "7:30-8:30 PM", "Booked");
            Calendar2 prac8 = new Calendar2("Week2", "Wednesday", "12:30-1:30 PM", "OPEN");
            Calendar2 prac9 = new Calendar2("Week2", "Thursday", "2:30-8:30 PM", "OPEN");
            Calendar2 prac10 = new Calendar2("Week2", "Friday", "5:30-6:30 PM", "OPEN");

            Calendar2 prac11 = new Calendar2("Week3", "Monday", "5:30-7:30 PM", "OPEN");
            Calendar2 prac12 = new Calendar2("Week3", "Tuesday", "7:30-8:30 PM", "Booked");
            Calendar2 prac13 = new Calendar2("Week3", "Wednesday", "12:30-1:30 PM", "OPEN");
            Calendar2 prac14 = new Calendar2("Week3", "Thursday", "2:30-3:30 PM", "OPEN");
            Calendar2 prac15 = new Calendar2("Week3", "Friday", "5:30-6:30 PM", "OPEN");
            Calendar2 prac16 = new Calendar2("Week4", "Monday", "5:30-7:30 PM", "OPEN");
            Calendar2 prac17 = new Calendar2("Week4", "Tuesday", "7:30-8:30 PM", "Booked");
            Calendar2 prac18 = new Calendar2("Week4", "Wednesday", "12:30-1:30 PM", "OPEN");
            Calendar2 prac19 = new Calendar2("Week4", "Thursday", "2:30-8:30 PM", "OPEN");
            Calendar2 prac20 = new Calendar2("Week4", "Friday", "5:30-6:30 PM", "OPEN");

            Calendar1 prac00 = new Calendar1("Week", "day", "00", "OPEN", "");
            Calendar1 prac21 = new Calendar1("Week1", "Monday", "5:30-7:30 PM", "OPEN", "");
            Calendar1 prac22 = new Calendar1("Week1", "Tuesday", "7:30-8:30 PM", "Booked", "John");
            Calendar1 prac23 = new Calendar1("Week1", "Wednesday", "12:30-1:30 PM", "OPEN", "");
            Calendar1 prac24 = new Calendar1("Week1", "Thursday", "2:30-3:30 PM", "OPEN", "");
            Calendar1 prac25 = new Calendar1("Week1", "Friday", "2:30-3:30 PM", "OPEN", "");
            Calendar1 prac26 = new Calendar1("Week2", "Monday", "5:30-7:30 PM", "OPEN", "");
            Calendar1 prac27 = new Calendar1("Week2", "Tuesday", "7:30-8:30 PM", "Booked", "Rahul");
            Calendar1 prac28 = new Calendar1("Week2", "Wednesday", "12:30-1:30 PM", "OPEN", "");
            Calendar1 prac29 = new Calendar1("Week2", "Thursday", "2:30-8:30 PM", "OPEN", "");
            Calendar1 prac30 = new Calendar1("Week2", "Friday", "5:30-6:30 PM", "OPEN", "");

            Calendar1 prac31 = new Calendar1("Week3", "Monday", "5:30-7:30 PM", "OPEN", "");
            Calendar1 prac32 = new Calendar1("Week3", "Tuesday", "7:30-8:30 PM", "Booked", "John");
            Calendar1 prac33 = new Calendar1("Week3", "Wednesday", "12:30-1:30 PM", "OPEN", "");
            Calendar1 prac34 = new Calendar1("Week3", "Thursday", "12:30-1:30 PM", "OPEN", "");
            Calendar1 prac35 = new Calendar1("Week3", "Friday", "5:30-6:30 PM", "OPEN", "");
            Calendar1 prac36 = new Calendar1("Week4", "Monday", "5:30-7:30 PM", "OPEN", "");
            Calendar1 prac37 = new Calendar1("Week4", "Tuesday", "7:30-8:30 PM", "Booked", "Rahul");
            Calendar1 prac38 = new Calendar1("Week4", "Wednesday", "12:30-1:30 PM", "OPEN", "");
            Calendar1 prac39 = new Calendar1("Week4", "Thursday", "2:30-8:30 PM", "OPEN", "");
            Calendar1 prac40 = new Calendar1("Week4", "Friday", "5:30-6:30 PM", "OPEN", "");

            /*
            User who wish to see Professor's calendar can input his name. If its Professor Frank then he gets
            to see who has booked the appt but if its Student bookedby column is not visible.
            */

            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter key to display Professor Frank's Calendar");
            String userName = myObj.next();

            if (userName.equals("Sp$ing#")) {
                PrintStream o1 = new PrintStream(new File("c:\\users\\rahul\\Appointment-Calendar\\target\\A.txt"));

                String arr1[] = {String.valueOf(prac00),
                        String.valueOf(prac21),
                        String.valueOf(prac22),
                        String.valueOf(prac23),
                        String.valueOf(prac24),
                        String.valueOf(prac25),
                        String.valueOf(prac26),
                        String.valueOf(prac27),
                        String.valueOf(prac28),
                        String.valueOf(prac29),
                        String.valueOf(prac30),
                        String.valueOf(prac31),
                        String.valueOf(prac32),
                        String.valueOf(prac33),
                        String.valueOf(prac34),
                        String.valueOf(prac35),
                        String.valueOf(prac36),
                        String.valueOf(prac37),
                        String.valueOf(prac38),
                        String.valueOf(prac39),
                        String.valueOf(prac40)

                };
                for (int i = 0; i < arr1.length; i++) {
                    System.out.println(arr1[i] + "Actual Calendar is printed in A.txt");
                    PrintStream console = System.out;
                    System.setOut(o1);
                }

            } else {
               PrintStream o2 = new PrintStream(new File("c:\\users\\rahul\\Appointment-Calendar\\target\\B.txt"));

                String arr2[] = {String.valueOf(prac0),
                        String.valueOf(prac1),
                        String.valueOf(prac2),
                        String.valueOf(prac3),
                        String.valueOf(prac4),
                        String.valueOf(prac5),
                        String.valueOf(prac6),
                        String.valueOf(prac7),
                        String.valueOf(prac8),
                        String.valueOf(prac9),
                        String.valueOf(prac10),
                        String.valueOf(prac11),
                        String.valueOf(prac12),
                        String.valueOf(prac13),
                        String.valueOf(prac14),
                        String.valueOf(prac15),
                        String.valueOf(prac16),
                        String.valueOf(prac17),
                        String.valueOf(prac18),
                        String.valueOf(prac19),
                        String.valueOf(prac20)

                };
                for (int j = 0; j < arr2.length; j++) {
                    System.out.println(arr2[j]+"Actual Calendar is generated in B.txt file");
                    PrintStream console = System.out;
                    System.setOut(o2);

                }


            }

        }


        public void setStatus(String Status) {
            this.Status = Status;
        }

        @Override
        public String toString() {
            return "Calendar2{" +
                    "Week='" + Week + '\'' +
                    ", Day='" + Day + '\'' +
                    ", Timeslot='" + Timeslot + '\'' +
                    ", Status='" + Status + '\'' +
                    '}';
        }
    }

