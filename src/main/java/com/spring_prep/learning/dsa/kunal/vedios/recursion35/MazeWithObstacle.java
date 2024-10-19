package com.spring_prep.learning.dsa.kunal.vedios.recursion35;

public class MazeWithObstacle {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        pathWithObstacle("", maze, 0, 0);
    }

    public static void pathWithObstacle(String p, boolean[][] maze, int r, int c){

        if(r == maze.length -1 && c == maze[0].length -1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if(r < maze.length -1){
            pathWithObstacle(p + "D", maze, r +1, c);
        }

        if(c < maze[0].length -1){
            pathWithObstacle(p + "R", maze, r, c+1);
        }

        if(r > 0){
            pathWithObstacle(p + "U", maze, r -1, c);
        }

        if(c > 0){
            pathWithObstacle(p + "U", maze, r, c -1);
        }
        maze[r][c] = true;
    }
}
