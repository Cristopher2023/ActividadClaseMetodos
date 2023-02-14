package org.Cristopher.metodos;

public class PruebaMetodos {

    public static void Nombre(String nombre, String apellido, String matricula) {

        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Matricula :" + matricula);

    }

    public static void Materia(String Mate, int Horas) {

        System.out.println("Materia:" + Mate);
        System.out.println("Horas:" + Horas + ":00 hrs");

    }

    public static void IngresaNombre() {
        Nombre("Cristopher", "Roman", "22TE0411M");
    }

    public static void IngresaMateria() {
        Materia("Programacion Orientada a Objetos", 2);
    }

}
