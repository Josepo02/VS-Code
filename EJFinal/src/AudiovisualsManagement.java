import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class AudiovisualsManagement {
    private static final int MAX_AUDIOVISUALES = 100;
    private static Audiovisual[] audiovisuales = new Audiovisual[MAX_AUDIOVISUALES];
    private static int numAudiovisuales = 0;

    public static void FileUpload() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("Netflix.csv"));
            String line = br.readLine();
            while ((line = br.readLine()) != null) {
                String[] datos = line.split(";");
                String titulo = datos[0];
                Genero genero = Genero.valueOf(datos[1]);
                Tipo tipo = Tipo.valueOf(datos[2]);
                int IMDb = Integer.parseInt(datos[3]);

                Audiovisual audiovisual = new Audiovisual(titulo, genero, tipo, IMDb);
                audiovisuales[numAudiovisuales] = audiovisual;
                numAudiovisuales++;
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Error al leer el fichero Netflix.csv");
        }
    }

    public static void SaveByGenre() {
        try {
            for (Genero genero : Genero.values()) {
                PrintWriter pw = new PrintWriter("./genres/" + genero.name() + ".csv");
                for (int i = 0; i < numAudiovisuales; i++) {
                    Audiovisual audiovisual = audiovisuales[i];
                    if (audiovisual.getGenero() == genero) {
                        pw.println(audiovisual.getTitulo() + ";" +
                                audiovisual.getGenero().name() + ";" +
                                audiovisual.getTipo().name() + ";" +
                                audiovisual.getIMDb());
                    }
                }
                pw.close();
            }
        } catch (IOException e) {
            System.err.println("Error al escribir el fichero de generos");
        }
    }

    public static void SaveByType() {
        try {
            for (Tipo tipo : Tipo.values()) {
                PrintWriter pw = new PrintWriter("./types/" + tipo.name() + ".csv");
                for (int i = 0; i < numAudiovisuales; i++) {
                    Audiovisual audiovisual = audiovisuales[i];
                    if (audiovisual.getTipo() == tipo) {
                        pw.println(audiovisual.getTitulo() + ";" +
                                audiovisual.getGenero().name() + ";" +
                                audiovisual.getTipo().name() + ";" +
                                audiovisual.getIMDb());
                    }
                }
                pw.close();
            }
        } catch (IOException e) {
            System.err.println("Error al escribir el fichero de tipos");
        }
    }
}