package tudelft.numfinder;

import tudelft.roman.RomanNumeral;

public class NumFinderMain {

    public static void main (String[] args) {
        NumFinder nf = new NumFinder();
        RomanNumeral rf = new RomanNumeral();

        // this works
        // nf.find(new int[] {4, 25, 7, 9});

        // this crashes
        nf.find(new int[] {0, 4, 3, -3, 2, 1});
        rf.convert("IV");

        System.out.println("The largest number is: " + nf.getLargest());
        System.out.println("The smallest number is: " + nf.getSmallest());
    }
}
