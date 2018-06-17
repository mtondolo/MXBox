package com.example.android.mxbox;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
/*
* {@link PlayListAdapterAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link PlayList} objects.
*
* */

public class PlayListAdapter extends ArrayAdapter<PlayList> {
    private static final String LOG_TAG = PlayListAdapter.class.getSimpleName ();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context   The current context. Used to inflate the layout file.
     * @param listitems A List of playlist objects to display in a list
     */

    public PlayListAdapter(Activity context, ArrayList<PlayList> listitems) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews , the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super ( context, 0, listitems );
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position    The position in the list of data that should be displayed in the
     *                    list item view.
     * @param convertView The recycled view to populate.
     * @param parent      The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from ( getContext () ).inflate (
                    R.layout.list_item, parent, false );
        }

        // Get the {@link PlayList} object located at this position in the list
        PlayList currentPlayList = getItem ( position );

        // Find the TextView in the list_item.xml layout with the ID song_title
        TextView songTitleTextView = (TextView) listItemView.findViewById ( R.id.song_title_text_view );
        // Get the song title from the current PlayList object and
        // set this text on the song title TextView
        songTitleTextView.setText ( currentPlayList.getmSongTitle () );

        // Find the TextView in the list_item.xml layout with the ID artist_name
        TextView artistNameTextView = (TextView) listItemView.findViewById ( R.id.artist_name_text_view );
        // Get the artist name from the current PlayList object and
        // set this text on the artist name TextView
        artistNameTextView.setText ( currentPlayList.getmArtistName () );

        // Find the TextView in the list_item.xml layout with the ID song_duration
        TextView songDurationTextView = (TextView) listItemView.findViewById ( R.id.song_duration_text_view );
        // Get the song duration from the current PlayList object and
        // set this text on the song duration TextView
        songDurationTextView.setText ( currentPlayList.getmSongDuration () );

        // Return the whole list item layout (containing 3 TextViews)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
