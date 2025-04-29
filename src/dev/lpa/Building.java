package dev.lpa;

import java.awt.*;

enum UsageType {ENTERTAINMENT, GOVERNMENT, RESIDENTAL, SPORTS}

public class Building implements Mappable {

    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (usage) {
            case ENTERTAINMENT -> Color.GREEN + " " + PointMaker.TRIANGLE;
            case SPORTS -> Color.RED + " " + PointMaker.STAR;
            case GOVERNMENT -> Color.BLUE + " " + PointMaker.SQUARE;
            case RESIDENTAL -> Color.ORANGE + " " + PointMaker.PUSH_PIN;
            default -> Color.BLACK + " " + PointMaker.CIRCLE;
        };
    }
}
