class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n =  position.length;
        int[][] car = new int[n][2];

        for(int i = 0; i < n; i++){
            car[i][0] = position[i];
            car[i][1] = speed[i];
        }

        Arrays.sort(car, (a, b) -> Integer.compare(b[0], a[0]));

        Deque <Double> carFleets = new ArrayDeque<Double>();

        for(int i = 0; i < n; i++){
            double currentCarTime = (double)(target - car[i][0])/ car[i][1];
            if(carFleets.isEmpty()){
                carFleets.push(currentCarTime);
                continue;
            }

            if(carFleets.peek() >= currentCarTime){
                continue;
            } else {
                carFleets.push(currentCarTime);
            }
        }

        return carFleets.size();
    }
}
