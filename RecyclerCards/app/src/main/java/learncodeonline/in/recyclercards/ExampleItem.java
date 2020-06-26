package learncodeonline.in.recyclercards;

import android.media.MediaPlayer;

public class ExampleItem {

    private int mImageResource;
    private String mText;
    private int mAudio;
    MediaPlayer mediaPlayer;


    public ExampleItem(int imageResource, String text, int audio) {
        mImageResource = imageResource;
        mText = text;
        mAudio = audio;
    }

    public int getmAudio() {

        return mAudio;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmText() {
        return mText;
    }
}
