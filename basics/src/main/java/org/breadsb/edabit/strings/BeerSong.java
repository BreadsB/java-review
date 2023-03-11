package org.breadsb.edabit.strings;

public class BeerSong {

    void singSong(int numberOfBeers) {
        int i;
        for (i = numberOfBeers; i>1; i--) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\nTake one down and pass it around, " + (i-1) + " bottles of beer on the wall.");
        }
        if (i==1) {
            System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer. \nTake it down and pass it around, no more bottles of beer on the wall.");
        } else {
            System.out.println("No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, " + numberOfBeers + " bottles of beer on the wall");
        }
    }
}