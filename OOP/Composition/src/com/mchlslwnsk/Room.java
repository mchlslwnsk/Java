package com.mchlslwnsk;

public class Room {

    private Windows windows;
    private Doors doors;

    public Room(Windows windows, Doors doors) {
        this.windows = windows;
        this.doors = doors;
    }

    public void OpenWindows() {
        getWindows().isWindowOpen();
        cleaningTime();
    }

    public void cleaningTime() {
        //System.out.println("The doors are closed");
        windows.cleanWindows(100);
    }


    public Windows getWindows() {
        return windows;
    }

    public Doors getDoors() {
        return doors;
    }
}
