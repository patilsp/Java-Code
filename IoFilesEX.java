package eleven;
import java.io.*;
public class IoFilesEX {

	
	public static void main(String[] args) throws IOException{
	

		File inputFile = new File("input.txt");
		File outputFile = new File("output.txt");
		
		FileInputStream in = new FileInputStream(inputFile);
		FileOutputStream out = new FileOutputStream(outputFile);
		
		int c;
		while((c=in.read()) != -1){
			out.write(c);
		}
		
		in.close();
		out.close();
		
		
	}

}
