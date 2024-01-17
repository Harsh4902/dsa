package geometricAlgo;

import spatialDS.QuadTree;

import javax.crypto.spec.RC2ParameterSpec;

public class RectangleOverlap {

    public static void main(String[] args) {

        Rect rec1 = new Rect(0,0,3,2);
        Rect rect2 = new Rect(2,1,4,3);
        System.out.println(rec1.intersects(rect2));
        Rect rec3 = new Rect(0,0,3,2);
        Rect rect4 = new Rect(2,3,4,3);
        System.out.println(rec3.intersects(rect4));

    }

    public static class Rect {

        long x1, y1, x2, y2;

        public Rect(long x1, long y1, long x2, long y2) {
            if (x1 > x2 || y1 > y2) throw new IllegalArgumentException("Illegal rectangle coordinates");
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
        }

        public boolean intersects(Rect r) {
            return r != null && !(r.x2 < x1 || r.x1 > x2 || r.y1 > y2 || r.y2 < y1);
        }

        public boolean contains(long x, long y) {
            return (x1 <= x && x <= x2) && (y1 <= y && y <= y2);
        }

        public boolean contains(Rect r) {
            return r != null && contains(r.x1, r.y1) && contains(r.x2, r.y2);
        }
    }

}
