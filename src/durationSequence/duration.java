package durationSequence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class duration {
	private static BufferedWriter bw;

	public static void main(String [] args) throws IOException {

		// The name of the file to open.
		String fileName = "src/Input/duracao.txt";

		// This will reference one line at a time
		String line = null;

		// FileReader reads text files in the default encoding.
		FileReader fileReader = 
				new FileReader(fileName);

		// Always wrap FileReader in BufredReader.
		Reader reader = new InputStreamReader(new FileInputStream(fileName), "utf-8");
		BufferedReader br = new BufferedReader(reader);
		String id= " ";
		Integer size = 0;
		ArrayList<String> saveString = new ArrayList<String>();
		FileWriter writer = new FileWriter("src/output/outputDuracao.txt", true);
		while((line = br.readLine()) != null) {
			//Separar três valores de cada linha

			String[] splited = line.split("\\s+");

			if(id.equals(splited[0])){
				//Guarda para depois
				saveString.add(splited[1]);
				saveString.add(splited[2]);

				//Aumenta o tamanho da sequência
				size++;

			}

			//Tem que escrever a linha inteira - Alterar o valor que compara com size para ser de comprimentos diferentes
			else {if(!id.equals(splited[0]) && size > 1){

				//Escreve todas as lojas
				for (int i = 0; i < (saveString.size())/2; i=i+2) {
					writer.write(saveString.get(i) + " " + addDuration(saveString.get(i+1)) + " -1 ");
					System.out.println(saveString.get(i) + " " + addDuration(saveString.get(i+1)) + " -1 ");
				}

				//Acaba sequência
				writer.write("-2\n");

				//Limpa o arraylist
				saveString.clear();

				//Reinicia a próxima sequência
				id = splited[0];
				saveString.add(splited[1]);
				size = 0;
				 
			}
			else{
				//Limpa o arraylist
				saveString.clear();

				//Reinicia a próxima sequência
				id = splited[0];
				saveString.add(splited[1]);
				saveString.add(splited[2]);
				size = 0;

			}
			}
		}  

		// Always close files.
		writer.close();         

	}

	private static String addDuration(String duration) {
		int dur = Integer.parseInt(duration);
		
		String resultado;
		if(dur <=15)resultado="short";
		else if(dur <= 30) resultado="medium";
		else resultado="big";
		
		return resultado;
	}
}
