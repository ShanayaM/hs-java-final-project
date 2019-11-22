/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.List;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 *
 * 
 */
public class MusicSurveyReaderTest {

    /**
     * Test of getMusicSurveyList method, of class MusicSurveyETL.
     */
    @Test
    public void testGetMusicSurveyList() {
        System.out.println("getMusicSurveyList");
        List result = MusicSurveyReader
                .getMusicSurveyList(SongReader.getSongList());
        assertNotNull(result);
        assertEquals(result.size(), 325);
    }
}
