package baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Jeanne Moore
 */

public record Website(String siteName, String author, boolean javaDir, boolean cssDir) {

    public String getSiteName() {
        return siteName;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getJavaDir() {
        return javaDir;
    }

    public boolean getCssDir() {
        return cssDir;
    }
}
