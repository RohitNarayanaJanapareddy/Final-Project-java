import java.io.*;
import java.util.*;

public class Calendar {
    private static List<String []> finalSlots = new ArrayList<String []>();

    public static void main(String[] args) throws FileNotFoundException {
        try{
            List<String> slots = new ArrayList<String>();

            FileReader fr = new FileReader("calendar.txt");
            BufferedReader br = new BufferedReader(fr);

            String wordsLine = br.readLine();
            while(wordsLine != null){
                slots.add(wordsLine);
                wordsLine = br.readLine();
            }
            br.close();

            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Username to view Professor Frank's Calendar: ");
            String username = sc.next();

            for(int i=0; i<slots.size(); i++){
                String[] slotData = slots.get(i).split(", ");
                finalSlots.add(slotData);
            }

            if(username.equals("Frank")) {
                System.out.println("Enter your passcode: ");
                String passcode = sc.next();
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
                for(int i=0; i<finalSlots.size(); i++){
                    System.out.print(i+1 + ") ");
                    for(int j=0; j<finalSlots.get(i).length-1; j++){
                        System.out.print(finalSlots.get(i)[j] + "  ");
                    }
                    System.out.println("");
                }
                
                System.out.println("Enter the slot number to book: ");
                int slotNumber = Integer.parseInt(sc.next());
                sc.close();
    
                if(finalSlots.get(slotNumber-1)[3].equals("status='CLOSED'")) System.out.println("This slot is already booked");  
                else if(finalSlots.get(slotNumber-1)[3].equals("status='OPEN'")) {
                    System.out.println("reaching the required condition");
                    finalSlots.get(slotNumber-1)[3] = "status='CLOSED'";
                    finalSlots.get(slotNumber-1)[4] = "bookedBy='" + username + "'";
    
                    for(int i=0; i<finalSlots.get(slotNumber-1).length; i++){
                        System.out.print(finalSlots.get(slotNumber-1)[i] + "  ");
                    }
                    System.out.println("");
                    System.out.println("Required Slot has been booked by " + username);
                }
    
                // rewrite the calendar.txt
                FileWriter fw = new FileWriter("calendar.txt");
                BufferedWriter bw = new BufferedWriter(fw);
    
                //bw.write();
    
                for(int i=0; i<finalSlots.size(); i++){
                    for(int j=0; j<finalSlots.get(i).length; j++){
                        bw.write(finalSlots.get(i)[j] + ", ");
                    }
                    bw.newLine();
                }
                bw.close();
            }

            
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}



