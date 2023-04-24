
package pooej1;

/**
 * 
 * @author Hilda MarHer <hherlindo@gmail.com>
 * @GitHub https://github.com/HildaMarHer
 *
 */

public class Libro {
    public int ISBN; 
    public String Titulo; 
    public String Autor; 
    public int NroPagina; 

    //constructor vacio 
    public Libro() {
    }
    
    //constructor lleno 

    public Libro(int ISBN, String Titulo, String Autor, int NroPagina) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NroPagina = NroPagina;
    }

    //Generando los get y set

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNroPagina() {
        return NroPagina;
    }

    public void setNroPagina(int NroPagina) {
        this.NroPagina = NroPagina;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", NroPagina=" + NroPagina + '}';
    }

    void setNroPaginas(int nextInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
