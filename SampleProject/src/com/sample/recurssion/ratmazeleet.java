package com.sample.recurssion;

import java.util.ArrayList;

public class ratmazeleet {

    public static boolean isValidMove(int y, int x, int[][] arr, boolean[][] visited) {

        if (x == -1 || x == arr.length || y == -1 || y == arr.length || visited[y][x] || arr[y][x] == 0) {
            return false;
        }

        return true;
    }

    public static void printPathUtil(int[][] arr, int y, int x, String path, ArrayList< String > pathList, boolean[][] visited) {
        
        if (x == -1 || x == arr.length || y == -1 || y == arr.length || visited[y][x] || arr[y][x] == 0) {
            return;
        }

        if (x == arr.length - 1 && y == arr.length - 1) {
            pathList.add( path );
            return;
        }

        visited[y][x] = true;

        if (isValidMove(y + 1, x, arr, visited)) {
            path += "D";
            printPathUtil(arr, y + 1, x, path, pathList, visited);
            path = path.substring(0, path.length() - 1);
        }

        if (isValidMove(y, x - 1, arr, visited)) {
            path += "L";
            printPathUtil(arr, y, x - 1, path, pathList, visited);
            path = path.substring(0, path.length() - 1);
        }

        if (isValidMove(y, x + 1, arr, visited)) {
            path += "R";
            printPathUtil(arr, y, x + 1, path, pathList, visited);
            path = path.substring(0, path.length() - 1);
        }

        if (isValidMove(y - 1, x, arr, visited)) {
            path += "U";
            printPathUtil(arr, y - 1, x, path, pathList, visited);
            path = path.substring(0, path.length() - 1);
        }

        visited[y][x] = false;

    }

    public static ArrayList < String > findPath(int[][] arr, int n) {

        ArrayList < String > possiblePaths = new ArrayList < String >();
        String path = "";

        boolean[][] visited = new boolean[n][n];
        for(int i = 0; i < n; i++){ 
            for(int j = 0; j < n; j++){
                visited[i][j] = false;
            }
        }

        printPathUtil(arr, 0, 0, path, possiblePaths, visited);

        return possiblePaths;
    }
    public static void main(String[] args) {
        int[][] arr= {
                    {1, 0, 0, 0},
                    {1, 1, 0, 1},
                    {1, 1, 0, 0},
                    {0, 1, 1, 1},
            };
        findPath(arr, 4);
    }

}
