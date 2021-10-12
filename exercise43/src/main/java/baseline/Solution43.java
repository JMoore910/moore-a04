package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

/*
    Create an application that asks for user to input information for a basic website skeleton
    User should input the website name, the author name, and say whether they want a folder for javascript and a folder for CSS
    The application then creates an html file "index.html" which contains the name of the site inside the <title> tag and
    the author name inside a <meta> tag
 */

import java.io.IOException;

public class Solution43 {
    public static void main(String[] args) throws IOException {
        //  Create a websiteCreator object and run code non statically through it
        WebsiteCreator app = new WebsiteCreator();
        app.createWebsite();
    }
}
