/* 
 * This file is how you might test out your code.  Don't submit this, and don't 
 * have a main method in SortTools.java.
 */

package assignment1;
public class Main {
	public static void main(String [] args) {

		// call your test methods here
		// SortTools.isSorted() etc.
                int [] a = {10,60,30,40,50};
                System.out.println(SortTools.isSorted(a, a.length));
                SortTools.insertSort(a, a.length);
                print(a);
                int [] x = SortTools.insertGeneral(a, 3, 35); 
                print(x);
                
                System.out.println(SortTools.find(x, 4, 50));
                
                System.out.println(SortTools.isSorted(x, x.length));
                System.out.println("in place: " + SortTools.insertInPlace(x, 1, 78));
                print(x);
                	}
        
        private static void print(int [] a ){
          for(int x=0;x<a.length;x++){
          System.out.println(a[x]);
                }

        }
        
}
