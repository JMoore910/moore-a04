package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WebsiteCreator {
    private static final Scanner input = new Scanner(System.in);

    public Website getUserInput() {
        //      take 4 strings as input. If anything other than 'y' or 'yyyyy....y'
        //      is input for creating folders, assume user does not want to make them
        //      use the 4 strings as arguments in a constructor for a Website object
        String siteName;
        String author;
        String dirCheck;

        boolean javaDirCheck = false;
        boolean cssDirCheck = false;

        System.out.print("Site name: ");
        siteName = input.nextLine();
        System.out.print("Author: ");
        author = input.nextLine();
        System.out.print("Do you want a folder for JavaScript? ");
        dirCheck = input.nextLine();
        //Check if input variable is either y or Y
        if (dirCheck.matches("[yY]+"))
            javaDirCheck = true;
        System.out.print("Do you want a folder for CSS? ");
        dirCheck = input.nextLine();
        //Check if input variable is either y or Y
        if (dirCheck.matches("[yY]+"))
            cssDirCheck = true;
        return new Website(siteName, author, javaDirCheck, cssDirCheck);
    }


    private void writeToHTML(String fileName, Website userSite) throws IOException {
        //      fileName will include the path to it
        //      Create buffered writer
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            bw.write("<html>\n<head>\n<title>" + userSite.getSiteName() + "</title>\n</head>\n<meta name = \"author\" content = \"" + userSite.getAuthor() + "\">\n</html>");
        }
    }


    public File createWebsite(Website userSite,String filePath) throws IOException {
        boolean fileCreated;
        Logger logger = Logger.getLogger("FilesCreated");
        //  make directory to hold html file
        String fileName = filePath + "website//" + userSite.getSiteName();
        fileCreated = new File(fileName).mkdirs();
        //  make javaScript directory if user authorized it
        if (userSite.getJavaDir())
            fileCreated = new File(fileName + "//js//").mkdirs();
        //  make CSS directory if user authorized it
        if (userSite.getCssDir())
            fileCreated = new File(fileName + "//css//").mkdirs();
        //  program then creates an html file called index.html inside of the new website directory
        File f = new File(fileName + "//index.html");
        fileName = fileName + "//index.html";
        writeToHTML(fileName, userSite);
        if (fileCreated) {
            logger.log(Level.INFO, "DIRECTORIES CREATED");
        }
        return f;
    }

    public void runApp(String filePath) throws IOException {
        Logger logger = Logger.getLogger("FilesCreated");
        File f = createWebsite(getUserInput(),filePath);
        if (f.exists()){
            logger.log(Level.INFO, "HTML CREATED");
        }
    }
}
