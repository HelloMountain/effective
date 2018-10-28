package iterator;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Classname IteratorEnum
 * @Description TODO
 * @Date 2018/10/28 9:23
 * @Created by HP
 */
public class IteratorEnum {
    enum Suts{A, B, C, D, E, F}
    enum Rank{a, b, c, d, e, f, g, h}
    public void forIterator(){
        Collection<Suts> suts = Arrays.asList(Suts.values());
        Collection<Rank> ranks = Arrays.asList(Rank.values());
        for (Iterator<Suts> i = suts.iterator(); i.hasNext(); ) {
            for (Iterator<Rank> j = ranks.iterator(); j.hasNext();){

                System.out.println(""+i.next()+j.next());
            }
        }
    }
    public static void forEach(){
        for (Suts suts:Suts.values()
             ) {
            for (Rank r :Rank.values()
                    ) {
                System.out.println(""+suts+r);
            }
        }
    }
    public static void main(String[] args) {
        forEach();
    }
}
