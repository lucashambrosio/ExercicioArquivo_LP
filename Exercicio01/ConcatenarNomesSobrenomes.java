package Exercicio01;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ConcatenarNomesSobrenomes {
    public static void main(String[] args) {
        try {

            BufferedReader Nomes = new BufferedReader(new FileReader("C:/Users/12118284/Documents/ArquivoNomes.txt"));
            String linhaNome;
            String[] nomes = new String[10];
            int i = 0;
            while ((linhaNome = Nomes.readLine()) != null) {
                nomes[i] = linhaNome;
                System.out.println(nomes[i]);
                i++;
            }
            Nomes.close();


            BufferedReader Sobrenomes = new BufferedReader(new FileReader("C:/Users/12118284/Documents/SobreNomes.txt"));
            String linhaSobrenome;
            String[] sobrenomes = new String[10];
            i = 0;
            while ((linhaSobrenome = Sobrenomes.readLine()) != null) {
                sobrenomes[i] = linhaSobrenome;
                System.out.println(sobrenomes[i]);
                i++;
            }
            Sobrenomes.close();


            FileWriter fw = new FileWriter("C:/Users/12118284/Documents/ArquivoNomesSobrenomes.txt");
            for (int j = 0; j < 10; j++) {
                fw.write(nomes[j] + " " + sobrenomes[j] + "\n");
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Erro ao ler ou gravar o arquivo.");
        }
    }
}
