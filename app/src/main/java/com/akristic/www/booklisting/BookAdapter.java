package com.akristic.www.booklisting;



import android.app.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class BookAdapter extends ArrayAdapter<Book> {

    public BookAdapter(Activity context, ArrayList<Book> books) {
        super(context, 0, books);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Book currentBook = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.book_name);
        nameTextView.setText(currentBook.getName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.book_author);
        addressTextView.setText(currentBook.getAuthor());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.book_description);
        descriptionTextView.setText(currentBook.getDescription());

        WebView imageWebView = (WebView) listItemView.findViewById(R.id.image_thumbnail);
        imageWebView.loadUrl(currentBook.getImageUrl());
        return listItemView;
    }
}
