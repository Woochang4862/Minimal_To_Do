package com.examples.minimal_to_do;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Mac on 2017. 4. 6..
 */

public class Content implements Parcelable {
    private String title;

    public Content(String title) {
        this.title = title;
    }

    protected Content(Parcel in) {
        title = in.readString();
    }

    public static final Creator<Content> CREATOR = new Creator<Content>() {
        @Override
        public Content createFromParcel(Parcel in) {
            return new Content(in);
        }

        @Override
        public Content[] newArray(int size) {
            return new Content[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
