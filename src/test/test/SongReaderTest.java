/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import project.SongReader;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

/**
 *
 * 
 */
public class SongReaderTest {

    /**
     * Test of getSongList method, of class SongETL.
     */
    @Test
    public void testGetSongList() {
        System.out.println("getSongList");
        List result = SongReader.getSongList();
        assertNotNull(result);
        assertEquals(result.size(), 72);
    }
}
