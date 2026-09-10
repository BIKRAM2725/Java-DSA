class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
    int grater = 0;

    for(int i : candies)
    {
        grater = Math.max(grater, i);
    }

    List<Boolean> arr = new ArrayList<>();

    for(int i = 0; i < candies.length ; i++)
    {
        if((candies[i] + extraCandies) >= grater)
        {
            arr.add(true);
        }
        else arr.add(false);

    }

    return arr;

    }
}