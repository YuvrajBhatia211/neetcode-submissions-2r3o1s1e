class Solution {
    public int maxArea(int[] heights) {
        int i=0;
        int j = heights.length-1;
        
         int maxarea=0;
        while(i<j){
            int w =  j-i;
            int h= Math.min(heights[i] , heights[j]);
            int area = w*h;

            maxarea = Math.max(maxarea,area);

            if(heights[i] < heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxarea;
    }
}
