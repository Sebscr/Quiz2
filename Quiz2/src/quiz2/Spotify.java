/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz2;
// Se crean los atributos
public class Spotify {
    public int id;
    public double duracion;
// Duracion en segundos
    public double añocreacion;
    public String titulo ;
    public String autor ;
    
   
  
   // Se crea el constructor usando los atributos previamente creados
    public Spotify(int id,double duracion,double añocreacion,String titulo, String autor) {
        this.id= id;
        this.duracion= duracion;
        this.añocreacion= añocreacion;
        this.titulo=titulo;
        this.autor=autor;
    
    }
// Se crean los get y los set para cada atributo
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public double getAñocreacion() {
        return añocreacion;
    }

    public void setAñocreacion(double añocreacion) {
        this.añocreacion = añocreacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    // Se crea la parte principal del codigo
    public static void main (String[] args){
        // Se crea una instancia de Spotify
        Spotify cancion= new Spotify(123456789,330,2004,"Lying from you","Linkin Park");
        
        // Se usan los getters para obtener los datos de la cancion
        System.out.println("El ID de la cancion es: "+cancion.getId());
        System.out.println("El titulo de la cancion es: "+cancion.getTitulo());
        System.out.println("El autor de la cancion es: "+cancion.getAutor());
        System.out.println("La duracion de la cancion es: "+cancion.getDuracion());
        System.out.println("El año de creacion de la cancion es: "+cancion.getAñocreacion());
    }
    }

