/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.ArrayList;
import java.util.List;
import project.MusicSurveyInterface;

/**
 *
 *  
 */
public class MusicSurvey implements MusicSurveyInterface {

    /**
     * @return the personId
     */
    @Override
    public String getPersonId() {
        return personId;
    }


    /**
     * @param personId
     *            the personId to set
     */
    @Override
    public void setPersonId(String personId) {
        this.personId = personId;
    }


    /**
     * @return the dateOfSurvey
     */
    @Override
    public String getDateOfSurvey() {
        return dateOfSurvey;
    }


    /**
     * @param dateOfSurvey
     *            the dateOfSurvey to set
     */
    @Override
    public void setDateOfSurvey(String dateOfSurvey) {
        this.dateOfSurvey = dateOfSurvey;
    }


    /**
     * @return the major
     */
    @Override
    public String getMajor() {
        return major;
    }


    /**
     * @param major
     *            the major to set
     */
    @Override
    public void setMajor(String major) {
        this.major = major;
    }


    /**
     * @return the regions
     */
    @Override
    public String getRegion() {
        return region;
    }


    /**
     * @param region
     *            the region to set
     */
    @Override
    public void setRegion(String region) {
        this.region = region;
    }


    /**
     * @return the hobby
     */
    @Override
    public String getHobby() {
        return hobby;
    }


    /**
     * @param hobby
     *            the hobby to set
     */
    @Override
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


    /**
     * @return the songQuestions
     */
    @Override
    public List getSongQuestions() {
        return songQuestions;
    }


    /**
     * @param songQuestions
     *            the songQuestions to set
     */
    @Override
    public void setSongQuestions(List songQuestions) {
        this.songQuestions = songQuestions;
    }

    private String personId;
    private String dateOfSurvey;
    private String major;
    private String region;
    private String hobby;
    // contains a list of 72 ISongQuestion
    private List songQuestions = new ArrayList();
}
