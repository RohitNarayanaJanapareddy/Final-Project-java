import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

class CalendarTest {

    public static void main(String[] args)  {

        try {

            File file = new File("calendars.txt");

            Scanner scan = new Scanner(file);

            OutputStream htmlfile = new FileOutputStream("calendar.html");

            PrintStream printhtml = new PrintStream(htmlfile);

            String[] textLine = new String[500];

            String box1 = "<html><h1 style=\"border:orange; border-width:5px;" +
                          " border-style:solid;\"></h1></html> ";

            String box2 = "<html><h1 style=\"border:orange; border-width:5px;" +
                          " border-style:solid;\"></h1></html> ";


            String box4 = "<html><h1 style=\"border:orange; border-width:5px;" +
                          " border-style:solid;\"></h1></html> ";

            String heading = """
                                <html><h1 style='color:Tomato';>\s
                                <center>Professor's Appointment Calendar</center>\s
                                </h1></html>""";

            String html = """
                              <html><div style='background-color:lightblue'\s
                                          font-size: 10px\s
                                          padding: 1px\s
                                          margin: 1px \s
                                          border: 1 px orange \s
                                          border-left-style:solid  \s
                                          display:block \s
                                          box-sizing: border-box>;\s
                                          <body><font face = "Verdana" color="black" size="5"\s
                                          </body></div></html>""";


//                String html_new = "<html><body><div style='background-color:lightblue'" +
//                                  "font face = \"Verdana\" " +
//                                  "color = \"black\"" +
//                                  "font-size= \"20px\""+
//                                  "display  = \"block\""+
//                                  "</div></body></html>";

            printhtml.println(box1);
            printhtml.println(heading);
            printhtml.println(box2);


            int linenum = 0;
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                textLine[linenum] = line;
                linenum++;
            }
            for (int i = 0; i < linenum; i++) {

                String  Contents =  html + textLine[i];
                printhtml.println(  Contents );

            }
            printhtml.println(box4);
            printhtml.close();
            htmlfile.close();
            scan.close();

        } catch (Exception e) {
            System.out.println("Something went wrong.");
        }

    }

}



