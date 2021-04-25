import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> mySet1 = new HashSet<Integer>();
        HashSet<Integer> mySet2 = new HashSet<Integer>();
        for(int num : nums1){
            mySet1.add(num);
        }

        for(int num : nums2){
            mySet2.add(num);
        }
        
        if(mySet1.size() > mySet2.size()){
            return changeToArray(mySet2, mySet1);
        } 
        return changeToArray(mySet1, mySet2);
        
    }
    
    public int[] changeToArray(HashSet<Integer> set1, HashSet<Integer> set2){
        int[] toReturn = new int[set1.size()];
        int counter = 0;
        
        for(Integer set: set1){
            if(set2.contains(set)){
                toReturn[counter] = set;
                counter++;
            }
        }
        
        return Arrays.copyOf(toReturn, counter);
    }
}
