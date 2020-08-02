package alpha;

public class max {
	public static void main(String args[]) {
		int[] a= {5,10,3,1,12,15};
		int grt=a[0];
		for(int i=1;i<a.length;i++)
		{
		if(a[i]>grt)
		grt=a[i];
		}
		System.out.println("maximum element in array"+grt);
		}
}
