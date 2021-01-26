package paquete;

/*Se desea realizar un programa para saber qué prioridad darle a cada materia en cuanto a clases de apoyo de acuerdo a la necesidad de los alumnos.
Al comenzar el programa, se pedirá la cantidad de alumnos que desea cargar. Luego, por cada alumno, se pedirá curso (a/b/c/d. Validar), y materia en la cual necesita 
clase de apoyo (taller/fundamentos/matemática).
Una vez realizado el ingreso de datos, se deberá mostrar por pantalla cuál fue la materia más requerida
*/

import java.util.Scanner;

public class Ejercicio13 {

	static Scanner ingreso =new Scanner(System.in);
	final static String CURSO_A = "a";
	final static String CURSO_B = "b";
	final static String CURSO_C = "c";
	final static String CURSO_D = "d";
	final static String TALLER ="thp";
	final static String FUNDAMENTOS ="fdp";
	final static String MATEMATICA ="mat";
	public static void main(String[] args) {
		
		int alumnos,contador=0;
		String curso, materia, masApoyo="";
		int th=0, fp=0, mt=0, mayor=0;
		
		alumnos=ingresarNum("Ingrese la cantidad de alumnos que desee cargar:");
		for (contador=1; contador<=alumnos; contador++) {
			curso=ingresarCurso("Ingresar el curso de cada estudiante: [a,b,c,d]");
			materia=ingresarMateria("Ingresar la materia en la que se necesite apoyo: [thp,mat,fdp]");
			if (materia.equals(TALLER)) {
				th++;
			}
				if (materia.equals(MATEMATICA)) {
				mt++;
			}
					if (materia.equals(FUNDAMENTOS)) {
				fp++;
			} 
					mayor=obtenerMayor(th,fp,mt);
					if (mayor==th) {
						masApoyo=materia;
					}	if(mayor==fp) {
						masApoyo=materia;
					}		if(mayor==mt) {
						masApoyo=materia;
					}
	}
		System.out.println("La materia mas solicitada es: " + masApoyo);
	}
	
	private static int obtenerMayor(int th, int fp, int mt) {
		int mayor;
		if (th > fp) {
            if (th > mt) {
                mayor=th;
                
            } else {
                mayor=mt;     
            }
        } else if (fp > mt) {
            mayor=fp;
        } else {
            mayor=mt;
        }
		
		return mayor;
	}




	private static String ingresarMateria(String mensaje) {
		String materia;
		System.out.println(mensaje);
		materia=ingreso.nextLine();
		while ((!materia.equals(FUNDAMENTOS)) && (!materia.equals(MATEMATICA)) && (!materia.equals(TALLER))) {
			System.out.println("ERROR");
			System.out.println(mensaje);
			materia=ingreso.nextLine();
		}
		return materia;
	}

	private static String ingresarCurso(String mensaje) {
		String curso;
		System.out.println(mensaje);
		curso=ingreso.nextLine();
		 while ((!curso.equals(CURSO_A)) && (!curso.equals(CURSO_B)) && (!curso.equals(CURSO_C)) && (!curso.equals(CURSO_D)) ) {
			 System.out.println("ERROR");
			 System.out.println(mensaje);
			 curso=ingreso.nextLine();
		 }
		 return curso;
		}	
	

	private static int ingresarNum(String mensaje) {
		int num;
		System.out.println(mensaje);
		num=ingreso.nextInt();
		ingreso.nextLine();
		return num;
	}

}
