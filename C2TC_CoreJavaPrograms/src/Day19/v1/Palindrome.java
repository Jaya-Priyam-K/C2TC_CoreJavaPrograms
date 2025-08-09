package Day19.v1;

//Program to define generic functional interface Palindrome

public interface Palindrome<T> {
	boolean checkPalindrome(T data);
}
