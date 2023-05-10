package sort_test;

import java.util.Arrays;
import java.util.Comparator;

public class TestDemo1 {
    public static void main(String[] args) {
        Girl g1 = new Girl("meimei",23,160);
        Girl g2 = new Girl("qianqian",22,150);
        Girl g3 = new Girl("zheng",22,160);

        Girl[] grils = {g1,g2,g3};

        Arrays.sort(grils, (Girl o1, Girl o2) -> {
                double temp = o1.getAge()-o2.getAge();
                temp = temp == 0 ? o1.getHeight()-o2.getHeight():temp;
                temp = temp == 0 ? o1.getName().compareTo(o2.getName()):temp;

                if(temp > 0)
                    return 1;
                else if(temp<0)
                    return -1;
                else
                    return 0;
            }
        );
        System.out.println(Arrays.toString(grils));
    }
}
