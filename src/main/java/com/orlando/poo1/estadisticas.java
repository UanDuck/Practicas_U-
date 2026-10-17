package com.orlando.poo1;

public class estadisticas{
    Alumno[] alum;
    public estadisticas(Alumno[] alum){
        this.alum=alum;
    }
    
    public int promedio(){
        
        int suma = 0;
        for(Alumno alum : alum){
            suma += alum.getClaificacion();
        }
        return suma/alum.length;
    }

    public float aprobados() {
        int aprobados=0;
    for(Alumno alum : alum){
        if(alum.getClaificacion() >= 6){
            aprobados++;
        }//if
    }//for
    return (aprobados*100)/alum.length;
    }


    float reprobados() {
        int reprobados=0;
        for(Alumno alum : alum){
            if(alum.getClaificacion() <6){
            reprobados++;
            }//if
        }//for
    return (reprobados*100)/alum.length;
    }
}
