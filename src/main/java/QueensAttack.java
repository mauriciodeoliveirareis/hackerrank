import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class QueensAttack {
    static int queensAttack(int boardSize, int qtyOfObstacles, int queenRow, int queenColumn, int[][] obstaclesArray) {
        Set<String> obstacles = obstaclesToMap(obstaclesArray);
        int queenMoves = 0;
        queenMoves += walkNorth(queenColumn,queenRow, obstacles);
        queenMoves += walkWest(queenColumn, queenRow,obstacles);
        queenMoves += walkNorthWest(queenColumn, queenRow, obstacles);
        queenMoves += walkSouth(queenColumn,queenRow, boardSize, obstacles);
        queenMoves += walkEast(queenColumn, queenRow,boardSize, obstacles);
        queenMoves += walkNorthEast(queenColumn, queenRow, boardSize, obstacles);
        queenMoves += walkSouthWest(queenColumn, queenRow, boardSize, obstacles);
        queenMoves += walkSouthEast(queenColumn, queenRow, boardSize, obstacles);
        return queenMoves;
    }

    private static Set<String> obstaclesToMap(int[][] obstaclesArray) {
        Set<String> obstacles = new HashSet<>();
        for(int i = 0; i < obstaclesArray.length; i++) {
            obstacles.add("r"+Integer.toString(obstaclesArray[i][0]) + "c"+Integer.toString(obstaclesArray[i][1]));

        }
        return obstacles;
    }

    private static boolean foundObstacle(int queenColumn, int queenRow, Set<String> obstacles) {
        return obstacles.contains("r"+Integer.toString(queenRow) + "c"+Integer.toString(queenColumn));


    }

    private static int walkSouthEast(int queenColumn, int queenRow, int boardSize, Set<String> obstacles) {
        int queenMoves = 0;
        while (queenRow != boardSize && queenColumn != boardSize) {
            queenColumn++;
            queenRow++;
            if(foundObstacle(queenColumn, queenRow, obstacles)) break;
            queenMoves++;
        }
        return queenMoves;
    }

    private static int walkSouthWest(int queenColumn, int queenRow, int boardSize, Set<String> obstacles) {
        int queenMoves = 0;
        while (queenRow != boardSize && queenColumn != 1) {
            queenColumn--;
            queenRow++;
            if(foundObstacle(queenColumn, queenRow, obstacles)) break;
            queenMoves++;
        }
        return queenMoves;
    }

    private static int walkNorthEast(int queenColumn, int queenRow, int boardSize, Set<String> obstacles) {
        int queenMoves = 0;
        while (queenColumn != boardSize && queenRow != 1) {
            queenColumn++;
            queenRow--;
            if(foundObstacle(queenColumn, queenRow, obstacles)) break;
            queenMoves++;
        }
        return queenMoves;
    }

    private static int walkNorthWest(int queenColumn, int queenRow, Set<String> obstacles) {
        int queenMoves = 0;
        while (queenColumn != 1 && queenRow != 1) {
            queenColumn--;
            queenRow--;
            if(foundObstacle(queenColumn, queenRow, obstacles)) break;
            queenMoves++;
        }
        return queenMoves;
    }

    private static int walkEast(int queenColumn, int queenRow, int boardSize, Set<String> obstacles) {
        int queenMoves = 0;
        while (queenColumn < boardSize) {
            queenColumn++;
            if(foundObstacle(queenColumn, queenRow, obstacles)) break;
            queenMoves++;
        }
        return queenMoves;
    }

    private static int walkWest(int queenColumn, int queenRow, Set<String> obstacles) {
        int queenMoves = 0;
        while (queenColumn > 1) {
            queenColumn--;
            if(foundObstacle(queenColumn, queenRow, obstacles)) break;
            queenMoves++;
        }
        return queenMoves;
    }

    private static int walkNorth(int queenColumn, int queenRow, Set<String> obstacles) {
        int queenMoves = 0;
        while (queenRow > 1) {
            queenRow--;
            if(foundObstacle(queenColumn, queenRow, obstacles)) break;
            queenMoves++;
        }
        return queenMoves;
    }

    private static int walkSouth(int queenColumn, int queenRow, int boardSize, Set<String> obstacles) {
        int queenMoves = 0;
        while (queenRow < boardSize) {
            queenRow++;
            if(foundObstacle(queenColumn, queenRow, obstacles)) break;
            queenMoves++;
        }
        return queenMoves;
    }

}
