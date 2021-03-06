package com.akristic.www.booklisting;


import java.text.DateFormat;

public class Book {
    private String mName;
    private String mAuthor;
    private String mUrl;
    private String mDescription;
    private String mImageUrl;

    public Book(String name, String author, String url, String description, String imageUrl) {
        mName = name;
        mAuthor = author;
        mUrl = url;
        mDescription = description;
        mImageUrl = imageUrl;
    }

    public String getName() {
        return mName;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getDescription() {
        return mDescription;
    }

    public String getImageUrl() {
        return mImageUrl;
    }
}
