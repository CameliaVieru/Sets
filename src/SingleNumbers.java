import java.util.HashSet;
import java.util.Set;

public class SingleNumbers {
	public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums) {
            
            if(!set.add(num)) {
                set.remove(num);
            }
        }
        
        for(int val : set) {
            return val;
        }
        return -1;
     
    }
}
