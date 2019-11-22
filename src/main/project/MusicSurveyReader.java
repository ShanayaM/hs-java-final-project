/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import project.MusicSurveyInterface;
/**
 *
 * 
 */
public final class MusicSurveyReader {
    public static List getMusicSurveyList(final List songList) {
        String csvFile = System.getProperty("user.dir") + File.separator
            + "MusicSurveyData2018.csv";
        System.out.println("csvFile = " + csvFile);

        List surveyList = new ArrayList();
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        try {
            br = new BufferedReader(new FileReader(csvFile));

            // skip first line
            br.readLine();

            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] data = line.split(cvsSplitBy);
                String personId = data[0];
                String dateOfSurvey = data[1];
                String major = data[2];
                String region = data[3];
                String hobby = data[4];

                // only process valid students not missing any attributes, skip
                // the rest
                if (isValid(major) && isValid(region) && isValid(hobby)) {
                    MusicSurveyInterface survey = new MusicSurvey();
                    survey.setPersonId(personId);
                    survey.setDateOfSurvey(dateOfSurvey);
                    survey.setMajor(major);
                    survey.setRegion(region);
                    survey.setHobby(hobby);

                    // now we can loop through the other 72 songs
                    // since songs are in order then we can rely on the song
                    // list
                    int haveYouHeardIndex = 5;
                    int doYouLikeIndex = 6;
                    for (int i = 0; i < songList.size(); i++) {
                        SongInterface song = (Song)songList.get(i);

                        String haveYouHeard = data[haveYouHeardIndex];
                        String doYouLike = data[doYouLikeIndex];

                        SongQuestionInterface songQuestion = new SongQuestion();
                        songQuestion.setSong(song);
                        songQuestion.setHaveYouHeardTheSong(haveYouHeard);
                        songQuestion.setDoYouLikeTheSong(doYouLike);

                        // if a song response is blank, then do not count it.
                        if (isValid(haveYouHeard) && isValid(doYouLike)) {
                            survey.getSongQuestions().add(songQuestion);
                        }

                        // incremente index by 2
                        haveYouHeardIndex = haveYouHeardIndex + 2;
                        doYouLikeIndex = doYouLikeIndex + 2;
                    }
                    surveyList.add(survey);
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
        return surveyList;
    }


    // If a student attribute is blank (hobby, major, region)
    // then exclude that student from your data.
    // alse
    // If a song response is blank, then do not count it.
    public static boolean isValid(String data) {
        return data != null && !data.equals("");
    }
}
