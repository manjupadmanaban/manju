package assighnment;

public class assign3 {

	public static void main(String[] args) {
		int n=13;
		for(int i=0;i<=n;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if(i==0||j==0||i==n||i+j<=(n-1)/2||i-j>=(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
				
			}
			System.out.println();
		}

	}

}
