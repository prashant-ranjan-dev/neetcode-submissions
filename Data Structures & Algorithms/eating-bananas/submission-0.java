class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int kmin = 1, kmax = Arrays.stream(piles).max().getAsInt();
        int res = 0, currentH = 0;
        while (kmin <= kmax) {
            currentH = 0;
            int mid = kmin + (kmax - kmin) / 2;
            for(int i = 0; i < piles.length; i++){
                currentH += (piles[i] + mid - 1) /mid;
            }

            if(currentH > h){
                kmin = mid+1;
            } else if(currentH <= h){
                res = mid;
                kmax = mid -1;
            }
        }

        return res;
    }
}
