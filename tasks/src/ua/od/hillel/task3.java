package ua.od.hillel;

public class task3 {

public static void main(String[] args) {
        int a = 12;
        int b = 3;
        int c = 7;
ostatok(a,b);
ostatok(b,c);
ostatok(c,b);
}
public static void ostatok(int x1,int x2){
		if (x1 % x2 == 0){
			System.out.println("true");
               } else {
                        System.out.println("false"); 
}
}
}