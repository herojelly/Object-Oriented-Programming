import java.util.Scanner;

import javax.sound.midi.SysexMessage;

/** Main Game Class */

public class Game {
	
	public static void main(String[] args) {
		printLoading();//Print Loading and Title Screens

		Story1();
		runGame(); // calls game loop
		Story2();
		runGame();
		Story3();
		runGame();
		Story4();
		runGame();
		Story5();
		Story6();
		runGame();
		Story7();
		runGame();
		Story8();
		runGame();
		Story9();
		Story10();
	}
	
	
	public static void printLoading(){//Prints loading and title screens.  Waits for start button to be clicked
		TitleScreen titleScreen=new TitleScreen();
		titleScreen.printScreens();
		
		while(titleScreen.getStartGame()==false){
			System.out.println(" ");
			//Wait for button to be clicked
		}
		
	}

	
	
	// Run Game Loop
	public static void runGame() {
	
		String var; // temp string
		int score = 0; // player score
		int numOfRuns = 1; // number of runs, when it becomes 10 it quits the do-while loop
		
		do {
			// Creates generator objects
			SexGenerator sex = new SexGenerator();
			RandomNameGenerator name = new RandomNameGenerator(sex.getSex());
			RandomHeightGenerator height = new RandomHeightGenerator();
			RandomWeightGenerator weight = new RandomWeightGenerator();
			SerialNumberGenerator serialNumber = new SerialNumberGenerator();
			CountriesOfEntryGenerator countriesOfEntry = new CountriesOfEntryGenerator();
			DateOfBirthGenerator dateOfBirth = new DateOfBirthGenerator();
			DurationOfEntryGenerator durationOfVisit = new DurationOfEntryGenerator();
			EntranceDateGenerator entranceDate = new EntranceDateGenerator();
			ExpirationDateGenerator expirationDate = new ExpirationDateGenerator();
			IssuingCountryGenerator issuingCountry = new IssuingCountryGenerator();
			IssuingCityGenerator issuingCity = new IssuingCityGenerator(issuingCountry.getCountry());
			PurposeOfEntryGenerator purposeOfEntry = new PurposeOfEntryGenerator();
			FieldOfWorkGenerator fieldOfWork = new FieldOfWorkGenerator();
			PictureGenerator picture = new PictureGenerator(sex.getSex());
			
			/** Generates character, passport, entry permit, work permit, diplomatic authorization */
			Character character = new Character(weight.getWeight(), height.getHeight(), picture.getPictureNumber(), purposeOfEntry.getPurpose(), durationOfVisit.getDuration());
			Passport passport = new Passport(issuingCountry.getCountry(), name.getName(), dateOfBirth.toString(), sex.getSex(), issuingCity.getCity(), expirationDate.toString(), serialNumber.getSerial(), weight.getWeight(), height.getHeight(), picture.getPictureNumber());
			EntryPermit entryPermit = new EntryPermit(name.getName(), serialNumber.getSerial(), purposeOfEntry.getPurpose(), durationOfVisit.getDuration(), entranceDate.toString());
			WorkPermit workPermit = new WorkPermit(name.getName(), fieldOfWork.getField(), expirationDate.toString());
			DiplomaticAuthorization diplomat = new DiplomaticAuthorization(name.getName(), serialNumber.getSerial(), countriesOfEntry.getCountries());
			
			/** Figures out what is wrong in the papers, if anything */
			ProbabilityGenerator probable = new ProbabilityGenerator();
			String whatIsWrong = probable.whatIsWrong();
			
			/** Executes if nothing is wrong with the papers */
			if (whatIsWrong.equals("Nothing")) {
			}
			
			/** Executes if name is wrong */
			if (whatIsWrong.equals("Name")) {
				if (purposeOfEntry.getPurpose().equals("visit") || purposeOfEntry.getPurpose().equals("travel")) {
					RandomNameGenerator randomName = new RandomNameGenerator(sex.getSex()); // Generates different name for entry permit
					entryPermit.setEntryName(randomName.getName());
					}
				else {
					RandomNameGenerator randomName = new RandomNameGenerator(sex.getSex()); // Generates random name
					int random = (int)(Math.random() * 3);
					if (random == 0) { // Makes the passport have the random name. Entry permit and diplomat/work paper have original name.
						passport.setName(randomName.getName());
					}
					else if (random == 1) { // Makes the entry permit have the random name. Passport and diplomat/work paper have original name.
						entryPermit.setEntryName(randomName.getName());
					}
					else { // Makes the diplomat/work paper have random name. Entry permit has original name.
						diplomat.setDiplomatName(randomName.getName());
						workPermit.setWorkName(randomName.getName());
					}
				}
				
			}
			
			/** Executes if weight is wrong */
			if (whatIsWrong.equals("Weight")) {
				RandomWeightGenerator randomWeight = new RandomWeightGenerator(); // makes random weight and assigns it to passport
				passport.setWeight(randomWeight.getWeight());

			}
			
			/** Executes if height is wrong */
			if (whatIsWrong.equals("Height")) {
				RandomHeightGenerator randomHeight = new RandomHeightGenerator(); // makes random height and assigns it to passport
				passport.setHeight(randomHeight.getHeight());
			}
			
			/** Executes if picture is wrong */
			if (whatIsWrong.equals("Picture")) {
				PictureGenerator randomPicture = new PictureGenerator(sex.getSex()); // makes random picture number and assigns it to passport
				passport.setPictureNumber(randomPicture.getPictureNumber());
			}
			
			/** Executes if purpose is wrong */
			if (whatIsWrong.equals("Purpose of Visit")) {
				PurposeOfEntryGenerator randomPurpose = new PurposeOfEntryGenerator(); // makes random purpose of entry and assigns it to entry permit
				entryPermit.setPurposeOfVisit(randomPurpose.getPurpose());
			}
			
			/** Executes if duration is wrong */
			if (whatIsWrong.equals("Duration of Visit")) {
				DurationOfEntryGenerator randomDuration = new DurationOfEntryGenerator(); // makes random duration of entry and assigns it to entry permit
				entryPermit.setDurationOfVisit(randomDuration.getDuration());
			}
			
			/** Executes if country is wrong */
			if (whatIsWrong.equals("Issuing Country")) {
				int randomNum = (int)(Math.random() * 4);
				switch (randomNum) {
					case 0: passport.setIssueCountry("Hippostan"); break;
					case 1: passport.setIssueCountry("Nation of Flamingo Rock"); break;
					case 2: passport.setIssueCountry("Principality of Ur Mom"); break;
					case 3: passport.setIssueCountry("Yolostan");
				}
			}
			
			/** Executes if date of birth is wrong */
			if (whatIsWrong.equals("Date of Birth")) {
				DateOfBirthGenerator randomDob = new DateOfBirthGenerator(); 	// Generates new date of birth
				randomDob.setYear(2017); 									 	// Sets year of birth to 2017
				passport.setDob(randomDob.toString()); 						 	// Sets passport d.o.b. to newly generated d.o.b.
			}
			
			/** Executes if sex is wrong */
			if (whatIsWrong.equals("Sex")) {
				if (passport.getSex() == 'M')
					passport.setSex(false);
				else
					passport.setSex(true);
			}
			
			/** Executes if city is wrong */
			if (whatIsWrong.equals("Issuing City")) {
				IssuingCountryGenerator randomCountry = new IssuingCountryGenerator(); 		// Generates random country
				while (randomCountry.getCountry().equals(issuingCountry.getCountry()))		// Makes sure it's not the same as original country
						randomCountry = new IssuingCountryGenerator();
				IssuingCityGenerator randomCity = new IssuingCityGenerator(randomCountry.getCountry()); // Generates random city from random country
				passport.setIssueCity(randomCity.getCity());											// Sets it as the city in passport		
			}
			
			/** Executes if expiration date is wrong */
			if (whatIsWrong.equals("Expiration Date")) {
				ExpirationDateGenerator randomEx = new ExpirationDateGenerator(); 	// Generates new date of birth
				randomEx.setYear(2005); 									 		// Sets year of birth to 2005
				passport.setExDate(randomEx.toString()); 						 	// Sets passport expiration date to newly generated expiration date
			}
			
			/** Executes if serial is wrong */
			if (whatIsWrong.equals("Serial Number")) {
				SerialNumberGenerator randomSerial = new SerialNumberGenerator(); // Generates random serial and sets to entry permit
				entryPermit.setSerialNum(randomSerial.getSerial());
			}
			
			/** Executes if entry date is wrong */
			if (whatIsWrong.equals("Date of Entry")) {
				EntranceDateGenerator randomEntranceDate = new EntranceDateGenerator();	 	// Generates new entry date
				randomEntranceDate.setYear(2008); 											// Sets entry date to 2008
				entryPermit.setEntranceDate(randomEntranceDate.toString());					// Sets passport entry date to generated one
			}

			/// Print Character Details
			System.out.println("\nCHARACTER");
			System.out.println("Weight: " + character.getWeight() + " lbs");
			System.out.println("Height: " + character.getHeight() + " in.");
			System.out.println("Duration of visit: " + character.getDurationOfVisit() + " months");
			System.out.println("Purpose of visit: " + character.getPurposeOfVisit());
			
			// Print Passport
			if (!whatIsWrong.equals("Wrong Documents")) {
				System.out.println("\nPASSPORT");
				System.out.println("Name: " + passport.getName());
				System.out.println("Serial Number: " + passport.getIDNum());
				System.out.println("Date of Birth: " + passport.getDob());
				System.out.println("Sex: " + passport.getSex());
				System.out.println("Issuing Country: " + passport.getIssueCountry());
				System.out.println("Issuing City: " + passport.getIssueCity());
				System.out.println("Expiration Date: " + passport.getExDate());
				System.out.println("Weight: " + passport.getWeight() + " lbs");
				System.out.println("Height: " + passport.getHeight() + " in");
			}
			
			// Print Entry Permit
			System.out.println("\nENTRY PERMIT");
			System.out.println("Name: " + entryPermit.getEntryName());
			System.out.println("Serial Number: " + entryPermit.getSerialNum());
			System.out.println("Purpose of Entry: " + entryPermit.getPurposeOfVisit());
			System.out.println("Duration of Visit: " + entryPermit.getDurationOfVisit() + " months");
			System.out.println("Enter by: " + entryPermit.getEntranceDate());
			
			// Print Work Pass
			if (purposeOfEntry.getPurpose().equals("Work")) {
				System.out.println("\nWORK PASS");
				System.out.println("Name: " + workPermit.getWorkName());
				System.out.println("Field of Work: " + workPermit.getFieldOfWork());
				System.out.println("Expiration Date: " + workPermit.getExpDate());
			}
			
			// Print Diplomatic Authorization
			if (purposeOfEntry.getPurpose().equals("Diplomat")) {
			System.out.println("\nDIPLOMATIC AUTHORIZATION");
			System.out.println("Name: " + diplomat.getDiplomatName());
			System.out.println("Serial Number: " + diplomat.getSerialNum());
			System.out.print("Countries of Entry: ");
			for (int i = 0; i < 7; i++) {
				if (countriesOfEntry.getCountries()[i] != null)
					System.out.print(countriesOfEntry.getCountries()[i] + "; ");
				}
			}
			
			PictureGenerator picture1 = new PictureGenerator(true);
			PictureGenerator picture2 = new PictureGenerator(true);
			picture1.setPictureNumber(character.getPictureNumber());
			picture2.setPictureNumber(passport.getPictureNumber());
			
			PrintScreen screen = new PrintScreen(picture1, 1010, 1);
			PrintScreen screen2 = new PrintScreen(picture2, 500, 1);
			
			Scanner input = new Scanner(System.in);
			System.out.print("\nType <a> for Accept or <d> for Deny: ");
			String status = input.next();
			
			//Closes the windows
			screen.setMyVisible(screen.getPassFrame(), false);
			screen2.setMyVisible(screen2.getPassFrame(), false);
			
			/** Prints player score, Keeps track of score, and error */
			System.out.println("\n-------------------------------------------");
			System.out.println("\nWHAT WAS WRONG: " + whatIsWrong);
			if (whatIsWrong.equals("Nothing") && status.equals("d")) 
				score--;
			else if (whatIsWrong.equals("Nothing") && status.equals("a")) 
				score++;
			else if (!whatIsWrong.equals("Nothing") && status.equals("d")) 
				score++;
			else
				score--;
			System.out.println("Your score: " + score);
			System.out.println("\n-------------------------------------------");
			
			var = input.nextLine();
			numOfRuns++;
			
		} while (var != "" && numOfRuns <= 6);
	}
	
