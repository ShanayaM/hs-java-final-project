/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.List;

/**
 *
 * 
 */
public interface MusicSurveyInterface {
    enum SurveyEnum {
        HOBBY, MAJOR, REGION;
    }
    String getPersonId();
    void setPersonId(String personId);
    String getDateOfSurvey();
    void setDateOfSurvey(String dateOfSurvey);
    String getMajor();
    void setMajor(String major);
    String getRegion();
    void setRegion(String region);
    String getHobby();
    void setHobby(String hobby);
    List getSongQuestions();
    void setSongQuestions(List songQuestions);
}
