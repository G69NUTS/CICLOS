import java.util.Scanner;
	class CICLOS {
//souf = System.out.printl("Algo")
	public static  void main (String[] args) {
	Scanner leer = new Scanner(System.in);
	System.out.println("Dijite porfavor un numero");
	int Pri_num	= leer.nextInt();
	System.out.println("Dijite porfavor un segundo numero");
	int Sec_num = leer.nextInt();
	
	  int resultado = 0;
        
        for (int i = 0; i < Sec_num; i++) {
            resultado += Pri_num;
        }
        System.out.println("El resultado de " + Pri_num + " multiplicado por " + Sec_num+ " es: " + resultado);
    }
}
	
	
		
	
