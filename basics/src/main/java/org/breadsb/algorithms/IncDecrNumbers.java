package org.breadsb.algorithms;

public class IncDecrNumbers {
    public static int incDec(int n) {
        int count = 0;
        boolean increasing = false;
        boolean good = false;

        for(int i=1; i<=(int) Math.pow(10, n); i++) {
            String sub = String.valueOf(i);
            if(sub.length()==1) {
                count++;
            } else {
                String[] splited = sub.split("");
                for(int y=1; y<splited.length; y++) {
                    int first = Integer.parseInt(splited[y]);
                    int second = Integer.parseInt(splited[y-1]);
                    if (first>second) {
                        increasing = true;
                        break;
                    } else if (first<second) {
                        increasing = false;
                        break;
                    }
                }

                if(increasing) {
                    for(int y=1; y<splited.length; y++) {
                        int first = Integer.parseInt(splited[y]);
                        int second = Integer.parseInt(splited[y-1]);
                        if(first>=second) {
                            good = true;
                        } else {
                            good = false;
                            break;
                        }
                    }
                } else {
                    for (int y=1; y<splited.length; y++) {
                        int first = Integer.parseInt(splited[y]);
                        int second = Integer.parseInt(splited[y-1]);
                        if(first<=second) {
                            good = true;
                        } else {
                            good = false;
                            break;
                        }
                    }
                }
                if(good) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int betterSoultion(int n) {
        return 0;
    }
}
