class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        ArrayList<int[]> list = new ArrayList<>();
        boolean inserted = false;

        for (int[] curr : intervals) {

            
            if (curr[1] < newInterval[0]) {
                list.add(curr);
            }

            
            else if (curr[0] > newInterval[1]) {

                if (!inserted) {
                    list.add(newInterval);
                    inserted = true;
                }

                list.add(curr);
            }

        
            else {
                newInterval[0] = Math.min(newInterval[0], curr[0]);
                newInterval[1] = Math.max(newInterval[1], curr[1]);
            }
        }

        if (!inserted) {
            list.add(newInterval);
        }

        return list.toArray(new int[list.size()][]);
    }
}