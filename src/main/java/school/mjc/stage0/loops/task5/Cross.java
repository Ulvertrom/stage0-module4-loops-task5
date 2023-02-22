package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        int middleFirst, middleSecond;
        if (sideLength % 2 == 0) {
            middleFirst = sideLength / 2;
            middleSecond = middleFirst + 1;
        } else {
            middleFirst = sideLength / 2 + 1;
            middleSecond = middleFirst;
        }
        if (sideLength > 0) {
            for (int i = 1; i <= sideLength; i++) {
                for (int j = 1; j <= sideLength; j++) {
                    if (i == middleFirst || i == middleSecond) System.out.print("8");
                    else System.out.print(j == middleFirst || j == middleSecond? "8": " ");
                }
                System.out.print("\n");
            }
        }

    }
}
