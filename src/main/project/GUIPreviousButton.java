/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import CS2114.Command;
import CS2114.Widget;
import java.util.List;

/**
 *
 */
public final class GUIPreviousButton
    extends GUIModel implements Command {

    public GUIPreviousButton(final List model,
                             final GUIInterface view) {
        super(model, view);
    }

    @Override
    public void execute(Widget widget) {
        int currentIndex = view.getPaginationIndex();
        if (currentIndex > 8) {
            if (currentIndex - 17 >= 0) {
                view.getNextButton().enable();
                view.getPreviousButton().enable();
                view.updateModel(model, currentIndex - 17,
                                 view.getCurrentType());
            }
        }
    }
}
