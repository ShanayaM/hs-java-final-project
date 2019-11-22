/*
 * 
 * 
 * 
 */
package project.gui;

import project.MusicSurveyInterface.SurveyEnum;
import java.util.List;
import project.GUIInterface;

/**
 *
 *
 */
public class GUIFunction {
    public GUIFunction(List model, GUIInterface view){
        //Controller keeps model and view separate from each other.

        //Update the view with the model
        view.updateModel(model, 0, SurveyEnum.HOBBY);

        //NORTH BUTTONS
        view.getPreviousButton().onClick(new GUIPreviousButton(model, view));
        view.getSortByArtistNameButton().onClick(new GUISortByArtistNameButton(model, view));
        view.getSortBySongTitleButton().onClick(new GUISortBySongTitleButton(model, view));
        view.getSortByReleaseYearButton().onClick(new GUISortByReleaseYearButton(model, view));
        view.getSortByGenreButton().onClick(new GUISortByGenreButton(model, view));
        view.getNextButton().onClick(new GUINextButton(model, view));
        //SOUTH BUTTONS
        view.getRepresentHobbyButton().onClick(new GUIRepresentHobyyButton(model, view));
        view.getRepresentMajorButton().onClick(new GUIRepresentMajorButton(model, view));
        view.getRepresentRegionButton().onClick(new GUIRepresentRegionButton(model, view));
        view.getQuitButton().onClick(new GUIQuitButton(model, view));
    }
}
