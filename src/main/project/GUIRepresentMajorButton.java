/*
 * 
 * GUI for rendering represent major button
 * 
 */
package project;

import CS2114.Command;
import CS2114.Widget;
import project.MusicSurveyInterface.SurveyEnum;
import java.util.List;

/**
 *
 */
public final class GUIRepresentMajorButton
    extends GUIModel implements Command {

    public GUIRepresentMajorButton(final List model,
                                   final GUIInterface view) {
        super(model, view);
    }

    @Override
    public void execute(final Widget widget) {
        view.updateModel(model, view.getPaginationIndex()- 8,
                         SurveyEnum.MAJOR);
    }
}
