/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import CS2114.Button;
import project.MusicSurveyInterface.SurveyEnum;
import java.util.List;

/**
 *
 *
 */
public interface GUIInterface {
    public int getPaginationIndex();


    public SurveyEnum getCurrentType();


    public void updateModel(List model, int index, SurveyEnum type);


    // USED BY CONTROLLER TO ADD ACTION COMMAND
    Button getNextButton();


    Button getPreviousButton();


    Button getQuitButton();


    Button getRepresentHobbyButton();


    Button getRepresentMajorButton();


    Button getRepresentRegionButton();


    Button getSortByArtistNameButton();


    Button getSortByGenreButton();


    Button getSortByReleaseYearButton();


    Button getSortBySongTitleButton();
}
