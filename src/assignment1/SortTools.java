// SortTools.java 
/*
 * EE422C Project 1 submission by
 * Replace <...> with your actual data.
 * Jacob Grimm
 * jag9794
 * <5-digit Unique No.>
 * Fall 2018
 * Slip days used: 
 */
package assignment1;
import java.util.Arrays;
public class SortTools {
	/**
	  * This method tests to see if the given array is sorted.
	  * @param x is the array
	  * @param n is the size of the input to be checked
	  * @return true if array is sorted
	  */
	public static boolean isSorted(int[] x, int n) {
            if(x.length==0 || n == 0){
                return false;            
            }                     
            int prev = x[0];
            for(int i=1; i<n; i++){
                if(x[i] >=prev){
                    prev = x[i];   
                }
                else{
                  return false;}
            
            }
		// stub only, you write this!
		// TODO: complete it
		return true;
	}

	/**
	 * This method returns the index of value v within array x.
	 * @param x is the array
	 * @param n is the size of the input to be checked
	 * @param v is the value to be searched for within x
	 * @return index of v if v is contained within x. -1 if v is not contained within x
	 */
	public static int find(int[] x, int n, int v) {
            int i=n/2;
            int lower=0;
            int repeat = -1;
            int upper = n;
            while(v != x[i] && lower != upper && i != repeat ){
                if(v > x[i]){
                    lower = i;                
                }
                if(v< x[i]){
                upper =i;
                }
                repeat = i;
                i = (upper + lower)/2;                                           
            }
            if(upper == lower || i==repeat ){
                return -1;
            }
            else{
                return i;           
            }            
    }

	/**
	 * This method returns a newly created array containing the first n elements of x, and v.
	 * @param x is the array
	 * @param n is the number of elements to be copied from x
	 * @param v is the value to be added to the new array
	 * @return a new array containing the first n elements of x, and v
	 */
	public static int[] insertGeneral(int[] x, int n, int v){
              //  int [] newArray = Arrays.copyOfRange(x, 0, n);
              int i=n;
              while( i <= 0  && x[i]<v){
                  i--;
              }
              
              if(x[i] == v){
                  int [] sameArray = Arrays.copyOfRange(x, 0, n);
                  return sameArray;
              }
              int[] newArray = new int [n+1];
              int index2 = n-1;

              for(int index=n; index>=0; index--){
                  if(index==i){
                      newArray[index]=v;                     
                  }
                  else{
                      
                      newArray[index]= x[index2];
                      index2--;                                     
                  }
    }
                      return newArray;

        }

	/**
	 * This method inserts a value into the array and ensures it's still sorted
	 * @param x is the array
	 * @param n is the number of elements in the array
	 * @param v is the value to be added
	 * @return n if v is already in x, otherwise returns n+1
	 */
	public static int insertInPlace(int[] x, int n, int v){
            int temp= 0;
            int j = n - 1;
                x[n] = v;
                int l = n;
                while(j>= 0 && x[j] > v ){
                    x[l]=x[j];
                    x[j]=v;
                    j--;
                    l--;                                                                        
                }
                return n+1;
    }
                

	/**
	 * This method sorts a given array using insertion sort
	 * @param x is the array to be sorted
	 * @param n is the number of elements of the array to be sorted
	 */
	public static void insertSort(int[] x, int n){
            for(int i=1; i<n; i++){
                int j = i-1;
                int save = x[i];
                int l = i;
                while(j>= 0 && x[j] > save ){
                    x[l]=x[j];
                    x[j]=save;
                    j--;
                    l--;                    
                }                               
            }            
       }

}
