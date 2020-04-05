//grapgh implementation using adjacency matrix(weightes graph)
package graphmatrix3;

import java.util.Scanner;

public class adjacecymatrix {
    int vertices;
    int matrix[][];

    public adjacecymatrix(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the vertices");
        int vertices = sc.nextInt();
        adjacecymatrix obj = new adjacecymatrix(vertices);
        System.out.println("enter the vallue of edges");
        int e = sc.nextInt();
        for (int i = 0; i < e; i++) {
            System.out.println("enter the source vertex");
            int a = sc.nextInt();
            System.out.println("enter the destination vertex");
            int b = sc.nextInt();
            System.out.println("enter the weight of the edge");
            int w = sc.nextInt();
            obj.getEdge(a, b, w);
        }
        obj.printGraph();
    }

    public void getEdge(int source, int destination, int weight) {
        matrix[source][destination] = weight;
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

