package org.example.javaIntermedioEjercicio3;
//8.	Escribe una clase en Java llamada "Empleado" que tenga atributos para el nombre, el salario
// y el número de identificación. Implementa métodos para aumentar el salario y mostrar la información
// del empleado.
public class Empleado {
    private String nombre;
    private int salario;
    private int id;

    public Empleado(String nombre, int salario, int id) {
        this.nombre = nombre;
        this.salario = salario;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", id=" + id +
                '}';
    }

    public void aumentarSalario(int aumentoSalario){
        salario+=aumentoSalario;
    }
    public void mostrarDatos(){
        System.out.println("el nombre del empleados es: " + this.nombre);
        System.out.println("el sueldo del empleados es: " + this.salario);
        System.out.println("el id del empleados es: " + this.id);

    }
}
