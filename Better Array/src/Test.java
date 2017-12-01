
public class Test {

	public static void main(String[] args) {
		int[] nums = {3, 1, 5, 4, 2};
		betterArray packer = new betterArray(nums);
		packer.print();
		packer.remove(5);
		packer.print();
		
		
	}

}