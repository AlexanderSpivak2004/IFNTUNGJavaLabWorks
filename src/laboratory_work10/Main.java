package laboratory_work10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Cube cube1 = new Cube(14, "Green");
        Cube cube2 = new Cube(8, "Red");
        Cube cube3 = new Cube(3, "Green");
        Cube cube4 = new Cube(67, "Blue");
        Cube cube5 = new Cube(9, "Blue");
        Cube cube6 = new Cube(5, "Green");
        Cube cube7 = new Cube(10, "Green");
        Cube cube8 = new Cube(102, "Red");
        Cube cube9 = new Cube(2, "Green");
        Cube cube10 = new Cube(6, "Red");

        List<Cube> cubes = new ArrayList<>();

        cubes.add(cube1);
        cubes.add(cube2);
        cubes.add(cube3);
        cubes.add(cube4);
        cubes.add(cube5);
        cubes.add(cube6);
        cubes.add(cube7);
        cubes.add(cube8);
        cubes.add(cube9);
        cubes.add(cube10);

        Predicate<Integer> isSideLengthLessThan10 = sideLength -> sideLength < 10;

        List<Cube> cubesWithSideLessThan10 = Main.filterCubesBySideLength(cubes, isSideLengthLessThan10);

        System.out.println("Cubes with side less than 10: ");
        for (Cube cube : cubesWithSideLessThan10) {
            System.out.println(cube);
        }

        // Task 2
        MyInterface isRequiredColor = String::equalsIgnoreCase;

        List<Cube> greenCubes = filterCubesByColor(cubes, isRequiredColor);

        System.out.println("Green cubes: ");
        for (Cube cube : greenCubes) {
            System.out.println(cube);
        }
    }

    public static List<Cube> filterCubesBySideLength(List<Cube> cubes, Predicate<Integer> predicate) {
        List<Cube> result = new ArrayList<>();

        for (Cube cube : cubes) {
            if (predicate.test(cube.getSideLength())) {
                result.add(cube);
            }
        }

        return result;
    }

    public static List<Cube> filterCubesByColor(List<Cube> cubes, MyInterface isRequiredColor) {
        List<Cube> result = new ArrayList<>();

        for (Cube cube : cubes) {
            if (isRequiredColor.isRequiredColor("Green", cube.getColor())) {
                result.add(cube);
            }
        }

        return result;
    }
}
