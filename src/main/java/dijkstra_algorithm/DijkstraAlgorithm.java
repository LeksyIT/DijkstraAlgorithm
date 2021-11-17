package dijkstra_algorithm;

public class DijkstraAlgorithm {
    public static void startDijkstraAlgorithm(int[][] matrix, int start, int V) {
        final int MAX_VALUE = 9999999;
        int[] distance = new int[V];
        boolean[] visited = new boolean[V];
        int min;
        int index = 0;

        for (int i = 0; i < 5; ++i) {
            distance[i] = MAX_VALUE;
            visited[i] = false;
        }
        distance[start - 1] = 0;
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 4; ++i) {
            min = MAX_VALUE;
            for (int j = 0; j < 5; ++j) {
                if (!visited[j] && distance[j] < min) {
                    min = distance[j];
                    index = j;
                }
            }
            visited[index] = true;
            for (int el = 0; el < 5; ++el) {
                if (!visited[el] && matrix[index][el] > 0 && distance[index] != MAX_VALUE && distance[index] + matrix[index][el] < distance[el]) {
                    distance[el] = distance[index] + matrix[index][el];
                }
            }
        }
        for (int j = 0; j < distance.length; j++) {
            System.out.println("Расстояние до " + (j + 1) + " = " + distance[j]);
        }
    }
}