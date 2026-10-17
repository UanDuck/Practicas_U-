package com.orlando.poo1;
public class Alumno {
   private String nombre;
    private int claificacion;

   /* 
    Alumno [] alus=new Alumno[]{
      new Alumno("Pedor", 7),
      new Alumno("Juan", 5),
      new Alumno("Tania", 8),
      new Alumno("Hazel", 6),
      new Alumno("Roberto", 6),
      new Alumno("Gomez", 9),
      new Alumno("Bolañoz", 4),
      new Alumno("Crash", 6),
      new Alumno("Blancanieves", 10),
      new Alumno("Jijija", 8),
    };
    */
    public Alumno(String nombre, int claificacion) {
        this.nombre = nombre;
        this.claificacion = claificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClaificacion() {
        return claificacion;
    }

    public void setClaificacion(int claificacion) {
        this.claificacion = claificacion;
    }

   /* @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", claificacion=" + claificacion + '}';
    }   */
}
