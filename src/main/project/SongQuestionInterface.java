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
    SongInterface getSong();
    void setSong(SongInterface song);
    String getHaveYouHeardTheSong();
    void setHaveYouHeardTheSong(String answer);
    String getDoYouLikeTheSong();
    void setDoYouLikeTheSong(String answer);
}
