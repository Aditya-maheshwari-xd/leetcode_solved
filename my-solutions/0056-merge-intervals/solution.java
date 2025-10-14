class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1)
        {
            return intervals;
        }
        Arrays.sort(intervals,Comparator.comparingInt(i->i[0]));
        List<int[]> result = new ArrayList<>();
        int [] newintervals = intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            int[] compare = intervals[i];
            if(newintervals[1]>=compare[0])
            {
                newintervals[1]= Math.max(newintervals[1],compare[1]);
            }
            else
            {
                                result.add(newintervals);

                newintervals = compare;
            }
        }
        result.add(newintervals);

        return result.toArray(new int[result.size()][]);
    }
}
