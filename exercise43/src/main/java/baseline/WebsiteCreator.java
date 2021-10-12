package baseline;

public class WebsiteCreator {
    //  private static final Scanner input = new Scanner(System.in);


    //  Create method: public Website getUserInput()
    //      take 4 strings as input. If anything other than 'y' or 'yyyyy....y'
    //      is input for creating folders, assume user does not want to make them
    //      use the 4 strings as arguments in a constructor for a Website object
    //      return userSite;


    //  Create method: private void writeToHTML(String fileName, Website userSite)
    //      fileName will include the path to it
    //      Create buffered writer
    //      BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))
    //      bw.write("<html><head><title>userSite.getSiteName()</title></head><meta name = "author" content = userSite.getAuthor()></html>");
    //      bw.close


    //  Create method: public void createWebsite()
    //      Website userSite = getUserInput();
    //      make directory to hold html file
    //      String fileName = "./website/" + userSite.getSiteName();
    //      new File(fileName).mkdirs();
    //
    //      if (userSite.getJavaDir)
    //          new File(fileName + "/js/").mkdirs();
    //
    //      if (userSite.getCssDir)
    //          new File(fileName + "/css/").mkdirs();
    //
    //      program then creates an html file called index.html inside of the new website directory
    //      writeToHTML(fileName, userSite);
}
