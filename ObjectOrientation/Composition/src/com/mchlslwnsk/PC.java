package com.mchlslwnsk;

public class PC {


    //instead extends
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }



    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        //fancy graphics
       // getMonitor().drawPixelAt(1,2,"red");
        // to check initialization use above formula
        monitor.drawPixelAt(10,9,"red");
    }


}
