package com.mchlslwnsk;

public class Point3D extends Point2D{

    double pointZ;

    public Point3D() {
        this.pointZ = 0;
    }

    public Point3D(double pointX, double pointY, double pointZ) {
        super(pointX, pointY);
        this.pointZ = pointZ;
        this.pointX = pointX;
        this.pointY=pointY;
    }


    public double getPointZ() {
        return pointZ;
    }
}
