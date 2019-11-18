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
    public enum SurveyEnum {
        HOBBY, MAJOR, REGION;
    }


    public String getPersonId();


    public void setPersonId(String personId);


    public String getDateOfSurvey();


    public void setDateOfSurvey(String dateOfSurvey);


    public String getMajor();


    public void setMajor(String major);


    public String getRegion();


    public void setRegion(String region);


    public String getHobby();


    public void setHobby(String hobby);


    public List getSongQuestions();


    public void setSongQuestions(List songQuestions);
}
