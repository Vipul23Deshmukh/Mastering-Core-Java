package Collection_Framework.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Remove_Even_Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(
        Arrays.asList(1,2,3,4,5,6)
                );
        Iterator<Integer> it= list.iterator();
            while(it.hasNext()){
                if(it.next()%2==0){
                    it.remove();
                }
            }
        System.out.println(list);
    }
}
