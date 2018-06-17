package com.example.android.mxbox;

/**
 * {@link Album} represents a single album from a grid of albums.
 * Each album object has 2 properties: title and artist.
 */

public class Album {

    // Name of the Album (e.g. God's Plan, Perfect, Havana)
    private String mAlbumName;

    // Artist name (e.g. Drake,Ed Sheeran,Camila Cabello Featuring Young Thug)
    private String mArtistName;

    /*
    * Create a new Album object.
    *
    * @param albumName is the name of the Album (e.g. God's Plan)
    * @param artistName is the corresponding Android version number (e.g. Drake)
    * */
    public Album(String albumName, String artistName) {
        mAlbumName = albumName;
        mArtistName = artistName;
    }

    /**
     * Get the name of the Album
     */
    public String getmAlbumName() {

        return mAlbumName;
    }

    /**
     * Get the Artist Name
     */
    public String getArtistName() {
        return mArtistName;
    }

}