	// Story part 1
	@SuppressWarnings("resource")
	public static void Story1() {
		System.out.println("DAY 1.");
		System.out.print("You are living in a small apartment in East Los Angeles.");
		PictureGenerator apartment = new PictureGenerator(true);
		apartment.setPictureNumber(103);
		PrintScreen apt = new PrintScreen(apartment, 1010, 1);
		new Scanner(System.in).nextLine();
		apt.setMyVisible(apt.getPassFrame(), false);


		System.out.print("To help pay for your bills you have taken a job at the Transportation Security Administration.");
		PictureGenerator tsa = new PictureGenerator(true);
		tsa.setPictureNumber(104);
		PrintScreen TSA = new PrintScreen(tsa, 1010, 1);
		new Scanner(System.in).nextLine();	
		System.out.print("Today is the day that you start.");
		new Scanner(System.in).nextLine();
		TSA.setMyVisible(TSA.getPassFrame(), false);
		
		PictureGenerator tyrone = new PictureGenerator(true);
		tyrone.setPictureNumber(100);
		PrintScreen screen = new PrintScreen(tyrone, 1010, 1);
		System.out.print("Hey, what's crackin, lo? It's your homie, DeAndre.");
		new Scanner(System.in).nextLine();
		System.out.print("You actually taking that job at the airport then?");
		new Scanner(System.in).nextLine();
		System.out.print("Fool, soon you'll be leaving all your roots behind. A gangbanger no more!");
		new Scanner(System.in).nextLine();
		System.out.print("You too blind to see it, but this your home! The 'jects and the tweakers and all.");
		new Scanner(System.in).nextLine();
		System.out.print("Try not to forget about your homies.");
		new Scanner(System.in).nextLine();
		screen.setMyVisible(screen.getPassFrame(), false);

		System.out.print("Press ENTER to pick up newspaper.");
		new Scanner(System.in).nextLine();
		PictureGenerator newspaper = new PictureGenerator(true);
		newspaper.setPictureNumber(105);
		PrintScreen news = new PrintScreen(newspaper, 1010, 1);
		
		System.out.print("Press ENTER to go to work.");
		new Scanner(System.in).nextLine();
		news.setMyVisible(news.getPassFrame(), false);
		PictureGenerator tsadude = new PictureGenerator(true);
		tsadude.setPictureNumber(102);
		PrintScreen screen2 = new PrintScreen(tsadude, 1010, 1);
		System.out.print("Hello, I am your supervisor. You call me 'boss'.");
		new Scanner(System.in).nextLine();
		System.out.print("I don't have very high expectations of you. But TRY not to screw up.");
		new Scanner(System.in).nextLine();
		System.out.print("Remember. It's not just your job at stake. It's also my rep.");
		new Scanner(System.in).nextLine();
		System.out.print("I expect great things from you! Or not.");
		new Scanner(System.in).nextLine();
		screen2.setMyVisible(screen2.getPassFrame(), false);
		System.out.print("Press ENTER to begin Day 1.");
		new Scanner(System.in).nextLine();

	}
	
