 class WHILE {

    public static void main(String[] args) {
        int numero = 345; // Número a descomponer
        int posicion = 0;

        while (numero > 0) {
            int digito = numero % 10; // Obtener el último dígito
            int potenciaDeDiez = (int) Math.pow(10, posicion); // Calcular la potencia de 10 correspondiente
            System.out.println(digito + " * " + potenciaDeDiez);

            numero /= 10; // Eliminar el último dígito
            posicion++; // Incrementar la posición (exponente de la potencia de 10)
        }
    }
}

	
	
	
	
	
	
	
	
	
	
	