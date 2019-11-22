/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * 
 */
public interface SongInterface {
    String getTitle();
    void setTitle(String title);
    String getArtist();
    void setArtist(String artist);
    String getYear();
    void setYear(String year);
    String getGenre();
    void setGenre(String genre);
    void increment(String key);
    int getTotal(String key);
}
