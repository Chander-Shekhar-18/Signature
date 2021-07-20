package com.example.signature;

public class SignatureData {
    String imageUrl,key;

    public SignatureData() {
    }

    public SignatureData(String imageUrl, String key) {
        this.imageUrl = imageUrl;
        this.key = key;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
