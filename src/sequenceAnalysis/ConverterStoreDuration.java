package sequenceAnalysis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.*;

import javax.sound.sampled.Line;

//WARNING: Alterar valor com a #alterar nos comentários dependendo do tamanho das sequências. Apenas devem ser corridos ficheiros com sequências do mesmo tamanho
public class ConverterStoreDuration {
	public static void main(String [] args) throws IOException {

		// The name of the file to open.
		String inputFileName = "src/outputStoreDuration/itemsStores+duration";		//#alterar o nome do ficheiro de entrada
		String outputFileName = inputFileName + "Analysis.txt";		//#alterar o nome do ficheiro de saída se desejar
		inputFileName = inputFileName + ".txt";
		
		// This will reference one line at a time
		String line = null;	

		// Always wrap FileReader in BufredReader.
		Reader reader = new InputStreamReader(new FileInputStream(inputFileName), "utf-8");
		BufferedReader br = new BufferedReader(reader);
		
		FileWriter writer = new FileWriter(outputFileName, true);
		FileWriter writeraux = new FileWriter("src/inputMovvo/auxiliar.txt", true);
		FileWriter writeraux2 = new FileWriter("src/inputMovvo/auxiliar2.txt", true);
		Reader readerAux = new InputStreamReader(new FileInputStream("src/inputMovvo/auxiliar.txt"), "utf-8");
		Reader readerAux2 = new InputStreamReader(new FileInputStream("src/inputMovvo/auxiliar2.txt"), "utf-8");
		BufferedReader brAux = new BufferedReader(readerAux);
		BufferedReader brAux2 = new BufferedReader(readerAux2);

		
		writer.write("#Substituição de nº loja pela categoria\n");
		int lojas[] = new int[1289];
		int initlojas[] = new int[1289];
		int endlojas[] = new int[1289];
		int nSeq=0;
		int seqSize = 2;			//#alterar dependendo do tamanho da sequência
		int nLinha=0;//Controlar a verificação de elementos na primeira linha das sequências
		int elemCounter[]=new int[500];
		int aux = -1;
		while((line = br.readLine()) != null) {
			//Separar valores de cada linha
			aux++;
			nSeq++;
			String[] splited = line.split("\\s+");
			nLinha=0;
			//NOTA: LOJA 1288 = 301 e LOJA 1175 = 300, NO DURATION É NECESSÁRIO SUBSTITUIR ESTAS LOJAS PARA FUNCIONAR
			for (int i = 0; i < splited.length; i++) {

				int store = Integer.parseInt(splited[i]); //#alterar adicionar .substring(0,3) quando é para a duração
				switch (store) {
				case 329:	writer.write("BANKS / FINANCIAL AGENTS     "); writeraux.write("BANKS / FINANCIAL AGENTS     \n"); lojas[329]=lojas[329]+1; if(nLinha==0)initlojas[329]=initlojas[329]+1; else if(nLinha==seqSize-1)endlojas[329]=endlojas[329]+1;break;
				case 330:	writer.write("BANKS / FINANCIAL AGENTS     "); writeraux.write("BANKS / FINANCIAL AGENTS     \n"); lojas[330]=lojas[330]+1; if(nLinha==0)initlojas[330]=initlojas[330]+1; else if(nLinha==seqSize-1)endlojas[330]=endlojas[330]+1;break;
				case 426:	writer.write("BANKS / FINANCIAL AGENTS     "); writeraux.write("BANKS / FINANCIAL AGENTS     \n"); lojas[426]=lojas[426]+1; if(nLinha==0)initlojas[426]=initlojas[426]+1; else if(nLinha==seqSize-1)endlojas[426]=endlojas[426]+1;break;
				case 306:	writer.write("BIJOUTERIE                   "); writeraux.write("BIJOUTERIE                   \n"); lojas[306]=lojas[306]+1; if(nLinha==0)initlojas[306]=initlojas[306]+1; else if(nLinha==seqSize-1)endlojas[306]=endlojas[306]+1;break;
				case 309:	writer.write("BIJOUTERIE                   "); writeraux.write("BIJOUTERIE                   \n"); lojas[309]=lojas[309]+1; if(nLinha==0)initlojas[309]=initlojas[309]+1; else if(nLinha==seqSize-1)endlojas[309]=endlojas[309]+1;break;
				case 380:	writer.write("BIJOUTERIE                   "); writeraux.write("BIJOUTERIE                   \n"); lojas[380]=lojas[380]+1; if(nLinha==0)initlojas[380]=initlojas[380]+1; else if(nLinha==seqSize-1)endlojas[380]=endlojas[380]+1;break;
				case 381:	writer.write("BIJOUTERIE                   "); writeraux.write("BIJOUTERIE                   \n"); lojas[381]=lojas[381]+1; if(nLinha==0)initlojas[381]=initlojas[381]+1; else if(nLinha==seqSize-1)endlojas[381]=endlojas[381]+1;break;
				case 392:	writer.write("BIJOUTERIE                   "); writeraux.write("BIJOUTERIE                   \n"); lojas[392]=lojas[392]+1; if(nLinha==0)initlojas[392]=initlojas[392]+1; else if(nLinha==seqSize-1)endlojas[392]=endlojas[392]+1;break;
				case 400:	writer.write("BIJOUTERIE                   "); writeraux.write("BIJOUTERIE                   \n"); lojas[400]=lojas[400]+1; if(nLinha==0)initlojas[400]=initlojas[400]+1; else if(nLinha==seqSize-1)endlojas[400]=endlojas[400]+1;break;
				case 497:	writer.write("BIJOUTERIE                   "); writeraux.write("BIJOUTERIE                   \n"); lojas[497]=lojas[497]+1; if(nLinha==0)initlojas[497]=initlojas[497]+1; else if(nLinha==seqSize-1)endlojas[497]=endlojas[497]+1;break;
				case 511:	writer.write("BIJOUTERIE                   "); writeraux.write("BIJOUTERIE                   \n"); lojas[511]=lojas[511]+1; if(nLinha==0)initlojas[511]=initlojas[511]+1; else if(nLinha==seqSize-1)endlojas[511]=endlojas[511]+1;break;
				case 311:	writer.write("BOOK STORE                   "); writeraux.write("BOOK STORE                   \n"); lojas[311]=lojas[311]+1; if(nLinha==0)initlojas[311]=initlojas[311]+1; else if(nLinha==seqSize-1)endlojas[311]=endlojas[311]+1;break;
				case 335:	writer.write("CHILDREN'S WEAR              "); writeraux.write("CHILDREN'S WEAR              \n"); lojas[335]=lojas[335]+1; if(nLinha==0)initlojas[335]=initlojas[335]+1; else if(nLinha==seqSize-1)endlojas[335]=endlojas[335]+1;break;
				case 340:	writer.write("CHILDREN'S WEAR              "); writeraux.write("CHILDREN'S WEAR              \n"); lojas[340]=lojas[340]+1; if(nLinha==0)initlojas[340]=initlojas[340]+1; else if(nLinha==seqSize-1)endlojas[340]=endlojas[340]+1;break;
				case 343:	writer.write("CHILDREN'S WEAR              "); writeraux.write("CHILDREN'S WEAR              \n"); lojas[343]=lojas[343]+1; if(nLinha==0)initlojas[343]=initlojas[343]+1; else if(nLinha==seqSize-1)endlojas[343]=endlojas[343]+1;break;
				case 344:	writer.write("CHILDREN'S WEAR              "); writeraux.write("CHILDREN'S WEAR              \n"); lojas[344]=lojas[344]+1; if(nLinha==0)initlojas[344]=initlojas[344]+1; else if(nLinha==seqSize-1)endlojas[344]=endlojas[344]+1;break;
				case 346:	writer.write("CHILDREN'S WEAR              "); writeraux.write("CHILDREN'S WEAR              \n"); lojas[346]=lojas[346]+1; if(nLinha==0)initlojas[346]=initlojas[346]+1; else if(nLinha==seqSize-1)endlojas[346]=endlojas[346]+1;break;
				case 347:	writer.write("CHILDREN'S WEAR              "); writeraux.write("CHILDREN'S WEAR              \n"); lojas[347]=lojas[347]+1; if(nLinha==0)initlojas[347]=initlojas[347]+1; else if(nLinha==seqSize-1)endlojas[347]=endlojas[347]+1;break;
				case 348:	writer.write("CHILDREN'S WEAR              "); writeraux.write("CHILDREN'S WEAR              \n"); lojas[348]=lojas[348]+1; if(nLinha==0)initlojas[348]=initlojas[348]+1; else if(nLinha==seqSize-1)endlojas[348]=endlojas[348]+1;break;
				case 349:	writer.write("CHILDREN'S WEAR              "); writeraux.write("CHILDREN'S WEAR              \n"); lojas[349]=lojas[349]+1; if(nLinha==0)initlojas[349]=initlojas[349]+1; else if(nLinha==seqSize-1)endlojas[349]=endlojas[349]+1;break;
				case 350:	writer.write("CHILDREN'S WEAR              "); writeraux.write("CHILDREN'S WEAR              \n"); lojas[350]=lojas[350]+1; if(nLinha==0)initlojas[350]=initlojas[350]+1; else if(nLinha==seqSize-1)endlojas[350]=endlojas[350]+1;break;
				case 351:	writer.write("CHILDREN'S WEAR              "); writeraux.write("CHILDREN'S WEAR              \n"); lojas[351]=lojas[351]+1; if(nLinha==0)initlojas[351]=initlojas[351]+1; else if(nLinha==seqSize-1)endlojas[351]=endlojas[351]+1;break;
				case 352:	writer.write("CHILDREN'S WEAR              "); writeraux.write("CHILDREN'S WEAR              \n"); lojas[352]=lojas[352]+1; if(nLinha==0)initlojas[352]=initlojas[352]+1; else if(nLinha==seqSize-1)endlojas[352]=endlojas[352]+1;break;
				case 353:	writer.write("CHILDREN'S WEAR              "); writeraux.write("CHILDREN'S WEAR              \n"); lojas[353]=lojas[353]+1; if(nLinha==0)initlojas[353]=initlojas[353]+1; else if(nLinha==seqSize-1)endlojas[353]=endlojas[353]+1;break;
				case 355:	writer.write("CHILDREN'S WEAR              "); writeraux.write("CHILDREN'S WEAR              \n"); lojas[355]=lojas[355]+1; if(nLinha==0)initlojas[355]=initlojas[355]+1; else if(nLinha==seqSize-1)endlojas[355]=endlojas[355]+1;break;
				case 525:	writer.write("CHILDREN'S WEAR              "); writeraux.write("CHILDREN'S WEAR              \n"); lojas[525]=lojas[525]+1; if(nLinha==0)initlojas[525]=initlojas[525]+1; else if(nLinha==seqSize-1)endlojas[525]=endlojas[525]+1;break;
				case 397:	writer.write("CHINA & GLASSWARE            "); writeraux.write("CHINA & GLASSWARE            \n"); lojas[397]=lojas[397]+1; if(nLinha==0)initlojas[397]=initlojas[397]+1; else if(nLinha==seqSize-1)endlojas[397]=endlojas[397]+1;break;
				case 398:	writer.write("CHINA & GLASSWARE            "); writeraux.write("CHINA & GLASSWARE            \n"); lojas[398]=lojas[398]+1; if(nLinha==0)initlojas[398]=initlojas[398]+1; else if(nLinha==seqSize-1)endlojas[398]=endlojas[398]+1;break;
				case 404:	writer.write("CHINA & GLASSWARE            "); writeraux.write("CHINA & GLASSWARE            \n"); lojas[404]=lojas[404]+1; if(nLinha==0)initlojas[404]=initlojas[404]+1; else if(nLinha==seqSize-1)endlojas[404]=endlojas[404]+1;break;
				case 526:	writer.write("CINEMAS                      "); writeraux.write("CINEMAS                      \n"); lojas[526]=lojas[526]+1; if(nLinha==0)initlojas[526]=initlojas[526]+1; else if(nLinha==seqSize-1)endlojas[526]=endlojas[526]+1;break;
				case 331:	writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[331]=lojas[331]+1; if(nLinha==0)initlojas[331]=initlojas[331]+1; else if(nLinha==seqSize-1)endlojas[331]=endlojas[331]+1;break;
				case 342:	writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[342]=lojas[342]+1; if(nLinha==0)initlojas[342]=initlojas[342]+1; else if(nLinha==seqSize-1)endlojas[342]=endlojas[342]+1;break;
				case 345:	writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[345]=lojas[345]+1; if(nLinha==0)initlojas[345]=initlojas[345]+1; else if(nLinha==seqSize-1)endlojas[345]=endlojas[345]+1;break;
				case 361:	writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[361]=lojas[361]+1; if(nLinha==0)initlojas[361]=initlojas[361]+1; else if(nLinha==seqSize-1)endlojas[361]=endlojas[361]+1;break;
				case 406:	writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[406]=lojas[406]+1; if(nLinha==0)initlojas[406]=initlojas[406]+1; else if(nLinha==seqSize-1)endlojas[406]=endlojas[406]+1;break;
				case 458:	writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[458]=lojas[458]+1; if(nLinha==0)initlojas[458]=initlojas[458]+1; else if(nLinha==seqSize-1)endlojas[458]=endlojas[458]+1;break;
				case 467:	writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[467]=lojas[467]+1; if(nLinha==0)initlojas[467]=initlojas[467]+1; else if(nLinha==seqSize-1)endlojas[467]=endlojas[467]+1;break;
				case 475:	writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[475]=lojas[475]+1; if(nLinha==0)initlojas[475]=initlojas[475]+1; else if(nLinha==seqSize-1)endlojas[475]=endlojas[475]+1;break;
				case 481:	writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[481]=lojas[481]+1; if(nLinha==0)initlojas[481]=initlojas[481]+1; else if(nLinha==seqSize-1)endlojas[481]=endlojas[481]+1;break;
				case 491:	writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[491]=lojas[491]+1; if(nLinha==0)initlojas[491]=initlojas[491]+1; else if(nLinha==seqSize-1)endlojas[491]=endlojas[491]+1;break;
				case 495:	writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[495]=lojas[495]+1; if(nLinha==0)initlojas[495]=initlojas[495]+1; else if(nLinha==seqSize-1)endlojas[495]=endlojas[495]+1;break;
				case 501:	writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[501]=lojas[501]+1; if(nLinha==0)initlojas[501]=initlojas[501]+1; else if(nLinha==seqSize-1)endlojas[501]=endlojas[501]+1;break;
				case 506:	writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[506]=lojas[506]+1; if(nLinha==0)initlojas[506]=initlojas[506]+1; else if(nLinha==seqSize-1)endlojas[506]=endlojas[506]+1;break;
				case 507:	writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[507]=lojas[507]+1; if(nLinha==0)initlojas[507]=initlojas[507]+1; else if(nLinha==seqSize-1)endlojas[507]=endlojas[507]+1;break;
				case 514:	writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[514]=lojas[514]+1; if(nLinha==0)initlojas[514]=initlojas[514]+1; else if(nLinha==seqSize-1)endlojas[514]=endlojas[514]+1;break;
				case 520:	writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[520]=lojas[520]+1; if(nLinha==0)initlojas[520]=initlojas[520]+1; else if(nLinha==seqSize-1)endlojas[520]=endlojas[520]+1;break;
				case 530:	writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[530]=lojas[530]+1; if(nLinha==0)initlojas[530]=initlojas[530]+1; else if(nLinha==seqSize-1)endlojas[530]=endlojas[530]+1;break;
				case 532:	writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[532]=lojas[532]+1; if(nLinha==0)initlojas[532]=initlojas[532]+1; else if(nLinha==seqSize-1)endlojas[532]=endlojas[532]+1;break;
				case 536:	writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[536]=lojas[536]+1; if(nLinha==0)initlojas[536]=initlojas[536]+1; else if(nLinha==seqSize-1)endlojas[536]=endlojas[536]+1;break;
				case 1175:  writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[1175]=lojas[1175]+1; if(nLinha==0)initlojas[1175]=initlojas[1175]+1; else if(nLinha==seqSize-1)endlojas[1175]=endlojas[1175]+1;break;
				case 300:   writer.write("CLOTHING IN GENERAL          "); writeraux.write("CLOTHING IN GENERAL          \n"); lojas[1175]=lojas[1175]+1; if(nLinha==0)initlojas[1175]=initlojas[1175]+1; else if(nLinha==seqSize-1)endlojas[1175]=endlojas[1175]+1;break;
				case 418:	writer.write("CLOTHING REPAIR              "); writeraux.write("CLOTHING REPAIR              \n"); lojas[418]=lojas[418]+1; if(nLinha==0)initlojas[418]=initlojas[418]+1; else if(nLinha==seqSize-1)endlojas[418]=endlojas[418]+1;break;
				case 310:	writer.write("COMMUNICATIONS               "); writeraux.write("COMMUNICATIONS               \n"); lojas[310]=lojas[310]+1; if(nLinha==0)initlojas[310]=initlojas[310]+1; else if(nLinha==seqSize-1)endlojas[310]=endlojas[310]+1;break;
				case 315:	writer.write("COMMUNICATIONS               "); writeraux.write("COMMUNICATIONS               \n"); lojas[315]=lojas[315]+1; if(nLinha==0)initlojas[315]=initlojas[315]+1; else if(nLinha==seqSize-1)endlojas[315]=endlojas[315]+1;break;
				case 317:	writer.write("COMMUNICATIONS               "); writeraux.write("COMMUNICATIONS               \n"); lojas[317]=lojas[317]+1; if(nLinha==0)initlojas[317]=initlojas[317]+1; else if(nLinha==seqSize-1)endlojas[317]=endlojas[317]+1;break;
				case 320:	writer.write("COMMUNICATIONS               "); writeraux.write("COMMUNICATIONS               \n"); lojas[320]=lojas[320]+1; if(nLinha==0)initlojas[320]=initlojas[320]+1; else if(nLinha==seqSize-1)endlojas[320]=endlojas[320]+1;break;
				case 415:	writer.write("COMMUNICATIONS               "); writeraux.write("COMMUNICATIONS               \n"); lojas[415]=lojas[415]+1; if(nLinha==0)initlojas[415]=initlojas[415]+1; else if(nLinha==seqSize-1)endlojas[415]=endlojas[415]+1;break;
				case 425:	writer.write("COMMUNICATIONS               "); writeraux.write("COMMUNICATIONS               \n"); lojas[425]=lojas[425]+1; if(nLinha==0)initlojas[425]=initlojas[425]+1; else if(nLinha==seqSize-1)endlojas[425]=endlojas[425]+1;break;
				case 327:	writer.write("COMPUTER SOFTWARE & HARDWARE "); writeraux.write("COMPUTER SOFTWARE & HARDWARE \n"); lojas[327]=lojas[327]+1; if(nLinha==0)initlojas[327]=initlojas[327]+1; else if(nLinha==seqSize-1)endlojas[327]=endlojas[327]+1;break;
				case 402:	writer.write("COMPUTER SOFTWARE & HARDWARE "); writeraux.write("COMPUTER SOFTWARE & HARDWARE \n"); lojas[402]=lojas[402]+1; if(nLinha==0)initlojas[402]=initlojas[402]+1; else if(nLinha==seqSize-1)endlojas[402]=endlojas[402]+1;break;
				case 527:	writer.write("COMPUTER SOFTWARE & HARDWARE "); writeraux.write("COMPUTER SOFTWARE & HARDWARE \n"); lojas[527]=lojas[527]+1; if(nLinha==0)initlojas[527]=initlojas[527]+1; else if(nLinha==seqSize-1)endlojas[527]=endlojas[527]+1;break;
				case 325:	writer.write("CRÆ’CHE FACILITIES           "); writeraux.write("CRÆ’CHE FACILITIES           \n"); lojas[325]=lojas[325]+1; if(nLinha==0)initlojas[325]=initlojas[325]+1; else if(nLinha==seqSize-1)endlojas[325]=endlojas[325]+1;break;
				case 414:	writer.write("DOORS, WARDROBES, AND SAFETY "); writeraux.write("DOORS, WARDROBES, AND SAFETY \n"); lojas[414]=lojas[414]+1; if(nLinha==0)initlojas[414]=initlojas[414]+1; else if(nLinha==seqSize-1)endlojas[414]=endlojas[414]+1;break;
				case 390:	writer.write("EQUIPMENT FOR ADVENTURE      "); writeraux.write("EQUIPMENT FOR ADVENTURE      \n"); lojas[390]=lojas[390]+1; if(nLinha==0)initlojas[390]=initlojas[390]+1; else if(nLinha==seqSize-1)endlojas[390]=endlojas[390]+1;break;
				case 409:	writer.write("FLOWERS AND PLANTS           "); writeraux.write("FLOWERS AND PLANTS           \n"); lojas[409]=lojas[409]+1; if(nLinha==0)initlojas[409]=initlojas[409]+1; else if(nLinha==seqSize-1)endlojas[409]=endlojas[409]+1;break;
				case 337:	writer.write("GIFTS                        "); writeraux.write("GIFTS                        \n"); lojas[337]=lojas[337]+1; if(nLinha==0)initlojas[337]=initlojas[337]+1; else if(nLinha==seqSize-1)endlojas[337]=endlojas[337]+1;break;
				case 357:	writer.write("GIFTS                        "); writeraux.write("GIFTS                        \n"); lojas[357]=lojas[357]+1; if(nLinha==0)initlojas[357]=initlojas[357]+1; else if(nLinha==seqSize-1)endlojas[357]=endlojas[357]+1;break;
				case 417:	writer.write("GIFTS                        "); writeraux.write("GIFTS                        \n"); lojas[417]=lojas[417]+1; if(nLinha==0)initlojas[417]=initlojas[417]+1; else if(nLinha==seqSize-1)endlojas[417]=endlojas[417]+1;break;
				case 324:	writer.write("HAIRDRESSER                  "); writeraux.write("HAIRDRESSER                  \n"); lojas[324]=lojas[324]+1; if(nLinha==0)initlojas[324]=initlojas[324]+1; else if(nLinha==seqSize-1)endlojas[324]=endlojas[324]+1;break;
				case 376:	writer.write("HAIRDRESSER                  "); writeraux.write("HAIRDRESSER                  \n"); lojas[376]=lojas[376]+1; if(nLinha==0)initlojas[376]=initlojas[376]+1; else if(nLinha==seqSize-1)endlojas[376]=endlojas[376]+1;break;
				case 424:	writer.write("HAIRDRESSING ARTICLES        "); writeraux.write("HAIRDRESSING ARTICLES        \n"); lojas[424]=lojas[424]+1; if(nLinha==0)initlojas[424]=initlojas[424]+1; else if(nLinha==seqSize-1)endlojas[424]=endlojas[424]+1;break;
				case 529:	writer.write("HOUSEHOLD ELECTRICAL APPLIANC"); writeraux.write("HOUSEHOLD ELECTRICAL APPLIANC\n"); lojas[529]=lojas[529]+1; if(nLinha==0)initlojas[529]=initlojas[529]+1; else if(nLinha==seqSize-1)endlojas[529]=endlojas[529]+1;break;
				case 509:	writer.write("JEANS AND CASUAL WEAR        "); writeraux.write("JEANS AND CASUAL WEAR        \n"); lojas[509]=lojas[509]+1; if(nLinha==0)initlojas[509]=initlojas[509]+1; else if(nLinha==seqSize-1)endlojas[509]=endlojas[509]+1;break;
				case 515:	writer.write("JEANS AND CASUAL WEAR        "); writeraux.write("JEANS AND CASUAL WEAR        \n"); lojas[515]=lojas[515]+1; if(nLinha==0)initlojas[515]=initlojas[515]+1; else if(nLinha==seqSize-1)endlojas[515]=endlojas[515]+1;break;
				case 313:	writer.write("JEWELERY & ACCESSORIES       "); writeraux.write("JEWELERY & ACCESSORIES       \n"); lojas[313]=lojas[313]+1; if(nLinha==0)initlojas[313]=initlojas[313]+1; else if(nLinha==seqSize-1)endlojas[313]=endlojas[313]+1;break;
				case 332:	writer.write("JEWELERY & ACCESSORIES       "); writeraux.write("JEWELERY & ACCESSORIES       \n"); lojas[332]=lojas[332]+1; if(nLinha==0)initlojas[332]=initlojas[332]+1; else if(nLinha==seqSize-1)endlojas[332]=endlojas[332]+1;break;
				case 356:	writer.write("JEWELERY & ACCESSORIES       "); writeraux.write("JEWELERY & ACCESSORIES       \n"); lojas[356]=lojas[356]+1; if(nLinha==0)initlojas[356]=initlojas[356]+1; else if(nLinha==seqSize-1)endlojas[356]=endlojas[356]+1;break;
				case 362:	writer.write("JEWELERY & ACCESSORIES       "); writeraux.write("JEWELERY & ACCESSORIES       \n"); lojas[362]=lojas[362]+1; if(nLinha==0)initlojas[362]=initlojas[362]+1; else if(nLinha==seqSize-1)endlojas[362]=endlojas[362]+1;break;
				case 375:	writer.write("JEWELERY & ACCESSORIES       "); writeraux.write("JEWELERY & ACCESSORIES       \n"); lojas[375]=lojas[375]+1; if(nLinha==0)initlojas[375]=initlojas[375]+1; else if(nLinha==seqSize-1)endlojas[375]=endlojas[375]+1;break;
				case 382:	writer.write("JEWELERY & ACCESSORIES       "); writeraux.write("JEWELERY & ACCESSORIES       \n"); lojas[382]=lojas[382]+1; if(nLinha==0)initlojas[382]=initlojas[382]+1; else if(nLinha==seqSize-1)endlojas[382]=endlojas[382]+1;break;
				case 427:	writer.write("JEWELERY & ACCESSORIES       "); writeraux.write("JEWELERY & ACCESSORIES       \n"); lojas[427]=lojas[427]+1; if(nLinha==0)initlojas[427]=initlojas[427]+1; else if(nLinha==seqSize-1)endlojas[427]=endlojas[427]+1;break;
				case 454:	writer.write("JEWELERY & ACCESSORIES       "); writeraux.write("JEWELERY & ACCESSORIES       \n"); lojas[454]=lojas[454]+1; if(nLinha==0)initlojas[454]=initlojas[454]+1; else if(nLinha==seqSize-1)endlojas[454]=endlojas[454]+1;break;
				case 468:	writer.write("JEWELERY & ACCESSORIES       "); writeraux.write("JEWELERY & ACCESSORIES       \n"); lojas[468]=lojas[468]+1; if(nLinha==0)initlojas[468]=initlojas[468]+1; else if(nLinha==seqSize-1)endlojas[468]=endlojas[468]+1;break;
				case 478:	writer.write("JEWELERY & ACCESSORIES       "); writeraux.write("JEWELERY & ACCESSORIES       \n"); lojas[478]=lojas[478]+1; if(nLinha==0)initlojas[478]=initlojas[478]+1; else if(nLinha==seqSize-1)endlojas[478]=endlojas[478]+1;break;
				case 508:	writer.write("JEWELERY & ACCESSORIES       "); writeraux.write("JEWELERY & ACCESSORIES       \n"); lojas[508]=lojas[508]+1; if(nLinha==0)initlojas[508]=initlojas[508]+1; else if(nLinha==seqSize-1)endlojas[508]=endlojas[508]+1;break;
				case 1288:  writer.write("JEWELERY & ACCESSORIES       "); writeraux.write("JEWELERY & ACCESSORIES       \n"); lojas[1288]=lojas[1288]+1; if(nLinha==0)initlojas[1288]=initlojas[1288]+1; else if(nLinha==seqSize-1)endlojas[1288]=endlojas[1288]+1;break;
				case 301:   writer.write("JEWELERY & ACCESSORIES       "); writeraux.write("JEWELERY & ACCESSORIES       \n"); lojas[1288]=lojas[1288]+1; if(nLinha==0)initlojas[1288]=initlojas[1288]+1; else if(nLinha==seqSize-1)endlojas[1288]=endlojas[1288]+1;break;
				case 477:	writer.write("LADIESWEAR                   "); writeraux.write("LADIESWEAR                   \n"); lojas[477]=lojas[477]+1; if(nLinha==0)initlojas[477]=initlojas[477]+1; else if(nLinha==seqSize-1)endlojas[477]=endlojas[477]+1;break;
				case 479:	writer.write("LADIESWEAR                   "); writeraux.write("LADIESWEAR                   \n"); lojas[479]=lojas[479]+1; if(nLinha==0)initlojas[479]=initlojas[479]+1; else if(nLinha==seqSize-1)endlojas[479]=endlojas[479]+1;break;
				case 484:	writer.write("LADIESWEAR                   "); writeraux.write("LADIESWEAR                   \n"); lojas[484]=lojas[484]+1; if(nLinha==0)initlojas[484]=initlojas[484]+1; else if(nLinha==seqSize-1)endlojas[484]=endlojas[484]+1;break;
				case 487:	writer.write("LADIESWEAR                   "); writeraux.write("LADIESWEAR                   \n"); lojas[487]=lojas[487]+1; if(nLinha==0)initlojas[487]=initlojas[487]+1; else if(nLinha==seqSize-1)endlojas[487]=endlojas[487]+1;break;
				case 494:	writer.write("LADIESWEAR                   "); writeraux.write("LADIESWEAR                   \n"); lojas[494]=lojas[494]+1; if(nLinha==0)initlojas[494]=initlojas[494]+1; else if(nLinha==seqSize-1)endlojas[494]=endlojas[494]+1;break;
				case 502:	writer.write("LADIESWEAR                   "); writeraux.write("LADIESWEAR                   \n"); lojas[502]=lojas[502]+1; if(nLinha==0)initlojas[502]=initlojas[502]+1; else if(nLinha==seqSize-1)endlojas[502]=endlojas[502]+1;break;
				case 505:	writer.write("LADIESWEAR                   "); writeraux.write("LADIESWEAR                   \n"); lojas[505]=lojas[505]+1; if(nLinha==0)initlojas[505]=initlojas[505]+1; else if(nLinha==seqSize-1)endlojas[505]=endlojas[505]+1;break;
				case 510:	writer.write("LADIESWEAR                   "); writeraux.write("LADIESWEAR                   \n"); lojas[510]=lojas[510]+1; if(nLinha==0)initlojas[510]=initlojas[510]+1; else if(nLinha==seqSize-1)endlojas[510]=endlojas[510]+1;break;
				case 512:	writer.write("LADIESWEAR                   "); writeraux.write("LADIESWEAR                   \n"); lojas[512]=lojas[512]+1; if(nLinha==0)initlojas[512]=initlojas[512]+1; else if(nLinha==seqSize-1)endlojas[512]=endlojas[512]+1;break;
				case 519:	writer.write("LADIESWEAR                   "); writeraux.write("LADIESWEAR                   \n"); lojas[519]=lojas[519]+1; if(nLinha==0)initlojas[519]=initlojas[519]+1; else if(nLinha==seqSize-1)endlojas[519]=endlojas[519]+1;break;
				case 336:	writer.write("LEATHER GOODS / ACCESSORIES  "); writeraux.write("LEATHER GOODS / ACCESSORIES  \n"); lojas[336]=lojas[336]+1; if(nLinha==0)initlojas[336]=initlojas[336]+1; else if(nLinha==seqSize-1)endlojas[336]=endlojas[336]+1;break;
				case 378:	writer.write("LEATHER GOODS / ACCESSORIES  "); writeraux.write("LEATHER GOODS / ACCESSORIES  \n"); lojas[378]=lojas[378]+1; if(nLinha==0)initlojas[378]=initlojas[378]+1; else if(nLinha==seqSize-1)endlojas[378]=endlojas[378]+1;break;
				case 471:	writer.write("LEATHER GOODS / ACCESSORIES  "); writeraux.write("LEATHER GOODS / ACCESSORIES  \n"); lojas[471]=lojas[471]+1; if(nLinha==0)initlojas[471]=initlojas[471]+1; else if(nLinha==seqSize-1)endlojas[471]=endlojas[471]+1;break;
				case 488:	writer.write("LEATHER GOODS / ACCESSORIES  "); writeraux.write("LEATHER GOODS / ACCESSORIES  \n"); lojas[488]=lojas[488]+1; if(nLinha==0)initlojas[488]=initlojas[488]+1; else if(nLinha==seqSize-1)endlojas[488]=endlojas[488]+1;break;
				case 318:	writer.write("MATRESS                      "); writeraux.write("MATRESS                      \n"); lojas[318]=lojas[318]+1; if(nLinha==0)initlojas[318]=initlojas[318]+1; else if(nLinha==seqSize-1)endlojas[318]=endlojas[318]+1;break;
				case 490:	writer.write("MEN SHIRTS AND TIES          "); writeraux.write("MEN SHIRTS AND TIES          \n"); lojas[490]=lojas[490]+1; if(nLinha==0)initlojas[490]=initlojas[490]+1; else if(nLinha==seqSize-1)endlojas[490]=endlojas[490]+1;break;
				case 498:	writer.write("MEN SHIRTS AND TIES          "); writeraux.write("MEN SHIRTS AND TIES          \n"); lojas[498]=lojas[498]+1; if(nLinha==0)initlojas[498]=initlojas[498]+1; else if(nLinha==seqSize-1)endlojas[498]=endlojas[498]+1;break;
				case 513:	writer.write("MENAGE ARTICLES AND UTENSILS "); writeraux.write("MENAGE ARTICLES AND UTENSILS \n"); lojas[513]=lojas[513]+1; if(nLinha==0)initlojas[513]=initlojas[513]+1; else if(nLinha==seqSize-1)endlojas[513]=endlojas[513]+1;break;
				case 472:	writer.write("MENSWEAR                     "); writeraux.write("MENSWEAR                     \n"); lojas[472]=lojas[472]+1; if(nLinha==0)initlojas[472]=initlojas[472]+1; else if(nLinha==seqSize-1)endlojas[472]=endlojas[472]+1;break;
				case 483:	writer.write("MENSWEAR                     "); writeraux.write("MENSWEAR                     \n"); lojas[483]=lojas[483]+1; if(nLinha==0)initlojas[483]=initlojas[483]+1; else if(nLinha==seqSize-1)endlojas[483]=endlojas[483]+1;break;
				case 489:	writer.write("MENSWEAR                     "); writeraux.write("MENSWEAR                     \n"); lojas[489]=lojas[489]+1; if(nLinha==0)initlojas[489]=initlojas[489]+1; else if(nLinha==seqSize-1)endlojas[489]=endlojas[489]+1;break;
				case 496:	writer.write("MENSWEAR                     "); writeraux.write("MENSWEAR                     \n"); lojas[496]=lojas[496]+1; if(nLinha==0)initlojas[496]=initlojas[496]+1; else if(nLinha==seqSize-1)endlojas[496]=endlojas[496]+1;break;
				case 504:	writer.write("MENSWEAR                     "); writeraux.write("MENSWEAR                     \n"); lojas[504]=lojas[504]+1; if(nLinha==0)initlojas[504]=initlojas[504]+1; else if(nLinha==seqSize-1)endlojas[504]=endlojas[504]+1;break;
				case 521:	writer.write("MENSWEAR                     "); writeraux.write("MENSWEAR                     \n"); lojas[521]=lojas[521]+1; if(nLinha==0)initlojas[521]=initlojas[521]+1; else if(nLinha==seqSize-1)endlojas[521]=endlojas[521]+1;break;
				case 316:	writer.write("MISCELLANEOUS                "); writeraux.write("MISCELLANEOUS                \n"); lojas[316]=lojas[316]+1; if(nLinha==0)initlojas[316]=initlojas[316]+1; else if(nLinha==seqSize-1)endlojas[316]=endlojas[316]+1;break;
				case 371:	writer.write("MISCELLANEOUS                "); writeraux.write("MISCELLANEOUS                \n"); lojas[371]=lojas[371]+1; if(nLinha==0)initlojas[371]=initlojas[371]+1; else if(nLinha==seqSize-1)endlojas[371]=endlojas[371]+1;break;
				case 394:	writer.write("MISCELLANEOUS                "); writeraux.write("MISCELLANEOUS                \n"); lojas[394]=lojas[394]+1; if(nLinha==0)initlojas[394]=initlojas[394]+1; else if(nLinha==seqSize-1)endlojas[394]=endlojas[394]+1;break;
				case 416:	writer.write("MISCELLANEOUS                "); writeraux.write("MISCELLANEOUS                \n"); lojas[416]=lojas[416]+1; if(nLinha==0)initlojas[416]=initlojas[416]+1; else if(nLinha==seqSize-1)endlojas[416]=endlojas[416]+1;break;
				case 476:	writer.write("MISCELLANEOUS                "); writeraux.write("MISCELLANEOUS                \n"); lojas[476]=lojas[476]+1; if(nLinha==0)initlojas[476]=initlojas[476]+1; else if(nLinha==seqSize-1)endlojas[476]=endlojas[476]+1;break;
				case 535:	writer.write("MISCELLANEOUS                "); writeraux.write("MISCELLANEOUS                \n"); lojas[535]=lojas[535]+1; if(nLinha==0)initlojas[535]=initlojas[535]+1; else if(nLinha==seqSize-1)endlojas[535]=endlojas[535]+1;break;
				case 387:	writer.write("MISCELLANEOUS                "); writeraux.write("MISCELLANEOUS                \n"); lojas[387]=lojas[387]+1; if(nLinha==0)initlojas[387]=initlojas[387]+1; else if(nLinha==seqSize-1)endlojas[387]=endlojas[387]+1;break;
				case 419:	writer.write("MISCELLANEOUS                "); writeraux.write("MISCELLANEOUS                \n"); lojas[419]=lojas[419]+1; if(nLinha==0)initlojas[419]=initlojas[419]+1; else if(nLinha==seqSize-1)endlojas[419]=endlojas[419]+1;break;
				case 470:	writer.write("MISCELLANEOUS                "); writeraux.write("MISCELLANEOUS                \n"); lojas[470]=lojas[470]+1; if(nLinha==0)initlojas[470]=initlojas[470]+1; else if(nLinha==seqSize-1)endlojas[470]=endlojas[470]+1;break;
				case 499:	writer.write("MISCELLANEOUS                "); writeraux.write("MISCELLANEOUS                \n"); lojas[499]=lojas[499]+1; if(nLinha==0)initlojas[499]=initlojas[499]+1; else if(nLinha==seqSize-1)endlojas[499]=endlojas[499]+1;break;
				case 531:	writer.write("MISCELLANEOUS                "); writeraux.write("MISCELLANEOUS                \n"); lojas[531]=lojas[531]+1; if(nLinha==0)initlojas[531]=initlojas[531]+1; else if(nLinha==seqSize-1)endlojas[531]=endlojas[531]+1;break;
				case 338:	writer.write("N/D                          "); writeraux.write("N/D                          \n"); lojas[338]=lojas[338]+1; if(nLinha==0)initlojas[338]=initlojas[338]+1; else if(nLinha==seqSize-1)endlojas[338]=endlojas[338]+1;break;
				case 393:	writer.write("N/D                          "); writeraux.write("N/D                          \n"); lojas[393]=lojas[393]+1; if(nLinha==0)initlojas[393]=initlojas[393]+1; else if(nLinha==seqSize-1)endlojas[393]=endlojas[393]+1;break;
				case 401:	writer.write("N/D                          "); writeraux.write("N/D                          \n"); lojas[401]=lojas[401]+1; if(nLinha==0)initlojas[401]=initlojas[401]+1; else if(nLinha==seqSize-1)endlojas[401]=endlojas[401]+1;break;
				case 312:	writer.write("NATURAL PERFUMERY            "); writeraux.write("NATURAL PERFUMERY            \n"); lojas[312]=lojas[312]+1; if(nLinha==0)initlojas[312]=initlojas[312]+1; else if(nLinha==seqSize-1)endlojas[312]=endlojas[312]+1;break;
				case 408:	writer.write("NATURAL PERFUMERY            "); writeraux.write("NATURAL PERFUMERY            \n"); lojas[408]=lojas[408]+1; if(nLinha==0)initlojas[408]=initlojas[408]+1; else if(nLinha==seqSize-1)endlojas[408]=endlojas[408]+1;break;
				case 326:	writer.write("OFFICIAL / STATE ORGANISMS   "); writeraux.write("OFFICIAL / STATE ORGANISMS   \n"); lojas[326]=lojas[326]+1; if(nLinha==0)initlojas[326]=initlojas[326]+1; else if(nLinha==seqSize-1)endlojas[326]=endlojas[326]+1;break;
				case 322:	writer.write("OPTICIAN                     "); writeraux.write("OPTICIAN                     \n"); lojas[322]=lojas[322]+1; if(nLinha==0)initlojas[322]=initlojas[322]+1; else if(nLinha==seqSize-1)endlojas[322]=endlojas[322]+1;break;
				case 365:	writer.write("OPTICIAN                     "); writeraux.write("OPTICIAN                     \n"); lojas[365]=lojas[365]+1; if(nLinha==0)initlojas[365]=initlojas[365]+1; else if(nLinha==seqSize-1)endlojas[365]=endlojas[365]+1;break;
				case 377:	writer.write("OPTICIAN                     "); writeraux.write("OPTICIAN                     \n"); lojas[377]=lojas[377]+1; if(nLinha==0)initlojas[377]=initlojas[377]+1; else if(nLinha==seqSize-1)endlojas[377]=endlojas[377]+1;break;
				case 399:	writer.write("OPTICIAN                     "); writeraux.write("OPTICIAN                     \n"); lojas[399]=lojas[399]+1; if(nLinha==0)initlojas[399]=initlojas[399]+1; else if(nLinha==seqSize-1)endlojas[399]=endlojas[399]+1;break;
				case 367:	writer.write("PERFUMES / COSMETICS         "); writeraux.write("PERFUMES / COSMETICS         \n"); lojas[367]=lojas[367]+1; if(nLinha==0)initlojas[367]=initlojas[367]+1; else if(nLinha==seqSize-1)endlojas[367]=endlojas[367]+1;break;
				case 372:	writer.write("PERFUMES / COSMETICS         "); writeraux.write("PERFUMES / COSMETICS         \n"); lojas[372]=lojas[372]+1; if(nLinha==0)initlojas[372]=initlojas[372]+1; else if(nLinha==seqSize-1)endlojas[372]=endlojas[372]+1;break;
				case 386:	writer.write("PERFUMES / COSMETICS         "); writeraux.write("PERFUMES / COSMETICS         \n"); lojas[386]=lojas[386]+1; if(nLinha==0)initlojas[386]=initlojas[386]+1; else if(nLinha==seqSize-1)endlojas[386]=endlojas[386]+1;break;
				case 412:	writer.write("PERFUMES / COSMETICS         "); writeraux.write("PERFUMES / COSMETICS         \n"); lojas[412]=lojas[412]+1; if(nLinha==0)initlojas[412]=initlojas[412]+1; else if(nLinha==seqSize-1)endlojas[412]=endlojas[412]+1;break;
				case 469:	writer.write("PERFUMES / COSMETICS         "); writeraux.write("PERFUMES / COSMETICS         \n"); lojas[469]=lojas[469]+1; if(nLinha==0)initlojas[469]=initlojas[469]+1; else if(nLinha==seqSize-1)endlojas[469]=endlojas[469]+1;break;
				case 319:	writer.write("PHARMACY                     "); writeraux.write("PHARMACY                     \n"); lojas[319]=lojas[319]+1; if(nLinha==0)initlojas[319]=initlojas[319]+1; else if(nLinha==seqSize-1)endlojas[319]=endlojas[319]+1;break;
				case 423:	writer.write("PHOTOGRAPHY                  "); writeraux.write("PHOTOGRAPHY                  \n"); lojas[423]=lojas[423]+1; if(nLinha==0)initlojas[423]=initlojas[423]+1; else if(nLinha==seqSize-1)endlojas[423]=endlojas[423]+1;break;
				case 314:	writer.write("POST OFFICE                  "); writeraux.write("POST OFFICE                  \n"); lojas[314]=lojas[314]+1; if(nLinha==0)initlojas[314]=initlojas[314]+1; else if(nLinha==seqSize-1)endlojas[314]=endlojas[314]+1;break;
				case 405:	writer.write("SERVICES                     "); writeraux.write("SERVICES                     \n"); lojas[405]=lojas[405]+1; if(nLinha==0)initlojas[405]=initlojas[405]+1; else if(nLinha==seqSize-1)endlojas[405]=endlojas[405]+1;break;
				case 420:	writer.write("SERVICES                     "); writeraux.write("SERVICES                     \n"); lojas[420]=lojas[420]+1; if(nLinha==0)initlojas[420]=initlojas[420]+1; else if(nLinha==seqSize-1)endlojas[420]=endlojas[420]+1;break;
				case 328:	writer.write("SHOE REPAIRING               "); writeraux.write("SHOE REPAIRING               \n"); lojas[328]=lojas[328]+1; if(nLinha==0)initlojas[328]=initlojas[328]+1; else if(nLinha==seqSize-1)endlojas[328]=endlojas[328]+1;break;
				case 333:	writer.write("SHOE STORE IN GENERAL        "); writeraux.write("SHOE STORE IN GENERAL        \n"); lojas[333]=lojas[333]+1; if(nLinha==0)initlojas[333]=initlojas[333]+1; else if(nLinha==seqSize-1)endlojas[333]=endlojas[333]+1;break;
				case 358:	writer.write("SHOE STORE IN GENERAL        "); writeraux.write("SHOE STORE IN GENERAL        \n"); lojas[358]=lojas[358]+1; if(nLinha==0)initlojas[358]=initlojas[358]+1; else if(nLinha==seqSize-1)endlojas[358]=endlojas[358]+1;break;
				case 359:	writer.write("SHOE STORE IN GENERAL        "); writeraux.write("SHOE STORE IN GENERAL        \n"); lojas[359]=lojas[359]+1; if(nLinha==0)initlojas[359]=initlojas[359]+1; else if(nLinha==seqSize-1)endlojas[359]=endlojas[359]+1;break;
				case 363:	writer.write("SHOE STORE IN GENERAL        "); writeraux.write("SHOE STORE IN GENERAL        \n"); lojas[363]=lojas[363]+1; if(nLinha==0)initlojas[363]=initlojas[363]+1; else if(nLinha==seqSize-1)endlojas[363]=endlojas[363]+1;break;
				case 368:	writer.write("SHOE STORE IN GENERAL        "); writeraux.write("SHOE STORE IN GENERAL        \n"); lojas[368]=lojas[368]+1; if(nLinha==0)initlojas[368]=initlojas[368]+1; else if(nLinha==seqSize-1)endlojas[368]=endlojas[368]+1;break;
				case 370:	writer.write("SHOE STORE IN GENERAL        "); writeraux.write("SHOE STORE IN GENERAL        \n"); lojas[370]=lojas[370]+1; if(nLinha==0)initlojas[370]=initlojas[370]+1; else if(nLinha==seqSize-1)endlojas[370]=endlojas[370]+1;break;
				case 384:	writer.write("SHOE STORE IN GENERAL        "); writeraux.write("SHOE STORE IN GENERAL        \n"); lojas[384]=lojas[384]+1; if(nLinha==0)initlojas[384]=initlojas[384]+1; else if(nLinha==seqSize-1)endlojas[384]=endlojas[384]+1;break;
				case 396:	writer.write("SHOE STORE IN GENERAL        "); writeraux.write("SHOE STORE IN GENERAL        \n"); lojas[396]=lojas[396]+1; if(nLinha==0)initlojas[396]=initlojas[396]+1; else if(nLinha==seqSize-1)endlojas[396]=endlojas[396]+1;break;
				case 465:	writer.write("SHOE STORE IN GENERAL        "); writeraux.write("SHOE STORE IN GENERAL        \n"); lojas[465]=lojas[465]+1; if(nLinha==0)initlojas[465]=initlojas[465]+1; else if(nLinha==seqSize-1)endlojas[465]=endlojas[465]+1;break;
				case 474:	writer.write("SHOE STORE IN GENERAL        "); writeraux.write("SHOE STORE IN GENERAL        \n"); lojas[474]=lojas[474]+1; if(nLinha==0)initlojas[474]=initlojas[474]+1; else if(nLinha==seqSize-1)endlojas[474]=endlojas[474]+1;break;
				case 486:	writer.write("SHOE STORE IN GENERAL        "); writeraux.write("SHOE STORE IN GENERAL        \n"); lojas[486]=lojas[486]+1; if(nLinha==0)initlojas[486]=initlojas[486]+1; else if(nLinha==seqSize-1)endlojas[486]=endlojas[486]+1;break;
				case 493:	writer.write("SHOE STORE IN GENERAL        "); writeraux.write("SHOE STORE IN GENERAL        \n"); lojas[493]=lojas[493]+1; if(nLinha==0)initlojas[493]=initlojas[493]+1; else if(nLinha==seqSize-1)endlojas[493]=endlojas[493]+1;break;
				case 503:	writer.write("SHOE STORE IN GENERAL        "); writeraux.write("SHOE STORE IN GENERAL        \n"); lojas[503]=lojas[503]+1; if(nLinha==0)initlojas[503]=initlojas[503]+1; else if(nLinha==seqSize-1)endlojas[503]=endlojas[503]+1;break;
				case 391:	writer.write("SILVER & PLATINGS            "); writeraux.write("SILVER & PLATINGS            \n"); lojas[391]=lojas[391]+1; if(nLinha==0)initlojas[391]=initlojas[391]+1; else if(nLinha==seqSize-1)endlojas[391]=endlojas[391]+1;break;
				case 373:	writer.write("SPORTS GOODS IN GENERAL      "); writeraux.write("SPORTS GOODS IN GENERAL      \n"); lojas[373]=lojas[373]+1; if(nLinha==0)initlojas[373]=initlojas[373]+1; else if(nLinha==seqSize-1)endlojas[373]=endlojas[373]+1;break;
				case 537:	writer.write("SPORTS GOODS IN GENERAL      "); writeraux.write("SPORTS GOODS IN GENERAL      \n"); lojas[537]=lojas[537]+1; if(nLinha==0)initlojas[537]=initlojas[537]+1; else if(nLinha==seqSize-1)endlojas[537]=endlojas[537]+1;break;
				case 360:	writer.write("SPORTSWEAR / FOOTWEAR        "); writeraux.write("SPORTSWEAR / FOOTWEAR        \n"); lojas[360]=lojas[360]+1; if(nLinha==0)initlojas[360]=initlojas[360]+1; else if(nLinha==seqSize-1)endlojas[360]=endlojas[360]+1;break;
				case 364:	writer.write("SPORTSWEAR / FOOTWEAR        "); writeraux.write("SPORTSWEAR / FOOTWEAR        \n"); lojas[364]=lojas[364]+1; if(nLinha==0)initlojas[364]=initlojas[364]+1; else if(nLinha==seqSize-1)endlojas[364]=endlojas[364]+1;break;
				case 366:	writer.write("SPORTSWEAR / FOOTWEAR        "); writeraux.write("SPORTSWEAR / FOOTWEAR        \n"); lojas[366]=lojas[366]+1; if(nLinha==0)initlojas[366]=initlojas[366]+1; else if(nLinha==seqSize-1)endlojas[366]=endlojas[366]+1;break;
				case 518:	writer.write("SPORTSWEAR / FOOTWEAR        "); writeraux.write("SPORTSWEAR / FOOTWEAR        \n"); lojas[518]=lojas[518]+1; if(nLinha==0)initlojas[518]=initlojas[518]+1; else if(nLinha==seqSize-1)endlojas[518]=endlojas[518]+1;break;
				case 388:	writer.write("STATIONARY & CRAFT ARTICLES  "); writeraux.write("STATIONARY & CRAFT ARTICLES  \n"); lojas[388]=lojas[388]+1; if(nLinha==0)initlojas[388]=initlojas[388]+1; else if(nLinha==seqSize-1)endlojas[388]=endlojas[388]+1;break;
				case 395:	writer.write("STATIONARY & CRAFT ARTICLES  "); writeraux.write("STATIONARY & CRAFT ARTICLES  \n"); lojas[395]=lojas[395]+1; if(nLinha==0)initlojas[395]=initlojas[395]+1; else if(nLinha==seqSize-1)endlojas[395]=endlojas[395]+1;break;
				case 533:	writer.write("SUPERMARKET AND HIPERMARKET  "); writeraux.write("SUPERMARKET AND HIPERMARKET  \n"); lojas[533]=lojas[533]+1; if(nLinha==0)initlojas[533]=initlojas[533]+1; else if(nLinha==seqSize-1)endlojas[533]=endlojas[533]+1;break;
				case 379:	writer.write("SWEETS AND CHOCOLATES        "); writeraux.write("SWEETS AND CHOCOLATES        \n"); lojas[379]=lojas[379]+1; if(nLinha==0)initlojas[379]=initlojas[379]+1; else if(nLinha==seqSize-1)endlojas[379]=endlojas[379]+1;break;
				case 411:	writer.write("TABACCO STORE                "); writeraux.write("TABACCO STORE                \n"); lojas[411]=lojas[411]+1; if(nLinha==0)initlojas[411]=initlojas[411]+1; else if(nLinha==seqSize-1)endlojas[411]=endlojas[411]+1;break;
				case 403:	writer.write("TEA / COFFEE SHOP            "); writeraux.write("TEA / COFFEE SHOP            \n"); lojas[403]=lojas[403]+1; if(nLinha==0)initlojas[403]=initlojas[403]+1; else if(nLinha==seqSize-1)endlojas[403]=endlojas[403]+1;break;
				case 323:	writer.write("TEENAGERS WEAR               "); writeraux.write("TEENAGERS WEAR               \n"); lojas[323]=lojas[323]+1; if(nLinha==0)initlojas[323]=initlojas[323]+1; else if(nLinha==seqSize-1)endlojas[323]=endlojas[323]+1;break;
				case 339:	writer.write("TEENAGERS WEAR               "); writeraux.write("TEENAGERS WEAR               \n"); lojas[339]=lojas[339]+1; if(nLinha==0)initlojas[339]=initlojas[339]+1; else if(nLinha==seqSize-1)endlojas[339]=endlojas[339]+1;break;
				case 341:	writer.write("TOYS IN GENERAL              "); writeraux.write("TOYS IN GENERAL              \n"); lojas[341]=lojas[341]+1; if(nLinha==0)initlojas[341]=initlojas[341]+1; else if(nLinha==seqSize-1)endlojas[341]=endlojas[341]+1;break;
				case 421:	writer.write("TRAVEL AGENCIES              "); writeraux.write("TRAVEL AGENCIES              \n"); lojas[421]=lojas[421]+1; if(nLinha==0)initlojas[421]=initlojas[421]+1; else if(nLinha==seqSize-1)endlojas[421]=endlojas[421]+1;break;
				case 369:	writer.write("UNDERWEAR                    "); writeraux.write("UNDERWEAR                    \n"); lojas[369]=lojas[369]+1; if(nLinha==0)initlojas[369]=initlojas[369]+1; else if(nLinha==seqSize-1)endlojas[369]=endlojas[369]+1;break;
				case 385:	writer.write("UNDERWEAR                    "); writeraux.write("UNDERWEAR                    \n"); lojas[385]=lojas[385]+1; if(nLinha==0)initlojas[385]=initlojas[385]+1; else if(nLinha==seqSize-1)endlojas[385]=endlojas[385]+1;break;
				case 466:	writer.write("UNDERWEAR                    "); writeraux.write("UNDERWEAR                    \n"); lojas[466]=lojas[466]+1; if(nLinha==0)initlojas[466]=initlojas[466]+1; else if(nLinha==seqSize-1)endlojas[466]=endlojas[466]+1;break;
				case 473:	writer.write("UNDERWEAR                    "); writeraux.write("UNDERWEAR                    \n"); lojas[473]=lojas[473]+1; if(nLinha==0)initlojas[473]=initlojas[473]+1; else if(nLinha==seqSize-1)endlojas[473]=endlojas[473]+1;break;
				case 480:	writer.write("UNDERWEAR                    "); writeraux.write("UNDERWEAR                    \n"); lojas[480]=lojas[480]+1; if(nLinha==0)initlojas[480]=initlojas[480]+1; else if(nLinha==seqSize-1)endlojas[480]=endlojas[480]+1;break;
				case 485:	writer.write("UNDERWEAR                    "); writeraux.write("UNDERWEAR                    \n"); lojas[485]=lojas[485]+1; if(nLinha==0)initlojas[485]=initlojas[485]+1; else if(nLinha==seqSize-1)endlojas[485]=endlojas[485]+1;break;
				case 492:	writer.write("UNDERWEAR                    "); writeraux.write("UNDERWEAR                    \n"); lojas[492]=lojas[492]+1; if(nLinha==0)initlojas[492]=initlojas[492]+1; else if(nLinha==seqSize-1)endlojas[492]=endlojas[492]+1;break;
				case 307:	writer.write("VARIOUS DECORATIONS OBJECTS  "); writeraux.write("VARIOUS DECORATIONS OBJECTS  \n"); lojas[307]=lojas[307]+1; if(nLinha==0)initlojas[307]=initlojas[307]+1; else if(nLinha==seqSize-1)endlojas[307]=endlojas[307]+1;break;
				case 524: 	writer.write("VARIOUS DECORATIONS OBJECTS  "); writeraux.write("VARIOUS DECORATIONS OBJECTS  \n"); lojas[524]=lojas[524]+1; if(nLinha==0)initlojas[524]=initlojas[524]+1; else if(nLinha==seqSize-1)endlojas[524]=endlojas[524]+1;break;
				case 1:     writer.write("s ");                             writeraux.write("s \n");                           lojas[1]=lojas[1]+1; if(nLinha==0)initlojas[1]=initlojas[1]+1; else if(nLinha==seqSize-1)endlojas[1]=endlojas[1]+1;break;
				case 2:     writer.write("m ");                             writeraux.write("m \n");                           lojas[2]=lojas[2]+1; if(nLinha==0)initlojas[2]=initlojas[2]+1; else if(nLinha==seqSize-1)endlojas[2]=endlojas[2]+1;break;
				case 3:     writer.write("l ");                             writeraux.write("l \n");                           lojas[3]=lojas[3]+1; if(nLinha==0)initlojas[3]=initlojas[3]+1; else if(nLinha==seqSize-1)endlojas[3]=endlojas[3]+1;break;
				case -1: writer.write("-1 ");writeraux.write("-1 "); elemCounter[aux]=elemCounter[aux]+1;break;
				default: 
                         break;
			}
				nLinha++;
			}
				//Acaba sequência
			elemCounter[aux]=elemCounter[aux]+1;
				writer.write("\n");
				writeraux.write("par\n");

		}  
		//Descobre as 10 lojas mais presentes em sequências, no início e no fim
		int largest[][] = top10Stores(lojas);
		int initials[][] = top10Stores(initlojas);
		
		line = null;
		int categories[][] = new int[52][3];
		int categoriesAux[] = new int[52];
		writeraux.close();         

		boolean novaLinha = false;

		//Encontra frequências de tipos de loja
		while((line = brAux.readLine()) != null) {
			//Separar valores de cada linha
				switch (line) {
				case "par": novaLinha = true; writeraux2.write("\n"); break;
				case "BANKS / FINANCIAL AGENTS     ": writeraux2.write("1 ");	if(categories[1 ][0]==0){categories[1][1]= categories[1][1]+1;  categories[1 ][0]=1;} categories[1 ][2]=categories[1 ][2]+1; break;
				case "BIJOUTERIE                   ": writeraux2.write("2 ");	if(categories[2 ][0]==0){categories[2][1]= categories[2][1]+1;  categories[2 ][0]=1;} categories[2 ][2]=categories[2 ][2]+1; break;
				case "BOOK STORE                   ": writeraux2.write("3 ");	if(categories[3 ][0]==0){categories[3][1]= categories[3][1]+1;  categories[3 ][0]=1;} categories[3 ][2]=categories[3 ][2]+1; break;
				case "CHILDREN'S WEAR              ": writeraux2.write("4 ");	if(categories[4 ][0]==0){categories[4][1]= categories[4][1]+1;  categories[4 ][0]=1;} categories[4 ][2]=categories[4 ][2]+1; break;
				case "CHINA & GLASSWARE            ": writeraux2.write("5 ");	if(categories[5 ][0]==0){categories[5][1]= categories[5][1]+1;  categories[5 ][0]=1;} categories[5 ][2]=categories[5 ][2]+1; break;
				case "CINEMAS                      ": writeraux2.write("6 ");	if(categories[6 ][0]==0){categories[6][1]= categories[6][1]+1;  categories[6 ][0]=1;} categories[6 ][2]=categories[6 ][2]+1; break;
				case "CLOTHING IN GENERAL          ": writeraux2.write("7 ");	if(categories[7 ][0]==0){categories[7][1]= categories[7][1]+1;  categories[7 ][0]=1;} categories[7 ][2]=categories[7 ][2]+1; break;
				case "CLOTHING REPAIR              ": writeraux2.write("8 ");	if(categories[8 ][0]==0){categories[8][1]= categories[8][1]+1;  categories[8 ][0]=1;} categories[8 ][2]=categories[8 ][2]+1; break;
				case "COMMUNICATIONS               ": writeraux2.write("9 ");	if(categories[9 ][0]==0){categories[9][1]= categories[9][1]+1;  categories[9 ][0]=1;} categories[9 ][2]=categories[9 ][2]+1; break;
				case "COMPUTER SOFTWARE & HARDWARE ": writeraux2.write("10 ");	if(categories[10][0]==0){categories[10][1]=categories[10][1]+1; categories[10][0]=1;} categories[10][2]=categories[10][2]+1;  break;
				case "CRÆ’CHE FACILITIES           ": writeraux2.write("11 ");	if(categories[11][0]==0){categories[11][1]=categories[11][1]+1; categories[11][0]=1;} categories[11][2]=categories[11][2]+1;  break;
				case "DOORS, WARDROBES, AND SAFETY ": writeraux2.write("12 ");	if(categories[12][0]==0){categories[12][1]=categories[12][1]+1; categories[12][0]=1;} categories[12][2]=categories[12][2]+1;  break;
				case "EQUIPMENT FOR ADVENTURE      ": writeraux2.write("13 ");	if(categories[13][0]==0){categories[13][1]=categories[13][1]+1; categories[13][0]=1;} categories[13][2]=categories[13][2]+1;  break;
				case "FLOWERS AND PLANTS           ": writeraux2.write("14 ");	if(categories[14][0]==0){categories[14][1]=categories[14][1]+1; categories[14][0]=1;} categories[14][2]=categories[14][2]+1;  break;
				case "GIFTS                        ": writeraux2.write("15 ");	if(categories[15][0]==0){categories[15][1]=categories[15][1]+1; categories[15][0]=1;} categories[15][2]=categories[15][2]+1;  break;
				case "HAIRDRESSER                  ": writeraux2.write("16 ");	if(categories[16][0]==0){categories[16][1]=categories[16][1]+1; categories[16][0]=1;} categories[16][2]=categories[16][2]+1;  break;
				case "HAIRDRESSING ARTICLES        ": writeraux2.write("17 ");	if(categories[17][0]==0){categories[17][1]=categories[17][1]+1; categories[17][0]=1;} categories[17][2]=categories[17][2]+1;  break;
				case "HOUSEHOLD ELECTRICAL APPLIANC": writeraux2.write("18 ");	if(categories[18][0]==0){categories[18][1]=categories[18][1]+1; categories[18][0]=1;} categories[18][2]=categories[18][2]+1;  break;
				case "JEANS AND CASUAL WEAR        ": writeraux2.write("19 ");	if(categories[19][0]==0){categories[19][1]=categories[19][1]+1; categories[19][0]=1;} categories[19][2]=categories[19][2]+1;  break;
				case "JEWELERY & ACCESSORIES       ": writeraux2.write("20 ");	if(categories[20][0]==0){categories[20][1]=categories[20][1]+1; categories[20][0]=1;} categories[20][2]=categories[20][2]+1;  break;
				case "LADIESWEAR                   ": writeraux2.write("21 ");	if(categories[21][0]==0){categories[21][1]=categories[21][1]+1; categories[21][0]=1;} categories[21][2]=categories[21][2]+1;  break;
				case "LEATHER GOODS / ACCESSORIES  ": writeraux2.write("22 ");	if(categories[22][0]==0){categories[22][1]=categories[22][1]+1; categories[22][0]=1;} categories[22][2]=categories[22][2]+1;  break;
				case "MATRESS                      ": writeraux2.write("23 ");	if(categories[23][0]==0){categories[23][1]=categories[23][1]+1; categories[23][0]=1;} categories[23][2]=categories[23][2]+1;  break;
				case "MEN SHIRTS AND TIES          ": writeraux2.write("24 ");	if(categories[24][0]==0){categories[24][1]=categories[24][1]+1; categories[24][0]=1;} categories[24][2]=categories[24][2]+1;  break;
				case "MENAGE ARTICLES AND UTENSILS ": writeraux2.write("25 ");	if(categories[25][0]==0){categories[25][1]=categories[25][1]+1; categories[25][0]=1;} categories[25][2]=categories[25][2]+1;  break;
				case "MENSWEAR                     ": writeraux2.write("26 ");	if(categories[26][0]==0){categories[26][1]=categories[26][1]+1; categories[26][0]=1;} categories[26][2]=categories[26][2]+1;  break;
				case "MISCELLANEOUS                ": writeraux2.write("27 ");	if(categories[27][0]==0){categories[27][1]=categories[27][1]+1; categories[27][0]=1;} categories[27][2]=categories[27][2]+1;  break;
				case "N/D                          ": writeraux2.write("28 ");	if(categories[28][0]==0){categories[28][1]=categories[28][1]+1; categories[28][0]=1;} categories[28][2]=categories[28][2]+1;  break;
				case "NATURAL PERFUMERY            ": writeraux2.write("29 ");	if(categories[29][0]==0){categories[29][1]=categories[29][1]+1; categories[29][0]=1;} categories[29][2]=categories[29][2]+1;  break;
				case "OFFICIAL / STATE ORGANISMS   ": writeraux2.write("30 ");	if(categories[30][0]==0){categories[30][1]=categories[30][1]+1; categories[30][0]=1;} categories[30][2]=categories[30][2]+1;  break;
				case "OPTICIAN                     ": writeraux2.write("31 ");	if(categories[31][0]==0){categories[31][1]=categories[31][1]+1; categories[31][0]=1;} categories[31][2]=categories[31][2]+1;  break;
				case "PERFUMES / COSMETICS         ": writeraux2.write("32 ");	if(categories[32][0]==0){categories[32][1]=categories[32][1]+1; categories[32][0]=1;} categories[32][2]=categories[32][2]+1;  break;
				case "PHARMACY                     ": writeraux2.write("33 ");	if(categories[33][0]==0){categories[33][1]=categories[33][1]+1; categories[33][0]=1;} categories[33][2]=categories[33][2]+1;  break;
				case "PHOTOGRAPHY                  ": writeraux2.write("34 ");	if(categories[34][0]==0){categories[34][1]=categories[34][1]+1; categories[34][0]=1;} categories[34][2]=categories[34][2]+1;  break;
				case "POST OFFICE                  ": writeraux2.write("35 ");	if(categories[35][0]==0){categories[35][1]=categories[35][1]+1; categories[35][0]=1;} categories[35][2]=categories[35][2]+1;  break;
				case "SERVICES                     ": writeraux2.write("36 ");	if(categories[36][0]==0){categories[36][1]=categories[36][1]+1; categories[36][0]=1;} categories[36][2]=categories[36][2]+1;  break;
				case "SHOE REPAIRING               ": writeraux2.write("37 ");	if(categories[37][0]==0){categories[37][1]=categories[37][1]+1; categories[37][0]=1;} categories[37][2]=categories[37][2]+1;  break;
				case "SHOE STORE IN GENERAL        ": writeraux2.write("38 ");	if(categories[38][0]==0){categories[38][1]=categories[38][1]+1; categories[38][0]=1;} categories[38][2]=categories[38][2]+1;  break;
				case "SILVER & PLATINGS            ": writeraux2.write("39 ");	if(categories[39][0]==0){categories[39][1]=categories[39][1]+1; categories[39][0]=1;} categories[39][2]=categories[39][2]+1;  break;
				case "SPORTS GOODS IN GENERAL      ": writeraux2.write("40 ");	if(categories[40][0]==0){categories[40][1]=categories[40][1]+1; categories[40][0]=1;} categories[40][2]=categories[40][2]+1;  break;
				case "SPORTSWEAR / FOOTWEAR        ": writeraux2.write("41 ");	if(categories[41][0]==0){categories[41][1]=categories[41][1]+1; categories[41][0]=1;} categories[41][2]=categories[41][2]+1;  break;
				case "STATIONARY & CRAFT ARTICLES  ": writeraux2.write("42 ");	if(categories[42][0]==0){categories[42][1]=categories[42][1]+1; categories[42][0]=1;} categories[42][2]=categories[42][2]+1;  break;
				case "SUPERMARKET AND HIPERMARKET  ": writeraux2.write("43 ");	if(categories[43][0]==0){categories[43][1]=categories[43][1]+1; categories[43][0]=1;} categories[43][2]=categories[43][2]+1;  break;
				case "SWEETS AND CHOCOLATES        ": writeraux2.write("44 ");	if(categories[44][0]==0){categories[44][1]=categories[44][1]+1; categories[44][0]=1;} categories[44][2]=categories[44][2]+1;  break;
				case "TABACCO STORE                ": writeraux2.write("45 ");	if(categories[45][0]==0){categories[45][1]=categories[45][1]+1; categories[45][0]=1;} categories[45][2]=categories[45][2]+1;  break;
				case "TEA / COFFEE SHOP            ": writeraux2.write("46 ");	if(categories[46][0]==0){categories[46][1]=categories[46][1]+1; categories[46][0]=1;} categories[46][2]=categories[46][2]+1;  break;
				case "TEENAGERS WEAR               ": writeraux2.write("47 ");	if(categories[47][0]==0){categories[47][1]=categories[47][1]+1; categories[47][0]=1;} categories[47][2]=categories[47][2]+1;  break;
				case "TOYS IN GENERAL              ": writeraux2.write("48 ");	if(categories[48][0]==0){categories[48][1]=categories[48][1]+1; categories[48][0]=1;} categories[48][2]=categories[48][2]+1;  break;
				case "TRAVEL AGENCIES              ": writeraux2.write("49 ");	if(categories[49][0]==0){categories[49][1]=categories[49][1]+1; categories[49][0]=1;} categories[49][2]=categories[49][2]+1;  break;
				case "UNDERWEAR                    ": writeraux2.write("50 ");	if(categories[50][0]==0){categories[50][1]=categories[50][1]+1; categories[50][0]=1;} categories[50][2]=categories[50][2]+1;  break;
				case "VARIOUS DECORATIONS OBJECTS  ": writeraux2.write("51 ");	if(categories[51][0]==0){categories[51][1]=categories[51][1]+1; categories[51][0]=1;} categories[51][2]=categories[51][2]+1;  break;
	            default: System.out.print("------- ");break;
			}
			if(novaLinha){
				//Reinicia a contagem para o o proximo loop
				for(int i = 0; i< categories.length ; i++){
					categories[i][0]=0;
				}
				novaLinha=false;
			}
			
		} 
		
		writeraux2.close(); 
		
		for(int i = 0; i< categories.length ; i++){
			categoriesAux[i]=categories[i][1];
		}
		
		int topcategories[][] = top10Stores(categoriesAux);
		
		writer.write("\n\n#Estatísticas Gerais\n");
		System.out.println("\n#Estatísticas Gerais");
		writer.write("Número de Sequências: " + nSeq + "\n");
		System.out.println("Número de Sequências: " + nSeq);
		System.out.println("Ficheiro de Entrada: " + inputFileName);
		writer.write("Ficheiro de Entrada: " + inputFileName + "\n");
		System.out.println("Ficheiro de Saída: " + outputFileName);
		writer.write("Ficheiro de Saída: " + outputFileName + "\n");
		
        writer.write("\n\n#Elementos que aparecem mais freqentemente\n");
		System.out.println("\n#Elementos que aparecem mais freqentemente");
		for(int i=0 ; i<=9;i++){
			writer.write("loja " +largest[i][0] + " - " + largest[i][1] + " vezes - " + (largest[i][1]*100/nSeq) + "%\n");
			System.out.println("loja " +largest[i][0] + " - " + largest[i][1] + " vezes - " + (largest[i][1]*100/nSeq) + "%");	
		}
		
        writer.write("\n\n#Elementos que aparecem mais vezes no início\n");
		System.out.println("\n#Elementos que aparecem mais vezes no início");
		for(int i=0 ; i<=4;i++){
			writer.write(initials[i][1] + "x: " + initials[i][0] + " ... - " + (initials[i][1]*100/nSeq) + "%\n");
			System.out.println(initials[i][1] + "x: " + initials[i][0] + " ... - " + (initials[i][1]*100/nSeq) + "%");	
		}
		
		
		writer.write("\n\n#Categorias mais frequentes\n");
		System.out.println("\n#Categorias mais frequentes");
		for(int i=0 ; i<=4;i++){
			writer.write(topcategories[i][1] + "x: Categoria " + giveCategory(topcategories[i][0]) + " - " + (topcategories[i][1]*100/nSeq) + "%\n");
			System.out.println(topcategories[i][1] + "x: Categoria " + giveCategory(topcategories[i][0]) + " - " + (topcategories[i][1]*100/nSeq) + "%");	
		}
		
		
		
		// Always close files.
		writer.close();  
		
		// Apaga conteúdo do ficheiro auxiliar.txt
		File file = new File("src/inputMovvo/auxiliar.txt");
		PrintWriter writer1 = new PrintWriter(file);
		writer1.print("");
		writer1.close();
		
		// Apaga conteúdo do ficheiro auxiliar2.txt
		File file2 = new File("src/inputMovvo/auxiliar2.txt");
		PrintWriter writer2 = new PrintWriter(file2);
		writer2.print("");
		writer2.close();

	}

