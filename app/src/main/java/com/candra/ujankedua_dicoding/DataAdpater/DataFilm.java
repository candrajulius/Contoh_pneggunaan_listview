package com.candra.ujankedua_dicoding.DataAdpater;

import android.os.Parcel;

import com.candra.ujankedua_dicoding.R;

import java.util.ArrayList;

public class DataFilm {
    public static String [] drama = {
            "Drama,Romance",
            "Action,Advanture",
            "Adventure,Action",
            "Thriller,Drama",
            "Action,Adventure,Science",
            "Drama",
            "Action,Adventure,Comedy",
            "Animation,Family,Adventure",
            "Action,Science Fiction",
            "Thriller,Drama,Science Fiction",
            "Action,Thriller",
            "Fantasy,Family,Comedy",
            "Adventure,Fantasy",
            "Comedy,Drama",
            "Adventure,Action,Thriller",
            "Action,Adventure,Animation,",
            "Action,Crime,Thriller",
            "Crime,Drama,Thriller",
            "Science Fiction,Acton"

    };

    private static String [] judul  = {
            "A Star is Bon",
            "Aquaman",
            "Avenger:Infinity War",
            "Bird Box",
            "Bummblebee",
            "Creed",
            "Deadpool",
            "How to Train Your Dragon:The Hidden World",
            "Dragon Ball Super:Broly",
            "Glass",
            "Hunter Killer",
            "Mary Poppins Returns",
            "Mortal Engines",
            "Preman Pensiunan",
            "Robin Hood",
            "Spider-Man:Into the Sipeder-Verse",
            "The Girl in the Sipedr's Web",
            "The Mule",
            "Venom"
    };

    private static String [] waktu = {
        "2h 16m",
        "2h 24m",
        "2h 29m",
        "2h 4m",
        "1h 54m",
        "2h 13m",
        "1h 48m",
        "1h 44m",
        "1h 41m",
        "2h 9m",
        "2h 2m",
        "2h 11m",
        "2h 9m",
        "1h 34m",
        "1h 56m",
        "1h 57m",
        "1h 57m",
        "1h 57m",
        "1h 52m"
    };

    private static String [] pg =  {
        "R",
        "PG-13",
        "PG-13",
        "R",
        "PG-13",
        "PG-13",
        "R",
        "PG",
        "PG",
        "PG-13",
        "R",
        "PG",
        "PG-13",
        "",
        "PG-13",
        "PG",
        "R",
        "R",
        "PG-13",
    };

    private static String [] negasra = {
        "US",
        "US",
        "US",
        "DK",
        "US",
        "US",
        "US",
        "US",
        "JP",
        "US",
        "US",
        "US",
        "US",
        "ID",
        "US",
        "US",
        "US",
        "US",
        "US"
    };

    private static String [] tahun = {
            "2018",
            "2018",
            "2018",
            "2018",
            "2018",
            "2015",
            "2016",
            "2019",
            "2018",
            "2019",
            "2018",
            "2018",
            "2018",
            "2019",
            "2018",
            "2018",
            "2018",
            "2018",
            "2018"
    };

    private static String [] tanggalTahubBulan = {
            "10/05/2018",
            "12/21/2018",
            "04/27/2018",
            "12/13/2018",
            "12/21/2018",
            "11/25/2015",
            "02/12/2016",
            "02/22/2019",
            "12/14/2018",
            "01/18/2019",
            "10/26/2018",
            "12/19/2018",
            "12/14/2018",
            "01/17/2019",
            "11/21/2018",
            "12/14/2018",
            "11/09/2018",
            "12/14/2018",
            "10/05/2018",
    };
    private static String [] judulKecil = {
            "A Star is Bon",
            "Home Is Calling",
            "An entire. Once and for all",
            "Never Lose Sight Of Survival",
            "Every Hero Has A a Beginning",
            "Your legacy is more than a name",
            "Witness the beginning of a happy ending",
            "The fiendship of a lifetime",
            "A new adventure to become the strongest begins",
            "You Cannot Contain What You Are",
            "Courage runs deep",
            "Magic Always Returns",
            "Some scars never heal",
            "",
            "The legend you know. The story you don't",
            "More Than One Wears the Mask",
            "Dicover what made her the girl",
            "Nobody Runs Forever",
            "The world has enough Superheroes"

    };

    private static int [] foto = {
            R.drawable.poster_a_star,
            R.drawable.poster_aquaman,
            R.drawable.poster_avengerinfinity,
            R.drawable.poster_birdbox,
            R.drawable.poster_bumblebee,
            R.drawable.poster_creed,
            R.drawable.poster_deadpool,
            R.drawable.poster_dragon,
            R.drawable.poster_dragonball,
            R.drawable.poster_glass,
            R.drawable.poster_hunterkiller,
            R.drawable.poster_marrypopins,
            R.drawable.poster_mortalengine,
            R.drawable.poster_preman,
            R.drawable.poster_robinhood,
            R.drawable.poster_spiderman,
            R.drawable.poster_thegirl,
            R.drawable.poster_themule,
            R.drawable.poster_venom

    };

