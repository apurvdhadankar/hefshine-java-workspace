package strings;

import java.util.Scanner;

public class BobCrushVowel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] sa = new String[n];
		for (int i = 0; i < sa.length; i++) 
		{
			sa[i] = sc.next();
		}
		for (int i = 0; i < sa.length; i++) 
		{
			char[] c = sa[i].toCharArray();
			boolean flag = false;
			for (int j = 0; j < c.length; j++) 
			{
				if(c[j]=='a' || c[j]=='A')
				{
					for (int k = 0; k < c.length; k++) 
					{
						if(c[k]=='e' || c[k]=='E')
						{
							for (int p = 0; p < c.length; p++) 
							{
								if(c[p]=='i' || c[p]=='I')
								{
									for (int l = 0; l < c.length; l++) 
									{
										if(c[l]=='o' || c[l]=='O')
										{
											for (int z = 0; z < c.length; z++) 
											{
												if(c[z]=='u' || c[z]=='U')
												{
													flag=true;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		if(flag)
		{
			System.out.println("lovely");
		}
		else
		{
			System.out.println("Ugly");
		}
		}
		
	}

}
