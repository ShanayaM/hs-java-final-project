/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.List;
/**
 *
 */
public final class ProjectRunner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //get data from csv
        List songList = project.SongReader.getSongList();
        List musicSurveyList = MusicSurveyReader.getMusicSurveyList(songList);

        //tally the survey results with song list to create the song survey model
        //loop through the 300+ surveys
        for (int i = 0; i < musicSurveyList.size(); i++) {

            //the survey has a list of songs that we asked 1 student about
            MusicSurveyInterface survey = (MusicSurveyInterface) musicSurveyList.get(i);
            String hobby = survey.getHobby();
            String major = survey.getMajor();
            String region = survey.getRegion();

            //get the questions
            List questions = survey.getSongQuestions();
            //loop through the 70+ survey song questions and update the resutls into the songs
            for (int j = 0; j < questions.size(); j++) {
                //get the specific song question
                SongQuestionInterface question = (SongQuestionInterface)questions.get(j);
                boolean heard = question.getHaveYouHeardTheSong().equals("Yes");
                boolean likes = question.getDoYouLikeTheSong().equals("Yes");
                SongInterface songInQuestion = (SongInterface)question.getSong();

                //find the song in our master list
                for (int k=0; k < songList.size(); k++) {
                    SongInterface song = (SongInterface) songList.get(k);
                    //once we find the song
                    if (song.equals(songInQuestion)) {
                        if (heard) {
                            song.increment("Heard");
                        }
                        if (likes) {
                            song.increment("Likes");
                        }
                        //Heard it
                        if (heard) {
                            song.increment(hobby+"Heard");
                            song.increment(major+"Heard");
                            song.increment(region+"Heard");
                        }
                        //Heard and liked
                        if (heard && likes) {
                            song.increment(hobby+"Likes");
                            song.increment(major+"Likes");
                            song.increment(region+"Likes");
                        }

                        songList.set(k, song);
                        break;
                    }
                }
            }
        }

        //here we have a real model with survey data inside
        //model does not know about the view
        List model = songList;
        //view dows not know about the model
        GUIInterface view = new GUIWindow();
        //controller keeps the model and view separate
        GUIFunction controller = new GUIFunction(model, view);
    }
}
