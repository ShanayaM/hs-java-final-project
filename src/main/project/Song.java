package project;

import java.util.HashMap;
import java.util.Map;

public final class Song implements SongInterface {
    private String title;
    private String artist;
    private String year;
    private String genre;
    
    /**
     * @return the title
     */
    @Override
    public String getTitle() {
        return title;
    }

    /**
     * @param t the title to set
     */
    @Override
    public void setTitle(final String t) {
        this.title = t;
    }

    /**
     * @return the artist
     */
    @Override
    public String getArtist() {
        return artist;
    }

    /**
     * @param art the artist to set
     */
    @Override
    public void setArtist(final String art) {
        this.artist = art;
    }

    /**
     * @return the year
     */
    @Override
    public String getYear() {
        return year;
    }

    /**
     * @param y the year to set
     */
    @Override
    public void setYear(final String y) {
        this.year = y;
    }

    /**
     * @return the genre
     */
    @Override
    public String getGenre() {
        return genre;
    }

    /**
     * @param g the genre to set
     */
    @Override
    public void setGenre(final String g) {
        this.genre = g;
    }
    
    private final Map totals = new HashMap();
    
    @Override
    public void increment(final String key) {
        if (totals.containsKey(key)) {
            int count = Integer.parseInt(String.valueOf(totals.get(key)));
            count = count + 1;
            totals.put(key, count);
        } else {
            totals.put(key, 1);
        }
    }
    
    @Override
    public int getTotal(final String key) {
        int total = 0;
        if (totals.containsKey(key)) {
            total = Integer.parseInt(String.valueOf(totals.get(key)));
        }
        return total;
    }
    
    @Override
    public String toString() {
        String br = "\n";
        StringBuilder sb = new StringBuilder();
        sb.append("Title : ").append(this.getTitle()).append(br);
        sb.append("Artist : ").append(this.getArtist()).append(br);
        sb.append("Year : ").append(this.getYear()).append(br);
        sb.append("Genre : ").append(this.getGenre()).append(br);
        //sb.append(totals.keySet()).append(br);
        sb.append("readingHeard : ").append(this.getTotal("readingHeard")).append(br);
        sb.append("readingLikes : ").append(this.getTotal("readingLikes")).append(br);
        sb.append("artHeard : ").append(this.getTotal("artHeard")).append(br);
        sb.append("artLikes : ").append(this.getTotal("artLikes")).append(br);
        sb.append("sportsHeard : ").append(this.getTotal("sportsHeard")).append(br);
        sb.append("sportsLikes : ").append(this.getTotal("sportsLikes")).append(br);
        sb.append("musicHeard : ").append(this.getTotal("musicHeard")).append(br);
        sb.append("musicLikes : ").append(this.getTotal("musicLikes")).append(br);
        sb.append("Computer ScienceHeard: ").append(this.getTotal("Computer ScienceHeard")).append(br);
        sb.append("Computer ScienceLikes : ").append(this.getTotal("Computer ScienceLikes")).append(br);
        sb.append("Other EngineeringHeard : ").append(this.getTotal("Other EngineeringHeard")).append(br);
        sb.append("Other EngineeringLikes : ").append(this.getTotal("Other EngineeringLikes")).append(br);
        sb.append("Math or CMDAHeard : ").append(this.getTotal("Math or CMDAHeard")).append(br);
        sb.append("Math or CMDALikes : ").append(this.getTotal("Math or CMDALikes")).append(br);
        sb.append("OtherHeard : ").append(this.getTotal("OtherHeard")).append(br);
        sb.append("OtherLikes : ").append(this.getTotal("OtherLikes")).append(br);
        sb.append("NortheastHeard : ").append(this.getTotal("NortheastHeard")).append(br);
        sb.append("NortheastLikes : ").append(this.getTotal("NortheastLikes")).append(br);
        sb.append("SoutheastHeard : ").append(this.getTotal("SoutheastHeard")).append(br);
        sb.append("SoutheastLikes : ").append(this.getTotal("SoutheastLikes")).append(br);
        sb.append("United States (other than Southeast or Northwest)Heard : ").append(this.getTotal("United States (other than Southeast or Northwest)Heard")).append(br);
        sb.append("United States (other than Southeast or Northwest)Likes : ").append(this.getTotal("United States (other than Southeast or Northwest)Likes")).append(br);
        sb.append("Outside of United StatesHeard : ").append(this.getTotal("Outside of United StatesHeard")).append(br);
        sb.append("Outside of United StatesLikes : ").append(this.getTotal("Outside of United StatesLikes")).append(br);
        sb.append("Heard : ").append(this.getTotal("Heard")).append(br);
        sb.append("Likes : ").append(this.getTotal("Likes")).append(br);
        
        return sb.toString();
    }
}
