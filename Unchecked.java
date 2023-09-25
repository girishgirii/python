package datatype2;

public class Unchecked {

	public static void main(String[] args)
	{
		//here we are dividing by o which will not be caught at comiple time
		//as there is no mistake but caught at runtime because it is mathematically incorrect
		int x = 0;
		int y =10;
		int z =y/x;
	}

}
