package Shapes3D;

public class SortingUtility {
    
    public static <T extends Comparable<T>> void bubbleSort(T[] array) {}
        // Bubble sort algorithm.
    	 public static void bubbleSort(Shape3D[] shapes, java.util.Comparator<Shape3D> comparator) {
    	        int n = shapes.length;
    	        for (int i = 0; i < n - 1; i++) {
    	            for (int j = 0; j < n - i - 1; j++) {
    	                if (comparator.compare(shapes[j], shapes[j + 1]) > 0) {
    	                    // swap shapes[j] and shapes[j+1]
    	                    Shape3D temp = shapes[j];
    	                    shapes[j] = shapes[j + 1];
    	                    shapes[j + 1] = temp;
    	                }
    	            }
    	        }
    	 
    }
}