	@SuppressWarnings("resource")
	public static void Story2() {
		System.out.println("DAY 2.");
		System.out.print("Press ENTER to wake up.");
		PictureGenerator apartment = new PictureGenerator(true);
		apartment.setPictureNumber(103);
		PrintScreen apt = new PrintScreen(apartment, 1010, 1);
		new Scanner(System.in).nextLine();
		apt.setMyVisible(apt.getPassFrame(), false);
		
		PictureGenerator tyrone = new PictureGenerator(true);
		tyrone.setPictureNumber(100);
		PrintScreen screen = new PrintScreen(tyrone, 1010, 1);
		System.out.print("Mornin'.");
		new Scanner(System.in).nextLine();
		System.out.print("How'd it go, fool?");
		new Scanner(System.in).nextLine();
		System.out.print("Man, so you making the beaucoup bucks now!");
		new Scanner(System.in).nextLine();
		System.out.print("You in the big league, swimmin with the white man. Me, I'm still in the game.");
		new Scanner(System.in).nextLine();
		System.out.print("Fool, you can swim with the white man, but don't get swallowed up.");
		new Scanner(System.in).nextLine();
		screen.setMyVisible(screen.getPassFrame(), false);
		
		System.out.print("Press ENTER to pick up newspaper.");
		new Scanner(System.in).nextLine();
		PictureGenerator newspaper = new PictureGenerator(true);
		newspaper.setPictureNumber(106);
		PrintScreen news = new PrintScreen(newspaper, 1010, 1);
		
		System.out.print("Press ENTER to go to work.");
		new Scanner(System.in).nextLine();
		news.setMyVisible(news.getPassFrame(), false);
		PictureGenerator tsadude = new PictureGenerator(true);
		tsadude.setPictureNumber(102);
		PrintScreen screen2 = new PrintScreen(tsadude, 1010, 1);
		System.out.print("So your performance yesterday wasn't completely pitiful.");
		new Scanner(System.in).nextLine();
		System.out.print("Keep it up and I might even get a raise.");
		new Scanner(System.in).nextLine();
		System.out.print("Well, what are you waiting around for? Work!");
		new Scanner(System.in).nextLine();
		System.out.print("The bureaucracy ain't going to run itself.");
		new Scanner(System.in).nextLine();
		screen2.setMyVisible(screen2.getPassFrame(), false);
		System.out.print("Press ENTER to begin Day 2.");
		new Scanner(System.in).nextLine();
	}
	
