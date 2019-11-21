/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import CS2114.Command;
import CS2114.Widget;
import project.MusicSurveyInterface;
import java.util.Comparator;
import java.util.List;
import project.SongInterface;
import project.GUIInterface;
import java.util.Iterator;

/**
 *
 */
public class GUISortByGenreButton extends GUIModel implements Command {

    public GUISortByGenreButton(List model, GUIInterface view) {
        super(model, view);
    }

    @Override
    public void execute(Widget widget) {
        model.sort(COMPARE_BY_GENRE);
        view.updateModel(model, 0, view.getCurrentType());
        //Generate text output of the data for 2 views hobby, sorted by genre
        if (MusicSurveyInterface.SurveyEnum.HOBBY.equals(view.getCurrentType())) {
            generateTextOutput(model);
        }
    }

    public static Comparator<SongInterface> COMPARE_BY_GENRE = new Comparator<SongInterface>() {
        public int compare(SongInterface one, SongInterface other) {
            return one.getGenre().toLowerCase().compareTo(other.getGenre().toLowerCase());
        }
    };

    private void generateTextOutput(List model) {
        Iterator iterator = model.iterator();
        String br = "\n";
        StringBuilder sb = new StringBuilder();
        while (iterator.hasNext()) {
            SongInterface song = (SongInterface) iterator.next();
            sb.append("genre : ").append(song.getGenre()).append(br);
            sb.append("title : ").append(song.getTitle()).append(br);
            sb.append("reading heard : ").append(song.getTotal("readingHeard")).append(br);
            sb.append("reading likes : ").append(song.getTotal("readingLikes")).append(br);
            sb.append("art heard : ").append(song.getTotal("artHeard")).append(br);
            sb.append("art likes : ").append(song.getTotal("artLikes")).append(br);
            sb.append("sports heard : ").append(song.getTotal("sportsHeard")).append(br);
            sb.append("sports likes : ").append(song.getTotal("sportsLikes")).append(br);
            sb.append("music heard : ").append(song.getTotal("musicHeard")).append(br);
            sb.append("music likes : ").append(song.getTotal("musicLikes")).append(br);
            sb.append("total heard : ").append(song.getTotal("Heard")).append(br);
            sb.append("total likes : ").append(song.getTotal("Likes")).append(br);
            sb.append("----------------------------").append(br);
        }
        System.out.println(sb.toString());
    }
}
