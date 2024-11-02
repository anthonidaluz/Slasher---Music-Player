package Classes;
public class Playlist extends Musica {
    
    private String Nome;
    private String Artista;
    private String Genero;

    public Playlist() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return "Playlist{" + "Nome=" + Nome + ", Artista=" + Artista + ", Genero=" + Genero + '}';
    }
    
    
    
    
    
}
