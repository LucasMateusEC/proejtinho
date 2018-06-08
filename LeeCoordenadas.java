package arquivos;
import java.io.*;
import java.nio.charset.StandardCharsets;
class LeeCoordenadas {
 public static void main(String[] args) throws IOException {
    InputStream is = null; 
    InputStreamReader isr = null;
    BufferedReader br = null;
    try{
        is = new FileInputStream("jajava.txt");
        isr = new InputStreamReader(is, StandardCharsets.UTF_8);
        br = new BufferedReader(isr);
    }
    catch (FileNotFoundException e){
        System.out.println("Não foi possivel abrir o arquivo");
    } finally{
    String linha;
    int contador = 0;
 // Percorrer todos as linhas do arquivo. Fim arquivo é retorna null
    try{
        while ((linha = br.readLine()) != null){
            System.out.print(linha); 
            contador++;
        }
    }
    catch(IOException ioe){
        System.out.println("Deu erro");
    }finally{
    try{
        br.close();
        isr.close();
        is.close();
    }
    catch(IOException ioe ){
        System.out.println("Deu erro na finalizacao do arquivo");
    }
    }
        }
 }
 }