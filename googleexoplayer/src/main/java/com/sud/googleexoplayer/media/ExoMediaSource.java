package com.sud.googleexoplayer.media;

import android.net.Uri;

import java.util.List;


public interface ExoMediaSource {

    interface Quality {
        CharSequence getDisplayName();

        Uri getUri();

        void setUri(Uri uri);

        void setDisplayName(CharSequence displayName);

        void setQuality(String quality);

        String getQuality();

    }

    Uri uri();

    String name();

    List<Quality> qualities();

    String extension();
}
