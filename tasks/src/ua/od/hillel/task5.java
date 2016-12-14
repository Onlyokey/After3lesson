package ua.od.hillel;

public class task5 {

public static void main(String[] args) {
	int FirstGuy = 25;
	int SecondGuy = 7;
	int ThirdGuy = 5;
	rent(FirstGuy);
	rent(SecondGuy);
	rent(ThirdGuy);
	}
public static void rent(int x) {
	int cost =0;
	if(x<=5){
	cost = x *40;
	}
	if(5<x && x<=7){
	cost = x*40-20;
	}
	if(x>7){
	cost = x*40-50;
	}
	System.out.println("you will pay " + cost + "$" + " for " + x + " days");
	}
	} 