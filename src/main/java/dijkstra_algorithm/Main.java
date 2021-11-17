package dijkstra_algorithm;

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 2, 14, 0, 0},
                {5, 0, 4, 0, 1},
                {12, 4, 0, 2, 0},
                {0, 0, 2, 0, 5},
                {0, 1, 0, 5, 0}};
        DijkstraAlgorithm.startDijkstraAlgorithm(matrix, 1, 5);
    }
}
