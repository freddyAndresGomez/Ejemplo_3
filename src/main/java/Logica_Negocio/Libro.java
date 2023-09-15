/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author YULIETH
 */
public class Libro {
    public String Titulo ;
    public String Autor ;
    public String Mes_publicacion ;
    public String Dia_publicacion ;
    public String Tematica ;
    public int Numero_paginas ;
    public  int Año_publicacion ;
    
    public Libro (){  
        
    }

    public Libro(String Titulo, String Autor, String Mes_publicacion, String Dia_publicacion, String Tematica ,int Numero_paginas, int Año_publicacion) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Mes_publicacion = Mes_publicacion;
        this.Dia_publicacion = Dia_publicacion;
        this.Numero_paginas = Numero_paginas;
        this.Año_publicacion = Año_publicacion;
        this.Tematica= Tematica ;
    }

    public void setTematica(String Tematica) {
        this.Tematica = Tematica;
    }

    
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setMes_publicacion(String Mes_publicacion) {
        this.Mes_publicacion = Mes_publicacion;
    }

    public void setDia_publicacion(String Dia_publicacion) {
        this.Dia_publicacion = Dia_publicacion;
    }

    public void setNumero_paginas(int Numero_paginas) {
        this.Numero_paginas = Numero_paginas;
    }

    public void setAño_publicacion(int Año_publicacion) {
        this.Año_publicacion = Año_publicacion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public String getMes_publicacion() {
        return Mes_publicacion;
    }

    public String getDia_publicacion() {
        return Dia_publicacion;
    }

    public int getNumero_paginas() {
        return Numero_paginas;
    }

    public int getAño_publicacion() {
        return Año_publicacion;
    }

    public String getTematica() {
        return Tematica;
    }
    
}
