package top.niqiu.Math.Geometry;

import java.util.Objects;

public class Pos {
    public double x;
    public double y;


    public Pos(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pos pos = (Pos) o;
        return Double.compare(pos.x, x) == 0 && Double.compare(pos.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "[x, y]".replace("x" ,String.valueOf(x)).replace("y", String.valueOf(y));
    }
}
