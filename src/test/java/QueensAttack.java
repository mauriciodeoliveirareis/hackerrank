public class QueensAttack {
    static int queensAttack(int boardSize, int qtyOfObstacles, int queenRow, int queenColumn, int[][] obstacles) {
        int queenMoves = 0;
        queenMoves += walkNorth(queenColumn,queenRow, obstacles);
        queenMoves += walkSouth(queenColumn,queenRow, boardSize, obstacles);
        queenMoves += walkWest(queenColumn, queenRow,obstacles);
        queenMoves += walkEast(queenColumn, queenRow,boardSize, obstacles);
        queenMoves += walkNorthWest(queenColumn, queenRow, obstacles);
        queenMoves += walkNorthEast(queenColumn, queenRow, boardSize, obstacles);
        queenMoves += walkSouthWest(queenColumn, queenRow, boardSize, obstacles);
        queenMoves += walkSouthEast(queenColumn, queenRow, boardSize, obstacles);
        return queenMoves;
    }

    private static boolean foundObstacle(int queenColumn, int queenRow, int[][] obstacles) {
        for(int i = 0; i < obstacles.length; i++) {
            if(obstacles[i][0] == queenRow && obstacles[i][1] == queenColumn)
                return true;
        }
        return false;

    }

    private static int walkSouthEast(int queenColumn, int queenRow, int boardSize, int[][] obstacles) {
        int queenMoves = 0;
        while (queenRow != boardSize && queenColumn != boardSize) {
            queenColumn++;
            queenRow++;
            if(foundObstacle(queenColumn, queenRow, obstacles)) break;
            queenMoves++;
        }
        return queenMoves;
    }

    private static int walkSouthWest(int queenColumn, int queenRow, int boardSize, int[][] obstacles) {
        int queenMoves = 0;
        while (queenRow != boardSize && queenColumn != 1) {
            queenColumn--;
            queenRow++;
            if(foundObstacle(queenColumn, queenRow, obstacles)) break;
            queenMoves++;
        }
        return queenMoves;
    }

    private static int walkNorthEast(int queenColumn, int queenRow, int boardSize, int[][] obstacles) {
        int queenMoves = 0;
        while (queenColumn != boardSize && queenRow != 1) {
            queenColumn++;
            queenRow--;
            if(foundObstacle(queenColumn, queenRow, obstacles)) break;
            queenMoves++;
        }
        return queenMoves;
    }

    private static int walkNorthWest(int queenColumn, int queenRow, int[][] obstacles) {
        int queenMoves = 0;
        while (queenColumn != 1 && queenRow != 1) {
            queenColumn--;
            queenRow--;
            if(foundObstacle(queenColumn, queenRow, obstacles)) break;
            queenMoves++;
        }
        return queenMoves;
    }

    private static int walkEast(int queenColumn, int queenRow, int boardSize, int[][] obstacles) {
        int queenMoves = 0;
        while (queenColumn < boardSize) {
            queenColumn++;
            if(foundObstacle(queenColumn, queenRow, obstacles)) break;
            queenMoves++;
        }
        return queenMoves;
    }

    private static int walkWest(int queenColumn, int queenRow, int[][] obstacles) {
        int queenMoves = 0;
        while (queenColumn > 1) {
            queenColumn--;
            if(foundObstacle(queenColumn, queenRow, obstacles)) break;
            queenMoves++;
        }
        return queenMoves;
    }

    private static int walkNorth(int queenColumn, int queenRow, int[][] obstacles) {
        int queenMoves = 0;
        while (queenRow > 1) {
            queenRow--;
            if(foundObstacle(queenColumn, queenRow, obstacles)) break;
            queenMoves++;
        }
        return queenMoves;
    }

    private static int walkSouth(int queenColumn, int queenRow, int boardSize, int[][] obstacles) {
        int queenMoves = 0;
        while (queenRow < boardSize) {
            queenRow++;
            if(foundObstacle(queenColumn, queenRow, obstacles)) break;
            queenMoves++;
        }
        return queenMoves;
    }

}
