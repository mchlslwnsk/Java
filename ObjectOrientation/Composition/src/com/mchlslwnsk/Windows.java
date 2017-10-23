package com.mchlslwnsk;

public class Windows {

    private DimensionsWindows dimensionsWindows;
    private boolean isOpen;
    private String material;

    public Windows(DimensionsWindows dimensionsWindows, boolean isOpen, String material) {
        this.dimensionsWindows = dimensionsWindows;
        this.isOpen = isOpen;
        this.material = material;
    }

    public void isWindowOpen() {
        System.out.println("The doors are open");
    }

    public void cleanWindows(int time) {
        System.out.println("Time of cleaning: " + time);
    }

    public DimensionsWindows getDimensionsWindows() {
        return dimensionsWindows;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public String getMaterial() {
        return material;
    }
}
