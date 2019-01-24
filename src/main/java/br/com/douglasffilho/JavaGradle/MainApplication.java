package br.com.douglasffilho.JavaGradle;

import br.com.douglasffilho.JavaGradle.Controller.PrintController;
import br.com.douglasffilho.JavaGradle.Model.Printer;
import br.com.douglasffilho.JavaGradle.Model.Solution;
import br.com.douglasffilho.JavaGradle.Services.PrintService;
import br.com.douglasffilho.JavaGradle.Services.impl.PrintServiceImpl;

public class MainApplication {

//	This is a demo task.
//
//	Write a function:
//
//	that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//
//	For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//
//	Given A = [1, 2, 3], the function should return 4.
//
//	Given A = [−1, −3], the function should return 1.
//
//	Write an efficient algorithm for the following assumptions:
//
//	 - N is an integer within the range [1..100,000];
//	 - each element of array A is an integer within the range [−1,000,000..1,000,000].
//
	public static void main(String[] args) {
		Solution solution = new Solution();

		int[] A = {1,3,6,4,1,2};

		int minPositive = solution.solution(A);

		System.out.println(minPositive);
	}
}
