package library.management.system;

public class DVD extends LibraryItem{
    public String director;
    public int duration;

    public DVD(String title, int releaseYear, String director, int duration) {
        super(title, releaseYear);
        this.director = director;
        this.duration = duration;
    }


    @Override
    public String getItemType() {
        return "DVD";
    }

    @Override
    public String getItemDetails() {
        return "Title: " + getTitle() + ", Director: " + director + ", : " + getReleaseYear() + ", Duration: " + duration;
    }
}
