package StoreNumberToCategory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Arrays;

//WARNING: Alterar valor com a #alterar nos comentários dependendo do tamanho das sequências. Apenas devem ser corridos ficheiros com sequências do mesmo tamanho
public class Converter {
	private static BufferedWriter bw;

	@SuppressWarnings("null")
	public static void main(String [] args) throws IOException {

		// The name of the file to open.
		String fileName = "src/input/durationSeq2.txt";		//#alterar o nome do ficheiro de entrada

		// This will reference one line at a time
		String line = null;

		// FileReader reads text files in the default encoding.
		FileReader fileReader = 
				new FileReader(fileName);

		// Always wrap FileReader in BufredReader.
		Reader reader = new InputStreamReader(new FileInputStream(fileName), "utf-8");
		BufferedReader br = new BufferedReader(reader);
		//#alterar o nome do ficheiro de saída
		FileWriter writer = new FileWriter("src/output/outputDuracao2.txt", true);
		
		writer.write("#Substituição de nº loja pela categoria\n");
		int lojas[] = new int[1289];
		int initlojas[] = new int[1289];
		int endlojas[] = new int[1289];
		int nSeq=0;
		int seqSize = 2;			//#alterar dependendo do tamanho da sequência
		int nLinha=0;//Controlar a verificação de elementos na primeira linha das sequências
		while((line = br.readLine()) != null) {
			//Separar dois valores de cada linha
			nSeq++;
			String[] splited = line.split("\\s+");
			nLinha=0;
			//NOTA: LOJA 1288 = 301 e LOJA 1175 = 300, NO DURATION É NECESSÁRIO SUBSTITUIR ESTAS LOJAS PARA FUNCIONAR
			for (int i = 0; i < splited.length; i++) {

				int store = Integer.parseInt(splited[i].substring(0,3)); //#alterar adicionar .substring(0,2) quando é para a duração
				switch (store) {
				case 329:	writer.write("BANKS / FINANCIAL AGENTS     "); lojas[329]=lojas[329]+1; if(nLinha==0)initlojas[329]=initlojas[329]+1; else if(nLinha==seqSize-1)endlojas[329]=endlojas[329]+1;break;
				case 330:	writer.write("BANKS / FINANCIAL AGENTS     "); lojas[330]=lojas[330]+1; if(nLinha==0)initlojas[330]=initlojas[330]+1; else if(nLinha==seqSize-1)endlojas[330]=endlojas[330]+1;break;
				case 426:	writer.write("BANKS / FINANCIAL AGENTS     "); lojas[426]=lojas[426]+1; if(nLinha==0)initlojas[426]=initlojas[426]+1; else if(nLinha==seqSize-1)endlojas[426]=endlojas[426]+1;break;
				case 306:	writer.write("BIJOUTERIE                   "); lojas[306]=lojas[306]+1; if(nLinha==0)initlojas[306]=initlojas[306]+1; else if(nLinha==seqSize-1)endlojas[306]=endlojas[306]+1;break;
				case 309:	writer.write("BIJOUTERIE                   "); lojas[309]=lojas[309]+1; if(nLinha==0)initlojas[309]=initlojas[309]+1; else if(nLinha==seqSize-1)endlojas[309]=endlojas[309]+1;break;
				case 380:	writer.write("BIJOUTERIE                   "); lojas[380]=lojas[380]+1; if(nLinha==0)initlojas[380]=initlojas[380]+1; else if(nLinha==seqSize-1)endlojas[380]=endlojas[380]+1;break;
				case 381:	writer.write("BIJOUTERIE                   "); lojas[381]=lojas[381]+1; if(nLinha==0)initlojas[381]=initlojas[381]+1; else if(nLinha==seqSize-1)endlojas[381]=endlojas[381]+1;break;
				case 392:	writer.write("BIJOUTERIE                   "); lojas[392]=lojas[392]+1; if(nLinha==0)initlojas[392]=initlojas[392]+1; else if(nLinha==seqSize-1)endlojas[392]=endlojas[392]+1;break;
				case 400:	writer.write("BIJOUTERIE                   "); lojas[400]=lojas[400]+1; if(nLinha==0)initlojas[400]=initlojas[400]+1; else if(nLinha==seqSize-1)endlojas[400]=endlojas[400]+1;break;
				case 497:	writer.write("BIJOUTERIE                   "); lojas[497]=lojas[497]+1; if(nLinha==0)initlojas[497]=initlojas[497]+1; else if(nLinha==seqSize-1)endlojas[497]=endlojas[497]+1;break;
				case 511:	writer.write("BIJOUTERIE                   "); lojas[511]=lojas[511]+1; if(nLinha==0)initlojas[511]=initlojas[511]+1; else if(nLinha==seqSize-1)endlojas[511]=endlojas[511]+1;break;
				case 311:	writer.write("BOOK STORE                   "); lojas[311]=lojas[311]+1; if(nLinha==0)initlojas[311]=initlojas[311]+1; else if(nLinha==seqSize-1)endlojas[311]=endlojas[311]+1;break;
				case 335:	writer.write("CHILDREN'S WEAR              "); lojas[335]=lojas[335]+1; if(nLinha==0)initlojas[335]=initlojas[335]+1; else if(nLinha==seqSize-1)endlojas[335]=endlojas[335]+1;break;
				case 340:	writer.write("CHILDREN'S WEAR              "); lojas[340]=lojas[340]+1; if(nLinha==0)initlojas[340]=initlojas[340]+1; else if(nLinha==seqSize-1)endlojas[340]=endlojas[340]+1;break;
				case 343:	writer.write("CHILDREN'S WEAR              "); lojas[343]=lojas[343]+1; if(nLinha==0)initlojas[343]=initlojas[343]+1; else if(nLinha==seqSize-1)endlojas[343]=endlojas[343]+1;break;
				case 344:	writer.write("CHILDREN'S WEAR              "); lojas[344]=lojas[344]+1; if(nLinha==0)initlojas[344]=initlojas[344]+1; else if(nLinha==seqSize-1)endlojas[344]=endlojas[344]+1;break;
				case 346:	writer.write("CHILDREN'S WEAR              "); lojas[346]=lojas[346]+1; if(nLinha==0)initlojas[346]=initlojas[346]+1; else if(nLinha==seqSize-1)endlojas[346]=endlojas[346]+1;break;
				case 347:	writer.write("CHILDREN'S WEAR              "); lojas[347]=lojas[347]+1; if(nLinha==0)initlojas[347]=initlojas[347]+1; else if(nLinha==seqSize-1)endlojas[347]=endlojas[347]+1;break;
				case 348:	writer.write("CHILDREN'S WEAR              "); lojas[348]=lojas[348]+1; if(nLinha==0)initlojas[348]=initlojas[348]+1; else if(nLinha==seqSize-1)endlojas[348]=endlojas[348]+1;break;
				case 349:	writer.write("CHILDREN'S WEAR              "); lojas[349]=lojas[349]+1; if(nLinha==0)initlojas[349]=initlojas[349]+1; else if(nLinha==seqSize-1)endlojas[349]=endlojas[349]+1;break;
				case 350:	writer.write("CHILDREN'S WEAR              "); lojas[350]=lojas[350]+1; if(nLinha==0)initlojas[350]=initlojas[350]+1; else if(nLinha==seqSize-1)endlojas[350]=endlojas[350]+1;break;
				case 351:	writer.write("CHILDREN'S WEAR              "); lojas[351]=lojas[351]+1; if(nLinha==0)initlojas[351]=initlojas[351]+1; else if(nLinha==seqSize-1)endlojas[351]=endlojas[351]+1;break;
				case 352:	writer.write("CHILDREN'S WEAR              "); lojas[352]=lojas[352]+1; if(nLinha==0)initlojas[352]=initlojas[352]+1; else if(nLinha==seqSize-1)endlojas[352]=endlojas[352]+1;break;
				case 353:	writer.write("CHILDREN'S WEAR              "); lojas[353]=lojas[353]+1; if(nLinha==0)initlojas[353]=initlojas[353]+1; else if(nLinha==seqSize-1)endlojas[353]=endlojas[353]+1;break;
				case 355:	writer.write("CHILDREN'S WEAR              "); lojas[355]=lojas[355]+1; if(nLinha==0)initlojas[355]=initlojas[355]+1; else if(nLinha==seqSize-1)endlojas[355]=endlojas[355]+1;break;
				case 525:	writer.write("CHILDREN'S WEAR              "); lojas[525]=lojas[525]+1; if(nLinha==0)initlojas[525]=initlojas[525]+1; else if(nLinha==seqSize-1)endlojas[525]=endlojas[525]+1;break;
				case 397:	writer.write("CHINA & GLASSWARE            "); lojas[397]=lojas[397]+1; if(nLinha==0)initlojas[397]=initlojas[397]+1; else if(nLinha==seqSize-1)endlojas[397]=endlojas[397]+1;break;
				case 398:	writer.write("CHINA & GLASSWARE            "); lojas[398]=lojas[398]+1; if(nLinha==0)initlojas[398]=initlojas[398]+1; else if(nLinha==seqSize-1)endlojas[398]=endlojas[398]+1;break;
				case 404:	writer.write("CHINA & GLASSWARE            "); lojas[404]=lojas[404]+1; if(nLinha==0)initlojas[404]=initlojas[404]+1; else if(nLinha==seqSize-1)endlojas[404]=endlojas[404]+1;break;
				case 526:	writer.write("CINEMAS                      "); lojas[526]=lojas[526]+1; if(nLinha==0)initlojas[526]=initlojas[526]+1; else if(nLinha==seqSize-1)endlojas[526]=endlojas[526]+1;break;
				case 331:	writer.write("CLOTHING IN GENERAL          "); lojas[331]=lojas[331]+1; if(nLinha==0)initlojas[331]=initlojas[331]+1; else if(nLinha==seqSize-1)endlojas[331]=endlojas[331]+1;break;
				case 342:	writer.write("CLOTHING IN GENERAL          "); lojas[342]=lojas[342]+1; if(nLinha==0)initlojas[342]=initlojas[342]+1; else if(nLinha==seqSize-1)endlojas[342]=endlojas[342]+1;break;
				case 345:	writer.write("CLOTHING IN GENERAL          "); lojas[345]=lojas[345]+1; if(nLinha==0)initlojas[345]=initlojas[345]+1; else if(nLinha==seqSize-1)endlojas[345]=endlojas[345]+1;break;
				case 361:	writer.write("CLOTHING IN GENERAL          "); lojas[361]=lojas[361]+1; if(nLinha==0)initlojas[361]=initlojas[361]+1; else if(nLinha==seqSize-1)endlojas[361]=endlojas[361]+1;break;
				case 406:	writer.write("CLOTHING IN GENERAL          "); lojas[406]=lojas[406]+1; if(nLinha==0)initlojas[406]=initlojas[406]+1; else if(nLinha==seqSize-1)endlojas[406]=endlojas[406]+1;break;
				case 458:	writer.write("CLOTHING IN GENERAL          "); lojas[458]=lojas[458]+1; if(nLinha==0)initlojas[458]=initlojas[458]+1; else if(nLinha==seqSize-1)endlojas[458]=endlojas[458]+1;break;
				case 467:	writer.write("CLOTHING IN GENERAL          "); lojas[467]=lojas[467]+1; if(nLinha==0)initlojas[467]=initlojas[467]+1; else if(nLinha==seqSize-1)endlojas[467]=endlojas[467]+1;break;
				case 475:	writer.write("CLOTHING IN GENERAL          "); lojas[475]=lojas[475]+1; if(nLinha==0)initlojas[475]=initlojas[475]+1; else if(nLinha==seqSize-1)endlojas[475]=endlojas[475]+1;break;
				case 481:	writer.write("CLOTHING IN GENERAL          "); lojas[481]=lojas[481]+1; if(nLinha==0)initlojas[481]=initlojas[481]+1; else if(nLinha==seqSize-1)endlojas[481]=endlojas[481]+1;break;
				case 491:	writer.write("CLOTHING IN GENERAL          "); lojas[491]=lojas[491]+1; if(nLinha==0)initlojas[491]=initlojas[491]+1; else if(nLinha==seqSize-1)endlojas[491]=endlojas[491]+1;break;
				case 495:	writer.write("CLOTHING IN GENERAL          "); lojas[495]=lojas[495]+1; if(nLinha==0)initlojas[495]=initlojas[495]+1; else if(nLinha==seqSize-1)endlojas[495]=endlojas[495]+1;break;
				case 501:	writer.write("CLOTHING IN GENERAL          "); lojas[501]=lojas[501]+1; if(nLinha==0)initlojas[501]=initlojas[501]+1; else if(nLinha==seqSize-1)endlojas[501]=endlojas[501]+1;break;
				case 506:	writer.write("CLOTHING IN GENERAL          "); lojas[506]=lojas[506]+1; if(nLinha==0)initlojas[506]=initlojas[506]+1; else if(nLinha==seqSize-1)endlojas[506]=endlojas[506]+1;break;
				case 507:	writer.write("CLOTHING IN GENERAL          "); lojas[507]=lojas[507]+1; if(nLinha==0)initlojas[507]=initlojas[507]+1; else if(nLinha==seqSize-1)endlojas[507]=endlojas[507]+1;break;
				case 514:	writer.write("CLOTHING IN GENERAL          "); lojas[514]=lojas[514]+1; if(nLinha==0)initlojas[514]=initlojas[514]+1; else if(nLinha==seqSize-1)endlojas[514]=endlojas[514]+1;break;
				case 520:	writer.write("CLOTHING IN GENERAL          "); lojas[520]=lojas[520]+1; if(nLinha==0)initlojas[520]=initlojas[520]+1; else if(nLinha==seqSize-1)endlojas[520]=endlojas[520]+1;break;
				case 530:	writer.write("CLOTHING IN GENERAL          "); lojas[530]=lojas[530]+1; if(nLinha==0)initlojas[530]=initlojas[530]+1; else if(nLinha==seqSize-1)endlojas[530]=endlojas[530]+1;break;
				case 532:	writer.write("CLOTHING IN GENERAL          "); lojas[532]=lojas[532]+1; if(nLinha==0)initlojas[532]=initlojas[532]+1; else if(nLinha==seqSize-1)endlojas[532]=endlojas[532]+1;break;
				case 536:	writer.write("CLOTHING IN GENERAL          "); lojas[536]=lojas[536]+1; if(nLinha==0)initlojas[536]=initlojas[536]+1; else if(nLinha==seqSize-1)endlojas[536]=endlojas[536]+1;break;
				case 1175:  writer.write("CLOTHING IN GENERAL          "); lojas[1175]=lojas[1175]+1; if(nLinha==0)initlojas[1175]=initlojas[1175]+1; else if(nLinha==seqSize-1)endlojas[1175]=endlojas[1175]+1;break;
				case 300:  writer.write("CLOTHING IN GENERAL          "); lojas[1175]=lojas[1175]+1; if(nLinha==0)initlojas[1175]=initlojas[1175]+1; else if(nLinha==seqSize-1)endlojas[1175]=endlojas[1175]+1;break;
				case 418:	writer.write("CLOTHING REPAIR              "); lojas[418]=lojas[418]+1; if(nLinha==0)initlojas[418]=initlojas[418]+1; else if(nLinha==seqSize-1)endlojas[418]=endlojas[418]+1;break;
				case 310:	writer.write("COMMUNICATIONS               "); lojas[310]=lojas[310]+1; if(nLinha==0)initlojas[310]=initlojas[310]+1; else if(nLinha==seqSize-1)endlojas[310]=endlojas[310]+1;break;
				case 315:	writer.write("COMMUNICATIONS               "); lojas[315]=lojas[315]+1; if(nLinha==0)initlojas[315]=initlojas[315]+1; else if(nLinha==seqSize-1)endlojas[315]=endlojas[315]+1;break;
				case 317:	writer.write("COMMUNICATIONS               "); lojas[317]=lojas[317]+1; if(nLinha==0)initlojas[317]=initlojas[317]+1; else if(nLinha==seqSize-1)endlojas[317]=endlojas[317]+1;break;
				case 320:	writer.write("COMMUNICATIONS               "); lojas[320]=lojas[320]+1; if(nLinha==0)initlojas[320]=initlojas[320]+1; else if(nLinha==seqSize-1)endlojas[320]=endlojas[320]+1;break;
				case 415:	writer.write("COMMUNICATIONS               "); lojas[415]=lojas[415]+1; if(nLinha==0)initlojas[415]=initlojas[415]+1; else if(nLinha==seqSize-1)endlojas[415]=endlojas[415]+1;break;
				case 425:	writer.write("COMMUNICATIONS               "); lojas[425]=lojas[425]+1; if(nLinha==0)initlojas[425]=initlojas[425]+1; else if(nLinha==seqSize-1)endlojas[425]=endlojas[425]+1;break;
				case 327:	writer.write("COMPUTER SOFTWARE & HARDWARE "); lojas[327]=lojas[327]+1; if(nLinha==0)initlojas[327]=initlojas[327]+1; else if(nLinha==seqSize-1)endlojas[327]=endlojas[327]+1;break;
				case 402:	writer.write("COMPUTER SOFTWARE & HARDWARE "); lojas[402]=lojas[402]+1; if(nLinha==0)initlojas[402]=initlojas[402]+1; else if(nLinha==seqSize-1)endlojas[402]=endlojas[402]+1;break;
				case 527:	writer.write("COMPUTER SOFTWARE & HARDWARE "); lojas[527]=lojas[527]+1; if(nLinha==0)initlojas[527]=initlojas[527]+1; else if(nLinha==seqSize-1)endlojas[527]=endlojas[527]+1;break;
				case 325:	writer.write("CRÆ’CHE FACILITIES           "); lojas[325]=lojas[325]+1; if(nLinha==0)initlojas[325]=initlojas[325]+1; else if(nLinha==seqSize-1)endlojas[325]=endlojas[325]+1;break;
				case 414:	writer.write("DOORS, WARDROBES, AND SAFETY "); lojas[414]=lojas[414]+1; if(nLinha==0)initlojas[414]=initlojas[414]+1; else if(nLinha==seqSize-1)endlojas[414]=endlojas[414]+1;break;
				case 390:	writer.write("EQUIPMENT FOR ADVENTURE      "); lojas[390]=lojas[390]+1; if(nLinha==0)initlojas[390]=initlojas[390]+1; else if(nLinha==seqSize-1)endlojas[390]=endlojas[390]+1;break;
				case 409:	writer.write("FLOWERS AND PLANTS           "); lojas[409]=lojas[409]+1; if(nLinha==0)initlojas[409]=initlojas[409]+1; else if(nLinha==seqSize-1)endlojas[409]=endlojas[409]+1;break;
				case 337:	writer.write("GIFTS                        "); lojas[337]=lojas[337]+1; if(nLinha==0)initlojas[337]=initlojas[337]+1; else if(nLinha==seqSize-1)endlojas[337]=endlojas[337]+1;break;
				case 357:	writer.write("GIFTS                        "); lojas[357]=lojas[357]+1; if(nLinha==0)initlojas[357]=initlojas[357]+1; else if(nLinha==seqSize-1)endlojas[357]=endlojas[357]+1;break;
				case 417:	writer.write("GIFTS                        "); lojas[417]=lojas[417]+1; if(nLinha==0)initlojas[417]=initlojas[417]+1; else if(nLinha==seqSize-1)endlojas[417]=endlojas[417]+1;break;
				case 324:	writer.write("HAIRDRESSER                  "); lojas[324]=lojas[324]+1; if(nLinha==0)initlojas[324]=initlojas[324]+1; else if(nLinha==seqSize-1)endlojas[324]=endlojas[324]+1;break;
				case 376:	writer.write("HAIRDRESSER                  "); lojas[376]=lojas[376]+1; if(nLinha==0)initlojas[376]=initlojas[376]+1; else if(nLinha==seqSize-1)endlojas[376]=endlojas[376]+1;break;
				case 424:	writer.write("HAIRDRESSING ARTICLES        "); lojas[424]=lojas[424]+1; if(nLinha==0)initlojas[424]=initlojas[424]+1; else if(nLinha==seqSize-1)endlojas[424]=endlojas[424]+1;break;
				case 529:	writer.write("HOUSEHOLD ELECTRICAL APPLIANC"); lojas[529]=lojas[529]+1; if(nLinha==0)initlojas[529]=initlojas[529]+1; else if(nLinha==seqSize-1)endlojas[529]=endlojas[529]+1;break;
				case 509:	writer.write("JEANS AND CASUAL WEAR        "); lojas[509]=lojas[509]+1; if(nLinha==0)initlojas[509]=initlojas[509]+1; else if(nLinha==seqSize-1)endlojas[509]=endlojas[509]+1;break;
				case 515:	writer.write("JEANS AND CASUAL WEAR        "); lojas[515]=lojas[515]+1; if(nLinha==0)initlojas[515]=initlojas[515]+1; else if(nLinha==seqSize-1)endlojas[515]=endlojas[515]+1;break;
				case 313:	writer.write("JEWELERY & ACCESSORIES       "); lojas[313]=lojas[313]+1; if(nLinha==0)initlojas[313]=initlojas[313]+1; else if(nLinha==seqSize-1)endlojas[313]=endlojas[313]+1;break;
				case 332:	writer.write("JEWELERY & ACCESSORIES       "); lojas[332]=lojas[332]+1; if(nLinha==0)initlojas[332]=initlojas[332]+1; else if(nLinha==seqSize-1)endlojas[332]=endlojas[332]+1;break;
				case 356:	writer.write("JEWELERY & ACCESSORIES       "); lojas[356]=lojas[356]+1; if(nLinha==0)initlojas[356]=initlojas[356]+1; else if(nLinha==seqSize-1)endlojas[356]=endlojas[356]+1;break;
				case 362:	writer.write("JEWELERY & ACCESSORIES       "); lojas[362]=lojas[362]+1; if(nLinha==0)initlojas[362]=initlojas[362]+1; else if(nLinha==seqSize-1)endlojas[362]=endlojas[362]+1;break;
				case 375:	writer.write("JEWELERY & ACCESSORIES       "); lojas[375]=lojas[375]+1; if(nLinha==0)initlojas[375]=initlojas[375]+1; else if(nLinha==seqSize-1)endlojas[375]=endlojas[375]+1;break;
				case 382:	writer.write("JEWELERY & ACCESSORIES       "); lojas[382]=lojas[382]+1; if(nLinha==0)initlojas[382]=initlojas[382]+1; else if(nLinha==seqSize-1)endlojas[382]=endlojas[382]+1;break;
				case 427:	writer.write("JEWELERY & ACCESSORIES       "); lojas[427]=lojas[427]+1; if(nLinha==0)initlojas[427]=initlojas[427]+1; else if(nLinha==seqSize-1)endlojas[427]=endlojas[427]+1;break;
				case 454:	writer.write("JEWELERY & ACCESSORIES       "); lojas[454]=lojas[454]+1; if(nLinha==0)initlojas[454]=initlojas[454]+1; else if(nLinha==seqSize-1)endlojas[454]=endlojas[454]+1;break;
				case 468:	writer.write("JEWELERY & ACCESSORIES       "); lojas[468]=lojas[468]+1; if(nLinha==0)initlojas[468]=initlojas[468]+1; else if(nLinha==seqSize-1)endlojas[468]=endlojas[468]+1;break;
				case 478:	writer.write("JEWELERY & ACCESSORIES       "); lojas[478]=lojas[478]+1; if(nLinha==0)initlojas[478]=initlojas[478]+1; else if(nLinha==seqSize-1)endlojas[478]=endlojas[478]+1;break;
				case 508:	writer.write("JEWELERY & ACCESSORIES       "); lojas[508]=lojas[508]+1; if(nLinha==0)initlojas[508]=initlojas[508]+1; else if(nLinha==seqSize-1)endlojas[508]=endlojas[508]+1;break;
				case 1288:  writer.write("JEWELERY & ACCESSORIES       "); lojas[1288]=lojas[1288]+1; if(nLinha==0)initlojas[1288]=initlojas[1288]+1; else if(nLinha==seqSize-1)endlojas[1288]=endlojas[1288]+1;break;
				case 301:  writer.write("JEWELERY & ACCESSORIES       "); lojas[1288]=lojas[1288]+1; if(nLinha==0)initlojas[1288]=initlojas[1288]+1; else if(nLinha==seqSize-1)endlojas[1288]=endlojas[1288]+1;break;
				case 477:	writer.write("LADIESWEAR                   "); lojas[477]=lojas[477]+1; if(nLinha==0)initlojas[477]=initlojas[477]+1; else if(nLinha==seqSize-1)endlojas[477]=endlojas[477]+1;break;
				case 479:	writer.write("LADIESWEAR                   "); lojas[479]=lojas[479]+1; if(nLinha==0)initlojas[479]=initlojas[479]+1; else if(nLinha==seqSize-1)endlojas[479]=endlojas[479]+1;break;
				case 484:	writer.write("LADIESWEAR                   "); lojas[484]=lojas[484]+1; if(nLinha==0)initlojas[484]=initlojas[484]+1; else if(nLinha==seqSize-1)endlojas[484]=endlojas[484]+1;break;
				case 487:	writer.write("LADIESWEAR                   "); lojas[487]=lojas[487]+1; if(nLinha==0)initlojas[487]=initlojas[487]+1; else if(nLinha==seqSize-1)endlojas[487]=endlojas[487]+1;break;
				case 494:	writer.write("LADIESWEAR                   "); lojas[494]=lojas[494]+1; if(nLinha==0)initlojas[494]=initlojas[494]+1; else if(nLinha==seqSize-1)endlojas[494]=endlojas[494]+1;break;
				case 502:	writer.write("LADIESWEAR                   "); lojas[502]=lojas[502]+1; if(nLinha==0)initlojas[502]=initlojas[502]+1; else if(nLinha==seqSize-1)endlojas[502]=endlojas[502]+1;break;
				case 505:	writer.write("LADIESWEAR                   "); lojas[505]=lojas[505]+1; if(nLinha==0)initlojas[505]=initlojas[505]+1; else if(nLinha==seqSize-1)endlojas[505]=endlojas[505]+1;break;
				case 510:	writer.write("LADIESWEAR                   "); lojas[510]=lojas[510]+1; if(nLinha==0)initlojas[510]=initlojas[510]+1; else if(nLinha==seqSize-1)endlojas[510]=endlojas[510]+1;break;
				case 512:	writer.write("LADIESWEAR                   "); lojas[512]=lojas[512]+1; if(nLinha==0)initlojas[512]=initlojas[512]+1; else if(nLinha==seqSize-1)endlojas[512]=endlojas[512]+1;break;
				case 519:	writer.write("LADIESWEAR                   "); lojas[519]=lojas[519]+1; if(nLinha==0)initlojas[519]=initlojas[519]+1; else if(nLinha==seqSize-1)endlojas[519]=endlojas[519]+1;break;
				case 336:	writer.write("LEATHER GOODS / ACCESSORIES  "); lojas[336]=lojas[336]+1; if(nLinha==0)initlojas[336]=initlojas[336]+1; else if(nLinha==seqSize-1)endlojas[336]=endlojas[336]+1;break;
				case 378:	writer.write("LEATHER GOODS / ACCESSORIES  "); lojas[378]=lojas[378]+1; if(nLinha==0)initlojas[378]=initlojas[378]+1; else if(nLinha==seqSize-1)endlojas[378]=endlojas[378]+1;break;
				case 471:	writer.write("LEATHER GOODS / ACCESSORIES  "); lojas[471]=lojas[471]+1; if(nLinha==0)initlojas[471]=initlojas[471]+1; else if(nLinha==seqSize-1)endlojas[471]=endlojas[471]+1;break;
				case 488:	writer.write("LEATHER GOODS / ACCESSORIES  "); lojas[488]=lojas[488]+1; if(nLinha==0)initlojas[488]=initlojas[488]+1; else if(nLinha==seqSize-1)endlojas[488]=endlojas[488]+1;break;
				case 318:	writer.write("MATRESS                      "); lojas[318]=lojas[318]+1; if(nLinha==0)initlojas[318]=initlojas[318]+1; else if(nLinha==seqSize-1)endlojas[318]=endlojas[318]+1;break;
				case 490:	writer.write("MEN SHIRTS AND TIES          "); lojas[490]=lojas[490]+1; if(nLinha==0)initlojas[490]=initlojas[490]+1; else if(nLinha==seqSize-1)endlojas[490]=endlojas[490]+1;break;
				case 498:	writer.write("MEN SHIRTS AND TIES          "); lojas[498]=lojas[498]+1; if(nLinha==0)initlojas[498]=initlojas[498]+1; else if(nLinha==seqSize-1)endlojas[498]=endlojas[498]+1;break;
				case 513:	writer.write("MENAGE ARTICLES AND UTENSILS "); lojas[513]=lojas[513]+1; if(nLinha==0)initlojas[513]=initlojas[513]+1; else if(nLinha==seqSize-1)endlojas[513]=endlojas[513]+1;break;
				case 472:	writer.write("MENSWEAR                     "); lojas[472]=lojas[472]+1; if(nLinha==0)initlojas[472]=initlojas[472]+1; else if(nLinha==seqSize-1)endlojas[472]=endlojas[472]+1;break;
				case 483:	writer.write("MENSWEAR                     "); lojas[483]=lojas[483]+1; if(nLinha==0)initlojas[483]=initlojas[483]+1; else if(nLinha==seqSize-1)endlojas[483]=endlojas[483]+1;break;
				case 489:	writer.write("MENSWEAR                     "); lojas[489]=lojas[489]+1; if(nLinha==0)initlojas[489]=initlojas[489]+1; else if(nLinha==seqSize-1)endlojas[489]=endlojas[489]+1;break;
				case 496:	writer.write("MENSWEAR                     "); lojas[496]=lojas[496]+1; if(nLinha==0)initlojas[496]=initlojas[496]+1; else if(nLinha==seqSize-1)endlojas[496]=endlojas[496]+1;break;
				case 504:	writer.write("MENSWEAR                     "); lojas[504]=lojas[504]+1; if(nLinha==0)initlojas[504]=initlojas[504]+1; else if(nLinha==seqSize-1)endlojas[504]=endlojas[504]+1;break;
				case 521:	writer.write("MENSWEAR                     "); lojas[521]=lojas[521]+1; if(nLinha==0)initlojas[521]=initlojas[521]+1; else if(nLinha==seqSize-1)endlojas[521]=endlojas[521]+1;break;
				case 316:	writer.write("MISCELLANEOUS                "); lojas[316]=lojas[316]+1; if(nLinha==0)initlojas[316]=initlojas[316]+1; else if(nLinha==seqSize-1)endlojas[316]=endlojas[316]+1;break;
				case 371:	writer.write("MISCELLANEOUS                "); lojas[371]=lojas[371]+1; if(nLinha==0)initlojas[371]=initlojas[371]+1; else if(nLinha==seqSize-1)endlojas[371]=endlojas[371]+1;break;
				case 394:	writer.write("MISCELLANEOUS                "); lojas[394]=lojas[394]+1; if(nLinha==0)initlojas[394]=initlojas[394]+1; else if(nLinha==seqSize-1)endlojas[394]=endlojas[394]+1;break;
				case 416:	writer.write("MISCELLANEOUS                "); lojas[416]=lojas[416]+1; if(nLinha==0)initlojas[416]=initlojas[416]+1; else if(nLinha==seqSize-1)endlojas[416]=endlojas[416]+1;break;
				case 476:	writer.write("MISCELLANEOUS                "); lojas[476]=lojas[476]+1; if(nLinha==0)initlojas[476]=initlojas[476]+1; else if(nLinha==seqSize-1)endlojas[476]=endlojas[476]+1;break;
				case 535:	writer.write("MISCELLANEOUS                "); lojas[535]=lojas[535]+1; if(nLinha==0)initlojas[535]=initlojas[535]+1; else if(nLinha==seqSize-1)endlojas[535]=endlojas[535]+1;break;
				case 387:	writer.write("MISCELLANEOUS                "); lojas[387]=lojas[387]+1; if(nLinha==0)initlojas[387]=initlojas[387]+1; else if(nLinha==seqSize-1)endlojas[387]=endlojas[387]+1;break;
				case 419:	writer.write("MISCELLANEOUS                "); lojas[419]=lojas[419]+1; if(nLinha==0)initlojas[419]=initlojas[419]+1; else if(nLinha==seqSize-1)endlojas[419]=endlojas[419]+1;break;
				case 470:	writer.write("MISCELLANEOUS                "); lojas[470]=lojas[470]+1; if(nLinha==0)initlojas[470]=initlojas[470]+1; else if(nLinha==seqSize-1)endlojas[470]=endlojas[470]+1;break;
				case 499:	writer.write("MISCELLANEOUS                "); lojas[499]=lojas[499]+1; if(nLinha==0)initlojas[499]=initlojas[499]+1; else if(nLinha==seqSize-1)endlojas[499]=endlojas[499]+1;break;
				case 531:	writer.write("MISCELLANEOUS                "); lojas[531]=lojas[531]+1; if(nLinha==0)initlojas[531]=initlojas[531]+1; else if(nLinha==seqSize-1)endlojas[531]=endlojas[531]+1;break;
				case 338:	writer.write("N/D                          "); lojas[338]=lojas[338]+1; if(nLinha==0)initlojas[338]=initlojas[338]+1; else if(nLinha==seqSize-1)endlojas[338]=endlojas[338]+1;break;
				case 393:	writer.write("N/D                          "); lojas[393]=lojas[393]+1; if(nLinha==0)initlojas[393]=initlojas[393]+1; else if(nLinha==seqSize-1)endlojas[393]=endlojas[393]+1;break;
				case 401:	writer.write("N/D                          "); lojas[401]=lojas[401]+1; if(nLinha==0)initlojas[401]=initlojas[401]+1; else if(nLinha==seqSize-1)endlojas[401]=endlojas[401]+1;break;
				case 312:	writer.write("NATURAL PERFUMERY            "); lojas[312]=lojas[312]+1; if(nLinha==0)initlojas[312]=initlojas[312]+1; else if(nLinha==seqSize-1)endlojas[312]=endlojas[312]+1;break;
				case 408:	writer.write("NATURAL PERFUMERY            "); lojas[408]=lojas[408]+1; if(nLinha==0)initlojas[408]=initlojas[408]+1; else if(nLinha==seqSize-1)endlojas[408]=endlojas[408]+1;break;
				case 326:	writer.write("OFFICIAL / STATE ORGANISMS   "); lojas[326]=lojas[326]+1; if(nLinha==0)initlojas[326]=initlojas[326]+1; else if(nLinha==seqSize-1)endlojas[326]=endlojas[326]+1;break;
				case 322:	writer.write("OPTICIAN                     "); lojas[322]=lojas[322]+1; if(nLinha==0)initlojas[322]=initlojas[322]+1; else if(nLinha==seqSize-1)endlojas[322]=endlojas[322]+1;break;
				case 365:	writer.write("OPTICIAN                     "); lojas[365]=lojas[365]+1; if(nLinha==0)initlojas[365]=initlojas[365]+1; else if(nLinha==seqSize-1)endlojas[365]=endlojas[365]+1;break;
				case 377:	writer.write("OPTICIAN                     "); lojas[377]=lojas[377]+1; if(nLinha==0)initlojas[377]=initlojas[377]+1; else if(nLinha==seqSize-1)endlojas[377]=endlojas[377]+1;break;
				case 399:	writer.write("OPTICIAN                     "); lojas[399]=lojas[399]+1; if(nLinha==0)initlojas[399]=initlojas[399]+1; else if(nLinha==seqSize-1)endlojas[399]=endlojas[399]+1;break;
				case 367:	writer.write("PERFUMES / COSMETICS         "); lojas[367]=lojas[367]+1; if(nLinha==0)initlojas[367]=initlojas[367]+1; else if(nLinha==seqSize-1)endlojas[367]=endlojas[367]+1;break;
				case 372:	writer.write("PERFUMES / COSMETICS         "); lojas[372]=lojas[372]+1; if(nLinha==0)initlojas[372]=initlojas[372]+1; else if(nLinha==seqSize-1)endlojas[372]=endlojas[372]+1;break;
				case 386:	writer.write("PERFUMES / COSMETICS         "); lojas[386]=lojas[386]+1; if(nLinha==0)initlojas[386]=initlojas[386]+1; else if(nLinha==seqSize-1)endlojas[386]=endlojas[386]+1;break;
				case 412:	writer.write("PERFUMES / COSMETICS         "); lojas[412]=lojas[412]+1; if(nLinha==0)initlojas[412]=initlojas[412]+1; else if(nLinha==seqSize-1)endlojas[412]=endlojas[412]+1;break;
				case 469:	writer.write("PERFUMES / COSMETICS         "); lojas[469]=lojas[469]+1; if(nLinha==0)initlojas[469]=initlojas[469]+1; else if(nLinha==seqSize-1)endlojas[469]=endlojas[469]+1;break;
				case 319:	writer.write("PHARMACY                     "); lojas[319]=lojas[319]+1; if(nLinha==0)initlojas[319]=initlojas[319]+1; else if(nLinha==seqSize-1)endlojas[319]=endlojas[319]+1;break;
				case 423:	writer.write("PHOTOGRAPHY                  "); lojas[423]=lojas[423]+1; if(nLinha==0)initlojas[423]=initlojas[423]+1; else if(nLinha==seqSize-1)endlojas[423]=endlojas[423]+1;break;
				case 314:	writer.write("POST OFFICE                  "); lojas[314]=lojas[314]+1; if(nLinha==0)initlojas[314]=initlojas[314]+1; else if(nLinha==seqSize-1)endlojas[314]=endlojas[314]+1;break;
				case 405:	writer.write("SERVICES                     "); lojas[405]=lojas[405]+1; if(nLinha==0)initlojas[405]=initlojas[405]+1; else if(nLinha==seqSize-1)endlojas[405]=endlojas[405]+1;break;
				case 420:	writer.write("SERVICES                     "); lojas[420]=lojas[420]+1; if(nLinha==0)initlojas[420]=initlojas[420]+1; else if(nLinha==seqSize-1)endlojas[420]=endlojas[420]+1;break;
				case 328:	writer.write("SHOE REPAIRING               "); lojas[328]=lojas[328]+1; if(nLinha==0)initlojas[328]=initlojas[328]+1; else if(nLinha==seqSize-1)endlojas[328]=endlojas[328]+1;break;
				case 333:	writer.write("SHOE STORE IN GENERAL        "); lojas[333]=lojas[333]+1; if(nLinha==0)initlojas[333]=initlojas[333]+1; else if(nLinha==seqSize-1)endlojas[333]=endlojas[333]+1;break;
				case 358:	writer.write("SHOE STORE IN GENERAL        "); lojas[358]=lojas[358]+1; if(nLinha==0)initlojas[358]=initlojas[358]+1; else if(nLinha==seqSize-1)endlojas[358]=endlojas[358]+1;break;
				case 359:	writer.write("SHOE STORE IN GENERAL        "); lojas[359]=lojas[359]+1; if(nLinha==0)initlojas[359]=initlojas[359]+1; else if(nLinha==seqSize-1)endlojas[359]=endlojas[359]+1;break;
				case 363:	writer.write("SHOE STORE IN GENERAL        "); lojas[363]=lojas[363]+1; if(nLinha==0)initlojas[363]=initlojas[363]+1; else if(nLinha==seqSize-1)endlojas[363]=endlojas[363]+1;break;
				case 368:	writer.write("SHOE STORE IN GENERAL        "); lojas[368]=lojas[368]+1; if(nLinha==0)initlojas[368]=initlojas[368]+1; else if(nLinha==seqSize-1)endlojas[368]=endlojas[368]+1;break;
				case 370:	writer.write("SHOE STORE IN GENERAL        "); lojas[370]=lojas[370]+1; if(nLinha==0)initlojas[370]=initlojas[370]+1; else if(nLinha==seqSize-1)endlojas[370]=endlojas[370]+1;break;
				case 384:	writer.write("SHOE STORE IN GENERAL        "); lojas[384]=lojas[384]+1; if(nLinha==0)initlojas[384]=initlojas[384]+1; else if(nLinha==seqSize-1)endlojas[384]=endlojas[384]+1;break;
				case 396:	writer.write("SHOE STORE IN GENERAL        "); lojas[396]=lojas[396]+1; if(nLinha==0)initlojas[396]=initlojas[396]+1; else if(nLinha==seqSize-1)endlojas[396]=endlojas[396]+1;break;
				case 465:	writer.write("SHOE STORE IN GENERAL        "); lojas[465]=lojas[465]+1; if(nLinha==0)initlojas[465]=initlojas[465]+1; else if(nLinha==seqSize-1)endlojas[465]=endlojas[465]+1;break;
				case 474:	writer.write("SHOE STORE IN GENERAL        "); lojas[474]=lojas[474]+1; if(nLinha==0)initlojas[474]=initlojas[474]+1; else if(nLinha==seqSize-1)endlojas[474]=endlojas[474]+1;break;
				case 486:	writer.write("SHOE STORE IN GENERAL        "); lojas[486]=lojas[486]+1; if(nLinha==0)initlojas[486]=initlojas[486]+1; else if(nLinha==seqSize-1)endlojas[486]=endlojas[486]+1;break;
				case 493:	writer.write("SHOE STORE IN GENERAL        "); lojas[493]=lojas[493]+1; if(nLinha==0)initlojas[493]=initlojas[493]+1; else if(nLinha==seqSize-1)endlojas[493]=endlojas[493]+1;break;
				case 503:	writer.write("SHOE STORE IN GENERAL        "); lojas[503]=lojas[503]+1; if(nLinha==0)initlojas[503]=initlojas[503]+1; else if(nLinha==seqSize-1)endlojas[503]=endlojas[503]+1;break;
				case 391:	writer.write("SILVER & PLATINGS            "); lojas[391]=lojas[391]+1; if(nLinha==0)initlojas[391]=initlojas[391]+1; else if(nLinha==seqSize-1)endlojas[391]=endlojas[391]+1;break;
				case 373:	writer.write("SPORTS GOODS IN GENERAL      "); lojas[373]=lojas[373]+1; if(nLinha==0)initlojas[373]=initlojas[373]+1; else if(nLinha==seqSize-1)endlojas[373]=endlojas[373]+1;break;
				case 537:	writer.write("SPORTS GOODS IN GENERAL      "); lojas[537]=lojas[537]+1; if(nLinha==0)initlojas[537]=initlojas[537]+1; else if(nLinha==seqSize-1)endlojas[537]=endlojas[537]+1;break;
				case 360:	writer.write("SPORTSWEAR / FOOTWEAR        "); lojas[360]=lojas[360]+1; if(nLinha==0)initlojas[360]=initlojas[360]+1; else if(nLinha==seqSize-1)endlojas[360]=endlojas[360]+1;break;
				case 364:	writer.write("SPORTSWEAR / FOOTWEAR        "); lojas[364]=lojas[364]+1; if(nLinha==0)initlojas[364]=initlojas[364]+1; else if(nLinha==seqSize-1)endlojas[364]=endlojas[364]+1;break;
				case 366:	writer.write("SPORTSWEAR / FOOTWEAR        "); lojas[366]=lojas[366]+1; if(nLinha==0)initlojas[366]=initlojas[366]+1; else if(nLinha==seqSize-1)endlojas[366]=endlojas[366]+1;break;
				case 518:	writer.write("SPORTSWEAR / FOOTWEAR        "); lojas[518]=lojas[518]+1; if(nLinha==0)initlojas[518]=initlojas[518]+1; else if(nLinha==seqSize-1)endlojas[518]=endlojas[518]+1;break;
				case 388:	writer.write("STATIONARY & CRAFT ARTICLES  "); lojas[388]=lojas[388]+1; if(nLinha==0)initlojas[388]=initlojas[388]+1; else if(nLinha==seqSize-1)endlojas[388]=endlojas[388]+1;break;
				case 395:	writer.write("STATIONARY & CRAFT ARTICLES  "); lojas[395]=lojas[395]+1; if(nLinha==0)initlojas[395]=initlojas[395]+1; else if(nLinha==seqSize-1)endlojas[395]=endlojas[395]+1;break;
				case 533:	writer.write("SUPERMARKET AND HIPERMARKET  "); lojas[533]=lojas[533]+1; if(nLinha==0)initlojas[533]=initlojas[533]+1; else if(nLinha==seqSize-1)endlojas[533]=endlojas[533]+1;break;
				case 379:	writer.write("SWEETS AND CHOCOLATES        "); lojas[379]=lojas[379]+1; if(nLinha==0)initlojas[379]=initlojas[379]+1; else if(nLinha==seqSize-1)endlojas[379]=endlojas[379]+1;break;
				case 411:	writer.write("TABACCO STORE                "); lojas[411]=lojas[411]+1; if(nLinha==0)initlojas[411]=initlojas[411]+1; else if(nLinha==seqSize-1)endlojas[411]=endlojas[411]+1;break;
				case 403:	writer.write("TEA / COFFEE SHOP            "); lojas[403]=lojas[403]+1; if(nLinha==0)initlojas[403]=initlojas[403]+1; else if(nLinha==seqSize-1)endlojas[403]=endlojas[403]+1;break;
				case 323:	writer.write("TEENAGERS WEAR               "); lojas[323]=lojas[323]+1; if(nLinha==0)initlojas[323]=initlojas[323]+1; else if(nLinha==seqSize-1)endlojas[323]=endlojas[323]+1;break;
				case 339:	writer.write("TEENAGERS WEAR               "); lojas[339]=lojas[339]+1; if(nLinha==0)initlojas[339]=initlojas[339]+1; else if(nLinha==seqSize-1)endlojas[339]=endlojas[339]+1;break;
				case 341:	writer.write("TOYS IN GENERAL              "); lojas[341]=lojas[341]+1; if(nLinha==0)initlojas[341]=initlojas[341]+1; else if(nLinha==seqSize-1)endlojas[341]=endlojas[341]+1;break;
				case 421:	writer.write("TRAVEL AGENCIES              "); lojas[421]=lojas[421]+1; if(nLinha==0)initlojas[421]=initlojas[421]+1; else if(nLinha==seqSize-1)endlojas[421]=endlojas[421]+1;break;
				case 369:	writer.write("UNDERWEAR                    "); lojas[369]=lojas[369]+1; if(nLinha==0)initlojas[369]=initlojas[369]+1; else if(nLinha==seqSize-1)endlojas[369]=endlojas[369]+1;break;
				case 385:	writer.write("UNDERWEAR                    "); lojas[385]=lojas[385]+1; if(nLinha==0)initlojas[385]=initlojas[385]+1; else if(nLinha==seqSize-1)endlojas[385]=endlojas[385]+1;break;
				case 466:	writer.write("UNDERWEAR                    "); lojas[466]=lojas[466]+1; if(nLinha==0)initlojas[466]=initlojas[466]+1; else if(nLinha==seqSize-1)endlojas[466]=endlojas[466]+1;break;
				case 473:	writer.write("UNDERWEAR                    "); lojas[473]=lojas[473]+1; if(nLinha==0)initlojas[473]=initlojas[473]+1; else if(nLinha==seqSize-1)endlojas[473]=endlojas[473]+1;break;
				case 480:	writer.write("UNDERWEAR                    "); lojas[480]=lojas[480]+1; if(nLinha==0)initlojas[480]=initlojas[480]+1; else if(nLinha==seqSize-1)endlojas[480]=endlojas[480]+1;break;
				case 485:	writer.write("UNDERWEAR                    "); lojas[485]=lojas[485]+1; if(nLinha==0)initlojas[485]=initlojas[485]+1; else if(nLinha==seqSize-1)endlojas[485]=endlojas[485]+1;break;
				case 492:	writer.write("UNDERWEAR                    "); lojas[492]=lojas[492]+1; if(nLinha==0)initlojas[492]=initlojas[492]+1; else if(nLinha==seqSize-1)endlojas[492]=endlojas[492]+1;break;
				case 307:	writer.write("VARIOUS DECORATIONS OBJECTS  "); lojas[307]=lojas[307]+1; if(nLinha==0)initlojas[307]=initlojas[307]+1; else if(nLinha==seqSize-1)endlojas[307]=endlojas[307]+1;break;
				case 524: 	writer.write("VARIOUS DECORATIONS OBJECTS  "); lojas[524]=lojas[524]+1; if(nLinha==0)initlojas[524]=initlojas[524]+1; else if(nLinha==seqSize-1)endlojas[524]=endlojas[524]+1;break;
				
				
	            default: writer.write("-------- ");
				         System.out.print("------- ");
                         break;
			}
				nLinha++;
			}
				//Acaba sequência
				writer.write("\n");
		


		}  
		//Descobre as 10 lojas mais presentes em sequências
		int largest[][] = top10Stores(lojas);
		int initials[][] = top10Stores(initlojas);
		int endings[][] = top10Stores(endlojas);
		
		writer.write("\n\n#Estatísticas Gerais\n");
		System.out.println("\n#Estatísticas Gerais");
		writer.write("Número de Sequências: " + nSeq + "\n");
		System.out.println("Número de Sequências: " + nSeq);
		writer.write("Tamanho das Sequências: " + seqSize + "\n");
		System.out.println("Tamanho das Sequências: " + seqSize);
		
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
		
        writer.write("\n\n#Elementos que aparecem mais vezes no fim\n");
		System.out.println("\n#Elementos que aparecem mais vezes no fim");
		for(int i=0 ; i<=4;i++){
			writer.write(endings[i][1] + "x: ... " + endings[i][0] + " - " + (endings[i][1]*100/nSeq) + "%\n");
			System.out.println(endings[i][1] + "x: ... " + endings[i][0] + " - " + (endings[i][1]*100/nSeq) + "%");	
		}
		// Always close files.
		writer.close();         

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

