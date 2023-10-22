package Shapes3D;

import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape3D> {
    
    private String strategy;

    public ShapeComparator(String strategy) {
        this.strategy = strategy;
    }

    @Override
    public int compare(Shape3D shape1, Shape3D shape2) {
        switch (strategy) {
            case "v":
                return Double.compare(shape1.getVolume(), shape2.getVolume());
            case "a":
                return Double.compare(shape1.getBaseArea(), shape2.getBaseArea());
            case "h":
            default:
                return shape1.compareTo(shape2);
        }
    }
}