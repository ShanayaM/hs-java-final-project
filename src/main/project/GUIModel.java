/*
 * 
 * GUI Model class to instantiate the gui
 * 
 */
package project;

import java.util.List;
import project.GUIInterface;

/**
 *
 *
 */
public class GUIModel {
    protected List model;
    protected GUIInterface view;
    
    public GUIModel(final List m, final GUIInterface v) {
        this.model = m;
        this.view = v;
    }
}
