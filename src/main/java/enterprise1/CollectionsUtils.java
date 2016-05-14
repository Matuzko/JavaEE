package enterprise1;



import java.util.List;
import java.util.ListIterator;
import java.util.Set;


public class CollectionsUtils {
    public static long populate (List list, int size){
        long start, stop, result = 0;
        for (int j = 0; j < 100; j++){
            list.clear();
            start = System.nanoTime();
            for (int i = 0; i < size; i++){
                list.add(i);
            }

            stop = System.nanoTime();
            result += stop - start;
        }
        return result / 100;
    }
    public static long populate (Set set, int size){
        long start, stop, result = 0;
        for (int i = 0; i < 100; i++){
            set.clear();
            start = System.nanoTime();
            for (int j = 0; j < size; j++){
                set.add(j);
            }
            stop = System.nanoTime();
            result += stop - start;
        }
        return result / 100;
    }
    public static long add (List list){
        long start, stop, result = 0;
        for (int i = 0; i < 100; i++){
            start = System.nanoTime();
            list.add(list.size()+1+i);
            stop = System.nanoTime();
            result += stop - start;
        }
        return result / 100;
    }
    public static long add (Set set){
        long start, stop, result = 0;
        for (int i = 0; i < 100; i++){
            start = System.nanoTime();
            set.add(set.size()+1+i);
            stop = System.nanoTime();
            result += stop - start;
        }
        return result / 100;
    }
    public static long remove (List list){
        long start, stop, result = 0;
        for (int i = 0; i < 100; i++){
            start = System.nanoTime();
            list.remove(list.size()-1-i);
            stop = System.nanoTime();
            result += stop - start;
        }
        return result / 100;
    }
    public static long remove (Set set){
        long start, stop, result = 0;
        for (int i = 0; i < 100; i++){
            start = System.nanoTime();
            set.remove(set.size()-1-i);
            stop = System.nanoTime();
            result += stop - start;
        }
        return result / 100;
    }
    public static long contains (List list){
        long start, stop, result = 0;
        for (int i = 0; i < 100; i++){
            start = System.nanoTime();
            list.contains(list.size()-i);
            stop = System.nanoTime();
            result += stop - start;
        }
        return result / 100;
    }
    public static long contains (Set set){
        long start, stop, result = 0;
        for (int i = 0; i < 100; i++){
            start = System.nanoTime();
            set.contains(set.size()-i);
            stop = System.nanoTime();
            result += stop - start;
        }
        return result / 100;
    }
    public static long get (List list){
        long start, stop, result = 0;
        for (int i = 0; i < 100; i++){
            start = System.nanoTime();
            list.get(list.size()-i-1);
            stop = System.nanoTime();
            result += stop - start;
        }
        return result / 100;
    }
    public static long iterAdd (List list){
        ListIterator iter = list.listIterator();
        long start, stop, result = 0;
        for (int i = 0; i < 100; i++){
            start = System.nanoTime();
            iter.add(list.size()+1+i);
            stop = System.nanoTime();
            result += stop - start;
        }
        return result / 100;
    }
    public static long iterRemove (List list){
        ListIterator iter = list.listIterator();
        long start, stop, result = 0;
        for (int i = 0; i < 100; i++){
            iter.next();
            start = System.nanoTime();
            iter.remove();
            stop = System.nanoTime();
            result += stop - start;
        }
        return result / 100;
    }

}
