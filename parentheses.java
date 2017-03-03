package stack;

import java.util.*;
import java.util.Scanner;


 class solution {
 
	public static char[][] ARRAYLIST = {{'{','}'},{'[',']'},{'<','>'}};
	
	public static boolean isOpen(char c){
		for(char[] array : ARRAYLIST){
			if (array[0]==c){
				return true;
			}
		}
		return false;
	}
		public static boolean matche(char open,char close){
			for(char[] array : ARRAYLIST){
				if (array[0]==open){
					return array[1]==close;
				}
		}
			return false;
	}
	
	public static boolean parenBalance(String input){
		Stack<Character> stack = new Stack<Character>();
		for(char c : input.toCharArray()){                //string to character
			if(isOpen(c)){
				stack.push(c);
			}else{
				if(stack.isEmpty()|| !matche(stack.peek(),c)){
					return false;
				
				}else {
					stack.pop();
				}
			}
		}
		return stack.isEmpty();
	}
}
public class parentheses{
	public static void main(String[] args) {
		solution s = new solution();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String exp = sc.next();
		System.out.println(solution.parenBalance(exp));

	}

}
