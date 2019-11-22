/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.gui;

import project.GUIInterface;
import CS2114.Button;
import CS2114.Shape;
import CS2114.Window;
import CS2114.WindowSide;
import project.MusicSurveyInterface.SurveyEnum;
import java.awt.Color;
import java.util.List;
import project.SongInterface;

/**
 *
 */
public class GUIWindow implements GUIInterface {


    private final Button previousButton = new Button("<- Prev");
    private final Button sortByArtistNameButton = new Button("Sort by Artist Name");
    private final Button sortBySongTitleButton = new Button("Sort by Song Title");
    private final Button sortByReleaseYearButton = new Button("Sort by Release Year");
    private final Button sortByGenreButton = new Button("Sort by Genre");
    private final Button nextButton = new Button("Next ->");

    private final int width = 236;
    private final int height = 96;
    private final int topRowY = 0;
    private final int centerRowY = 100;
    private final int bottomRowY = 200;
    private final int leftX = 0;
    private final int centerX = 240;
    private final int rightX = 480;

    private final Shape topLeft = new Shape(leftX, topRowY, width, height, Color.LIGHT_GRAY);
    private final Shape topCenter = new Shape(centerX, topRowY, width, height, Color.LIGHT_GRAY);
    private final Shape topRight = new Shape(rightX, topRowY, width, height, Color.LIGHT_GRAY);

    private final Shape centerLeft = new Shape(leftX, centerRowY, width, height, Color.LIGHT_GRAY);
    private final Shape centerCenter = new Shape(centerX, centerRowY, width, height, Color.LIGHT_GRAY);
    private final Shape centerRight = new Shape(rightX, centerRowY, width, height, Color.LIGHT_GRAY);

    private final Shape bottomLeft = new Shape(leftX, bottomRowY, width, height, Color.LIGHT_GRAY);
    private final Shape bottomCenter = new Shape(centerX, bottomRowY, width, height, Color.LIGHT_GRAY);
    private final Shape bottomRight = new Shape(rightX, bottomRowY, width, height, Color.LIGHT_GRAY);

    private final Shape legendBg = new Shape(720, 136, 120, 160, Color.BLACK);
    private final Shape legendFg = new Shape(722, 138, 116, 156, Color.WHITE);

    private final Button representHobbyButton = new Button("Represent Hobby");
    private final Button representMajorButton = new Button("Represent Major");
    private final Button representRegionButton = new Button("Represent Region");
    private final Button quitButton = new Button("Quit");


    final Window w = new Window("Parshad Barot");

    public GUIWindow() {

        int windowWidth = 843;
        int windowHeight = 400;

        //set preffered min dimesions
        w.setSize(windowWidth, windowHeight);

        //NORTH BUTTONS
        w.addButton(previousButton, WindowSide.NORTH);
        previousButton.disable();

        w.addButton(sortByArtistNameButton, WindowSide.NORTH);
        w.addButton(sortBySongTitleButton, WindowSide.NORTH);
        w.addButton(sortByReleaseYearButton, WindowSide.NORTH);
        w.addButton(sortByGenreButton, WindowSide.NORTH);
        w.addButton(nextButton, WindowSide.NORTH);
        //SOUTH BUTTONS
        w.addButton(representHobbyButton, WindowSide.SOUTH);
        w.addButton(representMajorButton, WindowSide.SOUTH);
        w.addButton(representRegionButton, WindowSide.SOUTH);
        w.addButton(quitButton, WindowSide.SOUTH);

        //protective glass to block you from clicking screen elements
//        Color glass = new Color(0f, 0f, 0f, .0f);
//        Shape securityGlass = new Shape(0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE, glass);
//        w.addShape(securityGlass);
//        w.moveToFront(securityGlass);
    }

    //index used for pagination
    private int paginationIndex;

    //pagination has to do with view not model
    @Override
    public int getPaginationIndex(){
        return paginationIndex;
    }

    private SurveyEnum currentType;
    @Override
    public SurveyEnum getCurrentType(){
        return currentType;
    }

    @Override
    public void updateModel(List model, int index, SurveyEnum type){
        w.removeAllShapes();

        currentType = type;

        if(model!=null && !model.isEmpty()){
            int size = model.size();
            if(index < size){
                this.paginationIndex = index;
                addGlyph(w, new GUIGlyph(topLeft, (SongInterface)model.get(index), type));
            }
            if(index + 1 < size){
                this.paginationIndex = index + 1;
                addGlyph(w, new GUIGlyph(topCenter, (SongInterface)model.get(index+1), type));
            }
            if(index + 2 < size){
                this.paginationIndex = index + 2;
                addGlyph(w, new GUIGlyph(topRight, (SongInterface)model.get(index+2), type));
            }

            if(index + 3 < size){
                this.paginationIndex = index + 3;
                addGlyph(w, new GUIGlyph(centerLeft, (SongInterface)model.get(index+3), type));
            }
            if(index + 4 < size){
                this.paginationIndex = index + 4;
                addGlyph(w, new GUIGlyph(centerCenter, (SongInterface)model.get(index+4), type));
            }
            if(index + 5 < size){
                this.paginationIndex = index + 5;
                addGlyph(w, new GUIGlyph(centerRight, (SongInterface)model.get(index+5), type));
            }

            if(index + 6 < size){
                this.paginationIndex = index + 6;
                addGlyph(w, new GUIGlyph(bottomLeft, (SongInterface)model.get(index+6), type));
            }
            if(index + 7 < size){
                this.paginationIndex = index + 7;
                addGlyph(w, new GUIGlyph(bottomCenter, (SongInterface)model.get(index+7), type));
            }
            if(index + 8 < size){
                this.paginationIndex = index + 8;
                addGlyph(w, new GUIGlyph(bottomRight, (SongInterface)model.get(index+8), type));
            }
        }

        addGlyph(w, new GUILegend(legendBg, (SongInterface)model.get(index), type));
        w.addShape(legendFg);
        w.addShape(legendBg);
    }

    /**
     * @return the previousButton
     */
    @Override
    public Button getPreviousButton() {
        return previousButton;
    }

    /**
     * @return the nextButton
     */
    @Override
    public Button getNextButton() {
        return nextButton;
    }

    private void addGlyph(Window w, GUIMiniGraph miniGraph) {
        Shape[] shapes = miniGraph.getGlyph();
        for (Shape shape : shapes) {
            w.addShape(shape);
        }
    }

    /**
     * @return the sortByArtistNameButton
     */
    @Override
    public Button getSortByArtistNameButton() {
        return sortByArtistNameButton;
    }

    /**
     * @return the sortBySongTitleButton
     */
    @Override
    public Button getSortBySongTitleButton() {
        return sortBySongTitleButton;
    }

    /**
     * @return the sortByReleaseYearButton
     */
    @Override
    public Button getSortByReleaseYearButton() {
        return sortByReleaseYearButton;
    }

    /**
     * @return the sortByGenreButton
     */
    @Override
    public Button getSortByGenreButton() {
        return sortByGenreButton;
    }

    /**
     * @return the representHobbyButton
     */
    @Override
    public Button getRepresentHobbyButton() {
        return representHobbyButton;
    }

    /**
     * @return the representMajorButton
     */
    @Override
    public Button getRepresentMajorButton() {
        return representMajorButton;
    }

    /**
     * @return the representRegionButton
     */
    @Override
    public Button getRepresentRegionButton() {
        return representRegionButton;
    }

    /**
     * @return the quitButton
     */
    @Override
    public Button getQuitButton() {
        return quitButton;
    }



//    public static void main(String[] args) {
//        new View();
//    }

}
