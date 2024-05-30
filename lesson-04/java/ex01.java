import java.util.Scanner;

public class ex01 {

    public static void clearConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static int[][] map = {
            { 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 1, 1, 0, 1, 1, 0 },
            { 0, 1, 0, 0, 1, 0, 0, 1 },
            { 0, 1, 0, 0, 0, 0, 1, 0 },
            { 0, 0, 1, 0, 0, 1, 0, 0 },
            { 0, 0, 0, 1, 1, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 0 }
    };

    @SuppressWarnings("resource")
    public static void print(int x, int y) {
        for (int i = 0; i < map.length; i++) {
            StringBuilder outStr = new StringBuilder();
            for (int j = 0; j < map[i].length; j++) {
                if (x == i && y == j) {
                    outStr.append("@");
                } else if (map[i][j] == 0) {
                    outStr.append(" ");
                } else {
                    outStr.append("█");
                }
            }
            System.out.println(outStr);
        }

        new Scanner(System.in).nextLine();
        clearConsole();
    }

    public static void draw(int x, int y) {
        print(x, y);
        if (map[x][y] == 0) {
            map[x][y] = 1;
            if (x - 1 >= 0)
                draw(x - 1, y);
            if (y + 1 < map[0].length)
                draw(x, y + 1);
            if (x + 1 < map.length)
                draw(x + 1, y);
            if (y - 1 >= 0)
                draw(x, y - 1);
        }
    }

    public static void main(String[] args) {
        draw(2, 2);
    }
}