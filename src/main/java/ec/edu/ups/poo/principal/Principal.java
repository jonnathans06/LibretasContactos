package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Registro de personas
        System.out.println("Ingrese cuántas personas desea registrar: ");
        int nPersonas = sc.nextInt();
        sc.nextLine(); // Consumir salto de línea

        Persona[] personas = new Persona[nPersonas];

        for (int i = 0; i < nPersonas; i++) {
            Persona persona = new Persona();

            System.out.println("\n--- Ingrese los datos de la persona " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            persona.setNombre(sc.nextLine());

            System.out.print("Apellido: ");
            persona.setApellido(sc.nextLine());

            System.out.print("Cédula: ");
            persona.setCedula(sc.nextLine());

            System.out.print("Dirección: ");
            persona.setDireccion(sc.nextLine());

            personas[i] = persona;
        }

        // Registro de familiares
        System.out.println("\n¿Cuántos familiares desea registrar?");
        int nFamiliares = sc.nextInt();
        sc.nextLine(); // Consumir salto de línea

        Familiar[] familiares = new Familiar[nFamiliares];

        for (int i = 0; i < nFamiliares; i++) {
            Familiar familiar = new Familiar();

            System.out.println("\n--- Ingrese los datos del familiar " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            familiar.setNombre(sc.nextLine());

            System.out.print("Apellido: ");
            familiar.setApellido(sc.nextLine());

            System.out.print("Cédula: ");
            familiar.setCedula(sc.nextLine());

            System.out.print("Dirección: ");
            familiar.setDireccion(sc.nextLine());

            System.out.print("Parentesco: ");
            familiar.setParentesco(sc.nextLine());

            System.out.print("Tipo de sangre: ");
            familiar.setTipoDeSangre(sc.nextLine());

            System.out.print("Año de nacimiento: ");
            int anioNacimiento = sc.nextInt();
            sc.nextLine();

            System.out.print("Mes de nacimiento (1-12): ");
            int mesNacimiento = sc.nextInt() - 1;
            sc.nextLine();

            System.out.print("Día de nacimiento: ");
            int diaNacimiento = sc.nextInt();
            sc.nextLine();

            GregorianCalendar fechaNacimiento = new GregorianCalendar(anioNacimiento, mesNacimiento - 1, diaNacimiento);
            familiar.setFechaNacimiento(fechaNacimiento);

            familiares[i] = familiar;
        }

        // Mostrar información de personas
        System.out.println("\n--- Lista de Personas ---");
        for (Persona persona : personas) {
            System.out.println(persona);
            System.out.println();
        }

        // Mostrar información de familiares
        System.out.println("\n--- Lista de Familiares ---");
        for (Familiar familiar : familiares) {
            System.out.println(familiar);
            System.out.println();
        }
    }
}
