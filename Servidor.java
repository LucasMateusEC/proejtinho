package socket;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;
public class Servidor {
	public static void main (String[] args) throws IOException {
		int cnt;
		ServerSocket servidor = new ServerSocket(5001);
		System.out.println("Porta 5001 aberta!");
		
		
		Socket cliente = servidor.accept();
		System.out.print("Nova conexao com o cliente " + cliente.getInetAddress().getHostAddress()+"\n");
		
		Scanner s = new Scanner(cliente.getInputStream());
		while (s.hasNextLine()) {
			cnt=2;
			while( cnt <= 2 ) {
			String longitude = s.nextLine();
			String latitude = s.nextLine();
			cnt-=2;
			System.out.println(longitude);
			System.out.println(latitude+ "\n" +"\n");
	
			
			}
		}
			
		
		s.close();
		servidor.close();
		cliente.close();
	}
}
