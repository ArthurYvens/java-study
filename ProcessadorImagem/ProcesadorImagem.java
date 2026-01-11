import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Classe responsável pelas operações de Input/Output de imagem.
 */
class RepositorioImagem {
    public static int[][] carregarParaMatrizGrayscale(String path) throws IOException {
        BufferedImage image = ImageIO.read(new File(path));
        int largura = image.getWidth();
        int altura = image.getHeight();
        int[][] matrix = new int[altura][largura];

        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {
                int p = image.getRGB(x, y);
                int r = (p >> 16) & 0xff;
                int g = (p >> 8) & 0xff;
                int b = p & 0xff;
                matrix[y][x] = (r + g + b) / 3;
            }
        }
        return matrix;
    }

    public static void salvarMatrizComoJpg(int[][] matriz, String outputPath) throws IOException {
        int altura = matriz.length;
        int largura = matriz[0].length;
        BufferedImage image = new BufferedImage(largura, altura, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {
                int cinza = matriz[y][x];
                // Reconstrói o pixel RGB com o mesmo valor para os 3 canais
                int rgb = (cinza << 16) | (cinza << 8) | cinza;
                image.setRGB(x, y, rgb);
            }
        }
        ImageIO.write(image, "jpg", new File(outputPath));
    }
}

/**
 * Classe de serviço para processamento de filtros.
 */
class ProcessadorDeServicoImagem {
    public static int[][] aplicarFiltroNegativo(int[][] source) {
        int altura = source.length;
        int largura = source[0].length;
        int[][] result = new int[altura][largura];

        for (int y = 0; y < altura; y++) {
            for (int x = 0; x < largura; x++) {
                result[y][x] = 255 - source[y][x];
            }
        }
        return result;
    }
}

/**
 * Ponto de entrada do programa.
 */
public class ProcesadorImagem {
    public static void main(String[] args) {
        String inputPath = "1278260.jpg"; // Substitua pelo seu arquivo
        String outputPath = "resultado_negativo.jpg";

        try {
            int[][] imageMatrix = RepositorioImagem.carregarParaMatrizGrayscale(inputPath);
            int[][] negativeMatrix = ProcessadorDeServicoImagem.aplicarFiltroNegativo(imageMatrix);
            RepositorioImagem.salvarMatrizComoJpg(negativeMatrix, outputPath);

            System.out.println("Processamento concluído com sucesso!");
        } catch (IOException e) {
            System.err.println("Erro ao processar imagem: " + e.getMessage());
        }
    }
}