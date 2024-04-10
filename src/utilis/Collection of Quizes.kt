package utilis

val animalQuestions: List<Pair<Pair<String, String>, List<String>>> = listOf(
    ("Welches Tier hat den längsten Hals auf der Welt?" to "Giraffe") to listOf("Elefant", "Krokodil", "Nashorn"),
    ("Welche Tierart ist bekannt für ihre schwarz-weißen Streifen?" to "Zebra") to listOf("Giraffe", "Panda", "Löwe"),
    ("Welches Raubtier ist das schnellste auf dem Land?" to "Gepard") to listOf("Löwe", "Leopard", "Tiger"),
    ("Welches Tier kann am längsten ohne Wasser auskommen?" to "Kamel") to listOf("Giraffe", "Elefant", "Nashorn"),
    ("Welches Tier hat den besten Geruchssinn?" to "Hund") to listOf("Katze", "Fuchs", "Wolf"),
    ("Welche Vogelart kann am längsten ohne zu landen fliegen?" to "Albatros") to listOf("Sperber", "Schwalbe", "Möwe"),
    ("Wie nennt man die größte Affenart?" to "Gorilla") to listOf("Orang-Utan", "Schimpanse", "Mandrill"),
    ("Welches Tier ist dafür bekannt, die meisten Tricks zu lernen?" to "Schimpanse") to listOf(
        "Delfin",
        "Papagei",
        "Hund"
    ),
    ("Welches Tier hat die längsten Hörner?" to "Elenantilope") to listOf("Büffel", "Antilope", "Ziege"),
    ("Welche Tierart ist für ihre Wanderungen über große Entfernungen bekannt?" to "Gnu") to listOf(
        "Bison",
        "Zebra",
        "Springbock"
    ),
    ("Welches Tier hat das größte Gehirn im Tierreich?" to "Pottwal") to listOf("Elefant", "Orca", "Delphin"),
    ("Wie nennt man die schnellste Vogelart?" to "Wanderfalke") to listOf("Adler", "Geier", "Bussard"),
    ("Welches Tier ist dafür bekannt, den höchsten Sprung zu machen?" to "Leopard") to listOf(
        "Löwe",
        "Gepard",
        "Tiger"
    ),
    ("Welches Tier hat den besten Tastsinn?" to "Elefant") to listOf("Nashorn", "Flusspferd", "Nilpferd"),
    ("Welche Tierart ist dafür bekannt, eine große Entfernung in einer einzigen Nacht zurückzulegen?" to "Waldelefant") to listOf(
        "Afrikanischer Elefant",
        "Indischer Elefant",
        "Sumatra-Elefant"
    ),
    ("Welches Tier ist das größte auf dem Land?" to "Afrikanischer Elefant") to listOf(
        "Nashorn",
        "Flusspferd",
        "Nilpferd"
    ),
    ("Welches Tier hat die größten Zähne im Tierreich?" to "Mammut") to listOf("Elefant", "Nilpferd", "Nashorn"),
    ("Welches Tier ist dafür bekannt, im Wasser zu schlafen?" to "Seekuh") to listOf("Otter", "Seelöwe", "Delfin"),
    ("Welches Tier ist der größte lebende Vogel?" to "Strauß") to listOf("Emu", "Kasuar", "Pinguin"),
    ("Welches Tier kann am längsten ohne Essen auskommen?" to "Krokodil") to listOf(
        "Alligator",
        "Schildkröte",
        "Echse"
    ),
    ("Welche Tierart kann giftigsten Biss abgeben?" to "Königskobra") to listOf(
        "Schwarze Mamba",
        "Grüne Mamba",
        "Korallenschlange"
    ),
    ("Welches Tier ist der beste Kletterer?" to "Gibbon") to listOf("Orang-Utan", "Schimpanse", "Mandrill"),
    ("Welches Tier kann am besten tauchen?" to "Pinguin") to listOf("Robbe", "Tintenfisch", "Wal"),
    ("Welches Tier ist das schnellste auf dem Wasser?" to "Sailfish") to listOf("Haifisch", "Thunfisch", "Delphin"),
    ("Welches Tier hat den längsten Schwanz?" to "Giraffe") to listOf("Löwe", "Tiger", "Leopard"),
    ("Welches Tier kann am besten schleichen?" to "Tiger") to listOf("Löwe", "Leopard", "Gepard"),
    ("Welches Tier hat den höchsten IQ?" to "Schimpanse") to listOf("Delfin", "Elefant", "Papagei"),
    ("Welches Tier hat das beste Gehör?" to "Elefant") to listOf("Flusspferd", "Nashorn", "Nilpferd"),
    ("Welches Tier hat den größten Appetit?" to "Blauwal") to listOf("Elefant", "Hippo", "Nashorn")
)       // Collection of animal questions with their answer and 3 options for wrong answers
val geographyQuestions: List<Pair<Pair<String, String>, List<String>>> = listOf(
    ("Was ist der längste Fluss der Welt?" to "Amazonas") to listOf("Nil", "Jangtse", "Mississippi"),
    ("Welches Land hat die größte Landfläche?" to "Russland") to listOf("Kanada", "China", "USA"),
    ("Welcher Berg ist der höchste der Welt?" to "Mount Everest") to listOf("K2", "Kangchendzönga", "Lhotse"),
    ("Welches Land hat die meisten Nachbarländer?" to "China") to listOf("Russland", "Deutschland", "Brasilien"),
    ("In welchem Kontinent liegt die Sahara?" to "Afrika") to listOf("Asien", "Australien", "Südamerika"),
    ("Welches ist der größte Ozean der Welt?" to "Pazifischer Ozean") to listOf(
        "Atlantischer Ozean",
        "Indischer Ozean",
        "Arktischer Ozean"
    ),
    ("Was ist die Hauptstadt von Kanada?" to "Ottawa") to listOf("Toronto", "Montreal", "Vancouver"),
    ("Welcher US-Bundesstaat ist der größte nach Fläche?" to "Alaska") to listOf("Kalifornien", "Texas", "Montana"),
    ("Wie heißt das größte Korallenriff der Welt?" to "Great Barrier Reef") to listOf(
        "Rotes Meer Korallenriff",
        "Karibisches Riff",
        "Neukaledonisches Barriereriff"
    ),
    ("Welcher Fluss fließt durch Paris?" to "Seine") to listOf("Rhein", "Loire", "Themse"),
    ("Welches ist das kleinste Land der Welt?" to "Vatikanstadt") to listOf("Monaco", "San Marino", "Liechtenstein"),
    ("Was ist der tiefste Punkt der Erde?" to "Marianengraben") to listOf("Totes Meer", "Baikalsee", "Tanganyikasee"),
    ("Welcher ist der längste Gebirgszug der Welt?" to "Anden") to listOf("Himalaya", "Rocky Mountains", "Alpen"),
    ("Welche Stadt ist als 'Die Stadt der sieben Hügel' bekannt?" to "Rom") to listOf(
        "Istanbul",
        "Lissabon",
        "San Francisco"
    ),
    ("In welchem Land liegt der Viktoriasee?" to "Geteilt zwischen Tansania, Uganda und Kenia") to listOf(
        "Ägypten",
        "Südafrika",
        "Marokko"
    ),
    ("Welches Land ist als 'Land der aufgehenden Sonne' bekannt?" to "Japan") to listOf(
        "Südkorea",
        "China",
        "Thailand"
    ),
    ("Was ist die größte Insel der Welt?" to "Grönland") to listOf("Neuguinea", "Madagaskar", "Borneo"),
    ("Welches Land ist von anderen Ländern komplett umschlossen?" to "Lesotho") to listOf(
        "Bhutan",
        "Luxemburg",
        "Vatikanstadt"
    ),
    ("Welches Land hat die längste Küstenlinie?" to "Kanada") to listOf("Indonesien", "Russland", "Australien"),
    ("Wie heißt der größte Wüstenkontinent?" to "Antarktika") to listOf("Afrika", "Asien", "Australien")
)   // Collection of geography questions with their answer and 3 options for wrong answers
val historyQuestions: List<Pair<Pair<String, String>, List<String>>> = listOf(
    ("Wer war der erste Präsident der Vereinigten Staaten?" to "George Washington") to listOf(
        "Thomas Jefferson",
        "Abraham Lincoln",
        "John Adams"
    ),
    ("Welches Weltwunder befand sich in der Stadt Babylon?" to "Hängende Gärten") to listOf(
        "Pyramiden von Gizeh",
        "Koloss von Rhodos",
        "Leuchtturm von Alexandria"
    ),
    ("Aus welchem Land stammte der berühmte Seefahrer Christoph Kolumbus?" to "Italien") to listOf(
        "Spanien",
        "Portugal",
        "England"
    ),
    ("Welches Ereignis wird oft als Beginn des Zweiten Weltkriegs angesehen?" to "Deutsche Invasion Polens 1939") to listOf(
        "Japanischer Angriff auf Pearl Harbor",
        "Hitlers Machtergreifung",
        "Italienischer Angriff auf Äthiopien"
    ),
    ("Wer führte die russische Revolution im Jahre 1917 an?" to "Wladimir Lenin") to listOf(
        "Josef Stalin",
        "Leon Trotzki",
        "Nikolaus II."
    ),
    ("In welchem Jahr fiel die Berliner Mauer?" to "1989") to listOf("1991", "1987", "1990"),
    ("Welcher römische Kaiser soll Rom angezündet haben?" to "Nero") to listOf("Caligula", "Augustus", "Tiberius"),
    ("Was war der Hauptzweck der Seidenstraße?" to "Handelsroute zwischen Asien und Europa") to listOf(
        "Militärischer Verteidigungsweg",
        "Pilgerpfad",
        "Wanderweg"
    ),
    ("Welche berühmte Schlacht ereignete sich 1066 in England?" to "Schlacht von Hastings") to listOf(
        "Schlacht bei Waterloo",
        "Schlacht von Trafalgar",
        "Schlacht von Agincourt"
    ),
    ("Wer schrieb die Unabhängigkeitserklärung der Vereinigten Staaten?" to "Thomas Jefferson") to listOf(
        "George Washington",
        "John Adams",
        "Benjamin Franklin"
    ),
    ("Welche Dynastie regierte China am längsten?" to "Zhou-Dynastie") to listOf(
        "Qing-Dynastie",
        "Ming-Dynastie",
        "Han-Dynastie"
    ),
    ("Welches Ereignis markierte das Ende des Mittelalters in Europa?" to "Fall von Konstantinopel") to listOf(
        "Entdeckung Amerikas",
        "Schwarzer Tod",
        "Hundertjähriger Krieg"
    ),
    ("Wer war der erste Kaiser von Frankreich?" to "Napoleon Bonaparte") to listOf(
        "Ludwig XIV.",
        "Karl der Große",
        "Louis XVI."
    ),
    ("In welchem Krieg kämpfte Florenz Nightingale?" to "Krimkrieg") to listOf(
        "Erster Weltkrieg",
        "Zweiter Weltkrieg",
        "Französisch-Indischer Krieg"
    ),
    ("Welche antike Zivilisation baute die Pyramiden von Gizeh?" to "Altes Ägypten") to listOf(
        "Das Römische Reich",
        "Die Maya",
        "Die Azteken"
    ),
    ("Welche historische Figur ist für die Reformation bekannt?" to "Martin Luther") to listOf(
        "Johannes Calvin",
        "Heinrich VIII.",
        "Ignatius von Loyola"
    ),
    ("Welche Stadt war die Hauptstadt des Byzantinischen Reiches?" to "Konstantinopel") to listOf(
        "Rom",
        "Athen",
        "Alexandria"
    ),
    ("In welchem Jahr wurde Indien unabhängig?" to "1947") to listOf("1948", "1950", "1952"),
    ("Wer war der Anführer der Normannen während der Schlacht von Hastings?" to "Wilhelm der Eroberer") to listOf(
        "Harald Godwinson",
        "Harald Hardrada",
        "Richard Löwenherz"
    ),
    ("Welche Erfindung endete die Mittelalterliche Ära und begann die Renaissance?" to "Buchdruck") to listOf(
        "Kompass",
        "Pulver",
        "Teleskop"
    )
)   // Collection of history questions with their answer and 3 options for wrong answers
val politicsQuestions: List<Pair<Pair<String, String>, List<String>>> = listOf(
    ("Welches Land hat das älteste durchgehend bestehende Parlament der Welt?" to "Island") to listOf(
        "Großbritannien",
        "Dänemark",
        "San Marino"
    ),
    ("Wer war der erste Bundeskanzler der Bundesrepublik Deutschland?" to "Konrad Adenauer") to listOf(
        "Willy Brandt",
        "Helmut Schmidt",
        "Ludwig Erhard"
    ),
    ("In welchem Jahr fiel die Berliner Mauer?" to "1989") to listOf("1987", "1991", "1990"),
    ("Welche Ideologie prägte Karl Marx?" to "Kommunismus") to listOf("Kapitalismus", "Anarchismus", "Sozialismus"),
    ("Wer war der erste weibliche Premierminister Großbritanniens?" to "Margaret Thatcher") to listOf(
        "Theresa May",
        "Angela Merkel",
        "Indira Gandhi"
    ),
    ("Was ist die Hauptaufgabe der Vereinten Nationen?" to "Förderung des Weltfriedens und der internationalen Sicherheit") to listOf(
        "Weltweite Wirtschaftsförderung",
        "Regulierung des internationalen Handels",
        "Entwicklungshilfe"
    ),
    ("Wie viele Mitgliedsstaaten hat die Europäische Union aktuell?" to "27") to listOf("28", "26", "25"),
    ("Wer war der erste Präsident der Sowjetunion?" to "Michail Gorbatschow") to listOf(
        "Wladimir Lenin",
        "Josef Stalin",
        "Leonid Breschnew"
    ),
    ("In welchem Land begann der Arabische Frühling?" to "Tunesien") to listOf("Ägypten", "Libyen", "Syrien"),
    ("Welche zwei Parteien dominieren das politische System der Vereinigten Staaten?" to "Demokraten und Republikaner") to listOf(
        "Konservative und Liberale",
        "Grüne und Liberale",
        "Fortschrittliche und Konservative"
    ),
    ("Welches Land wurde als erstes von einer kommunistischen Partei regiert?" to "Russland") to listOf(
        "China",
        "Kuba",
        "Nordkorea"
    ),
    ("Welcher deutsche Politiker wurde als 'Der Eiserne Kanzler' bekannt?" to "Otto von Bismarck") to listOf(
        "Wilhelm II.",
        "Adolf Hitler",
        "Angela Merkel"
    ),
    ("Wer war der längst amtierende Präsident der USA?" to "Franklin D. Roosevelt") to listOf(
        "Theodore Roosevelt",
        "George Washington",
        "Abraham Lincoln"
    ),
    ("In welcher Stadt befindet sich der Internationale Gerichtshof?" to "Den Haag") to listOf(
        "Genf",
        "New York",
        "Brüssel"
    ),
    ("Welches Land hat eine weibliche Premierministerin im Jahr 2022?" to "Finnland") to listOf(
        "Schweden",
        "Norwegen",
        "Dänemark"
    ),
    ("Was war der Kalte Krieg?" to "Politische und militärische Spannung zwischen den USA und der Sowjetunion") to listOf(
        "Konflikt zwischen Nord- und Südkorea",
        "Krieg zwischen den NATO-Staaten und dem Warschauer Pakt",
        "Wirtschaftskrieg zwischen Ost und West"
    ),
    ("Welche Farbe wird häufig mit der Umweltbewegung in Verbindung gebracht?" to "Grün") to listOf(
        "Blau",
        "Rot",
        "Gelb"
    ),
    ("Wer war der erste afroamerikanische Präsident der USA?" to "Barack Obama") to listOf(
        "Colin Powell",
        "Martin Luther King Jr.",
        "Jesse Jackson"
    ),
    ("Welcher Präsident führte Russland während des Übergangs vom Kommunismus zur Marktwirtschaft?" to "Boris Jelzin") to listOf(
        "Wladimir Putin",
        "Dmitri Medwedew",
        "Michail Gorbatschow"
    ),
    ("In welchem Land wurde die Apartheid offiziell 1991 beendet?" to "Südafrika") to listOf(
        "Australien",
        "USA",
        "Brasilien"
    )
)   // Collection of politics questions with their answer and 3 options for wrong answers
val scienceQuestions: List<Pair<Pair<String, String>, List<String>>> = listOf(
    ("Was ist die chemische Formel für Wasser?" to "H2O") to listOf("CO2", "H2O2", "O2"),
    ("Was ist die am häufigsten vorkommende Gas in der Erdatmosphäre?" to "Stickstoff") to listOf(
        "Sauerstoff",
        "Kohlendioxid",
        "Argon"
    ),
    ("Welches Element hat das Periodensystem-Symbol 'Au'?" to "Gold") to listOf("Silber", "Platin", "Kupfer"),
    ("Wer stellte die Relativitätstheorie auf?" to "Albert Einstein") to listOf(
        "Isaac Newton",
        "Stephen Hawking",
        "Niels Bohr"
    ),
    ("Was ist der nächstgelegene Stern zur Erde nach der Sonne?" to "Proxima Centauri") to listOf(
        "Sirius",
        "Alpha Centauri",
        "Betelgeuse"
    ),
    ("Was ist der Hauptunterschied zwischen Reptilien und Amphibien?" to "Reptilien sind wechselwarm und legen Eier mit ledriger Schale, während Amphibien oft einen Teil ihres Lebens im Wasser verbringen und Eier ohne Schale legen.") to listOf(
        "Reptilien haben Fell, Amphibien haben Schuppen",
        "Reptilien können fliegen, Amphibien nicht",
        "Reptilien leben nur an Land, Amphibien nur im Wasser"
    ),
    ("Wie viele Planeten hat unser Sonnensystem?" to "8") to listOf("7", "9", "10"),
    ("Welche Blutgruppe gilt als universeller Spender?" to "O negativ") to listOf(
        "A positiv",
        "B negativ",
        "AB positiv"
    ),
    ("Was ist DNA?" to "Die Molekulare Anleitung für die genetischen Informationen eines Organismus") to listOf(
        "Ein Eiweiß",
        "Ein Kohlenhydrat",
        "Ein Virus"
    ),
    ("Was ist Photosynthese?" to "Der Prozess, bei dem Pflanzen Sonnenlicht in chemische Energie umwandeln") to listOf(
        "Die Atmung von Pflanzen",
        "Die Verdunstung von Wasser aus Blättern",
        "Der Wachstumsprozess von Pflanzen"
    ),
    ("Welcher Planet ist als der 'Rote Planet' bekannt?" to "Mars") to listOf("Jupiter", "Venus", "Saturn"),
    ("Was ist ein Neutronenstern?" to "Ein extrem dichter Stern, der hauptsächlich aus Neutronen besteht") to listOf(
        "Ein Stern, der kurz vor der Supernova steht",
        "Ein junger Stern im frühen Entwicklungsstadium",
        "Ein Stern, der ausschließlich aus Neutronen besteht"
    ),
    ("Welches Organ produziert die Hormone Insulin und Glukagon?" to "Pankreas") to listOf(
        "Leber",
        "Nebennieren",
        "Schilddrüse"
    ),
    ("Was ist der häufigste Zustand der Materie im Universum?" to "Plasma") to listOf("Flüssig", "Fest", "Gas"),
    ("Wer entwickelte das Periodensystem der Elemente?" to "Dmitri Mendelejew") to listOf(
        "Antoine Lavoisier",
        "Marie Curie",
        "John Dalton"
    ),
    ("Was misst die Richter-Skala?" to "Die Stärke von Erdbeben") to listOf(
        "Die Intensität von Vulkanausbrüchen",
        "Die Windgeschwindigkeit von Wirbelstürmen",
        "Die Größe von Wellen im Meer"
    ),
    ("Was ist eine Supernova?" to "Eine enorme Explosion, die am Ende des Lebenszyklus eines Sterns auftritt") to listOf(
        "Der Zusammenstoß zweier Galaxien",
        "Ein Schwarzes Loch, das Materie verschluckt",
        "Die Geburt eines neuen Sterns"
    ),
    ("Welches ist das größte Organ des menschlichen Körpers?" to "Haut") to listOf("Leber", "Herz", "Gehirn"),
    ("Was ist die Hauptfunktion der weißen Blutkörperchen?" to "Infektionsabwehr und Immunantwort") to listOf(
        "Sauerstofftransport",
        "Blutgerinnung",
        "Regulierung des Blutzuckers"
    ),
    ("Wie viele Atome sind in einer einzelnen Wassermolekül?" to "3") to listOf("2", "4", "6"),
    ("Was ist die Funktion von Ribosomen in einer Zelle?" to "Proteinsynthese") to listOf(
        "DNA-Replikation",
        "Energieproduktion",
        "Zellatmung"
    ),
    ("Welches Element hat bei Raumtemperatur die höchste elektrische Leitfähigkeit?" to "Silber") to listOf(
        "Kupfer",
        "Gold",
        "Aluminium"
    ),
    ("Welches Vitamin wird durch Sonneneinstrahlung in der Haut produziert?" to "Vitamin D") to listOf(
        "Vitamin C",
        "Vitamin A",
        "Vitamin E"
    ),
    ("Was ist der Kuipergürtel?" to "Eine Region des Sonnensystems jenseits der Neptunbahn, die viele kleine eisige Körper enthält") to listOf(
        "Ein Asteroidengürtel zwischen Mars und Jupiter",
        "Eine Ansammlung von Sternen in der Milchstraße",
        "Eine Galaxie in der Nähe unserer Milchstraße"
    ),
    ("Was ist ein Lichtjahr?" to "Die Distanz, die Licht in einem Jahr zurücklegt") to listOf(
        "Die Zeit, die das Licht benötigt, um von der Sonne zur Erde zu gelangen",
        "Ein Jahr auf dem Planeten Licht",
        "Die Lebensdauer eines durchschnittlichen Sterns"
    ),
    ("Welches Metall ist flüssig bei Raumtemperatur?" to "Quecksilber") to listOf("Blei", "Eisen", "Zink"),
    ("Für was ist das Newton'sche Gesetz der allgemeinen Gravitation bekannt?" to "Die Anziehungskraft zwischen zwei Massen ist direkt proportional zum Produkt ihrer Massen und umgekehrt proportional zum Quadrat ihres Abstands") to listOf(
        "Jede Aktion hat eine gleiche und entgegengesetzte Reaktion",
        "Körper in Bewegung bleiben in Bewegung, es sei denn, eine äußere Kraft wirkt auf sie",
        "Die Beschleunigung eines Objekts ist proportional zur einwirkenden Kraft"
    ),
    ("Was ist ein Tardigrad?" to "Ein mikroskopisch kleines, extrem widerstandsfähiges Tierchen") to listOf(
        "Ein Dinosaurier",
        "Ein Elementarteilchen",
        "Ein Virus"
    ),
    ("Was ist der Unterschied zwischen exothermen und endothermen Reaktionen?" to "Exotherme Reaktionen setzen Wärme frei, während endotherme Reaktionen Wärme aufnehmen") to listOf(
        "Exotherme Reaktionen sind immer schnell, endotherme sind langsam",
        "Exotherme Reaktionen finden in Pflanzen statt, endotherme in Tieren",
        "Es gibt keinen Unterschied; es sind Synonyme"
    ),
    ("Was versteht man unter der 'Dunklen Materie'?" to "Eine nicht direkt beobachtbare Form der Materie, die etwa 85% der Materie im Universum ausmacht") to listOf(
        "Materie, die keine Lichtquellen abgibt oder reflektiert",
        "Schwarze Löcher",
        "Der Raum zwischen den Sternen"
    )
)   // Collection of science questions with their answer and 3 options for wrong answers
val sportsQuestions: List<Pair<Pair<String, String>, List<String>>> = listOf(
    ("Welcher Fußballspieler hat die meisten Tore in einer Weltmeisterschaft geschossen?" to "Miroslav Klose") to listOf(
        "Ronaldo",
        "Pelé",
        "Gerd Müller"
    ),
    ("In welchem Jahr wurden die ersten modernen Olympischen Spiele abgehalten?" to "1896") to listOf(
        "1900",
        "1912",
        "1892"
    ),
    ("Welches Land gewann die Fußball-Weltmeisterschaft 2014?" to "Deutschland") to listOf(
        "Brasilien",
        "Argentinien",
        "Niederlande"
    ),
    ("Wer ist als 'The Great One' im Eishockey bekannt?" to "Wayne Gretzky") to listOf(
        "Mario Lemieux",
        "Bobby Orr",
        "Sidney Crosby"
    ),
    ("Wie viele Spieler gibt es in einer Rugby-Union-Mannschaft?" to "15") to listOf("13", "11", "12"),
    ("Wer hat die meisten Grand Slam-Titel im Tennis gewonnen?" to "Margaret Court") to listOf(
        "Serena Williams",
        "Steffi Graf",
        "Martina Navratilova"
    ),
    ("Welcher Sport wird auch als 'König der Spiele' bezeichnet?" to "Schach") to listOf("Cricket", "Polo", "Golf"),
    ("Wer ist der schnellste Mensch der Welt?" to "Usain Bolt") to listOf("Tyson Gay", "Asafa Powell", "Yohan Blake"),
    ("In welcher Stadt fanden die Olympischen Spiele 2000 statt?" to "Sydney") to listOf("Athen", "Peking", "London"),
    ("Welcher Boxer hatte den Spitznamen 'The Greatest'?" to "Muhammad Ali") to listOf(
        "Mike Tyson",
        "Floyd Mayweather",
        "Sugar Ray Leonard"
    ),
    ("Welches Land ist für die Erfindung des Fußballs bekannt?" to "England") to listOf(
        "Brasilien",
        "Deutschland",
        "Italien"
    ),
    ("Welches Land hat die meisten Medaillen bei den Olympischen Winterspielen gewonnen?" to "Norwegen") to listOf(
        "USA",
        "Deutschland",
        "Kanada"
    ),
    ("Was ist die maximale Punktzahl in einem einzigen Frame von Bowling?" to "30") to listOf("300", "150", "120"),
    ("Welcher Golfer hat die meisten Major-Turniere gewonnen?" to "Jack Nicklaus") to listOf(
        "Tiger Woods",
        "Arnold Palmer",
        "Gary Player"
    ),
    ("Welches Land gewann die erste Fußball-Europameisterschaft?" to "Sowjetunion") to listOf(
        "Deutschland",
        "Spanien",
        "Italien"
    ),
    ("Wie lang ist ein olympisches Schwimmbecken?" to "50 Meter") to listOf("25 Meter", "100 Meter", "200 Meter"),
    ("Wer hat die Tour de France am häufigsten gewonnen?" to "Lance Armstrong") to listOf(
        "Eddy Merckx",
        "Miguel Indurain",
        "Bernard Hinault"
    ),
    ("In welcher Sportart ist Phil Taylor eine Legende?" to "Darts") to listOf("Snooker", "Billard", "Bowling"),
    ("Welches Team gewann die erste NBA-Meisterschaft?" to "Philadelphia Warriors") to listOf(
        "Boston Celtics",
        "Los Angeles Lakers",
        "Chicago Bulls"
    ),
    ("Wie heißt die höchste Spielklasse im deutschen Männerfußball?" to "Bundesliga") to listOf(
        "2. Bundesliga",
        "Regionalliga",
        "Oberliga"
    )
)   // Collection of sports questions with their answer and 3 options for wrong answers