import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
	public int distributeCandies(int[] candyType) {
        int candiesAllowed = candyType.length / 2;
        Set<Integer> set = new HashSet<>();
        
        for(int candy : candyType){
            set.add(candy);
        }
        
        return Math.min(set.size(), candiesAllowed);
    }
}