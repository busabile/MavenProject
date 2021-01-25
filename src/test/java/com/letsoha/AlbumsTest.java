package com.letsoha;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import static org.junit.Assert.*;

public class AlbumsTest {

    @Before
    public void setUp() throws Exception {

    }

    //Checks release date
    @Test
    public void TestSetReleaseDate() throws Exception {

        AlbumInterface date1 = new Albums();

        System.out.println(date1.ReleaseDate());

        assertTrue(date1.ReleaseDate().contains("27 Aug 2002"));

    }

    //Checks size
    @Test
    public void TestSetSize() throws Exception{

        AlbumInterface date2 = new Albums();

        assertEquals(6,date2.ReleaseDate().size());

    }

    //This checks removal
    @Test
    public void TestSetRemove() throws Exception{

        AlbumInterface date3 = new Albums();

        assertTrue(date3.ReleaseDate().remove("22 November 1994"));

    }

    //This checks artists
    @Test
    public void TestMapArtists() throws Exception {

        AlbumInterface artist1 = new Albums();

        System.out.println(artist1.Artists());

        assertEquals("Led Zeppelin", artist1.Artists().get("LZ"));

    }

    //This tests size
    @Test
    public void TestMapSize() throws Exception{

        AlbumInterface artist2 = new Albums();

        assertEquals(6,artist2.Artists().size());

    }

    //This looks for removal
    @Test
    public void TestMapRemove() throws Exception{

        AlbumInterface artist3 = new Albums();

        assertEquals("Queens of the Stone Age", artist3.Artists().remove("QA"));

    }

    //This for Album name
    @Test
    public void TestListAlbumName() throws Exception{

        AlbumInterface name1 = new Albums();

        System.out.println(name1.AlbumName());

        assertTrue(name1.AlbumName().contains("Prophets of Rage"));

    }

    //This tests the list size
    @Test
    public void TestListSize() throws Exception{

        AlbumInterface name2 = new Albums();

        assertEquals(6,name2.AlbumName().size());

    }

    //this test the list removal
    @Test
    public void TestListRemove() throws Exception{

        AlbumInterface name3 = new Albums();

        assertTrue(name3.AlbumName().remove("Led Zeppelin III"));

    }
}