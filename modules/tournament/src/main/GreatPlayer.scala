package lila.tournament

final class GreatPlayer(
  val name: String,
  val wiki: String,
  val description: Option[String] = None)

object GreatPlayer {

  val list = List(
    new GreatPlayer("Aagaard", "Jacob_Aagaard", None),
    new GreatPlayer("Abbot", "Robert_Abbott_(game_designer)", None),
    new GreatPlayer("Abonyi", "Istv%C3%A1n_Abonyi", None),
    new GreatPlayer("Adams", "Michael_Adams_(chess_player)", None),
    new GreatPlayer("Addison", "William_Addison_(chess_player)", None),
    new GreatPlayer("Adorján", "Andr%C3%A1s_Adorj%C3%A1n", None),
    new GreatPlayer("Ahues", "Carl_Ahues", None),
    new GreatPlayer("Aitken", "James_Macrae_Aitken", None),
    new GreatPlayer("Akobian", "Varuzhan_Akobian", None),
    new GreatPlayer("Akopian", "Vladimir_Akopian", None),
    new GreatPlayer("Alapin", "Semyon_Alapin", None),
    new GreatPlayer("Albin", "Adolf_Albin", None),
    new GreatPlayer("Alekhine", "Alexander_Alekhine", None),
    new GreatPlayer("Alekseev", "Evgeny_Alekseev_(chess_player)", None),
    new GreatPlayer("Alexander", "Conel_Hugh_O'Donel_Alexander", None),
    new GreatPlayer("Alexandria", "Nana_Alexandria", None),
    new GreatPlayer("Allgaier", "Johann_Baptist_Allgaier", None),
    new GreatPlayer("Almási", "Zolt%C3%A1n_Alm%C3%A1si", None),
    new GreatPlayer("Anand", "Viswanathan_Anand", None),
    new GreatPlayer("Anderssen", "Adolf_Anderssen", None),
    new GreatPlayer("Andersson", "Ulf_Andersson", None),
    new GreatPlayer("Andreikin", "Dmitry_Andreikin", None),
    new GreatPlayer("Angantýsson", "Haukur_Angant%C3%BDsson", None),
    new GreatPlayer("Antoshin", "Vladimir_Antoshin", None),
    new GreatPlayer("Arakhamia", "Ketevan_Arakhamia-Grant", None),
    new GreatPlayer("Aronian", "Levon_Aronian", None),
    new GreatPlayer("Asztalos", "Lajos_Asztalos", None),
    new GreatPlayer("Aulia", "Medina_Warda_Aulia", None),
    new GreatPlayer("Averbakh", "Yuri_Averbakh", None),
    new GreatPlayer("Azmaiparashvili", "Zurab_Azmaiparashvili", None),
    new GreatPlayer("Bacrot", "%C3%89tienne_Bacrot", None),
    new GreatPlayer("Balashov", "Yuri_Balashov", None),
    new GreatPlayer("Balla", "Zolt%C3%A1n_von_Balla", None),
    new GreatPlayer("Barcza", "Gedeon_Barcza", None),
    new GreatPlayer("Barnes", "Thomas_Wilson_Barnes", None),
    new GreatPlayer("Barry", "Stuart_Milner-Barry", None),
    new GreatPlayer("Bartolović", "Hrvoje_Bartolovi%C4%87", None),
    new GreatPlayer("Becerra", "Julio_Becerra_Rivero", None),
    new GreatPlayer("Becker", "Albert_Becker_(chess_player)", None),
    new GreatPlayer("Belavenets", "Sergey_Belavenets", None),
    new GreatPlayer("Beliavsky", "Alexander_Beliavsky", None),
    new GreatPlayer("Berger", "Johann_Berger", None),
    new GreatPlayer("Bernstein", "Ossip_Bernstein", None),
    new GreatPlayer("Bētiņš", "K%C4%81rlis_B%C4%93ti%C5%86%C5%A1", None),
    new GreatPlayer("Bird", "Henry_Bird_(chess_player)", None),
    new GreatPlayer("Bisguier", "Arthur_Bisguier", None),
    new GreatPlayer("Biyiasas", "Peter_Biyiasas", None),
    new GreatPlayer("Blackburne", "Joseph_Henry_Blackburne", None),
    new GreatPlayer("Bledow", "Ludwig_Bledow", None),
    new GreatPlayer("Blumenfeld", "Benjamin_Blumenfeld", None),
    new GreatPlayer("Bobotsov", "Milko_Bobotsov", None),
    new GreatPlayer("Boden", "Samuel_Boden", None),
    new GreatPlayer("Bogoljubov", "Efim_Bogoljubov", None),
    new GreatPlayer("Bohatyrchuk", "Fedir_Bohatyrchuk", None),
    new GreatPlayer("Boi", "Paolo_Boi", None),
    new GreatPlayer("Bolbochán", "Julio_Bolboch%C3%A1n", None),
    new GreatPlayer("Boleslavsky", "Isaac_Boleslavsky", None),
    new GreatPlayer("Bondarevsky", "Igor_Bondarevsky", None),
    new GreatPlayer("Botterill", "George_Botterill", None),
    new GreatPlayer("Botvinnik", "Mikhail_Botvinnik", None),
    new GreatPlayer("Breyer", "Gyula_Breyer", None),
    new GreatPlayer("Bronstein", "David_Bronstein", None),
    new GreatPlayer("Browne", "Walter_Browne", None),
    new GreatPlayer("Bruzón", "L%C3%A1zaro_Bruz%C3%B3n", None),
    new GreatPlayer("Buckle", "Henry_Thomas_Buckle", None),
    new GreatPlayer("Burgess", "Graham_Burgess", None),
    new GreatPlayer("Burn", "Amos_Burn", None),
    new GreatPlayer("Bykova", "Elisaveta_Bykova", None),
    new GreatPlayer("Byrne", "Robert_Byrne_(chess_player)", None),
    new GreatPlayer("Canal", "Esteban_Canal", None),
    new GreatPlayer("Capablanca", "Jos%C3%A9_Ra%C3%BAl_Capablanca", None),
    new GreatPlayer("Cardano", "Gerolamo_Cardano", None),
    new GreatPlayer("Carlsen", "Magnus_Carlsen", None),
    new GreatPlayer("Caro", "Horatio_Caro", None),
    new GreatPlayer("Caruana", "Fabiano_Caruana", None),
    new GreatPlayer("Chajes", "Oscar_Chajes", None),
    new GreatPlayer("Charousek", "Rudolf_Charousek", None),
    new GreatPlayer("Chen", "Zhu_Chen", None),
    new GreatPlayer("Chernev", "Irving_Chernev", None),
    new GreatPlayer("Chéron", "Andr%C3%A9_Ch%C3%A9ron", None),
    new GreatPlayer("Chiburdanidze", "Maia_Chiburdanidze", None),
    new GreatPlayer("Chigorin", "Mikhail_Chigorin", None),
    new GreatPlayer("Christiansen", "Larry_Christiansen", None),
    new GreatPlayer("Ciocâltea", "Victor_Cioc%C3%A2ltea", None),
    new GreatPlayer("Cochrane", "John_Cochrane_(chess_player)", None),
    new GreatPlayer("Cohn", "Erich_Cohn", None),
    new GreatPlayer("Colle", "Edgard_Colle", None),
    new GreatPlayer("Cook", "Nathaniel_Cook", None),
    new GreatPlayer("Cortlever", "Nicolaas_Cortlever", None),
    new GreatPlayer("Cozio", "Carlo_Cozio", None),
    new GreatPlayer("Cvitan", "Ognjen_Cvitan", None),
    new GreatPlayer("Czerniak", "Moshe_Czerniak", None),
    new GreatPlayer("Damant", "Andr%C3%A9_Diamant", None),
    new GreatPlayer("Damiano", "Pedro_Damiano", None),
    new GreatPlayer("Damjanović", "Mato_Damjanovi%C4%87", None),
    new GreatPlayer("de Firmian", "Nick_de_Firmian", None),
    new GreatPlayer("de Lucena", "Luis_Ram%C3%ADrez_de_Lucena", None),
    new GreatPlayer("de Rivière", "Jules_Arnous_de_Rivi%C3%A8re", None),
    new GreatPlayer("de Segura", "Ruy_L%C3%B3pez_de_Segura", None),
    new GreatPlayer("de Vere", "Cecil_Valentine_De_Vere", None),
    new GreatPlayer("del Corral", "Jes%C3%BAs_D%C3%ADez_del_Corral", None),
    new GreatPlayer("del Rio", "Ercole_del_Rio", None),
    new GreatPlayer("Denker", "Arnold_Denker", None),
    new GreatPlayer("Deschapelles", "Alexandre_Deschapelles", None),
    new GreatPlayer("di Bona", "Giovanni_Leonardo_Di_Bona", None),
    new GreatPlayer("Ding", "Ding_Liren", None),
    new GreatPlayer("Dlugy", "Maxim_Dlugy", None),
    new GreatPlayer("Dolmatov", "Sergey_Dolmatov", None),
    new GreatPlayer("Domínguez", "Leinier_Dom%C3%ADnguez", None),
    new GreatPlayer("Donner", "Jan_Hein_Donner", None),
    new GreatPlayer("Dreev", "Alexey_Dreev", None),
    new GreatPlayer("Dubois", "Serafino_Dubois", None),
    new GreatPlayer("Dufresne", "Jean_Dufresne", None),
    new GreatPlayer("Durão", "Joaquim_Dur%C3%A3o", None),
    new GreatPlayer("Duras", "Old%C5%99ich_Duras", None),
    new GreatPlayer("Duz-Khotimirsky", "Fedor_Duz-Khotimirsky", None),
    new GreatPlayer("Dvoiris", "Semen_Dvoirys", None),
    new GreatPlayer("Dvoretsky", "Mark_Dvoretsky", None),
    new GreatPlayer("Dzindzichashvili", "Roman_Dzindzichashvili", None),
    new GreatPlayer("Ehlvest", "Jaan_Ehlvest", None),
    new GreatPlayer("Eliskases", "Erich_Eliskases", None),
    new GreatPlayer("Eljanov", "Pavel_Eljanov", None),
    new GreatPlayer("Enevoldsen", "Jens_Enevoldsen", None),
    new GreatPlayer("Englisch", "Berthold_Englisch", None),
    new GreatPlayer("Estrin", "Yakov_Estrin", None),
    new GreatPlayer("Euwe", "Max_Euwe", None),
    new GreatPlayer("Evans", "William_Davies_Evans", None),
    new GreatPlayer("Fahrni", "Hans_Fahrni", None),
    new GreatPlayer("Falkbeer", "Ernst_Falkbeer", None),
    new GreatPlayer("Fancy", "Stuart_Fancy", None),
    new GreatPlayer("Faragó", "Iv%C3%A1n_Farag%C3%B3", None),
    new GreatPlayer("Fatalibekova", "Elena_Fatalibekova", None),
    new GreatPlayer("Feigin", "Movsas_Feigins", None),
    new GreatPlayer("Felgaer", "Rub%C3%A9n_Felgaer", None),
    new GreatPlayer("Filip", "Miroslav_Filip", None),
    new GreatPlayer("Fine", "Reuben_Fine", None),
    new GreatPlayer("Fischer", "Bobby_Fischer", None),
    new GreatPlayer("Flamberg", "Alexander_Flamberg", None),
    new GreatPlayer("Flesch", "J%C3%A1nos_Flesch", None),
    new GreatPlayer("Flohr", "Salo_Flohr", None),
    new GreatPlayer("Foltys", "Jan_Foltys", None),
    new GreatPlayer("Forgács", "Le%C3%B3_Forg%C3%A1cs", None),
    new GreatPlayer("Forintos", "Gy%C5%91z%C5%91_Forintos", None),
    new GreatPlayer("Forsyth", "David_Forsyth_(chess_player)", None),
    new GreatPlayer("Fressinet", "Laurent_Fressinet", None),
    new GreatPlayer("Ftáčnik", "%C4%BDubom%C3%ADr_Ft%C3%A1%C4%8Dnik", None),
    new GreatPlayer("Fuderer", "Andrija_Fuderer", None),
    new GreatPlayer("Furman", "Semyon_Furman", None),
    new GreatPlayer("Gaprindashvili", "Nona_Gaprindashvili", None),
    new GreatPlayer("García", "Adri%C3%A1n_Garc%C3%ADa_Conde", None),
    new GreatPlayer("Gashimov", "Vugar_Gashimov", None),
    new GreatPlayer("Gelashvili", "Tamaz_Gelashvili", None),
    new GreatPlayer("Gelfand", "Boris_Gelfand", None),
    new GreatPlayer("Geller", "Efim_Geller", None),
    new GreatPlayer("Georgiev", "Vladimir_Georgiev_(chess_player)", None),
    new GreatPlayer("Gheorghiu", "Florin_Gheorghiu", None),
    new GreatPlayer("Gibaud", "Am%C3%A9d%C3%A9e_Gibaud", None),
    new GreatPlayer("Gilg", "Karl_Gilg", None),
    new GreatPlayer("Gipslis", "Aivars_Gipslis", None),
    new GreatPlayer("Giri", "Anish_Giri", None),
    new GreatPlayer("Gligorić", "Svetozar_Gligori%C4%87", None),
    new GreatPlayer("Golmayo", "Celso_Golmayo_Z%C3%BApide", None),
    new GreatPlayer("Golombek", "Harry_Golombek", None),
    new GreatPlayer("Grachev", "Boris_Grachev", None),
    new GreatPlayer("Greco", "Gioachino_Greco", None),
    new GreatPlayer("Grischuk", "Alexander_Grischuk", None),
    new GreatPlayer("Grob", "Henri_Grob", None),
    new GreatPlayer("Grünfeld", "Gr%C3%BCnfeld", None),
    new GreatPlayer("Gufeld", "Eduard_Gufeld", None),
    new GreatPlayer("Guimard", "Carlos_Guimard", None),
    new GreatPlayer("Gulko", "Boris_Gulko", None),
    new GreatPlayer("Gunina", "Valentina_Gunina", None),
    new GreatPlayer("Gunsberg", "Isidor_Gunsberg", None),
    new GreatPlayer("Gurgenidze", "Bukhuti_Gurgenidze", None),
    new GreatPlayer("Gurieli", "Nino_Gurieli", None),
    new GreatPlayer("Gurvich", "Gurvich", None),
    new GreatPlayer("Gustafsson", "Jan_Gustafsson", None),
    new GreatPlayer("Hamppe", "Carl_Hamppe", None),
    new GreatPlayer("Hansen", "Eric_Hansen_(chess_player)", None),
    new GreatPlayer("Harika", "Dronavalli_Harika", None),
    new GreatPlayer("Harikrishna", "Pendyala_Harikrishna", None),
    new GreatPlayer("Harmonist", "Max_Harmonist", None),
    new GreatPlayer("Hartston", "William_Hartston", None),
    new GreatPlayer("Havasi", "Korn%C3%A9l_Havasi", None),
    new GreatPlayer("Heisman", "Dan_Heisman", None),
    new GreatPlayer("Hodges", "Albert_Hodges", None),
    new GreatPlayer("Holt", "Conrad_Holt", None),
    new GreatPlayer("Horowitz", "Israel_Albert_Horowitz", None),
    new GreatPlayer("Hort", "Vlastimil_Hort", None),
    new GreatPlayer("Horwitz", "Bernhard_Horwitz", None),
    new GreatPlayer("Hou", "Hou_Yifan", None),
    new GreatPlayer("Howell", "David_Howell_(chess_player)", None),
    new GreatPlayer("Hromádka", "Karel_Hrom%C3%A1dka", None),
    new GreatPlayer("Huang", "Huang_Qian", None),
    new GreatPlayer("Hübner", "Robert_H%C3%BCbner", None),
    new GreatPlayer("Hug", "Werner_Hug", None),
    new GreatPlayer("Hulak", "Krunoslav_Hulak", None),
    new GreatPlayer("Ilyin-Genevsky", "Alexander_Ilyin-Genevsky", None),
    new GreatPlayer("Inarkiev", "Ernesto_Inarkiev", None),
    new GreatPlayer("Ioseliani", "Nana_Ioseliani", None),
    new GreatPlayer("Ivanchuk", "Vassily_Ivanchuk", None),
    new GreatPlayer("Ivanov", "Alexander_Ivanov_(chess_player)", None),
    new GreatPlayer("Ivkov", "Borislav_Ivkov", None),
    new GreatPlayer("Jaffé", "Charles_Jaffe", None),
    new GreatPlayer("Jakovenko", "Dmitry_Jakovenko", None),
    new GreatPlayer("Janowski", "Dawid_Janowski", None),
    new GreatPlayer("Jobava", "Baadur_Jobava", None),
    new GreatPlayer("Johansen", "Darryl_Johansen", None),
    new GreatPlayer("Johner", "Paul_Johner", None),
    new GreatPlayer("Ju", "Ju_Wenjun", None),
    new GreatPlayer("Junge", "Klaus_Junge", None),
    new GreatPlayer("Kachiani", "Ketino_Kachiani", None),
    new GreatPlayer("Kahn", "Mir_Sultan_Khan", None),
    new GreatPlayer("Kamsky", "Gata_Kamsky", None),
    new GreatPlayer("Kan", "Ilya_Kan", None),
    new GreatPlayer("Karjakin", "Sergey_Karjakin", None),
    new GreatPlayer("Karlsson", "Magnus_Carlsen", None),
    new GreatPlayer("Karpov", "Anatoly_Karpov", None),
    new GreatPlayer("Kashdan", "Isaac_Kashdan", None),
    new GreatPlayer("Kasimdzhanov", "Rustam_Kasimdzhanov", None),
    new GreatPlayer("Kasparov", "Garry_Kasparov", None),
    new GreatPlayer("Kasparyan", "Genrikh_Kasparyan", None),
    new GreatPlayer("Kavalek", "Lubomir_Kavalek", None),
    new GreatPlayer("Kazantsev", "Alexander_Kazantsev", None),
    new GreatPlayer("Keres", "Paul_Keres", None),
    new GreatPlayer("Khalifman", "Alexander_Khalifman", None),
    new GreatPlayer("Kholmov", "Ratmir_Kholmov", None),
    new GreatPlayer("Kieseritzky", "Lionel_Kieseritzky", None),
    new GreatPlayer("Kindermann", "Stefan_Kindermann", None),
    new GreatPlayer("King", "Daniel_J._King", None),
    new GreatPlayer("Klein", "Ernest_Klein_(chess_player)", None),
    new GreatPlayer("Kling", "Josef_Kling", None),
    new GreatPlayer("Kmoch", "Hans_Kmoch", None),
    new GreatPlayer("Koblencs", "Alexander_Koblencs", None),
    new GreatPlayer("Koch", "Berthold_Koch", None),
    new GreatPlayer("Koltanowski", "George_Koltanowski", None),
    new GreatPlayer("Koppel", "Moshe_Koppel", None),
    new GreatPlayer("Korchnoi", "Viktor_Korchnoi", None),
    new GreatPlayer("Korobov", "Anton_Korobov", None),
    new GreatPlayer("Kosintseva", "Tatiana_Kosintseva", None),
    new GreatPlayer("Kosteniuk", "Alexandra_Kosteniuk", None),
    new GreatPlayer("Kostić", "Boris_Kosti%C4%87", None),
    new GreatPlayer("Kotov", "Alexander_Kotov", None),
    new GreatPlayer("Kovalevskaya", "Ekaterina_Kovalevskaya", None),
    new GreatPlayer("Kozlovskaya", "Valentina_Kozlovskaya", None),
    new GreatPlayer("Kožul", "Zdenko_Ko%C5%BEul", None),
    new GreatPlayer("Kramnik", "Vladimir_Kramnik", None),
    new GreatPlayer("Krejcik", "Josef_Krejcik", None),
    new GreatPlayer("Krogius", "Nikolai_Krogius", None),
    new GreatPlayer("Kubbel", "Leonid_Kubbel", None),
    new GreatPlayer("Kudrin", "Sergey_Kudrin", None),
    new GreatPlayer("Kupchik", "Abraham_Kupchik", None),
    new GreatPlayer("Kupreichik", "Viktor_Kupreichik", None),
    new GreatPlayer("Kurajica", "Bojan_Kurajica", None),
    new GreatPlayer("Kushnir", "Alla_Kushnir", None),
    new GreatPlayer("Kuzmin", "Gennady_Kuzmin", None),
    new GreatPlayer("La Bourdonnais", "Louis-Charles_Mah%C3%A9_de_La_Bourdonnais", None),
    new GreatPlayer("Landa", "Konstantin_Landa", None),
    new GreatPlayer("Lange", "Max_Lange", None),
    new GreatPlayer("Larsen", "Bent_Larsen", None),
    new GreatPlayer("Lasker", "Emanuel_Lasker", None),
    new GreatPlayer("Lautier", "Jo%C3%ABl_Lautier", None),
    new GreatPlayer("Lawrence", "Al_Lawrence_(chess_writer)", None),
    new GreatPlayer("Lazard", "Fr%C3%A9d%C3%A9ric_Lazard", None),
    new GreatPlayer("Lazarević", "Milunka_Lazarevi%C4%87", None),
    new GreatPlayer("Láznička", "Viktor_L%C3%A1zni%C4%8Dka", None),
    new GreatPlayer("Lee", "Peter_Lee_(chess_player)", None),
    new GreatPlayer("Leko", "Peter_Leko", None),
    new GreatPlayer("Lengyel", "Levente_Lengyel", None),
    new GreatPlayer("Leonhardt", "Paul_Saladin_Leonhardt", None),
    new GreatPlayer("Letelier", "Ren%C3%A9_Letelier", None),
    new GreatPlayer("Levenfish", "Grigory_Levenfish", None),
    new GreatPlayer("Levitina", "Irina_Levitina", None),
    new GreatPlayer("Levitsky", "Stepan_Levitsky", None),
    new GreatPlayer("Lewis", "William_Lewis_(chess_player)", None),
    new GreatPlayer("Li", "Li_Chao_(chess_player)", None),
    new GreatPlayer("Liberzon", "Vladimir_Liberzon", None),
    new GreatPlayer("Lilienthal", "Andor_Lilienthal", None),
    new GreatPlayer("Lipke", "Paul_Lipke", None),
    new GreatPlayer("Liren", "Ding_Liren", None),
    new GreatPlayer("Lisitsin", "Georgy_Lisitsin", None),
    new GreatPlayer("Litinskaya-Shul", "Marta_Litinskaya-Shul", None),
    new GreatPlayer("Ljubojević", "Ljubomir_Ljubojevi%C4%87", None),
    new GreatPlayer("Lolli", "Giambattista_Lolli", None),
    new GreatPlayer("Lombardy", "William_Lombardy", None),
    new GreatPlayer("López", "Ruy_L%C3%B3pez_de_Segura", None),
    new GreatPlayer("Löwenthal", "Johann_L%C3%B6wenthal", None),
    new GreatPlayer("Loyd", "Sam_Loyd", None),
    new GreatPlayer("Lundin", "Erik_Lundin", None),
    new GreatPlayer("Mackenzie", "George_Henry_Mackenzie", None),
    new GreatPlayer("Malakhov", "Vladimir_Malakhov_(chess_player)", None),
    new GreatPlayer("Mamedyarov", "Shakhriyar_Mamedyarov", None),
    new GreatPlayer("Marache", "Napoleon_Marache", None),
    new GreatPlayer("Marco", "Georg_Marco", None),
    new GreatPlayer("Marić", "Alisa_Mari%C4%87", None),
    new GreatPlayer("Mariotti", "Sergio_Mariotti", None),
    new GreatPlayer("Maróczy", "G%C3%A9za_Mar%C3%B3czy", None),
    new GreatPlayer("Marshall", "Frank_Marshall_(chess_player)", None),
    new GreatPlayer("Mason", "James_Mason_(chess_player)", None),
    new GreatPlayer("Matanović", "Aleksandar_Matanovi%C4%87", None),
    new GreatPlayer("Matlakov", "Maxim_Matlakov", None),
    new GreatPlayer("Mattisons", "Hermanis_Matisons", None),
    new GreatPlayer("Matulović", "Milan_Matulovi%C4%87", None),
    new GreatPlayer("Matveeva", "Svetlana_Matveeva", None),
    new GreatPlayer("Mayer", "Georg_Meier_(chess_player)", None),
    new GreatPlayer("Mayet", "Carl_Mayet", None),
    new GreatPlayer("McDonnell", "Alexander_McDonnell", None),
    new GreatPlayer("McShane", "Luke_McShane", None),
    new GreatPlayer("Mecking", "Henrique_Mecking", None),
    new GreatPlayer("Medina", "Medina_Warda_Aulia", None),
    new GreatPlayer("Meier", "Georg_Meier_(chess_player)", None),
    new GreatPlayer("Menchik", "Vera_Menchik", None),
    new GreatPlayer("Michell", "Reginald_Pryce_Michell", None),
    new GreatPlayer("Mieses", "Jacques_Mieses", None),
    new GreatPlayer("Mikėnas", "Vladas_Mik%C4%97nas", None),
    new GreatPlayer("Miles", "Tony_Miles", None),
    new GreatPlayer("Miśta", "Aleksander_Mi%C5%9Bta", None),
    new GreatPlayer("Mongredien", "Augustus_Mongredien", None),
    new GreatPlayer("Morozevich", "Alexander_Morozevich", None),
    new GreatPlayer("Morphy", "Paul_Morphy", None),
    new GreatPlayer("Motylev", "Alexander_Motylev", None),
    new GreatPlayer("Movsesian", "Sergei_Movsesian", None),
    new GreatPlayer("Murray", "Murray_Chandler", None),
    new GreatPlayer("Muzychuk", "Anna_Muzychuk", None),
    new GreatPlayer("Naiditsch", "Arkadij_Naiditsch", None),
    new GreatPlayer("Najdorf", "Miguel_Najdorf", None),
    new GreatPlayer("Najer", "Evgeniy_Najer", None),
    new GreatPlayer("Nakamura", "Hikaru_Nakamura", None),
    new GreatPlayer("Napier", "William_Ewart_Napier", None),
    new GreatPlayer("Navara", "David_Navara", None),
    new GreatPlayer("Nedeljković", "Ozren_Nedeljkovi%C4%87", None),
    new GreatPlayer("Negi", "Parimarjan_Negi", None),
    new GreatPlayer("Nei", "Iivo_Nei", None),
    new GreatPlayer("Nemet", "Ivan_Nemet", None),
    new GreatPlayer("Nenarokov", "Vladimir_Nenarokov", None),
    new GreatPlayer("Nepomniachtchi", "Ian_Nepomniachtchi", None),
    new GreatPlayer("Neumann", "Gustav_Neumann", None),
    new GreatPlayer("Ni", "Ni_Hua", None),
    new GreatPlayer("Nikitin", "Garry_Kasparov", None),
    new GreatPlayer("Nikolić", "Predrag_Nikoli%C4%87", None),
    new GreatPlayer("Nimzowitsch", "Aron_Nimzowitsch", None),
    new GreatPlayer("Nogueiras", "Jesus_Nogueiras", None),
    new GreatPlayer("Nunn", "John_Nunn", None),
    new GreatPlayer("Nyholm", "Gustaf_Nyholm", None),
    new GreatPlayer("O'Kelly", "Alb%C3%A9ric_O'Kelly_de_Galway", None),
    new GreatPlayer("Ólafsson", "Fri%C3%B0rik_%C3%93lafsson", None),
    new GreatPlayer("Olland", "Adolf_Georg_Olland", None),
    new GreatPlayer("Onischuk", "Alexander_Onischuk", None),
    new GreatPlayer("Opočenský", "Karel_Opo%C4%8Densk%C3%BD", None),
    new GreatPlayer("Ortega", "Lexy_Ortega", None),
    new GreatPlayer("Osnos", "Vyacheslav_Osnos", None),
    new GreatPlayer("Owen", "John_Owen_(chess_player)", None),
    new GreatPlayer("Pachl", "Franz_Pachl", None),
    new GreatPlayer("Pachman", "Lud%C4%9Bk_Pachman", None),
    new GreatPlayer("Padevsky", "Nikola_Padevsky", None),
    new GreatPlayer("Palac", "Mladen_Palac", None),
    new GreatPlayer("Palme", "Ryan_Palmer_(chess_player)", None),
    new GreatPlayer("Panno", "Oscar_Panno", None),
    new GreatPlayer("Parma", "Bruno_Parma", None),
    new GreatPlayer("Parr", "Larry_Parr_(chess_player)", None),
    new GreatPlayer("Paulsen", "Louis_Paulsen", None),
    new GreatPlayer("Pavasovič", "Du%C5%A1ko_Pavasovi%C4%8D", None),
    new GreatPlayer("Pelletier", "Yannick_Pelletier", None),
    new GreatPlayer("Peng", "Peng_Zhaoqin", None),
    new GreatPlayer("Penrose", "Jonathan_Penrose", None),
    new GreatPlayer("Pereira", "R%C3%BAben_Pereira", None),
    new GreatPlayer("Perlis", "Julius_Perlis", None),
    new GreatPlayer("Petrosian", "Tigran_Petrosian", None),
    new GreatPlayer("Petrov", "Alexander_Petrov_(chess_player)", None),
    new GreatPlayer("Petrović", "Nenad_Petrovi%C4%87_(chess_composer)", None),
    new GreatPlayer("Philidor", "Fran%C3%A7ois-Andr%C3%A9_Danican_Philidor", None),
    new GreatPlayer("Phillips", "Alan_Phillips_(chess_player)", None),
    new GreatPlayer("Pietzsch", "Wolfgang_Pietzsch", None),
    new GreatPlayer("Piket", "Jeroen_Piket", None),
    new GreatPlayer("Pillsbury", "Harry_Nelson_Pillsbury", None),
    new GreatPlayer("Pilnik", "Hermann_Pilnik", None),
    new GreatPlayer("Pirc", "Vasja_Pirc", None),
    new GreatPlayer("Pirogov", "Vinnytsia", None),
    new GreatPlayer("Plachetka", "J%C3%A1n_Plachetka", None),
    new GreatPlayer("Planinc", "Albin_Planinc", None),
    new GreatPlayer("Pogonina", "Natalia_Pogonina", None),
    new GreatPlayer("Polerio", "Giulio_Cesare_Polerio", None),
    new GreatPlayer("Polgár", "Judit_Polg%C3%A1r", None),
    new GreatPlayer("Pollock", "William_H._K._Pollock", None),
    new GreatPlayer("Polugaevsky", "Lev_Polugaevsky", None),
    new GreatPlayer("Pomar", "Arturo_Pomar", None),
    new GreatPlayer("Ponomariov", "Ruslan_Ponomariov", None),
    new GreatPlayer("Ponziani", "Domenico_Lorenzo_Ponziani", None),
    new GreatPlayer("Porges", "Moritz_Porges", None),
    new GreatPlayer("Porreca", "Giorgio_Porreca", None),
    new GreatPlayer("Portisch", "Lajos_Portisch", None),
    new GreatPlayer("Prins", "Lodewijk_Prins", None),
    new GreatPlayer("Prokeš", "Ladislav_Proke%C5%A1", None),
    new GreatPlayer("Przepiórka", "Dawid_Przepi%C3%B3rka", None),
    new GreatPlayer("Puc", "Stojan_Puc", None),
    new GreatPlayer("Purdy", "John_Purdy_(chess_player)", None),
    new GreatPlayer("Pytel", "Krzysztof_Pytel", None),
    new GreatPlayer("Rabar", "Braslav_Rabar", None),
    new GreatPlayer("Rabinovich", "Ilya_Rabinovich", None),
    new GreatPlayer("Radjabov", "Teimour_Radjabov", None),
    new GreatPlayer("Radulov", "Ivan_Radulov", None),
    new GreatPlayer("Ragozin", "Viacheslav_Ragozin", None),
    new GreatPlayer("Ramírez", "Alejandro_Ram%C3%ADrez_(chess_player)", None),
    new GreatPlayer("Ranken", "Charles_Ranken", None),
    new GreatPlayer("Rapport", "Rich%C3%A1rd_Rapport", None),
    new GreatPlayer("Rauzer", "Vsevolod_Rauzer", None),
    new GreatPlayer("Razuvaev", "Yuri_Razuvaev", None),
    new GreatPlayer("Reggio", "Arturo_Reggio", None),
    new GreatPlayer("Reinfeld", "Fred_Reinfeld", None),
    new GreatPlayer("Rellstab", "Ludwig_Rellstab_(chess_player)", None),
    new GreatPlayer("Reshevsky", "Samuel_Reshevsky", None),
    new GreatPlayer("Réti", "Richard_R%C3%A9ti", None),
    new GreatPlayer("Ribli", "Zolt%C3%A1n_Ribli", None),
    new GreatPlayer("Rice", "Isaac_Rice", None),
    new GreatPlayer("Richter", "Kurt_Richter", None),
    new GreatPlayer("Rinck", "Henri_Rinck", None),
    new GreatPlayer("Riumin", "Nikolai_Riumin", None),
    new GreatPlayer("Robatsch", "Karl_Robatsch", None),
    new GreatPlayer("Rohde", "Michael_Rohde_(chess_player)", None),
    new GreatPlayer("Romanishin", "Oleg_Romanishin", None),
    new GreatPlayer("Romanov", "Evgeny_Romanov_(chess_player)", None),
    new GreatPlayer("Romanovsky", "Peter_Romanovsky", None),
    new GreatPlayer("Rosanes", "Jakob_Rosanes", None),
    new GreatPlayer("Rosenthal", "Samuel_Rosenthal", None),
    new GreatPlayer("Rosselli", "Stefano_Rosselli_del_Turco", None),
    new GreatPlayer("Rossetto", "H%C3%A9ctor_Rossetto", None),
    new GreatPlayer("Rossolimo", "Nicolas_Rossolimo", None),
    new GreatPlayer("Rotlewi", "Gersz_Rotlewi", None),
    new GreatPlayer("Ruan", "Ruan_Lufei", None),
    new GreatPlayer("Rubinstein", "Akiba_Rubinstein", None),
    new GreatPlayer("Rublevsky", "Sergei_Rublevsky", None),
    new GreatPlayer("Rubtsova", "Olga_Rubtsova", None),
    new GreatPlayer("Rudenko", "Lyudmila_Rudenko", None),
    new GreatPlayer("Sahović", "Dragutin_Sahovi%C4%87", None),
    new GreatPlayer("Saint-Amant", "Pierre_Charles_Fournier_de_Saint-Amant", None),
    new GreatPlayer("Salov", "Valery_Salov", None),
    new GreatPlayer("Salvio", "Alessandro_Salvio", None),
    new GreatPlayer("Salwe", "Gersz_Salwe", None),
    new GreatPlayer("Sämisch", "Friedrich_S%C3%A4misch", None),
    new GreatPlayer("Sandipan", "Sandipan_Chanda", None),
    new GreatPlayer("Sanguineti", "Ra%C3%BAl_Sanguineti", None),
    new GreatPlayer("Santasiere", "Anthony_Santasiere", None),
    new GreatPlayer("Sarapu", "Ortvin_Sarapu", None),
    new GreatPlayer("Sargissian", "Gabriel_Sargissian", None),
    new GreatPlayer("Šarić", "Ivan_%C5%A0ari%C4%87_(chess_player)", None),
    new GreatPlayer("Sarratt", "Jacob_Sarratt", None),
    new GreatPlayer("Sax", "Gyula_Sax", None),
    new GreatPlayer("Schallopp", "Emil_Schallopp", None),
    new GreatPlayer("Schiffers", "Emanuel_Schiffers", None),
    new GreatPlayer("Schlechter", "Carl_Schlechter", None),
    new GreatPlayer("Schmid", "Lothar_Schmid", None),
    new GreatPlayer("Schories", "Georg_Schories", None),
    new GreatPlayer("Schulten", "John_William_Schulten", None),
    new GreatPlayer("Sebag", "Marie_Sebag", None),
    new GreatPlayer("Seirawan", "Yasser_Seirawan", None),
    new GreatPlayer("Selenus", "Augustus_the_Younger,_Duke_of_Brunswick-L%C3%BCneburg", None),
    new GreatPlayer("Selezniev", "Alexey_Selezniev", None),
    new GreatPlayer("Semenova", "Lidia_Semenova", None),
    new GreatPlayer("Sergeant", "Philip_Walsingham_Sergeant", None),
    new GreatPlayer("Shabalov", "Alexander_Shabalov", None),
    new GreatPlayer("Sherrard", "Benny_Andersson", None),
    new GreatPlayer("Shipley", "Emil_Kem%C3%A9ny", None),
    new GreatPlayer("Shirov", "Alexei_Shirov", None),
    new GreatPlayer("Short", "Nigel_Short", None),
    new GreatPlayer("Showalter", "Jackson_Showalter", None),
    new GreatPlayer("Shulman", "Yury_Shulman", None),
    new GreatPlayer("Shumov", "Ilya_Shumov", None),
    new GreatPlayer("Sigurjónsson", "Gu%C3%B0mundur_Sigurj%C3%B3nsson", None),
    new GreatPlayer("Silman", "Jeremy_Silman", None),
    new GreatPlayer("Simagin", "Vladimir_Simagin", None),
    new GreatPlayer("Sjugirov", "Sanan_Sjugirov", None),
    new GreatPlayer("Skripchenko", "Almira_Skripchenko", None),
    new GreatPlayer("Smeets", "Jan_Smeets", None),
    new GreatPlayer("Smejkal", "Jan_Smejkal", None),
    new GreatPlayer("Smirin", "Ilya_Smirin", None),
    new GreatPlayer("Smyslov", "Vasily_Smyslov", None),
    new GreatPlayer("So", "Wesley_So", None),
    new GreatPlayer("Sokolov", "Andrei_Sokolov", None),
    new GreatPlayer("Sokolsky", "Alexey_Sokolsky", None),
    new GreatPlayer("Soltis", "Andrew_Soltis", None),
    new GreatPlayer("Sosonko", "Gennadi_Sosonko", None),
    new GreatPlayer("Sozin", "Veniamin_Sozin", None),
    new GreatPlayer("Spassky", "Boris_Spassky", None),
    new GreatPlayer("Speelman", "Jon_Speelman", None),
    new GreatPlayer("Spielmann", "Rudolf_Spielmann", None),
    new GreatPlayer("Ståhlberg", "Gideon_St%C3%A5hlberg", None),
    new GreatPlayer("Stamma", "Philipp_Stamma", None),
    new GreatPlayer("Stanley", "Charles_Henry_Stanley", None),
    new GreatPlayer("Starr", "Nava_Starr", None),
    new GreatPlayer("Staunton", "Howard_Staunton", None),
    new GreatPlayer("Stean", "Michael_Stean", None),
    new GreatPlayer("Stefanova", "Antoaneta_Stefanova", None),
    new GreatPlayer("Stefanović", "Zlatni_De%C4%8Daci", None),
    new GreatPlayer("Stein", "Leonid_Stein", None),
    new GreatPlayer("Steiner", "Endre_Steiner", None),
    new GreatPlayer("Steinitz", "Wilhelm_Steinitz", None),
    new GreatPlayer("Stoltz", "G%C3%B6sta_Stoltz", None),
    new GreatPlayer("Süchting", "Hugo_S%C3%BCchting", None),
    new GreatPlayer("Suetin", "Alexey_Suetin", None),
    new GreatPlayer("Suhle", "Berthold_Suhle", None),
    new GreatPlayer("Sultan Khan", "Mir_Sultan_Khan", None),
    new GreatPlayer("Sutovsky", "Emil_Sutovsky", None),
    new GreatPlayer("Suttles", "Duncan_Suttles", None),
    new GreatPlayer("Sveshnikov", "Evgeny_Sveshnikov", None),
    new GreatPlayer("Svidler", "Peter_Svidler", None),
    new GreatPlayer("Swiderski", "Rudolf_Swiderski", None),
    new GreatPlayer("Szabó", "L%C3%A1szl%C3%B3_Szab%C3%B3_(chess_player)", None),
    new GreatPlayer("Szén", "J%C3%B3zsef_Sz%C3%A9n", None),
    new GreatPlayer("Taimanov", "Mark_Taimanov", None),
    new GreatPlayer("Takács", "S%C3%A1ndor_Tak%C3%A1cs", None),
    new GreatPlayer("Tal", "Mikhail_Tal", None),
    new GreatPlayer("Tan", "Tan_Zhongyi", None),
    new GreatPlayer("Tarjan", "James_Tarjan", None),
    new GreatPlayer("Tarrasch", "Siegbert_Tarrasch", None),
    new GreatPlayer("Tartakower", "Savielly_Tartakower", None),
    new GreatPlayer("Taubenhaus", "Jean_Taubenhaus", None),
    new GreatPlayer("Taylor", "David_Taylor_(chess_player)", None),
    new GreatPlayer("Teichmann", "Richard_Teichmann", None),
    new GreatPlayer("Teschner", "Rudolf_Teschner", None),
    new GreatPlayer("Thomas", "Sir_George_Thomas,_7th_Baronet", None),
    new GreatPlayer("Timman", "Jan_Timman", None),
    new GreatPlayer("Tiviakov", "Sergei_Tiviakov", None),
    new GreatPlayer("Tolush", "Alexander_Tolush", None),
    new GreatPlayer("Tomashevski", "Evgeny_Tomashevsky", None),
    new GreatPlayer("Topalov", "Veselin_Topalov", None),
    new GreatPlayer("Torre", "Carlos_Torre_Repetto", None),
    new GreatPlayer("Traxler", "Karel_Traxler", None),
    new GreatPlayer("Trenchard", "Herbert_William_Trenchard", None),
    new GreatPlayer("Treybal", "Karel_Treybal", None),
    new GreatPlayer("Trifunović", "Petar_Trifunovi%C4%87", None),
    new GreatPlayer("Tringov", "Georgi_Tringov", None),
    new GreatPlayer("Troitsky", "Alexey_Troitsky", None),
    new GreatPlayer("Uhlmann", "Wolfgang_Uhlmann", None),
    new GreatPlayer("Ujtelky", "Maximilian_Ujtelky", None),
    new GreatPlayer("Ulrich", "Ulrich_Voigt", None),
    new GreatPlayer("Ulvestad", "William_John_Donaldson", None),
    new GreatPlayer("Unzicker", "Wolfgang_Unzicker", None),
    new GreatPlayer("Ushenina", "Anna_Ushenina", None),
    new GreatPlayer("Vachier-Lagrave", "Maxime_Vachier-Lagrave", None),
    new GreatPlayer("Vaganyan", "Rafael_Vaganian", None),
    new GreatPlayer("Vallejo Pons", "Francisco_Vallejo_Pons", None),
    new GreatPlayer("van den Berg", "Van_den_Berg", None),
    new GreatPlayer("van den Bosch", "Johannes_van_den_Bosch_(chess_player)", None),
    new GreatPlayer("van Scheltinga", "Theo_van_Scheltinga", None),
    new GreatPlayer("van Wely", "Loek_van_Wely", None),
    new GreatPlayer("Vasiukov", "Evgeni_Vasiukov", None),
    new GreatPlayer("Velimirović", "Dragoljub_Velimirovi%C4%87", None),
    new GreatPlayer("Veresov", "Gavriil_Veresov", None),
    new GreatPlayer("Verlinsky", "Boris_Verlinsky", None),
    new GreatPlayer("Vidmar", "Milan_Vidmar", None),
    new GreatPlayer("Vitiugov", "Nikita_Vitiugov", None),
    new GreatPlayer("Volpert", "Larissa_Volpert", None),
    new GreatPlayer("von Bardeleben", "Curt_von_Bardeleben", None),
    new GreatPlayer("von Bilguer", "Paul_Rudolf_von_Bilguer", None),
    new GreatPlayer("von der Lasa", "Tassilo_von_Heydebrand_und_der_Lasa", None),
    new GreatPlayer("von Gottschall", "Hermann_von_Gottschall", None),
    new GreatPlayer("von Kolisch", "Ignatz_Kolisch", None),
    new GreatPlayer("von Popiel", "Ignatz_von_Popiel", None),
    new GreatPlayer("Vuković", "Vladimir_Vukovi%C4%87", None),
    new GreatPlayer("Wade", "Robert_Wade_(chess_player)", None),
    new GreatPlayer("Wagner", "Heinrich_Wagner", None),
    new GreatPlayer("Waitzkin", "Joshua_Waitzkin", None),
    new GreatPlayer("Walbrodt", "Carl_August_Walbrodt", None),
    new GreatPlayer("Walker", "George_Walker_(chess_player)", None),
    new GreatPlayer("Walter", "Max_Walter", None),
    new GreatPlayer("Wang", "Wang_Hao_(chess_player)", None),
    new GreatPlayer("Webb", "Simon_Webb_(chess_player)", None),
    new GreatPlayer("Wei", "Wei_Yi", None),
    new GreatPlayer("Weiss", "Max_Weiss", None),
    new GreatPlayer("Werle", "Jan_Werle", None),
    new GreatPlayer("Westerinen", "Heikki_Westerinen", None),
    new GreatPlayer("Whitaker", "Norman_T._Whitaker", None),
    new GreatPlayer("Williams", "Simon_Williams_(chess_player)", None),
    new GreatPlayer("Winawer", "Szymon_Winawer", None),
    new GreatPlayer("Winter", "William_Winter_(chess_player)", None),
    new GreatPlayer("Wisker", "John_Wisker", None),
    new GreatPlayer("Wittek", "Alexander_Wittek", None),
    new GreatPlayer("Wojtaszek", "Rados%C5%82aw_Wojtaszek", None),
    new GreatPlayer("Wolff", "Patrick_Wolff", None),
    new GreatPlayer("Wood", "Baruch_Harold_Wood", None),
    new GreatPlayer("Wyvill", "Marmaduke_Wyvill_(chess_player)", None),
    new GreatPlayer("Xie", "Xie_Jun", None),
    new GreatPlayer("Xu", "Xu_Yuhua", None),
    new GreatPlayer("Yanofsky", "Daniel_Yanofsky", None),
    new GreatPlayer("Yates", "Frederick_Yates", None),
    new GreatPlayer("Yusupov", "Artur_Yusupov", None),
    new GreatPlayer("Zagorovsky", "Vladimir_Zagorovsky", None),
    new GreatPlayer("Zhao", "Zhao_Zong-Yuan", None),
    new GreatPlayer("Zhukova", "Natalia_Zhukova", None),
    new GreatPlayer("Znosko-Borovsky", "Eugene_Znosko-Borovsky", None),
    new GreatPlayer("Zubarev", "Alexander_Zubarev", None),
    new GreatPlayer("Zuckerman", "Bernard_Zuckerman", None),
    new GreatPlayer("Zukertort", "Johannes_Zukertort", None),
    new GreatPlayer("Zvorykina", "Kira_Zvorykina", None),
    new GreatPlayer("Żytogórski", "Adolf_Zytogorski", None)
  )
}