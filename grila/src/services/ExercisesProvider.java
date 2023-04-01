package services;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import model.Category;
import model.Difficulty;
import model.Exercise;

public class ExercisesProvider {

	/*
	 * HashSet nu garanteaza ordinea elementelor deci intrebarile vor fi afisate on
	 * ordine casuala
	 */
	public static Set<Exercise> getExercosesByCategory(Category category, Difficulty difficulty) {
		Set<Exercise> exercises = new HashSet<Exercise>();
		exercises.add(new Exercise("Who created the C programming Language?",
				Map.of("Ken Thompson", 0, "Dennis Ritchie", 25, "Robin Milner", 0, "Frieder Nake", 0),
				Category.COMPUTING, Difficulty.EASY));
		exercises.add(new Exercise("Which one is the first high level programming language",
				Map.of("C", 0, "COBOL", 0, "FORTRAN", 25, "C++", 0), Category.COMPUTING, Difficulty.EASY));
		exercises.add(new Exercise("Which one is volatile memory in a computer system",
				Map.of("HardDisk", 0, "RAM", 25, "ROM", 0, "Optical Drive", 0), Category.COMPUTING, Difficulty.EASY));
		exercises.add(new Exercise("One Terabyte (1 TB) is equal to",
				Map.of("1028GB", 0, "1012GB", 0, "1000GB", 0, "1024GB", 25), Category.COMPUTING, Difficulty.EASY));
		exercises.add(new Exercise("What is the biggest ocean in the world?",
				Map.of("Atlantic Ocean", 0, "Arctic Ocean", 0, "Pacific Ocean", 25, "Indian Ocean", 0),
				Category.HISTORY, Difficulty.EASY));
		exercises.add(new Exercise("Who was the first President of the USA?",
				Map.of("George Bush", 0, "George W.Bush", 0, "George Washington", 25, "Ronald Reagan", 0),
				Category.HISTORY, Difficulty.EASY));
		exercises.add(new Exercise("Which war started in 1939 and ended in 1945?",
				Map.of("World War I", 0, "The Vietnam Ward", 0, "World War II", 25, "The Falklands War", 0),
				Category.HISTORY, Difficulty.EASY));
		exercises.add(new Exercise("What colour was the Statue of Liberty originally?",
				Map.of("White", 0, "Green", 0, "Cooper", 25, "Yellow", 0), Category.HISTORY, Difficulty.EASY));
		exercises.add(new Exercise("What is the world's largest continent?",
				Map.of("Africa", 0, "Europe", 0, "North America", 0, "Asia", 25), Category.GEOGRAPHY, Difficulty.EASY));
		exercises.add(new Exercise("What is the oldest active volcano on Earth?",
				Map.of("Loa", 0, "Etna", 25, "Fuji", 0, "Kilimanjaro", 0), Category.GEOGRAPHY, Difficulty.EASY));
		exercises.add(new Exercise("What is the smallest country in the world?",
				Map.of("San Marino", 0, "Vatican City", 25, "Nauru", 0, "Tuvalu", 0), Category.GEOGRAPHY,
				Difficulty.EASY));
		exercises.add(new Exercise("Which country has the most volcanoes?",
				Map.of("USA", 25, "Russia", 0, "Chile", 0, "Philippines", 0), Category.GEOGRAPHY, Difficulty.EASY));
		exercises.add(new Exercise("Who wrote The Iliad?",
				Map.of("Euripides", 0, "Beowulf", 0, "Homer", 25, "Virgil", 0), Category.LITERATURE, Difficulty.EASY));
		exercises.add(new Exercise("Don Quixote was written in which language?",
				Map.of("Old English", 0, "Italian", 0, "Greek", 0, "Spanish", 25), Category.LITERATURE,
				Difficulty.EASY));
		exercises.add(new Exercise("Sir Walter Scott is known for his historical novels about which country?",
				Map.of("Ireland", 0, "Scotland", 25, "England", 0, "Wales", 0), Category.LITERATURE, Difficulty.EASY));
		exercises.add(new Exercise("John Milton’s Paradise Lost was written during which century?",
				Map.of("1400’s", 0, "1500’s", 0, "1600’s", 0, "1700’s", 25), Category.LITERATURE, Difficulty.EASY));
		exercises.add(new Exercise("Which river flows through Paris?",
				Map.of("Meuse", 0, "Dordogne", 0, "Seine", 25, "Garonne", 0), Category.GEOGRAPHY, Difficulty.MEDIUM));
		exercises.add(new Exercise("What is Europe’s largest port?",
				Map.of("Rotterdam", 25, "Antwerp", 0, "Bremen", 0, "Hamburg", 0), Category.GEOGRAPHY,
				Difficulty.MEDIUM));
		exercises.add(new Exercise("Which European country shares its border with the most neighbours (nine)?",
				Map.of("Germany", 25, "Russia", 0, "Italy", 0, "Spain", 0), Category.GEOGRAPHY, Difficulty.MEDIUM));
		exercises
				.add(new Exercise("What is the only country with a coastline on both the Red Sea and the Persian Gulf?",
						Map.of("Saudi Arabia", 25, "Russia", 0, "Belgium", 0, "Italy", 0), Category.GEOGRAPHY,
						Difficulty.MEDIUM));
		exercises.add(new Exercise("Which US President was assassinated by Lee Harvey Oswald?",
				Map.of("John F Kennedy", 25, "Richard Nixon", 0, "George Washington", 0, "Franklin Roosevelt", 0),
				Category.HISTORY, Difficulty.MEDIUM));
		exercises.add(new Exercise("Who was the first Lord Protector of England after the Civil War?",
				Map.of("John Duke of Bedford", 0, "Richard Plantagenet", 0, "John Stewart", 0, "Oliver Cromwell", 25),
				Category.HISTORY, Difficulty.MEDIUM));
		exercises.add(new Exercise("Who was the longest serving US President?",
				Map.of("Franklin D Roosevelt", 25, "Richard Nixon", 0, "Thomas Jefferson", 0, "John F Kennedy", 0),
				Category.HISTORY, Difficulty.MEDIUM));
		exercises.add(new Exercise("Who led the Chinese revolution, becoming chairman of the Communist Party in 1949?",
				Map.of("Mao Zedong", 25, "Kim-Jao Lao", 0, "Lee Jon", 0, "Lee Fen", 0), Category.HISTORY,
				Difficulty.MEDIUM));
		exercises.add(new Exercise("Who wrote 'On Beauty' and 'White Teeth'?",
				Map.of("Phileas Fogg", 0, "John Wyndham", 0, "James Fenimore Cooper", 0, "Zadie Smith", 25),
				Category.LITERATURE, Difficulty.MEDIUM));
		exercises.add(new Exercise("Name the first book in the Noughts and Crosses series?",
				Map.of("A hare", 0, "A dog", 0, "A mount", 0, "Black and White", 25), Category.LITERATURE,
				Difficulty.MEDIUM));
		exercises.add(
				new Exercise("Ustinov has portrayed  detective Hercule Poirot in films. What nationality was Poirot?",
						Map.of("Belgian", 25, "Russian", 0, "Italian", 0, "Spanish", 0), Category.LITERATURE,
						Difficulty.MEDIUM));
		exercises.add(new Exercise("Who wrote The Last of the Mohicans?",
				Map.of("James Fenimore Cooper", 25, "Uriah Heap", 0, "Jane Eyre", 0, "Jim Hawkins", 0),
				Category.LITERATURE, Difficulty.MEDIUM));
		exercises.add(new Exercise("What doest the letter S stand for in Web terminology HTTPS",
				Map.of("Safe", 0, "Secure", 25, "Short", 0, "Shorter", 0), Category.COMPUTING, Difficulty.MEDIUM));
		exercises.add(new Exercise("Which one is the default extention of 20007 office word document",
				Map.of(".doc", 0, ".docx", 25, ".xls", 0, ".pdf", 0), Category.COMPUTING, Difficulty.MEDIUM));
		exercises.add(new Exercise("Who is the founder of Bluetooth",
				Map.of("Ericsson", 25, "IBM", 0, "Apple", 0, "Dell", 0), Category.COMPUTING, Difficulty.MEDIUM));
		exercises.add(new Exercise("Which one is a direct entry input device",
				Map.of("Key-to-doskette", 0, "Mouse", 25, "Punched Card", 0, "Computer Terminal", 0),
				Category.COMPUTING, Difficulty.MEDIUM));
		exercises.add(new Exercise("Who was the youngest Prime Minister in British history?",
				Map.of("William Pitt The Younger", 25, "Tony Blair", 0, "Margaret Thatcher", 0, "Gordon Brown", 0),
				Category.HISTORY, Difficulty.HARD));
		exercises.add(new Exercise("Which Roman emperor declared war on Neptune, God of the sea?",
				Map.of("Caligula", 25, "Nero", 0, "Claudius", 0, "Augustus", 0), Category.HISTORY, Difficulty.HARD));
		exercises.add(new Exercise("Which mythical beast could turn you to stone?",
				Map.of("A vampire", 0, "A gorgon", 25, "A chimera", 0, "A hydra", 0), Category.HISTORY,
				Difficulty.HARD));
		exercises.add(new Exercise("Which French fortress played a pivotal role in 18th-century politics?",
				Map.of("Carcassonne", 0, "Foix", 0, "Josselin", 0, "Bastile", 25), Category.HISTORY, Difficulty.HARD));
		exercises.add(new Exercise("What is the largest desert in this list?",
				Map.of("Sahara", 25, "Gobi", 0, "Kalahari", 0, "Great Victoria", 0), Category.GEOGRAPHY,
				Difficulty.HARD));
		exercises.add(new Exercise("In which US state would you find Fort Knox?",
				Map.of("Texas", 0, "Kentucky", 25, "Florida", 0, "Utah", 0), Category.GEOGRAPHY, Difficulty.HARD));
		exercises.add(new Exercise(
				"Dracula  lived in the historical region of Transylvania in which country is this castle?",
				Map.of("Russia", 0, "Romania", 25, "Italy", 0, "Belgium", 0), Category.GEOGRAPHY, Difficulty.HARD));
		exercises.add(new Exercise("Mount Vesuvius overlooks which present-day Italian city?",
				Map.of("Torino", 0, "Rome", 0, "Milan", 0, "Naples", 25), Category.GEOGRAPHY, Difficulty.HARD));

		exercises.add(new Exercise("Moving processes from the main memory to disc is called",
				Map.of("Scheduling", 0, "Caching", 0, "Paging", 25, "Spooling", 0), Category.COMPUTING,
				Difficulty.HARD));
		exercises.add(new Exercise("Basic Interface in ISDN refers to the transmission speed of",
				Map.of("64 Kbps", 0, "128 Kbps", 0, "144 Kbps", 25, "250 Kbps", 0), Category.COMPUTING,
				Difficulty.HARD));
		exercises.add(new Exercise("What is the default port number of POP3",
				Map.of("28", 0, "50", 0, "32", 0, "110", 25), Category.COMPUTING, Difficulty.HARD));
		exercises.add(new Exercise("What is the default port number of SMTP",
				Map.of("34", 0, "62", 0, "25", 25, "110", 0), Category.COMPUTING, Difficulty.HARD));

		exercises.add(new Exercise(
				"Which two cities provide the setting for Charles Dickens\u2019s \u2018A Tale of Two Cities\u2019?",
				Map.of("London and Paris", 25, "Moscow and Washington D.C", 0, "Amsterdam and London", 0,
						"Rome and Madrid", 0),
				Category.LITERATURE, Difficulty.HARD));
		exercises.add(new Exercise(
				"What are the names of the three \u2018Darling\u2019 children in J.M. Barrie\u2019s \u2018Peter Pan\u2019?",
				Map.of("Annie,Ashe,Brandon", 0, "John,Levi,Michael", 0, "Wendy,John,Michael", 25, "Joe,Robert,Luke", 0),
				Category.LITERATURE, Difficulty.HARD));
		exercises.add(new Exercise("Which cartoon animal is owned by Jon Arbuckle?",
				Map.of("Donald Duck", 0, "Garfield", 25, "Mickey Mouse", 0, "Tom and Jerry", 0), Category.LITERATURE,
				Difficulty.HARD));
		exercises.add(new Exercise("Which Shakespearean play features the characters of Goneril, Regan and Cordelia?",
				Map.of("King Joe", 0, "King John", 0, "King Lear", 25, "King Elliot", 0), Category.LITERATURE,
				Difficulty.HARD));

		return exercises.stream()
				.filter(exercise -> exercise.getCategory() == category && exercise.getDifficulty() == difficulty)
				.collect(Collectors.toSet());
	}
}