	@SuppressWarnings("resource")
	public static void Story3() {
		System.out.println("DAY 3.");
		System.out.print("Press ENTER to wake up.");
		PictureGenerator apartment = new PictureGenerator(true);
		apartment.setPictureNumber(103);
		PrintScreen apt = new PrintScreen(apartment, 1010, 1);
		new Scanner(System.in).nextLine();
		apt.setMyVisible(apt.getPassFrame(), false);
		
		PictureGenerator tyrone = new PictureGenerator(true);
		tyrone.setPictureNumber(100);
		PrintScreen screen = new PrintScreen(tyrone, 1010, 1);
		System.out.print("Listen.");
		new Scanner(System.in).nextLine();
		System.out.print("You know George? Slim George?");
		new Scanner(System.in).nextLine();
		System.out.print("Rolls with the S.O.C. crew?");
		new Scanner(System.in).nextLine();
		System.out.print("Lately, he been disrespectin' us.");
		new Scanner(System.in).nextLine();
		System.out.print("We gonna do something about it. I'll tell you the details tomorrow.");
		new Scanner(System.in).nextLine();
		screen.setMyVisible(screen.getPassFrame(), false);
		
		System.out.print("Press ENTER to pick up newspaper.");
		new Scanner(System.in).nextLine();
		PictureGenerator newspaper = new PictureGenerator(true);
		newspaper.setPictureNumber(107);
		PrintScreen news = new PrintScreen(newspaper, 1010, 1);
		
		System.out.print("Press ENTER to go to work.");
		new Scanner(System.in).nextLine();
		news.setMyVisible(news.getPassFrame(), false);
		PictureGenerator tsadude = new PictureGenerator(true);
		tsadude.setPictureNumber(102);
		PrintScreen screen2 = new PrintScreen(tsadude, 1010, 1);
		System.out.print("You see the paper this morning?");
		new Scanner(System.in).nextLine();
		System.out.print("People are saying this chicken tax thing might even lead to war.");
		new Scanner(System.in).nextLine();
		System.out.print("How stupid is that?");
		new Scanner(System.in).nextLine();
		System.out.print("I'll answer. Not as stupid as you.");
		new Scanner(System.in).nextLine();
		System.out.print("Get to work!");
		new Scanner(System.in).nextLine();
		screen2.setMyVisible(screen2.getPassFrame(), false);
		System.out.print("Press ENTER to begin Day 3.");
		new Scanner(System.in).nextLine();
	}
	
