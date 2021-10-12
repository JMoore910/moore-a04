package baseline;

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
