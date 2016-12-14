package ua.od.hillel;

public class task1 {

public static void main(String[] args) {
         int[] massiv = new int[3];
         INITmassiv(massiv);
         MaxAndMin(massiv);
}
public static void INITmassiv(int[] something){
		for (int i = 0; i < something.length; i++){
			something[i] = (int)(Math.random() * 100-50);
			System.out.println(something[i]);
}}
public static void MaxAndMin(int[] something){
		int Max = something[0];
		int Min = something[0];
		for (int i=0; i< something.length;i++){
			if (Max < something[i]) 
				Max = something[i];
			}
		for (int i=0; i< something.length;i++){
			if (Min > something[i])
				Min = something[i];
			}
		 System.out.println("Max number = " + Max + " " + "Min number = " + Min);
	}
}