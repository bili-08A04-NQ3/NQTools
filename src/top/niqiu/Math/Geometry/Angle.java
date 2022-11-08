package top.niqiu.Math.Geometry;

public class Angle extends GeometryShape{
    public Point vertex;

    // 角的两边上的一点
    public Point p1;
    public Point p2;

    // 角的两边
    public Line l1;
    public Line l2;

    public Angle(Point vertex, Point p1, Point p2) {
        this.vertex = vertex;
        this.p1 = p1;
        this.p2 = p2;
    }

    public Angle(Point vertex, Line l1, Line l2, int type) {
        this.vertex = vertex;
        switch (type) {
            case 1:
                this.p1 = l1.StartPoint;
                this.p2 = l2.StartPoint;
            case 2:
                this.p1 = l1.StartPoint;
                this.p2 = l2.EndPoint;
            case 3:
                this.p1 = l1.EndPoint;
                this.p2 = l2.StartPoint;
            case 4:
                this.p1 = l1.EndPoint;
                this.p2 = l2.EndPoint;
            default:
                // w
                throw new RuntimeException();
        }

    }
}
