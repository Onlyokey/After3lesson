package ua.od.hillel;

public class task4 {

public static void main(String[] args) {
int a = 32;
int b = -17;
aroundTEN(a, b);
}
public static void aroundTEN(int x1, int x2) {
int firstnumber = Math.abs(10 - x1);
int secondnumber = Math.abs(10 - x2);
if (firstnumber > secondnumber){
System.out.println(x2 + " closer to ten"); 
}else{
System.out.println(x1 + " closer to ten");
}
}
}