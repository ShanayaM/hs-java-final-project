/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import project.SongInterface;
import project.SongQuestionInterface;

/**
 *
 * 
 */
public class SongQuestion implements SongQuestionInterface {
    private SongInterface song;
    private String haveYouHeardTheSong;
    private String doYouLikeTheSong;

    /**
     * @return the song
     */
    @Override
    public SongInterface getSong() {
        return song;
    }


    /**
     * @param song
     *            the song to set
     */
    @Override
    public void setSong(SongInterface song) {
        this.song = song;
    }


    /**
     * @return the haveYouHeardTheSong
     */
    @Override
    public String getHaveYouHeardTheSong() {
        return haveYouHeardTheSong;
    }


    /**
     * @param haveYouHeardTheSong
     *            the haveYouHeardTheSong to set
     */
    @Override
    public void setHaveYouHeardTheSong(String haveYouHeardTheSong) {
        this.haveYouHeardTheSong = haveYouHeardTheSong;
    }


    /**
     * @return the doYouLikeTheSong
     */
    @Override
    public String getDoYouLikeTheSong() {
        return doYouLikeTheSong;
    }


    /**
     * @param doYouLikeTheSong
     *            the doYouLikeTheSong to set
     */
    @Override
    public void setDoYouLikeTheSong(String doYouLikeTheSong) {
        this.doYouLikeTheSong = doYouLikeTheSong;
    }

    
}
