package com.example.recyclerview;

public class Data_model {
    private String Title,Description;
    private int Image;

    public Data_model(String title, String description, int image) {
        Title = title;
        Description = description;
        Image = image;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}
