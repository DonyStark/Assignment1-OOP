package Shapes3D;

import java.io.*;

public class ShapeFileReader {
	/**
	 * Provides functionality to read shapes from a text file.
	 */
	public static Shape3D[] readShapesFromFile(String fileName) throws IOException {
		Shape3D[] shapes = null;

		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line = reader.readLine();
			String[] parts = line.split(" ");

			if (parts.length % 3 != 1) {
				System.out.println("Incorrect txt file formatting");
				return null;
			}

			int numShapes = Integer.parseInt(parts[0]);
			shapes = new Shape3D[numShapes];

			for (int i = 0; i < numShapes; i++) {
				int startIndex = i * 3 + 1;

				String shapeType = parts[startIndex];
				double param1 = Double.parseDouble(parts[startIndex + 1]);
				double param2 = Double.parseDouble(parts[startIndex + 2]);

				// Create the corresponding Shape3D object based on the shape type.
				switch (shapeType) {
				case "Cylinder":
					shapes[i] = new Cylinder(param1, param2);
					break;
				case "Cone":
					shapes[i] = new Cone(param1, param2);
					break;
				case "Pyramid":
					shapes[i] = new Pyramid(param1, param2);
					break;
				case "SquarePrism":
					shapes[i] = new SquarePrism(param1, param2);
					break;
				case "TriangularPrism":
					shapes[i] = new TriangularPrism(param1, param2);
					break;
				case "PentagonalPrism":
					shapes[i] = new PentagonalPrism(param1, param2);
					break;
				case "OctagonalPrism":
					shapes[i] = new OctagonalPrism(param1, param2);
					break;
				default:
					System.out.println("Shape Type not recognized");
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}

		return shapes;
	}
}
