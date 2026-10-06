public class Libro {

    private int isbn;
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible;

    public Libro(int isbn, String titulo, String autor, int anioPublicacion, boolean disponible){
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        switch (isbn) {
            case 0:
                System.out.println("ISBN no puede ser 0");
                break;
            default:
                if (isbn < 0) {
                    System.out.println("ISBN no puede ser negativo");
                }
                break;
        }
        this.isbn = isbn;
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

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String prestar(String titulo){
        if(this.titulo.equals(titulo)){
            if(disponible){
                disponible = false;
                return "Libro prestado exitosamente";
            } else {
                return "El libro no está disponible para prestar";
            }
        } else {
            return "El libro no coincide con el título proporcionado";
        }
    }

    public String devolver(String titulo){
        if(this.titulo.equals(titulo)){
            if(!disponible){
                disponible = true;
                return "Libro devuelto exitosamente";
            } else {
                return "El libro no estaba prestado";
            }
        } else {
            return "El libro no coincide con el título proporcionado";
        }
    }

    public void estasDisponible(String titulo, int isbn) {
        if(this.titulo.equals(titulo) && this.isbn == isbn){
            System.out.println(disponible ? "El libro está disponible" : "El libro no está disponible");
        } else {
            System.out.println("El libro no coincide con el título o ISBN proporcionado");
        }
    }

    @Override
    public String toString() {
            return "Libro[ isbn :" + isbn +", titulo:'" + titulo + "', autor:'" + autor + "', anioPublicacion:" + anioPublicacion +", disponible:" + disponible  +"]";
    }

}
