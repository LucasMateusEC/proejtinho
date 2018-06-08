package arquivos;
import java.io.*;
import java.util.Scanner;

class EscreveCoordenadas {
	public static void main(String[] args) throws IOException {
		OutputStream os = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		Scanner ler = new Scanner(System.in);
		String coordenadas = "";
		try {
			os = new FileOutputStream("saida.txt");
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
		}
		catch(FileNotFoundException e) {
			System.out.println("Nao deu pra abrir o arquivo ");
		}finally {
		coordenadas = ler.nextLine();
		bw.write(coordenadas);
		bw.newLine(); // Insere uma quebra de linha no arquivo!
		System.out.println("Erro na escrita!");
		bw.close(); // Lembrar de fechar o arquivo - leitura e escrita!
		osw.close();
		os.close();
		}
		 }
	}