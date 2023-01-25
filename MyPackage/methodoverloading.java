package MyPackage;

public class methodoverloading {
	public static void fun(int a) {
		System.out.println(a);
	}
	public static void fun(String name) {
		System.out.println(name);
	}
	public static void main(String[] args) {
		int a = 20;
		String name = "Sandeep";
		fun(a);
		fun(name);
	}
}