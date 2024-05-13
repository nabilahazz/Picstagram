package com.example.praktikum5;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

public class Instagram implements Parcelable {

    private String username;
    private String name;
    private int fotoProfile;
    private int fotoPostingan;
    private Uri selectedImageUri;


    public Instagram(String username, String name, String desc, int fotoProfile, int fotoPostingan) {
        this.username = username;
        this.name = name;
        this.fotoProfile = fotoProfile;
        this.fotoPostingan = fotoPostingan;
    }

    public Instagram(String username, String vyn, String konten, int vyn1, Uri selectedImageUri) {
        this.username = username;
        this.name = vyn;
        this.fotoProfile = vyn1;
        this.selectedImageUri = selectedImageUri;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFotoProfile() {
        return fotoProfile;
    }

    public void setFotoProfile(int fotoProfile) {
        this.fotoProfile = fotoProfile;
    }

    public int getFotoPostingan() {
        return fotoPostingan;
    }

    public void setFotoPostingan(int fotoPostingan) {
        this.fotoPostingan = fotoPostingan;
    }

    public Uri getSelectedImageUri() {
        return selectedImageUri;
    }

    public void setSelectedImageUri(Uri selectedImageUri) {
        this.selectedImageUri = selectedImageUri;
    }

    protected Instagram(Parcel in) {
        username = in.readString();
        name = in.readString();
        fotoProfile = in.readInt();
        fotoPostingan = in.readInt();
    }

    public static final Creator<Instagram> CREATOR = new Creator<Instagram>() {
        @Override
        public Instagram createFromParcel(Parcel in) {
            return new Instagram(in);
        }

        @Override
        public Instagram[] newArray(int size) {
            return new Instagram[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeString(username);
        dest.writeString(name);
        dest.writeInt(fotoProfile);
        dest.writeInt(fotoPostingan);
    }
}

