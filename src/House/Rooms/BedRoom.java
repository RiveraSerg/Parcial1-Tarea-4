package House.Rooms;

import House.Rooms.furniture.BedSize;

public class BedRoom {
    private BedSize bedSize;
    private boolean tv;
    private int width;
    private int height;
    private String Color;

    public BedSize getBedSize() {
        return bedSize;
    }

    public void setBedSize(BedSize bedSize) {
        this.bedSize = bedSize;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}


