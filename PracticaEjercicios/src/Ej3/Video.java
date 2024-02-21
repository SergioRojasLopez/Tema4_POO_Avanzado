package Ej3;

public class Video implements IMaterialBibiliografico{

    private int duracionVideo;

    public int getDuracionVideo() {
        return duracionVideo;
    }

    public void setDuracionVideo(int duracionVideo) {
        this.duracionVideo = duracionVideo;
    }

    public Video(int duracionVideo) {
        this.duracionVideo = duracionVideo;

    }

    @Override
    public void prestar() {

    }

    @Override
    public void devolver() {

    }

    @Override
    public void obtenerInformacion() {

    }
}
