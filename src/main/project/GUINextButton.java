/*
 * 
 * GUI for rendering next button
 * 
 */
package project;

import CS2114.Command;
import CS2114.Widget;
import java.util.List;

/**
 *
 *
 */
public final class GUINextButton
    extends GUIModel implements Command {

    public GUINextButton(final List model,
                         final GUIInterface view) {
        super(model, view);
    }

    @Override
    public void execute(final Widget widget) {
        int currentIndex = view.getPaginationIndex();
        int nextIndex = currentIndex + 1;
        if (nextIndex < model.size()) {
            view.getNextButton().enable();
            view.getPreviousButton().enable();
            view.updateModel(model, nextIndex, view.getCurrentType());
        }
    }
}
