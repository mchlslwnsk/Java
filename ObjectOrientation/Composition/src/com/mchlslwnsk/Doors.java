package com.mchlslwnsk;

public class Doors {

    private String model;
    private String material;
    private DimensionsDoors dimensionsDoors;
    private boolean isClosed;

    public Doors(String model, String material, DimensionsDoors dimensionsDoors) {

        this.model = model;
        this.material = material;
        this.dimensionsDoors = dimensionsDoors;
    }


    public String getModel() {
        return model;
    }

    public String getMaterial() {
        return material;
    }

    public DimensionsDoors getDimensionsDoors() {
        return dimensionsDoors;
    }
}
