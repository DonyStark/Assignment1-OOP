package Shapes3D;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
/**
 * A driver class for sorting and comparing different 3D shapes.
 */
public class ShapeSorterDriver {

    public static void main(String[] args) {
        if (args.length < 6) {
            displayUsage();
            return;
        }

        String fileName = null;
        String sortType = null;
        String sortOrder = null;

        for (int i = 0; i < args.length; i += 2) {
            switch (args[i].toLowerCase()) {
                case "-f":
                    fileName = args[i + 1];
                    break;
                case "-t":
                    sortType = args[i + 1];
                    break;
                case "-s":
                    sortOrder = args[i + 1];
                    break;
                default:
                    displayUsage();
                    return;
            }
        }

        Shape3D[] shapes = loadShapesFromFile(fileName);
        if (shapes == null) {
            System.out.println("Error loading shapes from file.");
            return;
        }

        ShapeComparator comparator = new ShapeComparator(sortType);

        switch (sortOrder.toLowerCase()) {
        case "b":
            SortingUtility.bubbleSort(shapes, comparator);
            break;
            // ... you can fill in other cases for other sorting methods
            default:
                displayUsage();
                return;
        }

        displaySortedShapes(shapes);
    }

    private static void displayUsage() {
        System.out.println("Usage: java -jar sort.jar -f<filename> -t<v/h/a> -s<b/s/i/m/q/z>");
    }

    private static Shape3D[] loadShapesFromFile(String fileName) {
        Shape3D[] shapes = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int numShapes = Integer.parseInt(reader.readLine().trim());
            shapes = new Shape3D[numShapes];
            
            for (int i = 0; i < numShapes; i++) {
                String[] parts = reader.readLine().split(" ");
                String shapeType = parts[0];
                double height = Double.parseDouble(parts[1]);
                double otherParam = Double.parseDouble(parts[2]);
                
                switch (shapeType) {
                    case "Cylinder":
                        shapes[i] = new Cylinder(height, otherParam);
                        break;
                    case "Cone":
                        shapes[i] = new Cone(height, otherParam);
                        break;
                    // ... Handle other shape types similarly
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return shapes;
    }

    private static void displaySortedShapes(Shape3D[] shapes) {
        System.out.println("Sorted Shapes:");
        for (Shape3D shape : shapes) {
            System.out.println(shape);
        }
    }

    private static void bubbleSort(Shape3D[] shapes, ShapeComparator comparator) {
        int n = shapes.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (comparator.compare(shapes[j], shapes[j+1]) < 0) {
                    Shape3D temp = shapes[j];
                    shapes[j] = shapes[j+1];
                    shapes[j+1] = temp;
                }
            }
        }
    }
}

class ShapeComparat implements java.util.Comparator<Shape3D> {
    private String sortType;

    public ShapeComparat(String sortType) {
        this.sortType = sortType;
    }

    @Override
    public int compare(Shape3D shape1, Shape3D shape2) {
        switch (sortType) {
            case "v":
                return Double.compare(shape1.getVolume(), shape2.getVolume());
            case "h":
                return Double.compare(shape1.getHeight(), shape2.getHeight());
            case "a":
                return Double.compare(shape1.getBaseArea(), shape2.getBaseArea());
            default:
                return 0;
        }
    }
}