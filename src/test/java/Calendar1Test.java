import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class Calendar1Test extends Calendar1 {

    public static void main(String[] args) {

        try {

            //File Appointmenttextfile = new File ("c:\\users\\rahul\\Appointment-Calendar\\target\\A.txt");
            File Appointmenttextfile = new File ("c:\\users\\rahul\\Appointment-Calendar\\Calendar.txt");

            Scanner scan = new Scanner(Appointmenttextfile);

            OutputStream Appointmenthtmlfile= new FileOutputStream(new File("c:\\users\\rahul\\Appointment-Calendar\\target\\Calendar.html"));
            PrintStream printhtml = new PrintStream(Appointmenthtmlfile);

            String[] textbyLine = new String[500];
            String temp = "";


            String htmlheader="<html><head>";

            htmlheader+="<pre></head><body>";
            String htmlnewline = "<br>";

            String htmlfooter="</pre></body></html>";
            int linenum = 0 ;

            while ( scan.hasNextLine()){
                String line = scan.nextLine();
                textbyLine[linenum] = line;
                linenum++;
            }
            for(int i=0;i<linenum;i++) {
                if(linenum > 0)
                {
                    temp = textbyLine[i] + htmlfooter;
                    //textbyLine[i] = temp;
                }

                printhtml.println(htmlheader + temp + htmlnewline + htmlfooter);
            }

            printhtml.close();
            Appointmenthtmlfile.close();
            scan.close();

        }

        catch (Exception e) {}

   }

    @Test
    void testToString() {
    }
}