	private static String giveCategory(int catNumber) {
		String category = null;
		switch(catNumber){
		case 1: category="BANKS / FINANCIAL AGENTS     ";  break;
		case 2: category="BIJOUTERIE                   ";  break;
		case 3: category="BOOK STORE                   ";  break;
		case 4: category="CHILDREN'S WEAR              ";  break;
		case 5: category="CHINA & GLASSWARE            ";  break;
		case 6: category="CINEMAS                      ";  break;
		case 7: category="CLOTHING IN GENERAL          ";  break;
		case 8: category="CLOTHING REPAIR              ";  break;
		case 9: category="COMMUNICATIONS               ";  break;
		case 10: category="COMPUTER SOFTWARE & HARDWARE "; break;
		case 11: category="CRÆ’CHE FACILITIES           "; break;
		case 12: category="DOORS, WARDROBES, AND SAFETY "; break;
		case 13: category="EQUIPMENT FOR ADVENTURE      "; break;
		case 14: category="FLOWERS AND PLANTS           "; break;
		case 15: category="GIFTS                        "; break;
		case 16: category="HAIRDRESSER                  "; break;
		case 17: category="HAIRDRESSING ARTICLES        "; break;
		case 18: category="HOUSEHOLD ELECTRICAL APPLIANC"; break;
		case 19: category="JEANS AND CASUAL WEAR        "; break;
		case 20: category="JEWELERY & ACCESSORIES       "; break;
		case 21: category="LADIESWEAR                   "; break;
		case 22: category="LEATHER GOODS / ACCESSORIES  "; break;
		case 23: category="MATRESS                      "; break;
		case 24: category="MEN SHIRTS AND TIES          "; break;
		case 25: category="MENAGE ARTICLES AND UTENSILS "; break;
		case 26: category="MENSWEAR                     "; break;
		case 27: category="MISCELLANEOUS                "; break;
		case 28: category="N/D                          "; break;
		case 29: category="NATURAL PERFUMERY            "; break;
		case 30: category="OFFICIAL / STATE ORGANISMS   "; break;
		case 31: category="OPTICIAN                     "; break;
		case 32: category="PERFUMES / COSMETICS         "; break;
		case 33: category="PHARMACY                     "; break;
		case 34: category="PHOTOGRAPHY                  "; break;
		case 35: category="POST OFFICE                  "; break;
		case 36: category="SERVICES                     "; break;
		case 37: category="SHOE REPAIRING               "; break;
		case 38: category="SHOE STORE IN GENERAL        "; break;
		case 39: category="SILVER & PLATINGS            "; break;
		case 40: category="SPORTS GOODS IN GENERAL      "; break;
		case 41: category="SPORTSWEAR / FOOTWEAR        "; break;
		case 42: category="STATIONARY & CRAFT ARTICLES  "; break;
		case 43: category="SUPERMARKET AND HIPERMARKET  "; break;
		case 44: category="SWEETS AND CHOCOLATES        "; break;
		case 45: category="TABACCO STORE                "; break;
		case 46: category="TEA / COFFEE SHOP            "; break;
		case 47: category="TEENAGERS WEAR               "; break;
		case 48: category="TOYS IN GENERAL              "; break;
		case 49: category="TRAVEL AGENCIES              "; break;
		case 50: category="UNDERWEAR                    "; break;
		case 51: category="VARIOUS DECORATIONS OBJECTS  "; break;
		default: System.out.print("------- ");break;
		}
		return category;
	}

