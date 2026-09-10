class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        

        for(int i = 0 ; i <= flowerbed.length-1 ; i++)
        {
            if (n == 0) return true;

            int left = 0;
            int right = 0;
            
            if(i != 0)
            {
                left = flowerbed[i - 1];
            }

            if(i != flowerbed.length-1)
            {
                right = flowerbed[i + 1];
            }
            

            if(flowerbed[i] == 0 && left == 0 && right == 0)
            {
                flowerbed[i] = 1;
                n--;
            }
            if (n == 0) {
                    return true;
            }
        }
        return n == 0 ? true : false;
    }
}