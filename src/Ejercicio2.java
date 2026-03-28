import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) throws Exception {
Scanner sc = new Scanner(System.in);
double promNotas = new double
double sumNotas = new double
int numEstudiantes = new Scanner(System.in);
System.out.println("ingrese cuantos estudiantes desea calcular ");
numEstudiantes = sc.nextInt() ;
double Notas[] = new double [numEstudiantes];
for(int i = 0 ; i < numEstudiantes; i++){
    System.out.print("Ingrese su nota");
    Notas [i] = sc.nextDouble()
    
    System.out.println();
}
if (Notas[i]<=3.0) {
    System.out.println("Notas bajas " = Notas [i]);
else ("notas altas " Notas[i]);
    
}
sumNotas = sumNotas + Notas[i]
promNotas = sumNotas/Notas.length
System.out.println("el promedio del grupo es "promNotas );

}

}
