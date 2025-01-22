import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Interval{
    int start;
    int end;

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}

class IntervalComparator implements Comparator<Interval> {
    public int compare(Interval i1, Interval i2) {
        return i1.start - i2.start;
    }
}


public class MergeIntervals {

    public static ArrayList<Interval> mergeInt(ArrayList<Interval> intervals){

        if (intervals == null || intervals.size() <= 1)
            return intervals;


        Collections.sort(intervals, new IntervalComparator());

        ArrayList<Interval> result = new ArrayList<Interval>();

        Interval prev = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {

            Interval curr = intervals.get(i);

            if (prev.end >= curr.start) {
                // merged case
                Interval merged = new Interval(prev.start, Math.max(prev.end,
                        curr.end));
                prev = merged;
            }

            else {
                result.add(prev);
                prev = curr;
            }
        }

        result.add(prev);
        return result;
    }
    public static void main(String[] args){

        ArrayList<Interval> str = new ArrayList<Interval>();
        Interval itr1=new Interval(1,3);
        Interval itr2=new Interval(2,3);
        Interval itr3=new Interval(4,6);
        Interval itr4=new Interval(5,7);
        str.add(itr1);
        str.add(itr2);
        str.add(itr3);
        str.add(itr4);

        ArrayList<Interval> result = new ArrayList<Interval>();
        result=mergeInt(str);
        for(Interval i : result){
            System.out.println(i.start+" "+i.end);
        }
    }

}
