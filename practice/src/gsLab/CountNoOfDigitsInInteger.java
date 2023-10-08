package gsLab;

public class CountNoOfDigitsInInteger {

	public static void main(String[] args) {
		int n =123456789;
		int temp =n;
		int cnt=0;
		while(temp>0)
		{
			temp = temp/10;
			System.out.println(temp);
			cnt++;
		}
		System.out.println(cnt);

	}

}