	@SuppressWarnings("resource")
	public static void Story4() {
		System.out.println("DAY 4.");
		System.out.print("Press ENTER to wake up.");
		PictureGenerator apartment = new PictureGenerator(true);
		apartment.setPictureNumber(103);
		PrintScreen apt = new PrintScreen(apartment, 1010, 1);
		new Scanner(System.in).nextLine();
		apt.setMyVisible(apt.getPassFrame(), false);
		
		PictureGenerator tyrone = new PictureGenerator(true);
		tyrone.setPictureNumber(100);
		PrintScreen screen = new PrintScreen(tyrone, 1010, 1);
		System.out.print("Alright.");
		new Scanner(System.in).nextLine();
		System.out.print("The plan's in motion.");
		new Scanner(System.in).nextLine();
		System.out.print("Tomorrow, we gonna roll up to the S.O.C. hangout.");
		new Scanner(System.in).nextLine();
		System.out.print("We gonna swoop up Slim and rough him up.");
		new Scanner(System.in).nextLine();
		System.out.print("Then we gonna drop him off by the side of the road.");
		new Scanner(System.in).nextLine();
		System.out.print("Maybe then that little hopper gonna think twice about disrespectin' the East side.");
		new Scanner(System.in).nextLine();
		System.out.print("You best be ready. Or are you too padded up living the life of the rich?");
		new Scanner(System.in).nextLine();
		screen.setMyVisible(screen.getPassFrame(), false);
		
		System.out.print("Press ENTER to pick up newspaper.");
		new Scanner(System.in).nextLine();
		PictureGenerator newspaper = new PictureGenerator(true);
		newspaper.setPictureNumber(108);
		PrintScreen news = new PrintScreen(newspaper, 1010, 1);
		
		System.out.print("Press ENTER to go to work.");
		new Scanner(System.in).nextLine();
		news.setMyVisible(news.getPassFrame(), false);
		PictureGenerator tsadude = new PictureGenerator(true);
		tsadude.setPictureNumber(102);
		PrintScreen screen2 = new PrintScreen(tsadude, 1010, 1);
		System.out.print("An FBI agent wants to speak with you today.");
		new Scanner(System.in).nextLine();
		System.out.print("Try not to make a mockery of this department.");
		new Scanner(System.in).nextLine();
		System.out.print("Any more than you already have, of course.");
		new Scanner(System.in).nextLine();
		screen2.setMyVisible(screen2.getPassFrame(), false);
		
		PictureGenerator inspector = new PictureGenerator(true);
		inspector.setPictureNumber(101);
		PrintScreen screen3 = new PrintScreen(inspector, 1010, 1);
		System.out.print("Hello. My name's Inspector Beaumont.");
		new Scanner(System.in).nextLine();
		System.out.print("I just want you to know that I'm on your side. That being said...");
		new Scanner(System.in).nextLine();
		System.out.print("If you see this fellow, goes by the name of DeAndre, I want you to report him to me immediately.");
		PrintScreen screen6 = new PrintScreen(tyrone, 500, 1);
		new Scanner(System.in).nextLine();
		System.out.print("We believe that he is planning a kidnapping of an FBI informant.");
		new Scanner(System.in).nextLine();
		System.out.print("We've been sitting on this cocaine distribution ring for a long time. This informant is valuable to us.");
		new Scanner(System.in).nextLine();
		System.out.print("We don't want our investigation ruined by some 'gang feud'.");
		new Scanner(System.in).nextLine();
		System.out.print("That's all. Goodbye, agent.");
		new Scanner(System.in).nextLine();
		screen3.setMyVisible(screen3.getPassFrame(), false);
		screen6.setMyVisible(screen6.getPassFrame(), false);

		System.out.print("Press ENTER to begin Day 4.");
		new Scanner(System.in).nextLine();
	}
	
