package at.htl.at.htl.model;

public class Game {
    String name;
    String publishingHouse;
    String categoryName;
    int imageResourceId;

    public Game(String name, String publishingHouse, String categoryName, int imageResourceId) {
        this.name = name;
        this.publishingHouse = publishingHouse;
        this.categoryName = categoryName;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }
}
