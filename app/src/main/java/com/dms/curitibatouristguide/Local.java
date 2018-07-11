package com.dms.curitibatouristguide;

import android.graphics.drawable.Drawable;

public class Local {

    private String mHeader;
    private Drawable mImage;
    private String mDescription;


    public Local(String header, Drawable mImage, String mDescription) {
        this.mHeader = header;
        this.mImage = mImage;
        this.mDescription = mDescription;
    }

    public Drawable getmImage() {
        return mImage;
    }

    public void setmImage(Drawable mImage) {
        this.mImage = mImage;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String getHeader() {
        return mHeader;
    }

    public void setHeader(String header) {
        this.mHeader = header;
    }
}
