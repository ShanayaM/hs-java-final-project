/*
 * 
 * GUI for rendering quit button
 * 
 */
package project;

import CS2114.Command;
import CS2114.Widget;
import java.util.List;

/**
 *
 */
public final class GUIQuitButton extends GUIModel implements Command {

    public GUIQuitButton(final List model, final GUIInterface view) {
        super(model, view);
    }

    @Override
    public void execute(Widget widget) {
        System.exit(0);
    }
}
