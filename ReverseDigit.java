//Reversing digits using loop

import java.util.Scanner;

class ReverseDigit {
	void rev(int n){

		int i;

		for(i=n;i>0;i++) {
			rem = n % 10;
			n = n / 10;
			rev = (rev * 10) + rem;
		}
	}
}
