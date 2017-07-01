package problems.medium.numberOfPlanes;


import shared.Interval;

import java.util.*;


public class NumberOfAirplanesInTheSky {
    /**
     * @param airplanes: An interval array
     * @return: Count of airplanes are in the sky.
     */


    public int countOfAirplanes(List<Interval> airplanes) {
        // write your code here
        int max = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        if (airplanes == null || airplanes.size() == 0) {
            return 0;
        }
        for (Interval interval : airplanes) {
            for (int i = interval.start; i < interval.end; ++i) {
                if (hashMap.containsKey(i)) {
                    hashMap.put(i, hashMap.get(i) + 1);
                } else {
                    hashMap.put(i, 1);
                }
                max = Math.max(hashMap.get(i), max);
            }
        }
        return max;
    }

    public int countOfAirplanes1(List<Interval> airplanes) {
        if (airplanes == null || airplanes.size() == 0) {
            return 0;
        }
        //this round of sort is to make sure landing takes place before flying, if
        //they happen at the same time
        Collections.sort(airplanes, new Comparator<Interval>() {
            public int compare(Interval i1, Interval i2) {
                return Integer.compare(i1.start, i2.start);
            }
        });
        Point1[] points = new Point1[airplanes.size() * 2];
        for (int i = 0; i < airplanes.size(); i++) {
            points[i * 2] = new Point1(airplanes.get(i).start, true);
            points[i * 2 + 1] = new Point1(airplanes.get(i).end, false);
        }
        Arrays.sort(points, new Comparator<Point1>() {
            public int compare(Point1 i1, Point1 i2) {
                return Integer.compare(i1.time, i2.time);
            }
        });
        int res = 0;
        int cur = 0;
        for (Point1 p : points) {
            if (!p.isStart) {
                cur--;
            } else {
                cur++;
                res = Math.max(res, cur);
            }
        }
        return res;
    }

    public int countOfAirplanes2(List<Interval> airplanes) {
        List<Point> list = new ArrayList<>(airplanes.size() * 2);
        for (Interval i : airplanes) {
            list.add(new Point(i.start, 1));
            list.add(new Point(i.end, 0));
        }

        Collections.sort(list, Point.PointComparator);
        int count = 0, ans = 0;
        for (Point p : list) {
            if (p.flag == 1) count++;
            else count--;
            ans = Math.max(ans, count);
        }

        return ans;
    }

    static class Point {
        public static Comparator<Point> PointComparator = new Comparator<Point>() {
            public int compare(Point p1, Point p2) {
                if (p1.time == p2.time) return p1.flag - p2.flag;
                else return p1.time - p2.time;
            }
        };
        int time;
        int flag;

        Point(int t, int s) {
            this.time = t;
            this.flag = s;
        }
    }

    class Point1 {
        int time;
        boolean isStart;

        public Point1(int time, boolean isStart) {
            this.time = time;
            this.isStart = isStart;
        }
    }

}
