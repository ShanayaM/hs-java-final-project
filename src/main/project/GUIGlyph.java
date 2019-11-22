/*
 * 
 * Glyph GUI
 * 
 */
package gui;

import CS2114.Shape;
import CS2114.TextShape;
import project.MusicSurveyInterface.SurveyEnum;
import java.awt.Color;

/**
 *
 *
 */
public final class GUIGlyph implements GUIMiniGraph {
    private final TextShape titleLabel = new TextShape(0, 10, "");
    private final TextShape artistLabel = new TextShape(0, 25, "");
    private final Shape hl = new Shape(0, 45, 5, 40, Color.BLACK);
    private Shape one = new Shape(0, 45, 200, 10, Color.MAGENTA);
    private Shape two = new Shape(0, 55, 200, 10, Color.BLUE);
    private Shape three = new Shape(0, 65, 200, 10, Color.ORANGE);
    private Shape four = new Shape(0, 75, 200, 10, Color.GREEN);

    public GUIGlyph(final Shape container, final SongInterface song,
                    final SurveyEnum type) {
        int x = container.getX();
        int y = container.getY();
        int width = container.getWidth();
        int centerWidth = width / 2;

        titleLabel.setText(song.getTitle());
        titleLabel.setBackgroundColor(Color.WHITE);
        titleLabel.setX(centerWidth - (titleLabel.getWidth() / 2));
        titleLabel.moveTo(titleLabel.getX() + container.getX(), titleLabel.getY() + container.getY());

        artistLabel.setText("by " + song.getArtist());
        artistLabel.setBackgroundColor(Color.WHITE);
        artistLabel.setX(centerWidth - (artistLabel.getWidth()/2));
        artistLabel.moveTo(artistLabel.getX()+container.getX(), artistLabel.getY()+container.getY());

        int onePercentYes = 0;
        int twoPercentYes = 0;
        int threePercentYes = 0;
        int fourPercentYes = 0;
        //set the withds based on the enum type
        if (SurveyEnum.HOBBY.equals(type)) {
            int readingHeard = song.getTotal("readingHeard");
            int readingLikes = song.getTotal("readingLikes");
            onePercentYes = getPercentYes(readingHeard,
                                          readingLikes);
            one = new Shape(0, 45, onePercentYes, 10, Color.MAGENTA);

            int artHeard = song.getTotal("artHeard");
            int artLikes = song.getTotal("artLikes");
            twoPercentYes = getPercentYes(artHeard, artLikes);
            two = new Shape(0, 55, twoPercentYes, 10, Color.BLUE);

            int sportsHeard = song.getTotal("sportsHeard");
            int sportsLikes = song.getTotal("sportsLikes");
            threePercentYes = getPercentYes(sportsHeard,
                                            sportsLikes);
            three = new Shape(0, 65, threePercentYes, 10, Color.ORANGE);

            int musicHeard = song.getTotal("musicHeard");
            int musicLikes = song.getTotal("musicLikes");
            fourPercentYes = getPercentYes(musicHeard, musicLikes);
            four = new Shape(0, 75, fourPercentYes, 10, Color.GREEN);
        }else if(SurveyEnum.MAJOR.equals(type)){
            int computerScienceHeard = song.getTotal("Computer ScienceHeard");
            int computerScienceLikes = song.getTotal("Computer ScienceLikes");
            onePercentYes = getPercentYes(computerScienceHeard,
                                          computerScienceLikes);
            one = new Shape(0, 45, onePercentYes, 10, Color.MAGENTA);

            int otherEngineeringHeard = song.getTotal("Other"
                    + "EngineeringHeard");
            int otherEngineeringLikes = song.getTotal("Other"
                                  + "EngineeringLikes");
            twoPercentYes = getPercentYes(otherEngineeringHeard,
                                          otherEngineeringLikes);
            two = new Shape(0, 55, twoPercentYes, 10, Color.BLUE);

            int mathOrCMDAHeard = song.getTotal("Math or CMDAHeard");
            int mathOrCMDALikes = song.getTotal("Math or CMDALikes");
            threePercentYes = getPercentYes(mathOrCMDAHeard,
                                            mathOrCMDALikes);
            three = new Shape(0, 65, threePercentYes, 10, Color.ORANGE);

            int otherHeard = song.getTotal("OtherHeard");
            int otherLikes = song.getTotal("OtherLikes");
            fourPercentYes = getPercentYes(otherHeard, otherLikes);
            four = new Shape(0, 75, fourPercentYes, 10, Color.GREEN);
        } else if (SurveyEnum.REGION.equals(type)) {
            int northeastHeard = song.getTotal("NortheastHeard");
            int northeastLikes = song.getTotal("NortheastLikes");
            onePercentYes = getPercentYes(northeastHeard,
                                          northeastLikes);
            one = new Shape(0, 45, onePercentYes, 10, Color.MAGENTA);

            int southeastHeard = song.getTotal("SoutheastHeard");
            int southeastLikes = song.getTotal("SoutheastLikes");
            twoPercentYes = getPercentYes(southeastHeard,
                                          southeastLikes);
            two = new Shape(0, 55, twoPercentYes, 10, Color.BLUE);

            int unitedStatesOtherThanSoutheastOrNorthwestHeard = song.getTotal("United States (other than Southeast or Northwest)Heard");
            int unitedStatesOtherThanSoutheastOrNorthwestLikes = song.getTotal("United States (other than Southeast or Northwest)Likes");
            threePercentYes = getPercentYes(unitedStatesOtherThanSoutheastOrNorthwestHeard, unitedStatesOtherThanSoutheastOrNorthwestLikes);
            three = new Shape(0, 65, threePercentYes, 10, Color.ORANGE);

            int outsideOfUnitedStatesHeard = song.getTotal("Outside of"
                                                           + "United StatesHeard");
            int outsideOfUnitedStatesLikes = song.getTotal("Outside of"
                                                           + "United StatesLikes");
            fourPercentYes = getPercentYes(outsideOfUnitedStatesHeard,
                                           outsideOfUnitedStatesLikes);
            four = new Shape(0, 75, fourPercentYes, 10, Color.GREEN);
        }

        //figure out if more people liked it than not likes it
        boolean oneMorePeopleLikedSoMoveRight = onePercentYes > 50;
        boolean twoMorePeopleLikedSoMoveRight = twoPercentYes > 50;
        boolean threeMorePeopleLikedSoMoveRight = threePercentYes > 50;
        boolean fourMorePeopleLikedSoMoveRight = fourPercentYes > 50;

        float onePercentYesPercentYes = (float) onePercentYes * ((float) onePercentYes * (float) .01);
        float twoPercentYesPercentYes = (float) twoPercentYes * ((float) twoPercentYes * (float) .01);
        float threePercentYesPercentYes = (float) threePercentYes * ((float) threePercentYes * (float) .01);
        float fourPercentYesPercentYes = (float) fourPercentYes * ((float) fourPercentYes * (float) .01);


        one.setX(centerWidth - (one.getWidth() / 2));
        one.moveTo(one.getX() + container.getX(), one.getY() + container.getY());
        //divive by 2 since we're centered
        int oneAmountToMove = (int) onePercentYesPercentYes / 2;
        if (oneMorePeopleLikedSoMoveRight){
            one.moveTo(one.getX() + oneAmountToMove, one.getY());
        } else {
            one.moveTo(one.getX() - oneAmountToMove, one.getY());
        }

        two.setX(centerWidth - (two.getWidth() / 2));
        two.moveTo(two.getX() + container.getX(), two.getY() + container.getY());
        //divive by 2 since we're centered
        int twoAmountToMove = (int) twoPercentYesPercentYes / 2;
        if (twoMorePeopleLikedSoMoveRight) {
            two.moveTo(two.getX() + twoAmountToMove, two.getY());
        } else {
            two.moveTo(two.getX() - twoAmountToMove, two.getY());
        }

        three.setX(centerWidth - (three.getWidth()/2));
        three.moveTo(three.getX() + container.getX(), three.getY() + container.getY());
        //divive by 2 since we're centered
        int threeAmountToMove = (int) threePercentYesPercentYes / 2;
        if (threeMorePeopleLikedSoMoveRight) {
            three.moveTo(three.getX() + threeAmountToMove, three.getY());
        } else {
            three.moveTo(three.getX() - threeAmountToMove, three.getY());
        }

        four.setX(centerWidth - (four.getWidth() / 2));
        four.moveTo(four.getX() + container.getX(),
                    four.getY() + container.getY());
        //divive by 2 since we're centered
        int fourAmountToMove = (int) fourPercentYesPercentYes / 2;
        if (fourMorePeopleLikedSoMoveRight) {
            four.moveTo(four.getX() + fourAmountToMove, four.getY());
        } else {
            four.moveTo(four.getX() - fourAmountToMove, four.getY());
        }

        hl.setX(centerWidth - (hl.getWidth() / 2));
        hl.moveTo(hl.getX() + container.getX(), hl.getY() + container.getY());
    }

    public int getPercentYes(final int heard, final int likes){
        return likes * 100/ heard;
    }

    @Override
    public Shape[] getGlyph(){
        Shape[] shapes = new Shape[7];
        shapes[0] = titleLabel;
        shapes[1] = artistLabel;
        shapes[2] = hl;
        shapes[3] = one;
        shapes[4] = two;
        shapes[5] = three;
        shapes[6] = four;

        return shapes;
    }
}
