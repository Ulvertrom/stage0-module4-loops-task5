package school.mjc.stage0.loops.task5;

public class Rectangle {
    public void printRectangleFrom8s(int length, int height) {
        if (length > 0 && height > 0) {
            for (int i = 1; i <= height; i++) {
                for (int j = 1; j <= length; j++) {
                    if (i == 1 || i == height) System.out.print("8");
                    else System.out.print(j == 1 || j == length? "8": " ");
                }
                System.out.print("\n");
            }
        }

    }
}
