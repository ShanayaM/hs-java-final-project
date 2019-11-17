/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.util.List;


/**
 *
 * 
 */
public class SongReaderTest extends student.TestCase {

    /**
     * Test of getSongList method, of class SongETL.
     */
    
    public void testGetSongList() {
        System.out.println("getSongList");
        List result = SongReader.getSongList();
        assertNotNull(result);
        assertEquals(result.size(), 72);
    }
}
