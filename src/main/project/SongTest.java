/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import project.SongInterface;
import org.junit.Before;

/**
 *
 * 
 */
public class SongTest extends student.TestCase {

    private SongInterface song;


    public void setUp() {
        song = new Song();
        song.setArtist("Rick Ross");
        song.setTitle("Dead Presidents");
        song.setYear("2017");
        song.setGenre("Rap");
    }


    /**
     * Test of getTitle method, of class Song.
     */

    public void testGetTitle() {
        System.out.println("getTitle");
        String expResult = "Dead Presidents";
        String result = song.getTitle();
        assertEquals(expResult, result);
    }


    /**
     * Test of setTitle method, of class Song.
     */

    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "This Love";
        song.setTitle(title);
        assertEquals(title, song.getTitle());
    }


    /**
     * Test of getArtist method, of class Song.
     */

    public void testGetArtist() {
        System.out.println("getArtist");
        String expResult = "Rick Ross";
        String result = song.getArtist();
        assertEquals(expResult, result);
    }


    /**
     * Test of setArtist method, of class Song.
     */

    public void testSetArtist() {
        System.out.println("setArtist");
        String artist = "Pantera";
        song.setArtist(artist);
        String result = song.getArtist();
        assertEquals(artist, result);
    }


    /**
     * Test of getYear method, of class Song.
     */

    public void testGetYear() {
        System.out.println("getYear");
        String expResult = "2017";
        String result = song.getYear();
        assertEquals(expResult, result);
    }


    /**
     * Test of setYear method, of class Song.
     */

    public void testSetYear() {
        System.out.println("setYear");
        String year = "1992";
        song.setYear(year);
        assertEquals(year, song.getYear());
    }


    /**
     * Test of getGenre method, of class Song.
     */

    public void testGetGenre() {
        System.out.println("getGenre");
        String expResult = "Rap";
        String result = song.getGenre();
        assertEquals(expResult, result);
    }


    /**
     * Test of setGenre method, of class Song.
     */

    public void testSetGenre() {
        System.out.println("setGenre");
        String genre = "Metal";
        song.setGenre(genre);
        assertEquals(genre, song.getGenre());
    }


    /**
     * Test of increment method, of class Song.
     */
    
    public void testIncrement() {
        song.increment("readingHeard");
        song.increment("readingHeard");
        song.increment("readingHeard");
        int expected = 3;
        int actual = song.getTotal("readingHeard");
        assertEquals(expected, actual);
    }


    /**
     * Test of getTotal method, of class Song.
     */
    
    public void testGetTotal() {
        System.out.println("getTotal");
        int expected = 0;
        int actual = song.getTotal("readingLiked");
        assertEquals(expected, actual);
    }


    /**
     * Test of toString method, of class Song.
     */
    
    public void testToString() {
        System.out.println("toString");
        song.increment("readingHeard");
        song.increment("Heard");
        song.increment("readingLikes");
        song.increment("Likes");
        song.increment("artHeard");
        song.increment("Heard");
        song.increment("artLikes");
        song.increment("Likes");
        song.increment("sportsHeard");
        song.increment("Heard");
        song.increment("sportsLikes");
        song.increment("Likes");
        song.increment("musicHeard");
        song.increment("Heard");
        song.increment("musicLikes");
        song.increment("Likes");
        song.increment("Computer ScienceHeard");
        song.increment("Computer ScienceLikes");
        song.increment("Other EngineeringHeard");
        song.increment("Other EngineeringLikes");
        song.increment("Math or CMDAHeard");
        song.increment("Math or CMDALikes");
        song.increment("OtherHeard");
        song.increment("OtherLikes");
        song.increment("NortheastHeard");
        song.increment("NortheastLikes");
        song.increment("SoutheastHeard");
        song.increment("SoutheastLikes");
        song.increment(
            "United States (other than Southeast or Northwest)Heard");
        song.increment(
            "United States (other than Southeast or Northwest)Likes");
        song.increment("Outside of United StatesHeard");
        song.increment("Outside of United StatesLikes");

        String br = "\n";
        StringBuilder sb = new StringBuilder();
        sb.append("Title : Dead Presidents").append(br);
        sb.append("Artist : Rick Ross").append(br);
        sb.append("Year : 2017").append(br);
        sb.append("Genre : Rap").append(br);
        sb.append("readingHeard : 1").append(br);
        sb.append("readingLikes : 1").append(br);
        sb.append("artHeard : 1").append(br);
        sb.append("artLikes : 1").append(br);
        sb.append("sportsHeard : 1").append(br);
        sb.append("sportsLikes : 1").append(br);
        sb.append("musicHeard : 1").append(br);
        sb.append("musicLikes : 1").append(br);
        sb.append("Computer ScienceHeard: 1").append(br);
        sb.append("Computer ScienceLikes : 1").append(br);
        sb.append("Other EngineeringHeard : 1").append(br);
        sb.append("Other EngineeringLikes : 1").append(br);
        sb.append("Math or CMDAHeard : 1").append(br);
        sb.append("Math or CMDALikes : 1").append(br);
        sb.append("OtherHeard : 1").append(br);
        sb.append("OtherLikes : 1").append(br);
        sb.append("NortheastHeard : 1").append(br);
        sb.append("NortheastLikes : 1").append(br);
        sb.append("SoutheastHeard : 1").append(br);
        sb.append("SoutheastLikes : 1").append(br);
        sb.append("United States (other than Southeast or Northwest)Heard : 1")
            .append(br);
        sb.append("United States (other than Southeast or Northwest)Likes : 1")
            .append(br);
        sb.append("Outside of United StatesHeard : 1").append(br);
        sb.append("Outside of United StatesLikes : 1").append(br);
        sb.append("Heard : 4").append(br);
        sb.append("Likes : 4").append(br);

        assertEquals(sb.toString(), song.toString());
    }
}
