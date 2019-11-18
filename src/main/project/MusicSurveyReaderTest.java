/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.List;
import static org.junit.Assert.*;

/**
 *
 * 
 */
public class MusicSurveyReaderTest extends student.TestCase {

    /**
     * Test of getMusicSurveyList method, of class MusicSurveyETL.
     */
    public void testGetMusicSurveyList() {
        System.out.println("getMusicSurveyList");
        List result = MusicSurveyReader.getMusicSurveyList(SongReader.getSongList());
        assertNotNull(result);
        assertEquals(result.size(), 325);
    }

}
