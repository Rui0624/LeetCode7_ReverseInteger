
public class Solution {
	public int reverse(int x) {
        int sign = (x > 0 ? 1 : -1);
        int num = Math.abs(x);
        String numString = Integer.toString(num);
        int n = numString.length();
        int[] nums = new int[n];
        int i = 0;
        
        while(num > 0){
        	nums[i] = num % 10;
        	num /= 10;
        	i++;
        }
        
        int m = nums.length;
        long res = 0;
        
        for(int j = 0; j < m; j++){
        	res += (nums[j] * Math.pow(10, m - 1 - j));
        }
        if (res > Integer.MAX_VALUE)
        	return 0;
        else
        	return sign > 0 ? (int)res : (int)-res;
    }
}