    private static String [] desripsi = {
         "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
         "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
         "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new danger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity Stones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have fought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
         "Five years after an ominous unseen presence drives most of society to suicide, a survivor and her two children make a desperate bid to reach safety.",
         "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.",
         "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.",
         "Deadpool tells the origin story of former Special Forces operative turned mercenary Wade Wilson, who after being subjected to a rogue experiment that leaves him with accelerated healing powers, adopts the alter ego Deadpool. Armed with his new abilities and a dark, twisted sense of humor, Deadpool hunts down the man who nearly destroyed his life.",
         "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.",
         "Earth is peaceful following the Tournament of Power. Realizing that the universes still hold many more strong people yet to see, Goku spends all his days training to reach even greater heights. Then one day, Goku and Vegeta are faced by a Saiyan called 'Broly' who they've never seen before. The Saiyans were supposed to have been almost completely wiped out in the destruction of Planet Vegeta, so what's this one doing on Earth? This encounter between the three Saiyans who have followed completely different destinies turns into a stupendous battle, with even Frieza (back from Hell) getting caught up in the mix.",
         "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
         "Captain Glass of the USS Arkansas discovers that a coup d'état is taking place in Russia, so he and his crew join an elite group working on the ground to prevent a war.",
         "In Depression-era London, a now-grown Jane and Michael Banks, along with Michael's three children, are visited by the enigmatic Mary Poppins following a personal loss. Through her unique magical skills, and with the aid of her friend Jack, she helps the family rediscover the joy and wonder missing in their lives.",
         "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.",
         "After three years, the business of Muslihat (Epi Kusnandar), who has retired as a thug, has a problem. Sales decline. Muslihat also faces new problems when Safira (Safira Maharani), her only daughter, grows up in adolescence and begins to be visited by boys. A bigger problem: frictions between his former subordinates.",
         "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
         "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a super collider, others from across the Spider-Verse are transported to this dimension.",
         "In Stockholm, Sweden, hacker Lisbeth Salander is hired by Frans Balder, a computer engineer, to retrieve a program that he believes it is too dangerous to exist.",
         "Earl Stone, a man in his eighties, is broke, alone, and facing foreclosure of his business when he is offered a job that simply requires him to drive. Easy enough, but, unbeknownst to Earl, he's just signed on as a drug courier for a Mexican cartel. He does so well that his cargo increases exponentially, and Earl hit the radar of hard-charging DEA agent Colin Bates.",
         "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own."

    };

    private static String [] petugasScreen = {
            "Will Fetters",
            "Will Beall",
            "Stephen McFeely",
            "Eric Heissere",
            "Christina Hodson",
            "Aaron Covington",
            "Paul Wernick",
            "Dean BeBLois",
            "Akira Toriyama",
            "M.Night Shyamalan",
            "Jamies Moss",
            "David Magee",
            "Peter Jackson",
            "",
            "Ben Chandler",
            "Phil Lord",
            "Jay Basu",
            "Nick Schenk",
            "Kelly Marcel"
    };

    private static String [] direktur = {
        "Bradley Cooper",
        "James Wan",
        "Anthony Russo",
        "Susanne Bier",
        "Travis Knight",
        "Ryan Coogler",
        "Tim Miller",
        "Dean DeBlois",
        "Tatsuya Nagamine",
        "M.Night Shyamalan",
        "Danovan Marsh",
        "Rob Marshall",
        "Christian Rivers",
        "Aris Nugraha",
        "Otti Bathurst",
        "Rodney Rothman",
        "Fede Alvarez",
        "Clint Eastwood",
        "Ruben Fleischer"
    };

    public static ArrayList<Film> ambilData(){
        ArrayList<Film> candra = new ArrayList<>();
        for (int positon = 0; positon < judul.length; positon++){
            Film film = new Film();
            film.setJudul(judul[positon]);
            film.setWaktu(waktu[positon]);
            film.setPg(pg[positon]);
            film.setNegara(negasra[positon]);
            film.setTahun(tahun[positon]);
            film.setTanggalTahunBulan(tanggalTahubBulan[positon]);
            film.setJudulKecil(judulKecil[positon]);
            film.setPhoto(foto[positon]);
            film.setDeskripsi(desripsi[positon]);
            film.setPetugasScreen(petugasScreen[positon]);
            film.setDirektur(direktur[positon]);
            film.setDrama(drama[positon]);
            candra.add(film);
        }
        return candra;

    }

}
