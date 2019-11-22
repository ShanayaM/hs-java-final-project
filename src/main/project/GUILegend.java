/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import CS2114.Shape;
import CS2114.TextShape;
import project.MusicSurveyInterface.SurveyEnum;
import java.awt.Color;
import project.SongInterface;

/**
 *
 *
 */
public final class GUILegend implements GUIMiniGraph {
    private TextShape legend = new TextShape(5, 5, "");
    private TextShape one = new TextShape(5, 25, "", Color.MAGENTA);
    private TextShape two = new TextShape(5, 40, "", Color.BLUE);
    private TextShape three = new TextShape(5, 55, "", Color.ORANGE);
    private TextShape four = new TextShape(5, 70, "", Color.GREEN);

    private TextShape songTitle = new TextShape(0, 90, "Song Title");
    private TextShape heard = new TextShape(13, 120, "Heard");
    private Shape hl = new Shape(0, 110, 5, 40, Color.BLACK);
    private TextShape likes = new TextShape(65, 120, "Likes");

    public GUILegend(final Shape cont,
                     final SongInterface song,
                     final SurveyEnum type) {
        int x = cont.getX();
        int y = cont.getY();
        int width = cont.getWidth();
        int height = cont.getHeight();

        int centerWidth = width / 2;
        int centerHeight = height / 2;

        if (SurveyEnum.HOBBY.equals(type)) {
            legend.setText("Hobby Legend");
            one.setText("Read");
            two.setText("Art");
            three.setText("Sports");
            four.setText("Music");
        } else if (SurveyEnum.MAJOR.equals(type)) {
            legend.setText("Major Legend");
            one.setText("CSCI");
            two.setText("Other Eng");
            three.setText("Math or CMDA");
            four.setText("Other");
        } else if (SurveyEnum.REGION.equals(type)) {
            legend.setText("Region Legend");
            one.setText("Northeast");
            two.setText("Southeast");
            three.setText("United States");
            four.setText("Outside US");
        }

        legend.setBackgroundColor(Color.WHITE);
        legend.moveTo(legend.getX() + cont.getX(), legend.getY() + cont.getY());

        one.setBackgroundColor(Color.WHITE);
        one.moveTo(one.getX() + cont.getX(), one.getY() + cont.getY());

        two.setBackgroundColor(Color.WHITE);
        two.moveTo(two.getX() + cont.getX(), two.getY() + cont.getY());

        three.setBackgroundColor(Color.WHITE);
        three.moveTo(three.getX() + cont.getX(), three.getY() + cont.getY());

        four.setBackgroundColor(Color.WHITE);
        four.moveTo(four.getX() + cont.getX(), four.getY() + cont.getY());

        songTitle.setBackgroundColor(Color.WHITE);
        songTitle.setX(centerWidth - (songTitle.getWidth() / 2));
        songTitle.moveTo(songTitle.getX() + cont.getX(),
                songTitle.getY() + cont.getY());

        heard.setBackgroundColor(Color.WHITE);
        heard.moveTo(heard.getX() + cont.getX(),
                heard.getY() + cont.getY());

        hl.setX(centerWidth - (hl.getWidth() / 2));
        hl.moveTo(hl.getX() + cont.getX(),
                hl.getY() + cont.getY());

        likes.setBackgroundColor(Color.WHITE);
        likes.moveTo(likes.getX() + cont.getX(),
                likes.getY() + cont.getY());
    }

    public Shape[] getGlyph() {
        Shape[] shapes = new Shape[9];
        shapes[0] = legend;
        shapes[1] = one;
        shapes[2] = two;
        shapes[3] = three;
        shapes[4] = four;
        shapes[5] = songTitle;
        shapes[6] = heard;
        shapes[7] = hl;
        shapes[8] = likes;

        return shapes;
    }}
