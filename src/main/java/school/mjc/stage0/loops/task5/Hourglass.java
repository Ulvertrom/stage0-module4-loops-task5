package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height > 0) {
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= height; j++) {
                    System.out.print(((i <= j && j <= height - i + 1) || (height - i + 1 <= j && j <= i))? "8": " ");
                }
                System.out.print("\n");
            }
        }

    }
}
