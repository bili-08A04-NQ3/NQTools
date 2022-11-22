package top.niqiu;

import top.niqiu.Logger.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = new Logger();

        // 1/f = 1/u + 1/v
        // 1/v = 1/u - 1/f
        // 1/v = (u-f)/uf
        // v = uf / (u-f)
        double f = 25;
        double v;
        double lv = 0;
        for (double u = 100; u > 0; u--) {
            if (u == f) {
                v = Double.MAX_VALUE;
            } else {
                v = u * f / (u - f);
            }
            System.out.println(- lv + v);
            lv = v;
        }
    }
}
