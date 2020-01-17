package jp.co.internous.action;

public class Test {

	public static void main(String[]args) {

		Person taro = new Person();
		taro.name ="山田太郎";
		taro.age =20;
		taro.phoneNumber ="090-0000-0000";
		taro.address ="090@gmail.com";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		Person jiro = new Person();
		jiro.name ="木村次郎";
		jiro.age =18;
		jiro.phoneNumber ="080-0000-0000";
		jiro.address ="080@gmail.com";

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		jiro.run();

		Person hanako = new Person();
		hanako.name ="鈴木花子";
		hanako.age =16;
		hanako.phoneNumber ="070-0000-0000";
		hanako.address ="070@gmail.com";

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();

		Robot aibo = new Robot();
		aibo.name ="aibo";
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo = new Robot();
		asimo.name ="asimo";
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper = new Robot();
		pepper.name ="pepper";
		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();
	}
}
