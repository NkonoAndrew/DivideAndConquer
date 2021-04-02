package cs146F20Mwaseprject2;

public class FindDollar {
	public static void main(String[] args) {
        String[] A = {"ate", "eat", "tea", "zoo"};
        String[] B = {"ate", "$","eat", "tea", "zoo"};

        int i = findDollar(B, "$");
        System.out.println(i);
    }

	/*Using Linear search to find element because its a small array size*/
    public static int findDollar(String[] array, String key){
        int n = array.length;
        for (int i = 0; i < n; i++){
        	//Use equals for strings
            if (key.equals(array[i]))
            	//return the index of the found string 
                return i;
        }
        //Goes here if it never finds anything 
        return -1;
    }
}
