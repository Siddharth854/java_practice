import java.lang.Math;
class max_water
{
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        int max_area = 0;
        int lp = 0, rp = height.length-1;
        while(lp < rp)
        {
            int width = rp-lp;
            int length = Math.min(height[lp],height[rp]);
            int curr_water = width * length;
            max_area = Math.max(max_area, curr_water);
            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
            System.out.println(max_area);
        }
    }
}
