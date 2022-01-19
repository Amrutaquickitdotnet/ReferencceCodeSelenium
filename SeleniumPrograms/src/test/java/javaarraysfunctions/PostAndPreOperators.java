package javaarraysfunctions;
public class PostAndPreOperators {
// 10 weeks
	public static void main(String[] args) {
		int i=100;
		//i=i+1;
		i++;// post increment - first uses i and then increments
		System.out.println(i);
		System.out.println(i++);
		System.out.println(i);
		
		int j=500 + i++;
		System.out.println(j);
		System.out.println(i);
		
		j=100;
		System.out.println(++j);
		j--;
		--j;
		

	}

}
