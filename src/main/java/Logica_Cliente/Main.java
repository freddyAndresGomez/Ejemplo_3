/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Libro;
import java.util.Scanner;

/**
 *
 * @author YULIETH
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String Titulo = "" ;
        String Autor = "" ;
        String Mes_publicacion = "" ;
        String Dia_publicacion = "";
        int Numero_paginas = 0;
        int Año_publicacion = 0 ;
        int año_actual = 2023 ;
        int vigencia_libro = 0 ;
       
        Libro objlibro = new Libro () ;
        
        Scanner scan = new Scanner(System.in) ;
        
        System.out.println("digite el titulo del libro");
        Titulo= scan.nextLine() ;
        objlibro.setTitulo(Titulo);
        
        System.out.println("digite el nombre del autor ");
        Autor= scan.nextLine() ;
        objlibro.setAutor(Autor);
        
       System.out.println("digite el mes de la publicacion del libro");
       Mes_publicacion = scan.nextLine() ;
       objlibro.setMes_publicacion(Mes_publicacion);
       
        
        System.out.println("digite el dia de la publicacion del libro ");
        Dia_publicacion = scan.nextLine();
        objlibro.setDia_publicacion(Dia_publicacion);
        
        
        
        System.out.println("diguite el año en que se publico");
        Año_publicacion = scan.nextInt();
        objlibro.setAño_publicacion(Año_publicacion);
        
       vigencia_libro = año_actual - objlibro.getAño_publicacion();
       
        System.out.println("digite numero de paginas del libro");
        Numero_paginas = scan.nextInt();
        objlibro.setNumero_paginas(Numero_paginas);
       
        System.out.println("el titulo del libro es :"+"\t"+objlibro.getTitulo());
        System.out.println("el autor del libro es  :"+"\t"+objlibro.getAutor());
        System.out.println("el numero de paginas es :"+"\t"+objlibro.getNumero_paginas());
        System.out.println("la fecha de publicacion es  :"+"\t"+objlibro.getDia_publicacion()+"/"+objlibro.getMes_publicacion()+ "/ "+objlibro.getAño_publicacion());        
        System.out.println("la vigencia del libro es  :"+"\t"+vigencia_libro+"\t años" );      
       
    }
    
}
