package javaprograms;

public class Example_021_superkeyword 
{
double width, height, depth;
public Example_021_superkeyword()
{
    height = 2;
	depth = 2;
	/*
	 * this.width = 2; this.height = 2; this.depth = 2;
	 */

}

public double volume() {
	return width* height* depth;
}
public static void main(String[] args) {
	Example_021_superkeyword  box = new Example_021_superkeyword();
	double vol = box.volume();
	System.out.println(vol);
	
}
}