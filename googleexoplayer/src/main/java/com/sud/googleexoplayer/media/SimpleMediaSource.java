package com.sud.googleexoplayer.media;

import android.net.Uri;

import java.util.List;


public class SimpleMediaSource implements ExoMediaSource {

    private String displayName;

    private Uri uri;

    private List<Quality> qualities;

    public SimpleMediaSource(String url) {
        this.uri = Uri.parse(url);
    }

    public SimpleMediaSource(Uri uri) {
        this.uri = uri;
    }


    @Override
    public String name() {
        return displayName;
    }

    @Override
    public List<Quality> qualities() {
        return qualities;
    }

    @Override
    public String extension() {
        return null;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public Uri uri() {
        return uri;
    }

    public void setQualities(List<Quality> qualities) {
        this.qualities = qualities;
    }

}
