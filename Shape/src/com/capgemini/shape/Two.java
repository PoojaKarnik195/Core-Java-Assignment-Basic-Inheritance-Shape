
package com.capgemini.shape;

/**
 * @author Pooja Karnik Program to instantiate an object and invoke a function
 *
 */
//Object instantiation and function invocation
public class Two {

	// instantiating objects of first and second class and calling their functions

	public static void main(String[] args) {

		First first = new First(10);
		Second second = new Second(20);

		first.disp();
		second.disp1();
	}
}
