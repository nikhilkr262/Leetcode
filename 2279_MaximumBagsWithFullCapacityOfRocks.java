class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int count=0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<capacity.length;i++){
                    arr.add(capacity[i]-rocks[i]); 
        }
                    Collections.sort(arr);
                    for(int i:arr)
                    {
                        if(i==0)
                            count++;
                        else if(additionalRocks>=i)
                        {
                            additionalRocks-=i;
                            count++;
                        }
                            
                    }
                                    
        return count;
        
    }
}