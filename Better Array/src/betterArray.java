
public class betterArray {
	int[] ids;
	public betterArray (int[] nums) {
		ids = nums;
	}
	
	public boolean contains(int val) {
		boolean r = false;
		for (int i = 0; i < ids.length; i++) {
			if (ids[i] == val) {
				System.out.println("An instance of this val was found: " + val);
				r = true;
			}
		}
		if (r == false){
			System.out.println("An instance of this val was not found: " + val);
		}
		return r;
	}
	
	public void push(int id) {
		int[] temp = new int[ids.length + 1];
		for (int i = 0; i < ids.length; i++) {
			temp[i] = ids[i];
		}
		temp[temp.length - 1] = id;
		ids = temp;
		System.out.println("This value was added: " + id);
	}
	
	public void pop() {
		int num = ids[ids.length - 1];
		int[] temp = new int[ids.length - 1];
		for (int i = 0; i < ids.length; i++) {
			temp[i] = ids[i];
		}
		
		ids = temp;
		System.out.println("This value was removed: " + num);
	}
	
	public void print() {
		for (int i = 0; i < ids.length; i++) {
			System.out.print(ids[i] + " ");
		}
		System.out.println();
	}
	
	public void sort() {
	    boolean swapped = true;
	    int a = 0;
	    int temp;
	    while (swapped) {
	        swapped = false;
	        a++;
	        for (int i = 0; i < ids.length - a; i++) {
	            if (ids[i] > ids[i + 1]) {
	                temp = ids[i];
	                ids[i] = ids[i + 1];
	                ids[i + 1] = temp;
	                swapped = true;
	            }
	        }
	    }
	}
	
	public void swap(int num1, int num2){
		int a = 0;
		int b = 0;
		boolean aa = false;
		boolean bb = false;
		for (int i = 0; i < ids.length; i++) {
			if (ids[i] == num1) {
				a = i;
				aa = true;
			}
			if (ids[i] == num2) {
				b = i;
				bb = true;
			}

		}
		if (aa && bb) {
			int temp = ids[a];
		    ids[a] = ids[b];
		    ids[b] = temp;
		}
		else {
			System.out.println("Invalid input numbers");
		}
	}	
	
	public void insert(int pos, int num) {
		int[] temp = new int[ids.length + 1];
		temp[pos] = num;
		for (int i = 0; i < pos; i++) {
			temp[i] = ids[i];
		}
		for (int i = pos + 1; i < temp.length; i++) {
			temp[i] = ids[i - 1];
		}
		boolean a = true;
		if (pos < 0 || pos > temp.length) {
			a = false;
			System.out.println("Invalid input numbers");
		}
		if (a == true)
			ids = temp;
	}
	
	public void remove(int num) {
		int a = 0;
		int[] temp = new int[ids.length - 1];
		for (int i = 0; i < ids.length; i++) {
			if (ids[i] == num) {
				a = i;
			}
		}
		for (int i = 0; i < a; i++) {
			temp[i] = ids[i];
		}
		for (int i = a; i < temp.length; i++) {
			temp[i] = ids[i + 1];
		}
	}
	
	
	
}