	@SuppressWarnings("resource")
	public static void Story5() {
		System.out.println("DAY 5.");
		System.out.print("Press ENTER to wake up.");
		PictureGenerator apartment = new PictureGenerator(true);
		apartment.setPictureNumber(103);
		PrintScreen apt = new PrintScreen(apartment, 1010, 1);
		new Scanner(System.in).nextLine();
		apt.setMyVisible(apt.getPassFrame(), false);
		
		PictureGenerator tyrone = new PictureGenerator(true);
		tyrone.setPictureNumber(100);
		PrintScreen screen = new PrintScreen(tyrone, 1010, 1);
		System.out.print("Let's roll, lo.");
		new Scanner(System.in).nextLine();
		screen.setMyVisible(screen.getPassFrame(), false);
		
		System.out.print("Press ENTER to get into DeAndre's van.");
		new Scanner(System.in).nextLine();
		PictureGenerator mask = new PictureGenerator(true);
		mask.setPictureNumber(109);
		PrintScreen screen2 = new PrintScreen(mask, 1010, 1);
		System.out.print("Alright, we here. Now let's get out, real sneaky-like.");
		new Scanner(System.in).nextLine();
		System.out.print("Actually, screw that. Where Slim at? SLIM, WHERE YOU AT!");
		new Scanner(System.in).nextLine();
		PictureGenerator inspector = new PictureGenerator(true);
		inspector.setPictureNumber(101);
		PrintScreen screen3 = new PrintScreen(inspector, 500, 1);
		System.out.print("Inspector Beaumont: I don't think that will be happening.");
		new Scanner(System.in).nextLine();
		System.out.print("DeAndre: Damn! It's a setup! Run!");
		new Scanner(System.in).nextLine();
		PictureGenerator police = new PictureGenerator(true);
		police.setPictureNumber(110);
		PrintScreen screen4 = new PrintScreen(police, 100, 1);
		PrintScreen screen5 = new PrintScreen(police, 700, 1);
		System.out.print("LAPD! DOWN ON THE GROUND!");
		new Scanner(System.in).nextLine();
		System.out.print("DeAndre: They got me, but not you! Run!!");
		new Scanner(System.in).nextLine();
		System.out.print("DeAndre: This is what you get... for leaving your roots... For dealing with the white man...");
		new Scanner(System.in).nextLine();
		screen2.setMyVisible(screen2.getPassFrame(), false);
		screen2.setMyVisible(screen3.getPassFrame(), false);
		screen2.setMyVisible(screen4.getPassFrame(), false);
		screen2.setMyVisible(screen5.getPassFrame(), false);

		System.out.print("You manage to sneak away as the cops apprehend DeAndre.");
		new Scanner(System.in).nextLine();
		System.out.print("Press ENTER to go home.");
		new Scanner(System.in).nextLine();
	}
	
	@SuppressWarnings("resource")
	public static void Story6() {
		System.out.println("DAY 6.");
		System.out.print("Press ENTER to wake up.");
		PictureGenerator apartment = new PictureGenerator(true);
		apartment.setPictureNumber(103);
		PrintScreen apt = new PrintScreen(apartment, 1010, 1);
		new Scanner(System.in).nextLine();
		apt.setMyVisible(apt.getPassFrame(), false);
		
		System.out.print("Press ENTER to pick up newspaper.");
		new Scanner(System.in).nextLine();
		PictureGenerator newspaper = new PictureGenerator(true);
		newspaper.setPictureNumber(111);
		PrintScreen news = new PrintScreen(newspaper, 1010, 1);
		
		System.out.print("Press ENTER to go to work.");
		new Scanner(System.in).nextLine();
		news.setMyVisible(news.getPassFrame(), false);
		PictureGenerator tsadude = new PictureGenerator(true);
		tsadude.setPictureNumber(102);
		PrintScreen screen2 = new PrintScreen(tsadude, 1010, 1);
		System.out.print("You weren't at work yesterday.");
		new Scanner(System.in).nextLine();
		System.out.print("I don't appreciate that. You're fired.");
		new Scanner(System.in).nextLine();
		System.out.print("Get out.");
		new Scanner(System.in).nextLine();
		
		PictureGenerator inspector = new PictureGenerator(true);
		inspector.setPictureNumber(101);
		PrintScreen screen3 = new PrintScreen(inspector, 500, 1);
		System.out.print("Inspector Beaumont: Sorry, you can't do that.");
		new Scanner(System.in).nextLine();
		System.out.print("This man here has proved his worth to the FBI, assisting in the capture of a dangerous criminal.");
		new Scanner(System.in).nextLine();
		System.out.print("He remains here. Why don't YOU get out.");
		new Scanner(System.in).nextLine();
		System.out.print("Boss: ...");
		new Scanner(System.in).nextLine();
		screen2.setMyVisible(screen2.getPassFrame(), false);

		System.out.print("Let me get down to it.");
		new Scanner(System.in).nextLine();
		System.out.print("A person matching your profile was seen fleeing the crime scene when DeAndre was taken into custody.");
		new Scanner(System.in).nextLine();
		System.out.print("Hopefully that wasn't you. I like you. I don't want to throw you in jail.");
		new Scanner(System.in).nextLine();
		System.out.print("As a reward for your cooperation, I've paid for a better apartment for you. A gift from the FBI.");
		new Scanner(System.in).nextLine();
		screen3.setMyVisible(screen3.getPassFrame(), false);

		System.out.print("Press ENTER to begin Day 6.");
		new Scanner(System.in).nextLine();
	}
	
