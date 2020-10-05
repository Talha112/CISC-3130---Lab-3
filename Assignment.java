import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collections;
import java.util.LinkedList;

public class Assignment {

    public static void main(String[] args) throws IOException {
        LinkedList<String> names = new LinkedList<String>();      // LL created using Linked List Class

        PrintStream ps = new PrintStream("sortedArtistNames.txt");   // Printer to write sorted list into txt


        String splitBy = ",";
        BufferedReader br = new BufferedReader(new FileReader                      //Buffered reader created to read from csv file
                ("/Users/lollol/Documents/regionalGlobalDailyLatest.csv"));
        String line;
        while((line = br.readLine()) !=null){
            String[] b = line.split(splitBy);
            names.add((b[2]));  // This makes it read onnly the column 2 containing artist names and adds it to LL
        }
        br.close();


        System.out.println(names); // prints unsorted LL
        Collections.sort(names);// Sorts LL
        System.out.println(names);//Prints sorted
        for(int x=0;x<200;x++) {              //loop for writing LL into txt file
            ps.println(names.get(x));        // Using loop to write line by line
        }                                   // made it easier to read the txt file




    }

    }








