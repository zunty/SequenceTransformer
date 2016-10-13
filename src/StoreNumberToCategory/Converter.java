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

public class Converter {
	private static BufferedWriter bw;

	public static void main(String [] args) throws IOException {

		// The name of the file to open.
		String fileName = "src/input/inputconverter.txt";

		// This will reference one line at a time
		String line = null;

		// FileReader reads text files in the default encoding.
		FileReader fileReader = 
				new FileReader(fileName);

		// Always wrap FileReader in BufredReader.
		Reader reader = new InputStreamReader(new FileInputStream(fileName), "utf-8");
		BufferedReader br = new BufferedReader(reader);

		FileWriter writer = new FileWriter("src/output/outputConverter.txt", true);
		int lojas[] = new int[1289]; 
		while((line = br.readLine()) != null) {
			//Separar dois valores de cada linha

			String[] splited = line.split("\\s+");
			
			for (int i = 0; i < splited.length; i++) {
				
				int store = Integer.parseInt(splited[i]);
				switch (store) {
				case 329:	writer.write("BANKS / FINANCIAL AGENTS     "); lojas[329]=lojas[329]+1; break;
				case 330:	writer.write("BANKS / FINANCIAL AGENTS     "); lojas[330]=lojas[330]+1; break;
				case 426:	writer.write("BANKS / FINANCIAL AGENTS     "); lojas[426]=lojas[426]+1; break;
				case 306:	writer.write("BIJOUTERIE                   "); lojas[306]=lojas[306]+1; break;
				case 309:	writer.write("BIJOUTERIE                   "); lojas[309]=lojas[309]+1; break;
				case 380:	writer.write("BIJOUTERIE                   "); lojas[380]=lojas[380]+1; break;
				case 381:	writer.write("BIJOUTERIE                   "); lojas[381]=lojas[381]+1; break;
				case 392:	writer.write("BIJOUTERIE                   "); lojas[392]=lojas[392]+1; break;
				case 400:	writer.write("BIJOUTERIE                   "); lojas[400]=lojas[400]+1; break;
				case 497:	writer.write("BIJOUTERIE                   "); lojas[497]=lojas[497]+1; break;
				case 511:	writer.write("BIJOUTERIE                   "); lojas[511]=lojas[511]+1; break;
				case 311:	writer.write("BOOK STORE                   "); lojas[311]=lojas[311]+1; break;
				case 335:	writer.write("CHILDREN'S WEAR              "); lojas[335]=lojas[335]+1; break;
				case 340:	writer.write("CHILDREN'S WEAR              "); lojas[340]=lojas[340]+1; break;
				case 343:	writer.write("CHILDREN'S WEAR              "); lojas[343]=lojas[343]+1; break;
				case 344:	writer.write("CHILDREN'S WEAR              "); lojas[344]=lojas[344]+1; break;
				case 346:	writer.write("CHILDREN'S WEAR              "); lojas[346]=lojas[346]+1; break;
				case 347:	writer.write("CHILDREN'S WEAR              "); lojas[347]=lojas[347]+1; break;
				case 348:	writer.write("CHILDREN'S WEAR              "); lojas[348]=lojas[348]+1; break;
				case 349:	writer.write("CHILDREN'S WEAR              "); lojas[349]=lojas[349]+1; break;
				case 350:	writer.write("CHILDREN'S WEAR              "); lojas[350]=lojas[350]+1; break;
				case 351:	writer.write("CHILDREN'S WEAR              "); lojas[351]=lojas[351]+1; break;
				case 352:	writer.write("CHILDREN'S WEAR              "); lojas[352]=lojas[352]+1; break;
				case 353:	writer.write("CHILDREN'S WEAR              "); lojas[353]=lojas[353]+1; break;
				case 355:	writer.write("CHILDREN'S WEAR              "); lojas[355]=lojas[355]+1; break;
				case 525:	writer.write("CHILDREN'S WEAR              "); lojas[525]=lojas[525]+1; break;
				case 397:	writer.write("CHINA & GLASSWARE            "); lojas[397]=lojas[397]+1; break;
				case 398:	writer.write("CHINA & GLASSWARE            "); lojas[398]=lojas[398]+1; break;
				case 404:	writer.write("CHINA & GLASSWARE            "); lojas[404]=lojas[404]+1; break;
				case 526:	writer.write("CINEMAS                      "); lojas[526]=lojas[526]+1; break;
				case 331:	writer.write("CLOTHING IN GENERAL          "); lojas[331]=lojas[331]+1; break;
				case 342:	writer.write("CLOTHING IN GENERAL          "); lojas[342]=lojas[342]+1; break;
				case 345:	writer.write("CLOTHING IN GENERAL          "); lojas[345]=lojas[345]+1; break;
				case 361:	writer.write("CLOTHING IN GENERAL          "); lojas[361]=lojas[361]+1; break;
				case 406:	writer.write("CLOTHING IN GENERAL          "); lojas[406]=lojas[406]+1; break;
				case 458:	writer.write("CLOTHING IN GENERAL          "); lojas[458]=lojas[458]+1; break;
				case 467:	writer.write("CLOTHING IN GENERAL          "); lojas[467]=lojas[467]+1; break;
				case 475:	writer.write("CLOTHING IN GENERAL          "); lojas[475]=lojas[475]+1; break;
				case 481:	writer.write("CLOTHING IN GENERAL          "); lojas[481]=lojas[481]+1; break;
				case 491:	writer.write("CLOTHING IN GENERAL          "); lojas[491]=lojas[491]+1; break;
				case 495:	writer.write("CLOTHING IN GENERAL          "); lojas[495]=lojas[495]+1; break;
				case 501:	writer.write("CLOTHING IN GENERAL          "); lojas[501]=lojas[501]+1; break;
				case 506:	writer.write("CLOTHING IN GENERAL          "); lojas[506]=lojas[506]+1; break;
				case 507:	writer.write("CLOTHING IN GENERAL          "); lojas[507]=lojas[507]+1; break;
				case 514:	writer.write("CLOTHING IN GENERAL          "); lojas[514]=lojas[514]+1; break;
				case 520:	writer.write("CLOTHING IN GENERAL          "); lojas[520]=lojas[520]+1; break;
				case 530:	writer.write("CLOTHING IN GENERAL          "); lojas[530]=lojas[530]+1; break;
				case 532:	writer.write("CLOTHING IN GENERAL          "); lojas[532]=lojas[532]+1; break;
				case 536:	writer.write("CLOTHING IN GENERAL          "); lojas[536]=lojas[536]+1; break;
				case 1175:  writer.write("CLOTHING IN GENERAL          "); lojas[1175]=lojas[1175]+1; break;
				case 418:	writer.write("CLOTHING REPAIR              "); lojas[418]=lojas[418]+1; break;
				case 310:	writer.write("COMMUNICATIONS               "); lojas[310]=lojas[310]+1; break;
				case 315:	writer.write("COMMUNICATIONS               "); lojas[315]=lojas[315]+1; break;
				case 317:	writer.write("COMMUNICATIONS               "); lojas[317]=lojas[317]+1; break;
				case 320:	writer.write("COMMUNICATIONS               "); lojas[320]=lojas[320]+1; break;
				case 415:	writer.write("COMMUNICATIONS               "); lojas[415]=lojas[415]+1; break;
				case 425:	writer.write("COMMUNICATIONS               "); lojas[425]=lojas[425]+1; break;
				case 327:	writer.write("COMPUTER SOFTWARE & HARDWARE "); lojas[327]=lojas[327]+1; break;
				case 402:	writer.write("COMPUTER SOFTWARE & HARDWARE "); lojas[402]=lojas[402]+1; break;
				case 527:	writer.write("COMPUTER SOFTWARE & HARDWARE "); lojas[527]=lojas[527]+1; break;
				case 325:	writer.write("CRÆ’CHE FACILITIES           "); lojas[325]=lojas[325]+1; break;
				case 414:	writer.write("DOORS, WARDROBES, AND SAFETY "); lojas[414]=lojas[414]+1; break;
				case 390:	writer.write("EQUIPMENT FOR ADVENTURE      "); lojas[390]=lojas[390]+1; break;
				case 409:	writer.write("FLOWERS AND PLANTS           "); lojas[409]=lojas[409]+1; break;
				case 337:	writer.write("GIFTS                        "); lojas[337]=lojas[337]+1; break;
				case 357:	writer.write("GIFTS                        "); lojas[357]=lojas[357]+1; break;
				case 417:	writer.write("GIFTS                        "); lojas[417]=lojas[417]+1; break;
				case 324:	writer.write("HAIRDRESSER                  "); lojas[324]=lojas[324]+1; break;
				case 376:	writer.write("HAIRDRESSER                  "); lojas[376]=lojas[376]+1; break;
				case 424:	writer.write("HAIRDRESSING ARTICLES        "); lojas[424]=lojas[424]+1; break;
				case 529:	writer.write("HOUSEHOLD ELECTRICAL APPLIANC"); lojas[529]=lojas[529]+1; break;
				case 509:	writer.write("JEANS AND CASUAL WEAR        "); lojas[509]=lojas[509]+1; break;
				case 515:	writer.write("JEANS AND CASUAL WEAR        "); lojas[515]=lojas[515]+1; break;
				case 313:	writer.write("JEWELERY & ACCESSORIES       "); lojas[313]=lojas[313]+1; break;
				case 332:	writer.write("JEWELERY & ACCESSORIES       "); lojas[332]=lojas[332]+1; break;
				case 356:	writer.write("JEWELERY & ACCESSORIES       "); lojas[356]=lojas[356]+1; break;
				case 362:	writer.write("JEWELERY & ACCESSORIES       "); lojas[362]=lojas[362]+1; break;
				case 375:	writer.write("JEWELERY & ACCESSORIES       "); lojas[375]=lojas[375]+1; break;
				case 382:	writer.write("JEWELERY & ACCESSORIES       "); lojas[382]=lojas[382]+1; break;
				case 427:	writer.write("JEWELERY & ACCESSORIES       "); lojas[427]=lojas[427]+1; break;
				case 454:	writer.write("JEWELERY & ACCESSORIES       "); lojas[454]=lojas[454]+1; break;
				case 468:	writer.write("JEWELERY & ACCESSORIES       "); lojas[468]=lojas[468]+1; break;
				case 478:	writer.write("JEWELERY & ACCESSORIES       "); lojas[478]=lojas[478]+1; break;
				case 508:	writer.write("JEWELERY & ACCESSORIES       "); lojas[508]=lojas[508]+1; break;
				case 1288:  writer.write("JEWELERY & ACCESSORIES       "); lojas[1288]=lojas[1288]+1; break;
				case 477:	writer.write("LADIESWEAR                   "); lojas[477]=lojas[477]+1; break;
				case 479:	writer.write("LADIESWEAR                   "); lojas[479]=lojas[479]+1; break;
				case 484:	writer.write("LADIESWEAR                   "); lojas[484]=lojas[484]+1; break;
				case 487:	writer.write("LADIESWEAR                   "); lojas[487]=lojas[487]+1; break;
				case 494:	writer.write("LADIESWEAR                   "); lojas[494]=lojas[494]+1; break;
				case 502:	writer.write("LADIESWEAR                   "); lojas[502]=lojas[502]+1; break;
				case 505:	writer.write("LADIESWEAR                   "); lojas[505]=lojas[505]+1; break;
				case 510:	writer.write("LADIESWEAR                   "); lojas[510]=lojas[510]+1; break;
				case 512:	writer.write("LADIESWEAR                   "); lojas[512]=lojas[512]+1; break;
				case 519:	writer.write("LADIESWEAR                   "); lojas[519]=lojas[519]+1; break;
				case 336:	writer.write("LEATHER GOODS / ACCESSORIES  "); lojas[336]=lojas[336]+1; break;
				case 378:	writer.write("LEATHER GOODS / ACCESSORIES  "); lojas[378]=lojas[378]+1; break;
				case 471:	writer.write("LEATHER GOODS / ACCESSORIES  "); lojas[471]=lojas[471]+1; break;
				case 488:	writer.write("LEATHER GOODS / ACCESSORIES  "); lojas[488]=lojas[488]+1; break;
				case 318:	writer.write("MATRESS                      "); lojas[318]=lojas[318]+1; break;
				case 490:	writer.write("MEN SHIRTS AND TIES          "); lojas[490]=lojas[490]+1; break;
				case 498:	writer.write("MEN SHIRTS AND TIES          "); lojas[498]=lojas[498]+1; break;
				case 513:	writer.write("MENAGE ARTICLES AND UTENSILS "); lojas[513]=lojas[513]+1; break;
				case 472:	writer.write("MENSWEAR                     "); lojas[472]=lojas[472]+1; break;
				case 483:	writer.write("MENSWEAR                     "); lojas[483]=lojas[483]+1; break;
				case 489:	writer.write("MENSWEAR                     "); lojas[489]=lojas[489]+1; break;
				case 496:	writer.write("MENSWEAR                     "); lojas[496]=lojas[496]+1; break;
				case 504:	writer.write("MENSWEAR                     "); lojas[504]=lojas[504]+1; break;
				case 521:	writer.write("MENSWEAR                     "); lojas[521]=lojas[521]+1; break;
				case 316:	writer.write("MISCELLANEOUS                "); lojas[316]=lojas[316]+1; break;
				case 371:	writer.write("MISCELLANEOUS                "); lojas[371]=lojas[371]+1; break;
				case 394:	writer.write("MISCELLANEOUS                "); lojas[394]=lojas[394]+1; break;
				case 416:	writer.write("MISCELLANEOUS                "); lojas[416]=lojas[416]+1; break;
				case 476:	writer.write("MISCELLANEOUS                "); lojas[476]=lojas[476]+1; break;
				case 535:	writer.write("MISCELLANEOUS                "); lojas[535]=lojas[535]+1; break;
				case 387:	writer.write("Miscellanious                "); lojas[387]=lojas[387]+1; break;
				case 419:	writer.write("Miscellanious                "); lojas[419]=lojas[419]+1; break;
				case 470:	writer.write("Miscellanious                "); lojas[470]=lojas[470]+1; break;
				case 499:	writer.write("Miscellanious                "); lojas[499]=lojas[499]+1; break;
				case 531:	writer.write("Miscellanious                "); lojas[531]=lojas[531]+1; break;
				case 338:	writer.write("N/D                          "); lojas[338]=lojas[338]+1; break;
				case 393:	writer.write("N/D                          "); lojas[393]=lojas[393]+1; break;
				case 401:	writer.write("N/D                          "); lojas[401]=lojas[401]+1; break;
				case 312:	writer.write("NATURAL PERFUMERY            "); lojas[312]=lojas[312]+1; break;
				case 408:	writer.write("NATURAL PERFUMERY            "); lojas[408]=lojas[408]+1; break;
				case 326:	writer.write("OFFICIAL / STATE ORGANISMS   "); lojas[326]=lojas[326]+1; break;
				case 322:	writer.write("OPTICIAN                     "); lojas[322]=lojas[322]+1; break;
				case 365:	writer.write("OPTICIAN                     "); lojas[365]=lojas[365]+1; break;
				case 377:	writer.write("OPTICIAN                     "); lojas[377]=lojas[377]+1; break;
				case 399:	writer.write("OPTICIAN                     "); lojas[399]=lojas[399]+1; break;
				case 367:	writer.write("PERFUMES / COSMETICS         "); lojas[367]=lojas[367]+1; break;
				case 372:	writer.write("PERFUMES / COSMETICS         "); lojas[372]=lojas[372]+1; break;
				case 386:	writer.write("PERFUMES / COSMETICS         "); lojas[386]=lojas[386]+1; break;
				case 412:	writer.write("PERFUMES / COSMETICS         "); lojas[412]=lojas[412]+1; break;
				case 469:	writer.write("PERFUMES / COSMETICS         "); lojas[469]=lojas[469]+1; break;
				case 319:	writer.write("PHARMACY                     "); lojas[319]=lojas[319]+1; break;
				case 423:	writer.write("PHOTOGRAPHY                  "); lojas[423]=lojas[423]+1; break;
				case 314:	writer.write("POST OFFICE                  "); lojas[314]=lojas[314]+1; break;
				case 405:	writer.write("SERVICES                     "); lojas[405]=lojas[405]+1; break;
				case 420:	writer.write("SERVICES                     "); lojas[420]=lojas[420]+1; break;
				case 328:	writer.write("SHOE REPAIRING               "); lojas[328]=lojas[328]+1; break;
				case 333:	writer.write("SHOE STORE IN GENERAL        "); lojas[333]=lojas[333]+1; break;
				case 358:	writer.write("SHOE STORE IN GENERAL        "); lojas[358]=lojas[358]+1; break;
				case 359:	writer.write("SHOE STORE IN GENERAL        "); lojas[359]=lojas[359]+1; break;
				case 363:	writer.write("SHOE STORE IN GENERAL        "); lojas[363]=lojas[363]+1; break;
				case 368:	writer.write("SHOE STORE IN GENERAL        "); lojas[368]=lojas[368]+1; break;
				case 370:	writer.write("SHOE STORE IN GENERAL        "); lojas[370]=lojas[370]+1; break;
				case 384:	writer.write("SHOE STORE IN GENERAL        "); lojas[384]=lojas[384]+1; break;
				case 396:	writer.write("SHOE STORE IN GENERAL        "); lojas[396]=lojas[396]+1; break;
				case 465:	writer.write("SHOE STORE IN GENERAL        "); lojas[465]=lojas[465]+1; break;
				case 474:	writer.write("SHOE STORE IN GENERAL        "); lojas[474]=lojas[474]+1; break;
				case 486:	writer.write("SHOE STORE IN GENERAL        "); lojas[486]=lojas[486]+1; break;
				case 493:	writer.write("SHOE STORE IN GENERAL        "); lojas[493]=lojas[493]+1; break;
				case 503:	writer.write("SHOE STORE IN GENERAL        "); lojas[503]=lojas[503]+1; break;
				case 391:	writer.write("SILVER & PLATINGS            "); lojas[391]=lojas[391]+1; break;
				case 373:	writer.write("SPORTS GOODS IN GENERAL      "); lojas[373]=lojas[373]+1; break;
				case 537:	writer.write("SPORTS GOODS IN GENERAL      "); lojas[537]=lojas[537]+1; break;
				case 360:	writer.write("SPORTSWEAR / FOOTWEAR        "); lojas[360]=lojas[360]+1; break;
				case 364:	writer.write("SPORTSWEAR / FOOTWEAR        "); lojas[364]=lojas[364]+1; break;
				case 366:	writer.write("SPORTSWEAR / FOOTWEAR        "); lojas[366]=lojas[366]+1; break;
				case 518:	writer.write("SPORTSWEAR / FOOTWEAR        "); lojas[518]=lojas[518]+1; break;
				case 388:	writer.write("STATIONARY & CRAFT ARTICLES  "); lojas[388]=lojas[388]+1; break;
				case 395:	writer.write("STATIONARY & CRAFT ARTICLES  "); lojas[395]=lojas[395]+1; break;
				case 533:	writer.write("SUPERMARKET AND HIPERMARKET  "); lojas[533]=lojas[533]+1; break;
				case 379:	writer.write("SWEETS AND CHOCOLATES        "); lojas[379]=lojas[379]+1; break;
				case 411:	writer.write("TABACCO STORE                "); lojas[411]=lojas[411]+1; break;
				case 403:	writer.write("TEA / COFFEE SHOP            "); lojas[403]=lojas[403]+1; break;
				case 323:	writer.write("TEENAGERS WEAR               "); lojas[323]=lojas[323]+1; break;
				case 339:	writer.write("TEENAGERS WEAR               "); lojas[339]=lojas[339]+1; break;
				case 341:	writer.write("TOYS IN GENERAL              "); lojas[341]=lojas[341]+1; break;
				case 421:	writer.write("TRAVEL AGENCIES              "); lojas[421]=lojas[421]+1; break;
				case 369:	writer.write("UNDERWEAR                    "); lojas[369]=lojas[369]+1; break;
				case 385:	writer.write("UNDERWEAR                    "); lojas[385]=lojas[385]+1; break;
				case 466:	writer.write("UNDERWEAR                    "); lojas[466]=lojas[466]+1; break;
				case 473:	writer.write("UNDERWEAR                    "); lojas[473]=lojas[473]+1; break;
				case 480:	writer.write("UNDERWEAR                    "); lojas[480]=lojas[480]+1; break;
				case 485:	writer.write("UNDERWEAR                    "); lojas[485]=lojas[485]+1; break;
				case 492:	writer.write("UNDERWEAR                    "); lojas[492]=lojas[492]+1; break;
				case 307:	writer.write("VARIOUS DECORATIONS OBJECTS  "); lojas[307]=lojas[307]+1; break;
				case 524: 	writer.write("VARIOUS DECORATIONS OBJECTS  "); lojas[524]=lojas[524]+1; break;

	            default: writer.write("-------- ");
				         System.out.print("------- ");
                         break;
			}
			}
				//Acaba sequência
				writer.write("\n");
		


		}  
		Arrays.sort(lojas);
		int[] top10 = Arrays.copyOfRange(lojas, lojas.length-10,lojas.length);
		writer.write("#Elementos que aparecem mais freqentemente\n");
		System.out.println("\n#Elementos que aparecem mais freqentemente");
		for(int i=lojas.length-1;i>lojas.length-11;i--){
			writer.write(" - " + lojas[i] + " vezes \n");
			System.out.println("- " + lojas[i]);
		}
		// Always close files.
		writer.close();         

	}
	}

