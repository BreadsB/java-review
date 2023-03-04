package org.breadsb.edabit.expert;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//https://edabit.com/challenge/YzWb77MowQpixfpWh
public class AscendingConsecutiveNumbers {
    public static boolean ascending(String str) {
        boolean result = false;
        boolean rising = false;
        List<Integer> list = new ArrayList<>();
        List<Boolean> trueList = new ArrayList<>();

        for(int i=1; i<=str.length()/2; i++) { // how long would be the element
            if (str.length()%i!=0) {
                continue;
            }
            list.add(Integer.parseInt(str.substring(0,i)));

            for (int x=i; x<str.length(); x+=i) {
                list.add(Integer.parseInt(str.substring(x,x+i)));

                if (!Objects.equals(list.get(0), list.get(1)-1)) {
                    rising = false;
                    list.clear();
                    break;
                } else {
                    rising = true;
                }
            }
            if (rising) {

                for (int y=1; y<list.size(); y++) {

                    if (list.get(y)==list.get(y-1)+1) {
                        trueList.add(true);
                    } else {
                        list.clear();
                        trueList.clear();
                        break;
                    }
                }
                if (!trueList.contains(false) && trueList.contains(true)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean sol2(String str) {
        for (int i = 1; i <= str.length()/2+1; i++) {
            long num1 = Integer.parseInt(str.substring(0, i));
            String tmp = "";
            while (tmp.length()<str.length()) {
                tmp+=Long.toString(num1);
                num1++;
            }
            if(str.equals(tmp)){
                return true;
            }
        }
        return false;
    }
}
