package com.letsoha;


import java.util.*;

public class Albums implements AlbumInterface{
    public Albums(){

    }

    @Override
    public Set<String> ReleaseDate() {

        Set date = new HashSet();

        date.add("12 April 2011");

        date.add("5 Oct 1970");

        date.add("15 Sep 2017");

        date.add("27 Aug 2002");

        date.add("22 November 1994");

        date.add("24 March 2009");

        return date;

    }

    @Override
    public Map<String, String> Artists() {

        Map artist = new HashMap();

        artist.put("FF","Foo Fighters");

        artist.put("LZ","Led Zeppelin");

        artist.put("PR","Prophets of Rage");

        artist.put("QA","Queens of the Stone Age");

        artist.put("PJ","Pearl Jam");

        artist.put("MD","Mastodon");

        return artist;

    }



    @Override
    public List<String> AlbumName() {

        List name = new ArrayList();

        name.add("Wasting Light");

        name.add("Led Zeppelin III");

        name.add("Prophets of Rage");

        name.add("Songs for the Deaf");

        name.add("Vitalogy");

        name.add("Crack the Skye");

        return name;

    }

}
