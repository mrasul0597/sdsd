
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int [] a = new int [] {1,2,5,16,-1,0,32,3,5,8,23,4};
        int [] b = new int []{};
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(16);
        list.add(-1);
        list.add(-2);
        list.add(0);
        list.add(32);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(23);
        list.add(4);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) <= 0) {
                list.remove(i);
                --i;
            }
        }
        for (int i = 0; i < list.size(); i++) {
             if (list.get(i) % 2 != 0) {
                list.remove(i);
                --i;
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
