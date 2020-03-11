package com.example.a3allmni.model;

import android.os.Parcel;
import android.os.Parcelable;

public class letter implements Parcelable {

    private int id;
    private String title;
    private int image;
    private int pronounce;

    public letter(int id, String title, int image, int pronounce) {
        this.id = id;
        this.title = title;
        this.image = image;
        this.pronounce = pronounce;
    }

    protected letter(Parcel in) {
        id = in.readInt();
        title = in.readString();
        image = in.readInt();
        pronounce = in.readInt();
    }

    public static final Creator<letter> CREATOR = new Creator<letter>() {
        @Override
        public letter createFromParcel(Parcel in) {
            return new letter(in);
        }

        @Override
        public letter[] newArray(int size) {
            return new letter[size];
        }
    };

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getPronounce() {
        return pronounce;
    }

    public void setPronounce(int pronounce) {
        this.pronounce = pronounce;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(title);
        dest.writeInt(image);
        dest.writeInt(pronounce);
    }
}