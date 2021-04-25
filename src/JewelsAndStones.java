import java.util.HashSet;

public class JewelsAndStones {
	public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set = new HashSet<>();
        char[] jewel = jewels.toCharArray();
        
        for(int i = 0; i < jewel.length; i++){
            set.add(jewel[i]);
        }
        
        int counter = 0;
        
        char[] stone = stones.toCharArray();
        
        for(int i = 0; i < stone.length; i++){
            if(set.contains(stone[i])){
                counter++;
            }
        }
        
        return counter;
        
    }
}
