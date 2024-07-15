package com.social.t1.model;

import android.net.Uri;

public class GalleryImages {

    public Uri picUri;

    public GalleryImages() {
    }

    public GalleryImages(Uri picUri) {
        this.picUri = picUri;

    }

    public Uri getPicUri() {
        return picUri;
    }

    public void setPicUri(Uri picUri) {
        this.picUri = picUri;
    }

}