	private static int[][] top10Stores(int[] lojas) {
		int largest[][] = new int[10][2];;
		largest[9][0]= 0;largest[9][1]= 0;
		largest[8][0]= 0;largest[8][1]= 0;
		largest[7][0]= 0;largest[7][1]= 0;
		largest[6][0]= 0;largest[6][1]= 0;
		largest[5][0]= 0;largest[5][1]= 0;
		largest[4][0]= 0;largest[4][1]= 0;
		largest[3][0]= 0;largest[3][1]= 0;
		largest[2][0]= 0;largest[2][1]= 0;
    	largest[1][0]= 0;largest[1][1]= 0;
    	largest[0][0]= 0;largest[0][1]= 0;

		
        for(int i =0;i<lojas.length;i++) {
            if(lojas[i] >= largest[0][1]) {
            	largest[9][0]= largest[8][0];largest[9][1]= largest[8][1];
            	largest[8][0]= largest[7][0];largest[8][1]= largest[7][1];
            	largest[7][0]= largest[6][0];largest[7][1]= largest[6][1];
            	largest[6][0]= largest[5][0];largest[6][1]= largest[5][1];
            	largest[5][0]= largest[4][0];largest[5][1]= largest[4][1];
            	largest[4][0]= largest[3][0];largest[4][1]= largest[3][1];
            	largest[3][0]= largest[2][0];largest[3][1]= largest[2][1];
            	largest[2][0]= largest[1][0];largest[2][1]= largest[1][1];
            	largest[1][0]= largest[0][0];largest[1][1]= largest[0][1];
            	largest[0][0]= i;
            	largest[0][1]= lojas[i];

            }
            else if(lojas[i] >= largest[1][1]) {
            	largest[9][0]= largest[8][0];largest[9][1]= largest[8][1];
            	largest[8][0]= largest[7][0];largest[8][1]= largest[7][1];
            	largest[7][0]= largest[6][0];largest[7][1]= largest[6][1];
            	largest[6][0]= largest[5][0];largest[6][1]= largest[5][1];
            	largest[5][0]= largest[4][0];largest[5][1]= largest[4][1];
            	largest[4][0]= largest[3][0];largest[4][1]= largest[3][1];
            	largest[3][0]= largest[2][0];largest[3][1]= largest[2][1];
            	largest[2][0]= largest[1][0];largest[2][1]= largest[1][1];
            	largest[1][0]= i;
            	largest[1][1]= lojas[i];

            }
            else if(lojas[i] >= largest[2][1]) {
            	largest[9][0]= largest[8][0];largest[9][1]= largest[8][1];
            	largest[8][0]= largest[7][0];largest[8][1]= largest[7][1];
            	largest[7][0]= largest[6][0];largest[7][1]= largest[6][1];
            	largest[6][0]= largest[5][0];largest[6][1]= largest[5][1];
            	largest[5][0]= largest[4][0];largest[5][1]= largest[4][1];
            	largest[4][0]= largest[3][0];largest[4][1]= largest[3][1];
            	largest[3][0]= largest[2][0];largest[3][1]= largest[2][1];
            	largest[2][0]= i;
            	largest[2][1]= lojas[i];

            }
            else if(lojas[i] >= largest[3][1]) {
            	largest[9][0]= largest[8][0];largest[9][1]= largest[8][1];
            	largest[8][0]= largest[7][0];largest[8][1]= largest[7][1];
            	largest[7][0]= largest[6][0];largest[7][1]= largest[6][1];
            	largest[6][0]= largest[5][0];largest[6][1]= largest[5][1];
            	largest[5][0]= largest[4][0];largest[5][1]= largest[4][1];
            	largest[4][0]= largest[3][0];largest[4][1]= largest[3][1];
            	largest[3][0]= i;
            	largest[3][1]= lojas[i];

            }
            else if(lojas[i] >= largest[4][1]) {
            	largest[9][0]= largest[8][0];largest[9][1]= largest[8][1];
            	largest[8][0]= largest[7][0];largest[8][1]= largest[7][1];
            	largest[7][0]= largest[6][0];largest[7][1]= largest[6][1];
            	largest[6][0]= largest[5][0];largest[6][1]= largest[5][1];
            	largest[5][0]= largest[4][0];largest[5][1]= largest[4][1];
            	largest[4][0]= i;
            	largest[4][1]= lojas[i];

            }
            else if(lojas[i] >= largest[5][1]) {
            	largest[9][0]= largest[8][0];largest[9][1]= largest[8][1];
            	largest[8][0]= largest[7][0];largest[8][1]= largest[7][1];
            	largest[7][0]= largest[6][0];largest[7][1]= largest[6][1];
            	largest[6][0]= largest[5][0];largest[6][1]= largest[5][1];
            	largest[5][0]= i;
            	largest[5][1]= lojas[i];

            }
            else if(lojas[i] >= largest[6][1]) {
            	largest[9][0]= largest[8][0];largest[9][1]= largest[8][1];
            	largest[8][0]= largest[7][0];largest[8][1]= largest[7][1];
            	largest[7][0]= largest[6][0];largest[7][1]= largest[6][1];
            	largest[6][0]= i;
            	largest[6][1]= lojas[i];

            }
            else if(lojas[i] >= largest[7][1]) {
            	largest[9][0]= largest[8][0];largest[9][1]= largest[8][1];
            	largest[8][0]= largest[7][0];largest[8][1]= largest[7][1];
            	largest[7][0]= i;
            	largest[7][1]= lojas[i];

            }
            else if(lojas[i] >= largest[8][1]) {
            	largest[9][0]= largest[8][0];largest[9][1]= largest[8][1];
            	largest[8][0]= i;
            	largest[8][1]= lojas[i];

            }
            else if(lojas[i] >= largest[9][1]) {
            	largest[9][0]= i;
            	largest[9][1]= lojas[i];

            }
        }
		return largest;
	}
	
}
	

