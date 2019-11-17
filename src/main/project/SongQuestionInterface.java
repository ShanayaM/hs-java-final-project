/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 *
 */
public interface SongQuestionInterface {
    public SongInterface getSong();


    public void setSong(SongInterface song);


    public String getHaveYouHeardTheSong();


    public void setHaveYouHeardTheSong(String answer);


    public String getDoYouLikeTheSong();


    public void setDoYouLikeTheSong(String answer);
}
