/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import CS2114.Command;
import CS2114.Widget;
import project.MusicSurveyInterface.SurveyEnum;
import java.util.List;
import project.GUIInterface;

/**
 *
 */
public class GUIRepresentMajorButton extends GUIModel implements Command{

    public GUIRepresentMajorButton(List model, GUIInterface view) {
        super(model, view);
    }

    @Override
    public void execute(Widget widget) {
        view.updateModel(model, view.getPaginationIndex()-8, SurveyEnum.MAJOR);
    }
}