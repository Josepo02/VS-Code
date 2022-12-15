public class Audiovisual {
    private String titulo;
    private Genero genero;
    private Tipo tipo;
    private int IMDb;

    public Audiovisual(String titulo, Genero genero, Tipo tipo, int IMDb) {
        this.titulo = titulo;
        this.genero = genero;
        this.tipo = tipo;
        this.IMDb = IMDb;
    }

    public String getTitulo() {
        return titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getIMDb() {
        return IMDb;
    }
}