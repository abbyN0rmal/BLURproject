package com.abby.android.blurproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.MediaController;
import android.widget.VideoView;
import android.widget.ZoomButtonsController;


import java.lang.reflect.Array;
import java.util.ArrayList;



public class AlbumsAndSinglesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_albums_and_singles);


        ArrayList<AlbumItem> typesOfAlbums = new ArrayList<>();
        typesOfAlbums.add(new AlbumItem("Parklife 1994", R.drawable.parklife));
        typesOfAlbums.add(new AlbumItem("Modern Life is Rubbish 1993", R.drawable.modernlifeisrubbish));
        typesOfAlbums.add(new AlbumItem("The Great Escape 1995", R.drawable.thegreatescape));
        typesOfAlbums.add(new AlbumItem("The Magic Whip 2015", R.drawable.themagicwhip));
        typesOfAlbums.add(new AlbumItem("Blur 1997", R.drawable.bluralbumcover));
        typesOfAlbums.add(new AlbumItem("Leisure 1991", R.drawable.leisure));

        AlbumAdapter adapter = new AlbumAdapter(this, typesOfAlbums);

        // The format for the albums
        GridView gridView = findViewById(R.id.grid);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        gridView.setAdapter(adapter);

        //The video
        VideoView videoView = findViewById(R.id.parklife);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video1;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

    }

}




