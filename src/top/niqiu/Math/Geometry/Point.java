package top.niqiu.Math.Geometry;

import java.util.Objects;

public class Point {
    public Pos pos;

    /**
     * Draw a random point
     */
    public Point() {
        this(Math.random() * Settings.getRandomPosRange(), Math.random() * Settings.getRandomPosRange());
    }

    /**
     * Draw a point on pos
     * @param pos pos
     */
    public Point(Pos pos) {
        this.pos = pos;
    }

    /**
     * Draw a point on pos
     * @param x Pos.x
     * @param y Pos.y
     */
    public Point(double x, double y) {
        this(new Pos(x, y));
    }

    /**
     * Draw a random pos which isn't superposition to other pos
     */
    public Point(Pos... pos) {
        this();
        Pos choice = new Pos(Math.random() * Settings.getRandomPosRange(), Math.random() * Settings.getRandomPosRange());
        while (true) {
            boolean x = false;
            for (Pos p: pos) {
                if (p.equals(choice)) {
                    x = true;
                    break;
                }
            }
            if (x) {
                choice = new Pos(Math.random() * Settings.getRandomPosRange(), Math.random() * Settings.getRandomPosRange());
            } else {
                break;
            }
        }
        this.pos = choice;
    }

    public Point(Point... points) {
        this();
        Point choice = new Point(Math.random() * Settings.getRandomPosRange(), Math.random() * Settings.getRandomPosRange());
        while (true) {
            boolean x = false;
            for (Point p: points) {
                if (p.equals(choice)) {
                    x = true;
                    break;
                }
            }
            if (x) {
                choice = new Point(Math.random() * Settings.getRandomPosRange(), Math.random() * Settings.getRandomPosRange());
            } else {
                break;
            }
        }
        this.pos = new Pos(choice.x(), choice.y());
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Objects.equals(pos, point.pos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pos);
    }

    @Override
    public String toString() {
        return pos.toString();
    }

    public double x() {
        return this.pos.x;
    }

    public double y() {
        return this.pos.y;
    }
}
