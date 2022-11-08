package top.niqiu;

import top.niqiu.Math.Geometry.Line;
import top.niqiu.Math.Geometry.LineInitType;
import top.niqiu.Network.Network;

import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.next();
        String s =  Network.Fetch("https://api.seniverse.com/v3/weather/daily.json?key=S6JOK9adH4c36m7wx&location="
                + city +
                "&language=zh-Hans&unit=c&start=-1&days=8");
        System.out.println(s);


        Line start = new Line();
        Line end = new Line(start, LineInitType.PARALLEL);
        Line third = new Line(start, LineInitType.INTERSECT);

    }
}


