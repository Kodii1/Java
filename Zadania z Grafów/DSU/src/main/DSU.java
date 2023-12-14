package main;


import java.util.*;

public class DSU {
    private final ArrayList < Integer > parents = new ArrayList<>();
    private final ArrayList < Integer > ranks = new ArrayList<>();
    DSU(int n) {
        for (int i = 0; i < n; i++) {
            parents.add(i);
            ranks.add(0);
        }
    }

    public int find(int x) {
        if( parents.get(x) != x ){
            parents.set ( x, find ( parents.get ( x ) ) );
        }
        return parents.get(x);
    }
    public void union(int x, int y){
        int xRoot = find(x);
        int yRoot = find(y);

        if( xRoot != yRoot) {
            if( ranks.get(xRoot) > ranks.get(yRoot) ){
                parents.set(xRoot,yRoot);
            }else if( ranks.get(xRoot) < ranks.get(yRoot) ) {
                parents.set( yRoot, xRoot );
            }else{
                parents.set( yRoot, xRoot);
                ranks.set(xRoot, ranks.get(yRoot) + 1);
            }
        }
    }


}

