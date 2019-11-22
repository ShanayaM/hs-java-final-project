/*
 * 
 * SongReader class reads the csv file and sets the song 
 * parameters for to be displayed.
 */
package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * 
 */
public class SongReader {

    public static List getSongList() {
        String csvFile = System.getProperty("user.dir") + File.separator
            + "SongList2018.csv";
        System.out.println("csvFile = " + csvFile);

        List songList = new ArrayList();
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] data = line.split(cvsSplitBy);
                String title = data[0];
                String artist = data[1];
                String year = data[2];
                String genre = data[3];
                if (isValid(title) && isValid(artist) && isValid(year)
                    && isValid(genre)) {
                    SongInterface song = new Song();
                    song.setTitle(title);
                    song.setArtist(artist);
                    song.setYear(year);
                    song.setGenre(genre);
                    song.setArtist(artist);
                    songList.add(song);
                }
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (br != null) {
                try {
                    br.close();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return songList;
    }


    // A filter to remove help us skip first row of csv file
    public static boolean isValid(final String data) {
        boolean isValid = true;
        if ("Song Title".equals(data)) {
            isValid = false;
        }
        if ("Artist".equals(data)) {
            isValid = false;
        }
        if ("Year".equals(data)) {
            isValid = false;
        }
        if ("Genre".equals(data)) {
            isValid = false;
        }
        return isValid;
    }
}
