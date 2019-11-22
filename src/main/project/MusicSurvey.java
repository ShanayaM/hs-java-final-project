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
     * @param id
     *            the personId to set
     */
    @Override
    public void setPersonId(final String id) {
        this.personId = id;
    }


    /**
     * @return the dateOfSurvey
     */
    @Override
    public String getDateOfSurvey() {
        return dateOfSurvey;
    }


    /**
     * @param dos
     *            the dateOfSurvey to set
     */
    @Override
    public void setDateOfSurvey(final String dos) {
        this.dateOfSurvey = dos;
    }


    /**
     * @return the major
     */
    @Override
    public String getMajor() {
        return major;
    }


    /**
     * @param m
     *            the major to set
     */
    @Override
    public void setMajor(final String m) {
        this.major = m;
    }


    /**
     * @return the regions
     */
    @Override
    public String getRegion() {
        return region;
    }


    /**
     * @param r
     *            the region to set
     */
    @Override
    public void setRegion(final String r) {
        this.region = r;
    }


    /**
     * @return the hobby
     */
    @Override
    public String getHobby() {
        return hobby;
    }

    /**
     * @param hob
     *            the hobby to set
     */
    @Override
    public void setHobby(final String hob) {
        this.hobby = hob;
    }


    /**
     * @return the songQuestions
     */
    @Override
    public List getSongQuestions() {
        return songQuestions;
    }


    /**
     * @param questions
     *            the songQuestions to set
     */
    @Override
    public void setSongQuestions(final List questions) {
        this.songQuestions = questions;
    }

    private String personId;
    private String dateOfSurvey;
    private String major;
    private String region;
    private String hobby;
    // contains a list of 72 ISongQuestion
    private List songQuestions = new ArrayList();
}
