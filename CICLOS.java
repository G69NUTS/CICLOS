import java.util.Scanner;
	class CICLOS {
//souf = System.out.printl("Algo")
	public static  void main (String[] args) {
	Scanner leer = new Scanner(System.in);
	System.out.println("Dijite porfavor un numero");
	int Pri_num	= leer.nextInt();
	System.out.println("Dijite porfavor un segundo numero");
	int Sec_num = leer.nextInt();
	
	  int Total = 0;
        
        for (int i = 0; i < Sec_num; i++) {
            Total += Pri_num;
        }
        System.out.println("El resultado de " + Pri_num + " multiplicado por " + Sec_num+ " es: " + Total);
    	
	System.out.println("A continuacion vamos a hacer la elevacion de 2 numeros que usted nos ingrese");
	System.out.println("Dijite la base");
	int base = leer.nextInt();
	System.out.println("Dijite el exponente");
	int exponente = leer.nextInt();
	int resultado = base;
	
        for (int i = 1;i < exponente; i++) {
            resultado = resultado*base;
        }
	System.out.println("El resultado de " + base + " elevado a la " + exponente + " es: " + resultado);
	
	
	
	}
}			
import java.util.Scanner;

class WHILE{
	public static void main(String[] arg){
	
	Scanner leer = new Scanner(System.in);
	System.out.println("Dijite un numero entero");
	int num = leer.nextInt();
	int div = 10;
	int res;
	int sol;
	int i = 10;
	int rex;
	if(num<0){
		System.out.println("Un numero entero es positivo ANIMAL xoxo");
	}
	if(num>=10){
		while(num>0){
		sol = num /= div;
		res = num %= div;
		rex = i *= div;
		System.out.println(res);
	}
}
	