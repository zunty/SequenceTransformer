package SeveralItemsConverter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.*;

//WARNING: Alterar valor com a #alterar nos comentários dependendo do tamanho das sequências. Apenas devem ser corridos ficheiros com sequências do mesmo tamanho
public class Items {
	public static void main(String [] args) throws IOException {

		// The name of the file to open.
		String inputFileName = "src/inputSPMF/itemsStores+duration.txt";		//#alterar o nome do ficheiro de entrada
		String outputFileName = "src/outputSPMF/itemsStores+duration.txt";		//#alterar o nome do ficheiro de saída
		
		// This will reference one line at a time
		String line = null;	

		// Always wrap FileReader in BufredReader.
		Reader reader = new InputStreamReader(new FileInputStream(inputFileName), "utf-8");
		BufferedReader br = new BufferedReader(reader);
		
		FileWriter writer = new FileWriter(outputFileName, true);

		
		boolean twoItems = false;
		boolean twoItems2 = false;

		int counter = 0;
		while((line = br.readLine()) != null) {
			//Separar valores de cada linha
			String[] splited = line.split("\\s+");
			counter=0;
			twoItems= false;
			twoItems2 = false;

			//Verifica se algum elemento é composto por dois elementos num dos campos
			for (int i = 0; i < splited.length-3; i++) {

				int store = Integer.parseInt(splited[i]); 
				
				if(store!=-1){
					counter++;;
				}
				else counter = 0;
				
				if(counter>1 && twoItems){twoItems2=true;break;}
				else if(counter>1){twoItems=true;}
				
			}
			
			//Escrever linha se for
			if(twoItems && twoItems2){
			for (int i = 0; i < splited.length-3; i++) {
				writer.write(splited[i] + " ");
				System.out.print(splited[i] + " ");
			}
			//Acaba sequência

			writer.write("\n");
			System.out.println();
			}

		}  
		
		
		// Always close files.
		writer.close();  
		
		// Apaga conteúdo do ficheiro auxiliar.txt
		File file = new File("src/input/auxiliarItems.txt");
		PrintWriter writer1 = new PrintWriter(file);
		writer1.print("");
		writer1.close();
		

	}
}

