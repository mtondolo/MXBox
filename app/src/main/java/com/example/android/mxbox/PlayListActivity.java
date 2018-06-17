package com.example.android.mxbox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link PlayListActivity} shows a list of songs on a playlist.
 * For each playlist item, display the song name, title , and duration.
 */

public class PlayListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.list_view);

        // Create an ArrayList of Playlist objects
        final ArrayList<PlayList> listitems = new ArrayList<PlayList> ();
        listitems.add ( new PlayList ( getString ( R.string.song_one_title ), getString ( R.string.song_one_artist ),
                getString ( R.string.song_one_duration ) ) );
        listitems.add ( new PlayList ( getString ( R.string.song_two_title ), getString ( R.string.song_two_artist ),
                getString ( R.string.song_two_duration ) ) );
        listitems.add ( new PlayList ( getString ( R.string.song_three_title ), getString ( R.string.song_three_artist ),
                getString ( R.string.song_three_duration ) ) );
        listitems.add ( new PlayList ( getString ( R.string.song_four_title ), getString ( R.string.song_four_artist ),
                getString ( R.string.song_four_duration ) ) );
        listitems.add ( new PlayList ( getString ( R.string.song_five_title ), getString ( R.string.song_five_artist ),
                getString ( R.string.song_five_duration ) ) );
        listitems.add ( new PlayList ( getString ( R.string.song_six_title ), getString ( R.string.song_six_artist ),
                getString ( R.string.song_six_duration ) ) );
        listitems.add ( new PlayList ( getString ( R.string.song_seven_title ), getString ( R.string.song_seven_artist ),
                getString ( R.string.song_seven_duration ) ) );
        listitems.add ( new PlayList ( getString ( R.string.song_eight_title ), getString ( R.string.song_eight_artist ),
                getString ( R.string.song_eight_duration ) ) );
        listitems.add ( new PlayList ( getString ( R.string.song_nine_title ), getString ( R.string.song_nine_artist ),
                getString ( R.string.song_nine_duration ) ) );
        listitems.add ( new PlayList ( getString ( R.string.song_ten_title ), getString ( R.string.song_ten_artist ),
                getString ( R.string.song_ten_duration ) ) );

        // Create an {@link PlayListAdapter}, whose data source is a list of
        // {@link Playlist}.
        PlayListAdapter adapter = new PlayListAdapter ( this, listitems );

        // Get a reference to the ListView, and attach the adapter to the listView.
        final ListView listView = (ListView) findViewById ( R.id.listview );
        listView.setAdapter ( adapter );

        //Set a ClickListener on that listView.
        listView.setOnItemClickListener ( new AdapterView.OnItemClickListener () {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                for (position = 0; position < listitems.size (); position++) {

                    // Create a new intent to open the {@link NowPlayingActivity}
                    Intent myIntent = new Intent ( view.getContext (), NowPlayingActivity.class );

                    // Start the new activity
                    startActivityForResult ( myIntent, 0 );
                    break;
                }
            }
        } );
    }
}
