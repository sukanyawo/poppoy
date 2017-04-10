package rmuti.epoy.noopoy;

public class NumberUtil {
	public int SumArray(int[]arr){
		int sum = 0;
		int i;
		for(i=0;i<arr.length;i++){
			sum = sum + arr[i];
		}
		return sum;
	}

}
