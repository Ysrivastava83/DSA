package LamdaExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LamdaSum
{
    public static void main(String[] args)
    {
        List<Integer> num= Arrays.asList(1,2,3,4,5,6);
                        int sum=num.stream()
                                .filter(n->n%2==0)
                                .map(n->n*n)
                                .reduce(0,(c,e)->c+e);

                             num.stream()
                                 .sorted()
                                 .forEach(System.out::println);

        System.out.println(sum);
    }
}
