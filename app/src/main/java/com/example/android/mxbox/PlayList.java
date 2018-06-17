package com.example.android.mxbox;

/**
 * {@link PlayList} represents a single item of list of songs.
 * Each playlist object has 3 properties: title, name, and duration.
 */

public class PlayList {

    // Name of the song (e.g. God's Plan, Perfect, Havana)
    private String mSongTitle;

    // Artist name (e.g. Drake,Ed Sheeran,Camila Cabello Featuring Young Thug)
    private String mArtistName;

    // Song duration(e.g. 3:12,4:35,3:54)
    private String mSongDuration;

    /*
   * Create a new PlayList object.
   *
   * @param songTitle is the name of the song (e.g. God's Plan)
   * @param artistName is the corresponding Artist Name (e.g. 2.3-2.7)
   * @param  songDuration is the corresponding duration (e.g. 3.12)
   * */

    public PlayList(String songTitle, String artistName, String songDuration) {
        mSongTitle = songTitle;
        mArtistName = artistName;
        mSongDuration = songDuration;

    }

    /**
     * Get the name of the Song.
     */
    public String getmSongTitle() {
        return mSongTitle;
    }

    /**
     * Get the Artist Name
     */
    public String getmArtistName() {
        return mArtistName;
    }

    /**
     * Get the song duration
     */
    public String getmSongDuration() {
        return mSongDuration;
    }
}
