//adjacency list representation of graph using linked list of bidirectional graph or unweightes graph
package graphmatrix4;

import java.util.LinkedList;
import java.util.Scanner;

public class adjacencylist {
    int vertices;
    LinkedList<Integer> adjlist[];

    public adjacencylist(int vertices) {
        this.vertices = vertices;
        adjlist = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjlist[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of vertices");
        int vertices = sc.nextInt();
        adjacencylist obj = new adjacencylist(vertices);
        for (int i = 0; i < vertices; i++) {
            System.out.println("enter the source value");
            int s = sc.nextInt();
            System.out.println("enter the destination value");
            int d = sc.nextInt();
            obj.getEdge(s, d);
        }
        obj.deisplay();
    }

    public void getEdge(int source, int destination) {
        adjlist[source].addFirst(destination);
        adjlist[source].addFirst(destination);
    }

    public void deisplay() {
        for (int i = 0; i < vertices; i++) {
            if (adjlist[i].size() > 0) {
                System.out.print("vertex connected to which vertex=  ");
                for (int j = 0; j < adjlist[i].size(); j++) {
                    System.out.print(adjlist[i].get(j) + " ");
                }
            }
            System.out.println();
        }
    }
}
