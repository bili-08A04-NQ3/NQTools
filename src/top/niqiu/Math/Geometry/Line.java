package top.niqiu.Math.Geometry;

import java.util.ArrayList;
import java.util.List;

public class Line extends GeometryShape {
    public Point StartPoint;
    public Point EndPoint;

    public List<Line> parallelLines = new ArrayList<>();
    public List<Line> intersectLines = new ArrayList<>();

    /**
     * Draw a line with start and end.
     *
     * @param start the Pos list start.
     * @param end   the Pos list end.
     */
    @Deprecated
    public Line(Point start, Point end) {
        this.StartPoint = start;
        this.EndPoint = end;
    }

    /**
     * Draw a line parallel to another line.
     *
     * @param line line.
     */
    public Line(Line line, String type) {
        this((Point) null, (Point) null);
        if (type.equals(LineInitType.INTERSECT)) {
            this.parallelLines.add(line);
            // 添加相交点
            for (Line l: this.parallelLines) {
                l.parallelLines.add(line);
            }
        } else if (type.equals(LineInitType.PARALLEL)) {
            this.intersectLines.add(line);
        }
    }

    /**
     * Draw a random line.
     */
    public Line() {
        this(new Point(), new Point());
    }

    public boolean IsParallelTo(Line line) {
        if (this.StartPoint != null && this.EndPoint != null && line.StartPoint != null && line.EndPoint != null) {
            // 通过坐标判断是否平行
            return this.StartPoint.x() - this.EndPoint.x() == this.StartPoint.x() - this.EndPoint.y();
        } else {
            // 坐标不全

            // 寻找已经确定的线
            for (Line p: this.parallelLines) {
                if (p.equals(line)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSuperpositionTo(Line line) {
        if (this.StartPoint != null && this.EndPoint != null && line.StartPoint != null && line.EndPoint != null) {
            // 通过坐标判断是否重合 TODO nmsl

        }
    }
}