	@SuppressWarnings("resource")
	public static void Story7() {
		System.out.println("DAY 7.");
		System.out.print("Press ENTER to wake up.");
		PictureGenerator apartment = new PictureGenerator(true);
		apartment.setPictureNumber(114);
		PrintScreen apt = new PrintScreen(apartment, 1010, 1);
		new Scanner(System.in).nextLine();
		apt.setMyVisible(apt.getPassFrame(), false);
		
		System.out.print("Press ENTER to pick up newspaper.");
		new Scanner(System.in).nextLine();
		PictureGenerator newspaper = new PictureGenerator(true);
		newspaper.setPictureNumber(112);
		PrintScreen news = new PrintScreen(newspaper, 1010, 1);
		
		System.out.print("Press ENTER to go to work.");
		new Scanner(System.in).nextLine();
		news.setMyVisible(news.getPassFrame(), false);
		PictureGenerator tsadude = new PictureGenerator(true);
		tsadude.setPictureNumber(102);
		PrintScreen screen2 = new PrintScreen(tsadude, 1010, 1);
		System.out.print("HEY!");
		new Scanner(System.in).nextLine();
		System.out.print("Helping the FBI? What are you, a joke?");
		new Scanner(System.in).nextLine();
		System.out.print("I might not be able to fire you, but I sure can make your life miserable.");
		new Scanner(System.in).nextLine();
		System.out.print("Yesterday night I had a dream where you were exiled to Uru Rock.");
		new Scanner(System.in).nextLine();
		System.out.print("It was pretty sweet, because no one actually lives there except some goats. And they all got killed in the war.");
		new Scanner(System.in).nextLine();
		System.out.print("I wish you would get killed in a war.");
		new Scanner(System.in).nextLine();
		screen2.setMyVisible(screen2.getPassFrame(), false);
		
		PictureGenerator inspector = new PictureGenerator(true);
		inspector.setPictureNumber(101);
		PrintScreen screen3 = new PrintScreen(inspector, 500, 1);
		System.out.print("Hello again. I've got good news and bad news.");
		new Scanner(System.in).nextLine();
		System.out.print("Good news is DeAndre is going to be serving some good hard time.");
		new Scanner(System.in).nextLine();
		System.out.print("Attempted murder will do that.");
		new Scanner(System.in).nextLine();
		System.out.print("Bad news is I'm being pressured to audit your accounts.");
		new Scanner(System.in).nextLine();
		System.out.print("Good thing you've never done anything illegal, correct? Never associated with any gangs? Nothing like that?");
		new Scanner(System.in).nextLine();
		System.out.print("I trust you! You have nothing to fear.");
		new Scanner(System.in).nextLine();
		screen3.setMyVisible(screen3.getPassFrame(), false);

		System.out.print("Press ENTER to begin Day 7.");
		new Scanner(System.in).nextLine();
	}
	
	@SuppressWarnings("resource")
	public static void Story8() {
		System.out.println("DAY 8.");
		System.out.print("Press ENTER to wake up.");
		PictureGenerator apartment = new PictureGenerator(true);
		apartment.setPictureNumber(114);
		PrintScreen apt = new PrintScreen(apartment, 1010, 1);
		new Scanner(System.in).nextLine();
		apt.setMyVisible(apt.getPassFrame(), false);
		
		System.out.print("Press ENTER to pick up newspaper.");
		new Scanner(System.in).nextLine();
		PictureGenerator newspaper = new PictureGenerator(true);
		newspaper.setPictureNumber(113);
		PrintScreen news = new PrintScreen(newspaper, 1010, 1);
		
		System.out.print("Press ENTER to go to work.");
		new Scanner(System.in).nextLine();
		news.setMyVisible(news.getPassFrame(), false);
		PictureGenerator tsadude = new PictureGenerator(true);
		tsadude.setPictureNumber(102);
		PrintScreen screen2 = new PrintScreen(tsadude, 1010, 1);
		System.out.print("I overheard your conversation yesterday.");
		new Scanner(System.in).nextLine();
		System.out.print("You know you're screwed, right.");
		new Scanner(System.in).nextLine();
		System.out.print("'Never done anything illegal'? Fat chance!");
		new Scanner(System.in).nextLine();
		System.out.print("They're going to dig up your past and put you in jail for a long time.");
		new Scanner(System.in).nextLine();
		System.out.print("But I've had a... let's say a change of heart about you.");
		new Scanner(System.in).nextLine();
		System.out.print("I'll help you get out of the country. Gongdong's a nice place. No extradition, for one.");
		new Scanner(System.in).nextLine();
		System.out.print("Honestly, I'd do almost anything if it meant I'd never have to see you again.");
		new Scanner(System.in).nextLine();
		screen2.setMyVisible(screen2.getPassFrame(), false);
		
		PictureGenerator inspector = new PictureGenerator(true);
		inspector.setPictureNumber(101);
		PrintScreen screen3 = new PrintScreen(inspector, 500, 1);
		System.out.print("The audit is going well, but you have some very close ties to DeAndre.");
		new Scanner(System.in).nextLine();
		System.out.print("The man in the van looked a lot like you...");
		new Scanner(System.in).nextLine();
		System.out.print("I don't want to do this, but we might have to detain you for questioning.");
		new Scanner(System.in).nextLine();
		System.out.print("For now, you can keep doing your job.");
		new Scanner(System.in).nextLine();
		System.out.print("If you're innocent, you have nothing to fear.");
		new Scanner(System.in).nextLine();
		screen3.setMyVisible(screen3.getPassFrame(), false);

		System.out.print("Press ENTER to begin Day 8.");
		new Scanner(System.in).nextLine();
	}
	
