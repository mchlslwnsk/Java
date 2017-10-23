package com.mchlslwnsk;

public class Point2D {

    double pointX;
    double pointY;

    public Point2D(){
        this.pointX=0;
        this.pointY=0;
    }

    public Point2D(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }


    public double getPointX() {
        return pointX;
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }
}
