package com.example.recyclercards;

public class ExampleItem {
    private int mImageResource;
    private String mText;
    private String dText;
    private int mAudio;

    public ExampleItem(int ImageResource, String text, String text1, int audio) {
        mImageResource = ImageResource;
        mText = text;
        dText = text1;
        mAudio = audio;
    }


    public int getmImageResource() {
        return mImageResource;
    }

    public String getmText() {
        return mText;
    }

    public String getdText() {
        return dText;
    }

    public int getmAudio() {
        return mAudio;
    }
}
