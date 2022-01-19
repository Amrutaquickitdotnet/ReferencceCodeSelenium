package javaprograms;

public class Example_020_constructoroverloading 
{
double width, height, depth;
public Example_020_constructoroverloading()
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
	Example_020_constructoroverloading  box = new Example_020_constructoroverloading();
	double vol = box.volume();
	System.out.println(vol);
	
}
}