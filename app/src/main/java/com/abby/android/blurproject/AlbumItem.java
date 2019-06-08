package com.abby.android.blurproject;

public class AlbumItem {
    String albumText;
    int albumImage;



    public AlbumItem(String albumText, int albumImage) {
        this.albumText = albumText;
        this.albumImage = albumImage;
    }

    public String getAlbumText() {
        return albumText;
    }

    public int getAlbumImage() {
        return albumImage;
    }
}
