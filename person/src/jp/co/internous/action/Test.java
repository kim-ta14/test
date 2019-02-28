package jp.co.internous.action;

public class Test {

	public static void main(String[]args){
Person taro = new Person();

taro.name = "山田太郎" ;
taro.age=20;

System.out.println(taro.name);
System.out.println(taro.age);
taro.talk();
taro.walk();
taro.run();



Person jiro = new Person();

jiro.name = "木村次郎" ;
jiro.age=18;

System.out.println(jiro.name);
System.out.println(jiro.age);

Person hanako = new Person();

hanako.name = "鈴木花子" ;
hanako.age=16;

System.out.println(hanako.name);
System.out.println(hanako.age);


Person takuya = new Person();

takuya.name = "木村拓也" ;
takuya.age=29;
takuya.phoneNumber="09077371422";
takuya.address="takuyacronald7@gmail.com";

System.out.println(takuya.name);
System.out.println(takuya.age);
System.out.println(takuya.phoneNumber);
System.out.println(takuya.address);



Robot aibo = new Robot();

aibo.name="aibo";
aibo.talk();
aibo.walk();
aibo.run();



Robot asimo =new Robot();

asimo.name ="asimo";
asimo.talk();
asimo.walk();
asimo.run();



Robot pepper =new Robot();

pepper.name ="pepper";
pepper.talk();
pepper.walk();
pepper.run();
}
}
