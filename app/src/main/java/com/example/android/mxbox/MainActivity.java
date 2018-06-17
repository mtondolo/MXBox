package com.example.android.mxbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * {@link MainActivity} shows a list of activities available in the app.
 * * Playlist,Albums, Artists and Songs.
 */

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        //Find the view  that displays playlist
        LinearLayout playList = (LinearLayout) findViewById ( R.id.playlist_linear_layout );

        //Set a ClickListener on that View
        playList.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                // Create a new intent to open the {@link PlayListActivity}
                Intent playListIntent = new Intent ( MainActivity.this, PlayListActivity.class );

                // Start the new activity
                startActivity ( playListIntent );
            }
        } );

        //Find the view that displays albums
        LinearLayout nowPlaying = (LinearLayout) findViewById ( R.id.albums_linear_layout );

        //Set a ClickListener on that View
        nowPlaying.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                // Create a new intent to open the {@link AlbumsActivity}
                Intent nowPlayingIntent = new Intent ( MainActivity.this, AlbumsActivity.class );

                // Start the new activity
                startActivity ( nowPlayingIntent );
            }
        } );

        //Find the view that displays artists
        LinearLayout artistsLinearLayout = (LinearLayout) findViewById ( R.id.artists_linear_layout );

        //Set a ClickListener on that View
        artistsLinearLayout.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Toast.makeText ( MainActivity.this, getString ( R.string.splash_screen_toast ),
                        Toast.LENGTH_SHORT ).show ();
            }
        } );

        //Find the view that displays songs
        LinearLayout songsLinearLayout = (LinearLayout) findViewById ( R.id.songs_linear_layout );

        //Set a ClickListener on that View
        songsLinearLayout.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {

                Toast.makeText ( MainActivity.this, getString ( R.string.splash_screen_toast ),
                        Toast.LENGTH_SHORT ).show ();
            }
        } );

    }
}