	@SuppressWarnings("resource")
	public static void Story9() {
		System.out.println("DAY 9.");
		System.out.print("Press ENTER to wake up.");
		PictureGenerator apartment = new PictureGenerator(true);
		apartment.setPictureNumber(114);
		PrintScreen apt = new PrintScreen(apartment, 1010, 1);
		new Scanner(System.in).nextLine();
		System.out.print("*RING*");
		new Scanner(System.in).nextLine();
		
		PictureGenerator tsadude = new PictureGenerator(true);
		tsadude.setPictureNumber(115);
		PrintScreen screen2 = new PrintScreen(tsadude, 500, 1);
		System.out.print("I've got you your passport.");
		new Scanner(System.in).nextLine();
		System.out.print("One benefit of working for the TSA is knowing these inside and out.");
		new Scanner(System.in).nextLine();
		System.out.print("This forgery will get you past any security.");
		new Scanner(System.in).nextLine();
		System.out.print("Your ticket out is to board Gongdong Air Flight 666.");
		new Scanner(System.in).nextLine();
		System.out.print("Good luck.");
		new Scanner(System.in).nextLine();
		screen2.setMyVisible(screen2.getPassFrame(), false);
		
		System.out.print("Press ENTER to pack your bags.");
		new Scanner(System.in).nextLine();
		System.out.print("POLICE! OPEN UP!");
		new Scanner(System.in).nextLine();
		System.out.print("LAPD!");
		new Scanner(System.in).nextLine();
		
		PictureGenerator police = new PictureGenerator(true);
		police.setPictureNumber(110);
		PrintScreen screen3 = new PrintScreen(police, 500, 1);
		PrintScreen screen4 = new PrintScreen(police, 200, 1);
		System.out.print("YOU'RE UNDER ARREST!");
		new Scanner(System.in).nextLine();
		System.out.print("Press ENTER to jump out the window.");
		new Scanner(System.in).nextLine();
		System.out.print("STOP! WE WILL SHOOOT!");
		new Scanner(System.in).nextLine();
		apt.setMyVisible(apt.getPassFrame(), false);
		screen3.setMyVisible(screen3.getPassFrame(), false);
		screen4.setMyVisible(screen4.getPassFrame(), false);

		System.out.print("Press ENTER to go to the airport.");
		new Scanner(System.in).nextLine();
		
		System.out.print("You swipe your badge on a key reader. Surprisingly, it still works.");
		new Scanner(System.in).nextLine();
		System.out.print("You sneak around security using maintenance and staff-only hallways.");
		new Scanner(System.in).nextLine();
		System.out.print("Eventually, you make your way to the Gondong Air Terminal.");
		PictureGenerator airplane = new PictureGenerator(true);
		airplane.setPictureNumber(116);
		PrintScreen screen5 = new PrintScreen(airplane, 1010, 1);
		System.out.print("'Welcome to Gongdong Airlines. We are now boarding Flight 666.'");
		new Scanner(System.in).nextLine();
		System.out.print("As you take off, you look behind you at the airport.");
		new Scanner(System.in).nextLine();
		System.out.print("You realize it is time for your new life.");
		new Scanner(System.in).nextLine();
		screen5.setMyVisible(screen5.getPassFrame(), false);
		
	}
	
	@SuppressWarnings("resource")
	public static void Story10() {
		System.out.println("DAY 10.");
		System.out.print("Press ENTER to wake up.");
		new Scanner(System.in).nextLine();
		PictureGenerator airport = new PictureGenerator(true);
		airport.setPictureNumber(117);
		PrintScreen screen1 = new PrintScreen(airport, 1010, 1);
		System.out.print("The airplane has arrived at Jincheng International Airport.");
		new Scanner(System.in).nextLine();
		System.out.print("Used to the amount of paperwork required to enter the U.S., you begin taking your papers out.");
		new Scanner(System.in).nextLine();
		System.out.print("You hand your entry permit, work pass, and passport to the customs official.");
		new Scanner(System.in).nextLine();
		System.out.print("'What is this crap?!'");
		new Scanner(System.in).nextLine();
		System.out.print("'You don't need any of this! Just give me your passport!'");
		new Scanner(System.in).nextLine();
		System.out.print("Without so much as reading your passport, she stamps it and waves you on.");
		new Scanner(System.in).nextLine();
		System.out.print("'But.. I don't understand!', you say. 'What about forgeries? What about... terrorists!'");
		new Scanner(System.in).nextLine();
		System.out.print("'It has never happened here. Maybe it never will', she responds.");
		new Scanner(System.in).nextLine();
		System.out.print("Hardly believing your luck, you enter your new home.");
		new Scanner(System.in).nextLine();
		screen1.setMyVisible(screen1.getPassFrame(), false);
		
		PictureGenerator flag = new PictureGenerator(true);
		flag.setPictureNumber(118);
		PrintScreen screen2 = new PrintScreen(flag, 1010, 1);
		System.out.print("You look at the flag.");
		new Scanner(System.in).nextLine();
		System.out.print("Gongdong above all.");
		new Scanner(System.in).nextLine();
		screen2.setMyVisible(screen2.getPassFrame(), false);
		System.out.println("FIN.");
	}
	
}