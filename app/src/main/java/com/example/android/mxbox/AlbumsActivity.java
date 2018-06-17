package com.example.android.mxbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * {@link AlbumsActivity} shows a list of albums on a playlist.
 * For each album, display the album title and artist name.
 */

public class AlbumsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.grid_view);

        // Create an ArrayList of Albums objects
        final ArrayList<Album> albums = new ArrayList<Album> ();
        albums.add ( new Album ( getString ( R.string.song_one_title ), getString ( R.string.song_one_artist ) ) );
        albums.add ( new Album ( getString ( R.string.song_two_title ), getString ( R.string.song_two_artist ) ) );
        albums.add ( new Album ( getString ( R.string.song_three_title ), getString ( R.string.song_three_artist ) ) );
        albums.add ( new Album ( getString ( R.string.song_four_title ), getString ( R.string.song_four_artist ) ) );
        albums.add ( new Album ( getString ( R.string.song_five_title ), getString ( R.string.song_five_artist ) ) );
        albums.add ( new Album ( getString ( R.string.song_six_title ), getString ( R.string.song_six_artist ) ) );
        albums.add ( new Album ( getString ( R.string.song_seven_title ), getString ( R.string.song_seven_artist ) ) );
        albums.add ( new Album ( getString ( R.string.song_eight_title ), getString ( R.string.song_eight_artist ) ) );
        albums.add ( new Album ( getString ( R.string.song_nine_title ), getString ( R.string.song_nine_artist ) ) );
        albums.add ( new Album ( getString ( R.string.song_ten_title ), getString ( R.string.song_ten_artist ) ) );
        albums.add ( new Album ( getString ( R.string.song_one_title ), getString ( R.string.song_one_artist ) ) );
        albums.add ( new Album ( getString ( R.string.song_two_title ), getString ( R.string.song_two_artist ) ) );
        albums.add ( new Album ( getString ( R.string.song_three_title ), getString ( R.string.song_three_artist ) ) );
        albums.add ( new Album ( getString ( R.string.song_four_title ), getString ( R.string.song_four_artist ) ) );
        albums.add ( new Album ( getString ( R.string.song_five_title ), getString ( R.string.song_five_artist ) ) );
        albums.add ( new Album ( getString ( R.string.song_six_title ), getString ( R.string.song_six_artist ) ) );

        // Create an {@link AlbumAdapter}, whose data source is a list of
        // {@link Album}.
        AlbumAdapter adapter = new AlbumAdapter ( this, albums );

        // Get a reference to the GridView, and attach the adapter to the GridView.
        GridView gridView = (GridView) findViewById ( R.id.gridview );
        gridView.setAdapter ( adapter );

    }
}
