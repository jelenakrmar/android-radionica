# Android radionica

[Magic 8-ball](https://en.wikipedia.org/wiki/Magic_8-Ball) je populana iračka za proricanje sudbine nastala u pedesetim. Kažu da se godišnje proda milion njih. 
Na ovoj radionici smo pravili sličnu magičnu kuglu, ali kvadratnog oblika zarad jednostavnosti :)

Čemu služi ova aplikacija? Kada ste u nedoumici oko bilo čega, postavite aplikaciji pitanje na koje može da odgovori sa DA ili NE. Onda tapnite na dugme da dobijete odgovor.

A sad s programerske tačke gledišta: Potrebno je da se pritiskom na dugme u polju za odgovor prikaže nasumičan tekst iz liste definisanih tekstova ("Ne", "Nikad", "Definitivno", "Da", "Verovatno", "Možda", "Nemam pojma").

* [Slajdovi sa prve radionice](https://www.slideshare.net/JelenaKrmar/razvoj-android-aplikacija-1-uvod)
* [Slajdovi sa druge radionice](https://www.slideshare.net/JelenaKrmar/razvoj-android-aplikacija-2-praktian-primer)

# Uputstvo kako smo ovo napravili 

1. Kad smo kreirali projekat, dodali smo jednu praznu aktivnost `Empty Activity`  
2. Prvo smo se pozabavili vizuelnim izgledom.  
  a. U `activity_main.xml` smo dodali `Button` i još jedan `ConstraintLayout` u koji smo ubacili jedan `TextView`.  
  b. Zatim smo podešavali [Constraints](https://developer.android.com/training/constraint-layout/index.html) za svaki element, menjali boje i pravili da izgleda kao na dizajnu.   
  c. Da bismo uklonili `ActionBar` (plavu traku gde se nalazi naziv aplikacije), morali smo da promenimo temu aplikacije. U `styles.xml` na liniji 4 smo stavili `parent="Theme.AppCompat.Light.NoActionBar"`.  
  d. Da bismo promenili boju Status bara, primenili smo trik: u `colors.xml` smo za boju `colorPrimaryDark` stavili da bude crna (`#000000`).  
3. Zatim smo prešli na Java kod u `MainActivity.java`.  
  a. Definisali smo listu mogućih odgovora.  
  b. Pronašli smo element na ekranu u kome će se menjati odgovor: `answer = findViewById(R.id.answer);`  
  c. Na dugme smo postavili `OnClickListener`, da bi smo definisali šta se dešava kad se tapne: `changeAnswer.setOnClickListener(new View.OnClickListener() {...`  
  d. Postavili nasumičan odgovor kao vrednost teksta: `answer.setText(...`
4. Postavili odgovarajuću ikonicu koju smo napravili koristeći [Android Asset Studio](https://romannurik.github.io/AndroidAssetStudio/) i ubacili je u folder `res / mipmap` (zamenili defaultnu).
