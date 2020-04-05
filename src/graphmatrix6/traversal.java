//graph traversal(depth first search traversal)
package graphmatrix6;

import java.util.LinkedList;
import java.util.Scanner;

public class traversal {
    int vertices;
    LinkedList<Integer> adjlist[];
    boolean visted[];

    public traversal(int vertices) {
        this.vertices = vertices;
        adjlist = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjlist[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the vertices");
        int vertices = sc.nextInt();
        traversal obj = new traversal(vertices);
        for (int i = 0; i < vertices; i++) {
            System.out.println("enter the value of soure");
            int s = sc.nextInt();
            System.out.println("enter the value of destinaton");
            int d = sc.nextInt();
            obj.getEdge(s, d);
        }
        obj.DFS(0);
    }

    public void getEdge(int source, int destination) {
        adjlist[source].addFirst(destination);
    }

    public void DFS(int start_vertex) {
        visted = new boolean[vertices];
        dfsrecursion(start_vertex);
    }

    public void dfsrecursion(int start) {
        visted[start] = true;
        System.out.print(start + " ");
        for (int i = 0; i < adjlist[start].size(); i++) {
            int destination = adjlist[start].get(i);
            if (!visted[destination]) {
                dfsrecursion(destination);
            }
        }
    }
}