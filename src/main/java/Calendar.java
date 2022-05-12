import java.io.*;
import java.util.*;

public class Calendar {
    private static List<String []> finalSlots = new ArrayList<String []>();

    public static void readFile() throws IOException {
        try{
            List<String> slots = new ArrayList<String>();

            FileReader fr = new FileReader("calendar.txt"); // To read the calendar.txt file
            BufferedReader br = new BufferedReader(fr);  // to read the .txt file in proper format

            String wordsLine = br.readLine();
            while (wordsLine != null) {
                slots.add(wordsLine);
                wordsLine = br.readLine();
            }
            br.close();

            for(int i=0; i<slots.size(); i++){
                String[] slotData = slots.get(i).split(", ");
//                 for(int j=0; j<slotData.length; j++){
//                     System.out.print("[" + slotData[j] + "]");
//                 }
//                 System.out.println("");
                finalSlots.add(slotData);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args)  {
        try {
            String enteredPassword;

            readFile();

            Scanner sc = new Scanner(System.in);  // to read the input from terminal or console
            System.out.println("Enter your Username to view Professor Frank's Calendar: ");
            String username = sc.next();

            if(username.equals("Frank")) {    // if username is given as frank

                Console console = System.console();
                enteredPassword =
                        new String(console.readPassword("Please enter your password: "));
                String passcode = enteredPassword;
//                System.out.println("Enter your passcode: ");   // terminal will ask for the passcode to show whole calendar.txt
//                String passcode = sc.next();
                if(passcode.equals("1234")){
                    for(int i=0; i<finalSlots.size(); i++){
                        System.out.print(i+1 + ") ");
                        for(int j=0; j<finalSlots.get(i).length; j++){
                            System.out.print(finalSlots.get(i)[j] + "  ");
                        }
                        System.out.println("");
                    }
                }else{
                    System.out.println("passcode is incorrect");
                }
            }else{
                for(int i=0; i<finalSlots.size(); i++){  // if username is not frank  does not show the booked my column
                    System.out.print(i+1 + ") ");
                    for(int j=0; j<finalSlots.get(i).length-2; j++){
                        System.out.print(finalSlots.get(i)[j] + "  ");
                    }
                    System.out.println("");
                }

                System.out.println("Enter the slot number to book: ");
                int slotNumber = Integer.parseInt(sc.next());
                sc.close();

                if(finalSlots.get(slotNumber-1)[3].equals("status='CLOSED'")) System.out.println(" No more slot are available for the given day");  // if the status of the slot is closed, user should be unable to book the slot and this message should be shown to the user
                else if(finalSlots.get(slotNumber-1)[3].equals("status='OPEN'")) {
                    int count = Integer.parseInt(finalSlots.get(slotNumber-1)[4].substring(finalSlots.get(slotNumber-1)[4].lastIndexOf("=") + 1));
                    if(count == 1){
                        System.out.println("reaching the required condition");
                        finalSlots.get(slotNumber-1)[3] = "status='CLOSED'";  // if the count is 1 the status should turn to closed as this is the last slot
                        finalSlots.get(slotNumber-1)[5] = "bookedBy='" + username + "," + finalSlots.get(slotNumber-1)[5].substring(finalSlots.get(slotNumber-1)[5].lastIndexOf("=") + 2);
                        count--;
                        finalSlots.get(slotNumber-1)[4] = "slots=" + count;
                    }else{
                        finalSlots.get(slotNumber-1)[5] = "bookedBy='" + username + "," + finalSlots.get(slotNumber-1)[5].substring(finalSlots.get(slotNumber-1)[5].lastIndexOf("=") + 2);
                        count--;
                        finalSlots.get(slotNumber-1)[4] = "slots=" + count;
                    }


                    for(int i=0; i<finalSlots.get(slotNumber-1).length-2; i++){
                        System.out.print(finalSlots.get(slotNumber-1)[i] + "  ");
                    }
                    System.out.println("");
                    System.out.println("Required Slot has been booked by " + username);
                }

                // rewrite the calendar.txt for reuse
                FileWriter fw1 = new FileWriter("calendar.txt");
                BufferedWriter bw1 = new BufferedWriter(fw1);  // buffered writer should be created in order to write the new data into calendar.txt

                //bw.write();

                for(int i=0; i<finalSlots.size(); i++){
                    for(int j=0; j<finalSlots.get(i).length; j++){
                        bw1.write(finalSlots.get(i)[j] + ", ");
                    }
                    bw1.newLine();
                }
                bw1.close();

                // rewrite the calendar.txt for student's display

                FileWriter fw2 = new FileWriter("calendars.txt");
                BufferedWriter bw2 = new BufferedWriter(fw2);

                for(int i=0; i<finalSlots.size(); i++){
                    for(int j=0; j<finalSlots.get(i).length-1; j++){
                        bw2.write(finalSlots.get(i)[j] + ", ");
                    }
                    bw2.newLine();
                }
                bw2.close();

            }


        }catch(IOException e){
            e.printStackTrace();
        }
    }
}