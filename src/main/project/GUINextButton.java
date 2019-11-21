/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import CS2114.Command;
import CS2114.Widget;
import java.util.List;
import project.GUIInterface;

/**
 *
 *
 */
public class GUINextButton extends GUIModel implements Command{

    public GUINextButton(List model, GUIInterface view) {
        super(model, view);
    }

    @Override
    public void execute(Widget widget) {
        int currentIndex = view.getPaginationIndex();
        int nextIndex = currentIndex+1;
        if(nextIndex<model.size()){
            view.getNextButton().enable();
            view.getPreviousButton().enable();
            view.updateModel(model, nextIndex, view.getCurrentType());
        }
    }
}