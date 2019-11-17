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
    public String getTitle();


    public void setTitle(String title);


    public String getArtist();


    public void setArtist(String artist);


    public String getYear();


    public void setYear(String year);


    public String getGenre();


    public void setGenre(String genre);


    public void increment(String key);


    public int getTotal(String key);
}
