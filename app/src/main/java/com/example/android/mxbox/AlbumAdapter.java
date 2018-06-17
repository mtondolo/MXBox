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
* {@link AlbumAdapter} is an {@link ArrayAdapter} that can provide the layout for each list
* based on a data source, which is a list of {@link Album} objects.
*
* */

public class AlbumAdapter extends ArrayAdapter<Album> {
    private static final String LOG_TAG = AlbumAdapter.class.getSimpleName ();

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context The current context. Used to inflate the layout file.
     * @param albums  A List of Albums objects to display in a list
     */
    public AlbumAdapter(Activity context, ArrayList<Album> albums) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for three TextViews , the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super ( context, 0, albums );
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View GridItemView = convertView;
        if (GridItemView == null) {
            GridItemView = LayoutInflater.from ( getContext () ).inflate (
                    R.layout.grid_item, parent, false );
        }

        // Get the {@link Album} object located at this position in the list
        Album currentAlbum = getItem ( position );

        // Find the TextView in the grid_item.xml layout with the ID album_title
        TextView albumTitleTextView = (TextView) GridItemView.findViewById ( R.id.album_title_text_view );
        // Get the album title from the current Album object and
        // set this text on the album title TextView
        albumTitleTextView.setText ( currentAlbum.getmAlbumName () );

        // Find the TextView in the grid_item.xml layout with the ID artist_name
        TextView artistNameTextView = (TextView) GridItemView.findViewById ( R.id.artist_name_text_view );
        // Get the artist name from the current Album object and
        // set this text on the artist name TextView
        artistNameTextView.setText ( currentAlbum.getArtistName () );

        // Return the whole grid item layout (containing 2 TextViews)
        // so that it can be shown in the GridView
        return GridItemView;
    }
}
