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
public final class SongQuestion implements SongQuestionInterface {
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
     * @param s
     *            the song to set
     */
    @Override
    public void setSong(final SongInterface s) {
        this.song = s;
    }


    /**
     * @return the haveYouHeardTheSong
     */
    @Override
    public String getHaveYouHeardTheSong() {
        return haveYouHeardTheSong;
    }


    /**
     * @param heardSong
     *            the haveYouHeardTheSong to set
     */
    @Override
    public void setHaveYouHeardTheSong(final String heardSong) {
        this.haveYouHeardTheSong = heardSong;
    }


    /**
     * @return the doYouLikeTheSong
     */
    @Override
    public String getDoYouLikeTheSong() {
        return doYouLikeTheSong;
    }


    /**
     * @param likeSong
     *            the doYouLikeTheSong to set
     */
    @Override
    public void setDoYouLikeTheSong(final String likeSong) {
        this.doYouLikeTheSong = likeSong;
    }    
}
