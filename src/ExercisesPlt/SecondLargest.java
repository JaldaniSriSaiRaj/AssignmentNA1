package ExercisesPlt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

 

public class SecondLargest {

 

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2,3,5,6,3,3,3,2,3,5,0);
        Set<Integer> s1 = new TreeSet<Integer>();
        numbers.stream().filter(e->s1.add(e)).collect(Collectors.toSet());
        List<Integer> l2 =new ArrayList<>(s1);
        System.out.println(l2.get(l2.size()-2));

        // TODO Auto-generated method stub

 

    }

 

}