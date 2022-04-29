import java.io.File;
    import java.io.FileOutputStream;
    import java.io.OutputStream;
    import java.io.PrintStream;
    import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class CalendarTest {


        public static void main(String[] args) throws InterruptedException {

            try {


                File file = new File("calendars.txt");

                Scanner scan = new Scanner(file);

                OutputStream htmlfile = new FileOutputStream(new File("calendar.html"));
                PrintStream printhtml = new PrintStream(htmlfile);


                String[] textLine = new String[500];
                String Contents = "";


                String html1 = "<html><div style=\"background: lightblue; \n" +
                        "            font-size: 10px; \n" +
                        "            padding: 1px; \n" +
                        "            border: 1px solid lightred; \n" +
                        "            margin: 1px;\">; \n" +
                        "<hr size=\"3\" width=\"100%\" color=\"red\">\"; \n" +
                        "<body><font color=\"black\" size=\"5\">";

                //html1 += "<hr size=\"3\" width=\"100%\" color=\"red\">";
                //html1 += "<body><font color=\"black\" size=\"5\">";

                String linebreak = "<br>";
                String html3 = "</body></div></html>";
                int linenum = 0;

                while (scan.hasNextLine()) {
                    String line = scan.nextLine();
                    textLine[linenum] = line;
                    linenum++;
                }
                for (int i = 0; i < linenum; i++) {
                    if (linenum > 0) {
                        Contents = textLine[i] + html3;

                    }

                    printhtml.println(  html1 + Contents + linebreak + html3);
                }

                printhtml.close();
                htmlfile.close();
                scan.close();

            } catch (Exception e) {
            }

        }

    }

