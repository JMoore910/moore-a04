package baseline;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Logger;

public class ListPrinter {
    //  Reusable class that prints a list of strings to an output file
    private final String outFileName;

    public ListPrinter(){
        outFileName = "data\\exercise41_output.txt";
    }
    public File printToFile(List<String> list) throws IOException {
        boolean created = false;
        File outFile;
        Logger logger = Logger.getLogger("Sorter Logger");
        //  use a for each loop and print out the string i at each element of list
        try {
            outFile = new File(outFileName);
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
        if (created) {
            logger.info("file created and written to");
        }
        return outFile;

    }
}
