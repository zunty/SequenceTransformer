package noRefineSequence;
import java.io.*;

public class Test {
	private static BufferedWriter bw;

	public static void main(String [] args) throws IOException {

		// The name of the file to open.
		String fileName = "src/input/inputCompleta.txt";

		// This will reference one line at a time
		String line = null;

		// FileReader reads text files in the default encoding.
		FileReader fileReader = 
				new FileReader(fileName);

		// Always wrap FileReader in BufredReader.
		Reader reader = new InputStreamReader(new FileInputStream(fileName), "utf-8");
		BufferedReader br = new BufferedReader(reader);
		String id= " ";
		System.out.println("ola5");
		FileWriter writer = new FileWriter("src/output/output2.txt", true);
		while((line = br.readLine()) != null) {
			//Separar dois valores de cada linha
			System.out.println(line);

			String[] splited = line.split("\\s+");
			System.out.println(splited[0] + " - " + splited[1]);
			if(id.equals(splited[0])){
				writer.write(splited[1] + " -1 ");
			}
			else{
				id = splited[0];
				writer.write("-2\n");
				writer.write(splited[1] + " -1 ");

			}

		}  

		// Always close files.
		writer.close();         

	}
}
