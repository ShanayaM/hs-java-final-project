/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import CS2114.Command;
import CS2114.Widget;
import java.util.Comparator;
import java.util.List;
import project.SongInterface;
import project.GUIInterface;

/**
 *
 */
public class GUISortByReleaseYearButton extends GUIModel implements Command{

    public GUISortByReleaseYearButton(List model, GUIInterface view) {
        super(model, view);
    }

    @Override
    public void execute(Widget widget) {
        model.sort(COMPARE_BY_RELEASE_YEAR);
        view.updateModel(model, 0, view.getCurrentType());
    }

    public static Comparator<SongInterface> COMPARE_BY_RELEASE_YEAR = new Comparator<SongInterface>() {
        public int compare(SongInterface one, SongInterface other) {
            return one.getYear().toLowerCase().compareTo(other.getYear().toLowerCase());
        }
    };
}