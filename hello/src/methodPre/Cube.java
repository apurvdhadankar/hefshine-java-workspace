package methodPre;

public class Cube {
	int height, width, depth;
	
	public Cube(int height, int width, int depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	void calculateVolume()
	{
		int volume = height*width*depth;
		System.out.println(volume);
	}
	
	public static void main(String[] args) {
		Cube obCube = new Cube(10, 10, 10);
		obCube.calculateVolume();
	}
	
}
