package Shapes3D;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ShapeFileReader {
	/**
	 * Provides functionality to read shapes from a text file.
	 */
    public static Shape3D[] readShapesFromFile(String fileName) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int numberOfShapes = Integer.parseInt(br.readLine().trim());
            Shape3D[] shapes = new Shape3D[numberOfShapes];

            for (int i = 0; i < numberOfShapes; i++) {
                String line = br.readLine();
                String[] parts = line.split(" ");
                String shapeType = parts[0];

                switch (shapeType) {
                    case "Cylinder":
                        shapes[i] = new Cylinder(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
                        break;
                    case "Cone":
                        shapes[i] = new Cone(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
                        break;
                    case "Pyramid":
                        shapes[i] = new Pyramid(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
                        break;
                    case "SquarePrism":
                        shapes[i] = new SquarePrism(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
                        break;
                    case "TriangularPrism":
                        shapes[i] = new TriangularPrism(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
                        break;
                    case "PentagonalPrism":
                        shapes[i] = new PentagonalPrism(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
                        break;
                    case "OctagonalPrism":
                        shapes[i] = new OctagonalPrism(Double.parseDouble(parts[1]), Double.parseDouble(parts[2]));
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown shape type: " + shapeType);
                }
            }

            return shapes;
        }
    }
}
