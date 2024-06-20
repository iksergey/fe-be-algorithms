import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Wave {
    public static void main(String[] args) {

        var mapGenerator = new MapGenerator();
        // System.out.println(
        // new MapPrinter().printRawData(
        // mapGenerator.getMap()));
        System.out.println(
                new MapPrinter().printColoredMap(
                        mapGenerator.getMap()));

        var waveAlgorithm = new WaveAlgorithm(mapGenerator.getMap());
        waveAlgorithm.colorize(new Point2D(3, 3));

        // System.out.println(
        // new MapPrinter().printColoredMap(
        // mapGenerator.getMap()));

        System.out.println(
                new MapPrinter().printRawData(
                        mapGenerator.getMap()));
    }
}

class Point2D {
    int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("x: %d  y: %d", x, y);
    }
}

class MapGenerator {
    int[][] map;

    public MapGenerator() {
        int[][] initialMap = {
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 },
                { -1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, -1, 0, -1, -1, -1, -1, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, -1, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1 },
                { -1, -1, -1, 0, -1, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, -1, 0, -1, 0, 0, -1, -1, -1, 0, 0, -1 },
                { -1, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1 },
                { -1, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, -1 },
                { -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1 },
                { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 }
        };

        this.map = initialMap;
    }

    public int[][] getMap() {
        return map;
    }

    public void setCat(Point2D pos) {
        map[pos.x][pos.y] = -2;
    }

    public void setExit(Point2D pos) {
        map[pos.x][pos.y] = -3;
    }
}

class MapPrinter {

    public String printRawData(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int[] row : map) {
            for (int cell : row) {
                sb.append(String.format("%5d", cell));
            }
            sb.append("\n");
        }
        sb.append("\n".repeat(3));

        return sb.toString();
    }

    public String printColoredMap(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int[] row : map) {
            for (int cell : row) {
                switch (cell) {
                    // case 0: sb.append("░"); break;
                    case 0 -> sb.append("░");
                    case -1 -> sb.append("▓");
                    case -2 -> sb.append("К");
                    case -3 -> sb.append("E");
                    default -> sb.append(" ");
                }
            }
            sb.append("\n");
        }
        sb.append("\n".repeat(3));
        return sb.toString();
    }
}

class WaveAlgorithm {
    int[][] map;

    public WaveAlgorithm(int[][] map) {
        this.map = map;
    }

    public void colorize(Point2D startPoint) {
        Queue<Point2D> queue = new LinkedList<>();
        queue.add(startPoint);
        map[startPoint.x][startPoint.y] = 1;

        while (!queue.isEmpty()) {
            Point2D p = queue.remove();

            if (map[p.x - 1][p.y] == 0) {
                queue.add(new Point2D(p.x - 1, p.y));
                map[p.x - 1][p.y] = map[p.x][p.y] + 1;
            }
            if (map[p.x][p.y - 1] == 0) {
                queue.add(new Point2D(p.x, p.y - 1));
                map[p.x][p.y - 1] = map[p.x][p.y] + 1;
            }
            if (map[p.x + 1][p.y] == 0) {
                queue.add(new Point2D(p.x + 1, p.y));
                map[p.x + 1][p.y] = map[p.x][p.y] + 1;
            }
            if (map[p.x][p.y + 1] == 0) {
                queue.add(new Point2D(p.x, p.y + 1));
                map[p.x][p.y + 1] = map[p.x][p.y] + 1;
            }
        }
    }

    public ArrayList<Point2D> getRoad(Point2D exit) {
        ArrayList<Point2D> road = new ArrayList<>();
        return road;
    }
}
