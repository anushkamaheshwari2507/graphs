//graph representation using adjacecy matrix (directed grapgh)
package graphmatrix2;

import java.util.Scanner;

public class adjacencymatrix {
    int vertices;
    int matrix[][];

    public adjacencymatrix(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the vertices");
        int vertices = sc.nextInt();
        adjacencymatrix obj = new adjacencymatrix(vertices);
        System.out.println("enter the vallue of edges");
        int e = sc.nextInt();
        for (int i = 0; i < e; i++) {
            System.out.println("enter the source vertex");
            int a = sc.nextInt();
            System.out.println("enter the destination vertex");
            int b = sc.nextInt();
            obj.getEdge(a, b);
        }
        obj.printGraph();
    }

    public void getEdge(int source, int destination) {
        matrix[source][destination] = 1;
    }

    public void printGraph() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j] + "   ");
            }
            System.out.println();
        }
    }
}

