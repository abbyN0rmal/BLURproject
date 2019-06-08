package com.abby.android.blurproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.abby.android.blurproject.R;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<AlbumItem> {
    public AlbumAdapter(Context context, ArrayList<AlbumItem> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_album_list_view, parent, false);
        AlbumItem currentAlbumItem = getItem(position);
        ImageView albumImageView = convertView.findViewById(R.id.item_image_view);
        albumImageView.setImageResource(currentAlbumItem.getAlbumImage());
        TextView albumTextView = convertView.findViewById(R.id.item_text_view);
        albumTextView.setText((currentAlbumItem).getAlbumText());

        return convertView;
    }


}
