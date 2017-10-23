package com.mchlslwnsk;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(100, 90, 100);
        Case theCase = new Case("YY2s", "Toshiba", "1200", dimensions);
        Monitor theMonitor = new Monitor("17inch XD", "Dell", 17, new Resolution(1600, 900));
        Motherboard theMotherboard = new Motherboard("YOLO", "Samsung", 8, 4, "v.2.69");


        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//thePC.getMonitor().drawPixelAt(1000,500, "blue");
//thePC.getMotherboard().loadProgram("Windows 10.0");
//thePC.getTheCase().pressPowerButton();

        thePC.powerUp();
        theMonitor.drawPixelAt(12, 2, "yellow");

//Some trials

//        DimensionsDoors dimensionsDoors = new DimensionsDoors(2000,80);
//        Doors theDoors = new Doors("Batman", "wood", dimensionsDoors);
//        Windows theWindows = new Windows(new DimensionsWindows(100,100), false, "wood");
//        Room theRoom = new Room(theWindows,theDoors);
//        theRoom.OpenWindows();


    }
}
