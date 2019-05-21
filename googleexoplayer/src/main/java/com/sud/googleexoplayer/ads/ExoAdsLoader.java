package com.sud.googleexoplayer.ads;

import android.view.ViewGroup;

import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdsLoader;

import java.io.IOException;


public class ExoAdsLoader extends Player.DefaultEventListener implements AdsLoader {

    @Override
    public void setSupportedContentTypes(int... contentTypes) {

    }

    @Override
    public void attachPlayer(ExoPlayer player, EventListener eventListener, ViewGroup adUiViewGroup) {

    }

    @Override
    public void detachPlayer() {

    }

    @Override
    public void release() {

    }

    @Override
    public void handlePrepareError(int adGroupIndex, int adIndexInAdGroup, IOException exception) {

    }
}
