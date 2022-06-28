package level3.lesson5.dz;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;

public class ComparatorEx {
    public static void main(String[] args) {
        ArrayList<A> arr = new ArrayList<A>();
        arr.add(new A(1, 3));
        arr.add(new A(3, 1));
        arr.add(new A(2, 4));
        System.out.println(arr.toString());

        arr.sort(null);
        System.out.println(arr.toString());

        arr.sort(new Comparator<A>() {
            @Override
            public int compare(A o1, A o2) {
                if (o1.getY() > o2.getY()) return 1;
                if (o1.getY() < o2.getY()) return -1;
                return 0;
            }
        });
        System.out.println(arr.toString());
        arr.sort(new ReverseX());
        System.out.println(arr.toString());
        arr.sort(
                (a, b) -> {
                    if (a.getY() > b.getY()) return -1;
                    if (a.getY() < b.getY()) return 1;
                    return 0;
                }
        );
        System.out.println(arr.toString());
    }
}

class A implements Comparable<A> {
    private int x;
    private int y;

    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public int compareTo(A other) {
        if (this.x > other.x) return 1;
        if (this.x < other.x) return -1;
        return 0;
    }


    @Override
    public String toString() {
        return "{" + this.x + ";" + this.y + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        A a = (A) o;
        return x == a.x && y == a.y;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }
}

class ReverseX implements Comparator<A> {

    @Override
    public int compare(A o1, A o2) {
        return o2.compareTo(o1);
    }
}