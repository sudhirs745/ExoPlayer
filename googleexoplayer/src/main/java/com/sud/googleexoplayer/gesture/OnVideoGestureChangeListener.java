package com.sud.googleexoplayer.gesture;

import androidx.annotation.IntDef;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;



public interface OnVideoGestureChangeListener {

    int VOLUME_CHANGED_REDUCTION = -1;
    int VOLUME_CHANGED_MUTE = VOLUME_CHANGED_REDUCTION + 1;
    int VOLUME_CHANGED_INCREMENT = VOLUME_CHANGED_MUTE + 1;


    @IntDef({VOLUME_CHANGED_REDUCTION, VOLUME_CHANGED_MUTE, VOLUME_CHANGED_INCREMENT})
    @Retention(RetentionPolicy.SOURCE)
    @interface VolumeChangeType {

    }


    void onVolumeChanged(int range, @VolumeChangeType int type);

    void onBrightnessChanged(int brightnessPercent);

    void onNoGesture();

    void onShowSeekSize(long seekSize, boolean fastForward);

}
