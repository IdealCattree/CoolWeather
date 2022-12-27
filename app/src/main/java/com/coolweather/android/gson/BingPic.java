package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BingPic {

    @SerializedName("MediaContents")
    public List<ImageContent> imageContents;

    public class ImageContent {

        public Image image;

        public class Image {

            public String Url;
        }
    }
}
