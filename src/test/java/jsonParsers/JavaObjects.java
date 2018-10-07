package jsonParsers;

// Source: https://spring.io/understanding/JSON

class Member{
	public String name;
	public int age;
	public boolean member;
}
class Members{

	public int[] indexes = {5, 10, 15, 20};
	public String[] names = {"John", "Elizabeth", "Mary"};
}

public class JavaObjects {

	public static void main(String[] args) {
		Member m1 = new Member();
		m1.name = "John";
		m1.age  = 35;
		m1.member = true;

		System.out.println(m1.name);
		System.out.println(m1.age);
		System.out.println(m1.member);

		Members ms = new Members();

		System.out.println(ms.indexes[0] + "	" + ms.names[0]);
		System.out.println(ms.indexes[1] + "	" + ms.names[1]);
		System.out.println(ms.indexes[2] + "	" + ms.names[2]);

	}

}
