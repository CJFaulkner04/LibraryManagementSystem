package library.management.system;

import java.security.PublicKey;

public abstract class LibraryItem {

    public String title;
    public int releaseYear;

    public LibraryItem(String title, int releaseYear){
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getTitle(){
        return title;
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    public abstract String getItemType();
    public abstract String getItemDetails();

}
