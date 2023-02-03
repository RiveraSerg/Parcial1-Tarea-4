package House.Rooms;

public class DiningRoom {
    private int windows;
    private boolean tv;
    private int width;
    private int height;
    private String color;
    private int chairsCapacity;


    public int getWindows() {
        return windows;
    }

    public boolean isTv() {
        return tv;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public int getChairsCapacity() {
        return chairsCapacity;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setChairsCapacity(int chairsCapacity) {
        this.chairsCapacity = chairsCapacity;
    }
}
