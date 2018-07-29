import java.util.*;
public static void main(String[] args) {
	String s1= "12";
	String s2 = "c";
	if(convertFromBase(s1,10)==convertFromBase(s2,16))
		System.out.println("Equal");
	else
		System.out.println("No equal");
}