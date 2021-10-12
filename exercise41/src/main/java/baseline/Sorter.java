package baseline;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Logger;

import static java.util.Collections.sort;

public class Sorter {
    private final String in;
    private final String out;

    public Sorter() {
        //  Constructor for sorter object: Point files at their respective paths
        in = "data\\exercise41_input.txt";
        out = "data\\exercise41_output.txt";
    }

    public List<String> readFile(List<String> list) throws IOException {
        //  SonarLint calls for this function to be static
        //  Create BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(in))) {
            //  declare variable to read a line from file
            String input = br.readLine();
            while (input != null) {
                //  add input to the list
                list.add(input);
                input = br.readLine();
            }
        }
        //      return list of inputs
        return list;
    }

    public List<String> alphabetSortList(List<String> list) {
        //Use collections sort
        sort(list);
        return list;
    }

    public void printToFile(List<String> list) throws IOException {
        boolean created = false;
        Logger logger = Logger.getLogger("Sorter Logger");
        //  use a for each loop and print out the string i at each element of list
        try {
            File outFile = new File(out);
            //  Check to see if the output file does not exist yet
            if (!outFile.exists()) {
                created = outFile.createNewFile();
            }
            PrintWriter writer = new PrintWriter(outFile);
            for (String i : list) {
                writer.println(i);
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("An error has occurred");
        }
        if (created)
            logger.info("file created and written to");
    }
}
