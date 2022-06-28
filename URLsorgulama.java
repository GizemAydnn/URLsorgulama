import java.util.Scanner;

public class URLsorgulama {

    public static void main(String[] args) {

	//Ödev Sahibi: Gizem Aydın * 200541028

        Scanner scan = new Scanner(System.in);
        String[] alanAdiUzantisi = {
                ".ac", ".ad", ".ae", ".aero", ".af", ".ag", ".ai", ".al", ".am", ".an", ".ao", ".aq", ".ar",  ".arpa", ".as", ".at", ".au", ".aw", ".az", ".ba",
                ".bb", ".bd", ".be", ".bf", ".bg", ".bh", ".bi", ".biz", ".bj", ".bm", ".bn", ".bo", ".br", ".bs", ".bt", ".bv", ".bw", ".by", ".bz", ".ca",
                ".cc", ".cd", ".cf", ".cg", ".ch", ".ci", ".ck", ".cl", ".cm", ".cn", ".co", ".com", ".coop" ".cr" ".cu" ".cv" ".cx", ".cy", ".cz", ".de",
                ".dj", ".dk", ".dm", ".do",".dz", ".ec",".edu", ".ee", ".eg", ".er", ".es", ".et", ".eu", ".fi", ".fj" ".fk", ".fm", ".fo", ".fr",".ga",
                ".gb", ".gd", ".ge", ".gf",  ".gg", ".gh", ".gi", ".gl", ".gm", ".gn",  ".gov", ".gp", ".gq", ".gr", ".gs", ".gt", ".gu", ".gw", ".gy",
                ".hk", ".hm" ".hn", ".hr", ".ht", ".hu", ".id",  ".ie", ".il", ".im", ".in", ".info", ".int", ".io", ".iq",  ".ir", ".is", ".it", ".je", ".jm",
                ".jo", ".jp",  ".ke", ".kg", ".kh", ".ki",  ".km",  ".kn", ".ko", ".kr", ".kw", ".ky", ".kz", ".la", ".lb", ".lc", ".li", ".lk", ".lr",
                ".ls", ".lt", ".lu", ".lv", ".ly", ".ma", ".mc", ".md", ".me", ".mg", ".mh", ".mil", ".mk", ".ml", ".mm", ".mn", ".mo", ".mp", ".mq", ".mr",
                ".ms", ".mt", ".mu", ".museum", ".mv",  ".mw", ".mx", ".my", ".mz", ".na", ".name", ".nc", ".ne", ".net", ".nf", ".ng", ".ni", ".nl", ".no",
                ".np", ".nr", ".nu", ".nz", ".om", ".org", ".pa", ".pe",  ".pf", ".pg", ".ph", ".pk", ".pl", ".pm", ".pn", ".pr", ".pro", ".ps", ".pt",
                ".pw", ".py", ".qa", ".re", ".ro", ".rs", ".ru", ".rw", ".sa", ".sb", ".sc", ".sd", ".se", ".sg", ".sh", ".si", ".sj", ".sk", ".sl", ".sm",
                ".sn", ".so", ".sr", ".st", ".su", ".sv", ".sy", ".sz", ".tc", ".td", ".tf", ".tg", ".th", ".tj", ".tk", ".tl", ".tm", ".tn", ".to", ".tp",
                ".tr", ".tt", ".tv", ".tw", ".tz", ".ua", ".ug", ".uk", ".um", ".us", ".uy", ".uz", ".va", ".vc", ".ve", ".vg",  ".vi", ".vn", ".vu", ".wf", 
                ".ws", ".ye", ".yt", ".yu", ".za", ".zm", ".zw"};

        String[] ülkeYadaDurum;
        ülkeYadaDurum = new String[]{
                "Ascension Adası", "Andorra", "Birleşik Arap Emirlikleri", "Hava taşımacılığı endüstrisi", "Afganistan", "Antigua ve Barbuda", "Anguilla", 
                "Arnavutluk", "Ermenistan", "Hollanda Antilleri", "Angola", "Antarktika", "Arjantin", "Address ve Routing Parameter Area","Amerikan Samoası",
                "Avusturya", "Avustralya", "Aruba", "Azerbaycan", "Bosna-Hersek", "Barbados", "Bangladeş","Belçika", "Burkina Faso", "Bulgaristan", "Bahreyn",
                "Burundi", "business","Benin", "Bermuda", "Brunei Darussalam",  "Bolivya", "Brezilya", "Bahamalar", "Bhutan","Bouvet Adası", "Botswana",
                "Beyaz Rusya", "Belize", "Kanada", "Cocos (Keeling) Adaları", "Kongo Demokratik Cumhuriyeti", "Orta Afrika Cumhuriyeti", "Kongo Cumhuriyeti",
                "İsviçre(Confoederatio Helvetica)", "Fildişi Sahili", "Cook Adaları", "Şili", "Kamerun", "Çin, anakara", "Kolombiya", "ticari", "cooperatives",
                "Costa Rika", "Küba", "Cape Verde", "Christmas Adası", "Kıbrıs", "Çek Cumhuriyeti", "Almanya(Deutschland)", "Jibuti", "Danimarka", "Dominika",
                "Dominik Cumhuriyeti", "Cezayir", "Ekvador", "eğitim", "Estonya","Mısır", "Eritre", "İspanya(España)", "Etiyopya", "Avrupa Birliği", "Finlandiya",
                "Fiji", "Falkland Adaları", "Micronezya", "Faroe Adaları	", "Fransa", "Gabon", "Birleşik Krallık", "Grenada", "Gürcistan", "Fransız Guyanası",
                "Guernsey", "Gana", "Gibraltar", "Greenland", "Gambia", "Gine", "Hükümet - Government", "Guadeloupe", "Equator Ginesi", "Yunanistan",
                "Güney Georgia ve Güney Sandwich Adaları", "Guatemala", "Guam", "Guinea-Bissau", "Guyana", "Hong Kong", "Heard Adası ve McDonald Adaları", 
                "Honduras", "Hırvatistan(Hrvatska)", "Haiti", "Macaristan", "Endonezya", "İrlanda", "İsrail", "Isle of Man", "Hindistan", "information",
                "Uluslararası örgütler", "Hint Okyanusundaki İngiliz Toprakları", "Irak", "İran", "İzlanda", "İtalya", "Jersey", "Jamaika", "Ürdün", "Japonya",
                "Kenya", "Kırgızistan", "Kamboçya(Khmer)", "Kiribati", "Komor", "Saint Kitts ve Nevis", "Kosova", "Güney Kore Cumhuriyeti", "Kuveyt", 
                "Cayman Adaları", "Kazakistan", "Laos", "Lübnan", "Saint Lucia", "Liechtenstein", "Sri Lanka", "Liberia", "Lesotho", "Litvanya", "Lüksemburg",
                "Letonya", "Libya", "Fas", "Monako", "Moldova", "Karadağ", "Madagaskar", "Marshall Adaları", "ABD askeri birimleri", "Makedonya", "Mali",
                "Myanmar", "Moğolistan", "Macau", "Kuzey Mariana Adaları", "Martinik", "Moritanya", "Montserrat", "Malta", "Mauritius", "Müze", "Maldivler",
                "Malawi", "Meksika", "Malezya", "Mozambik", "Namibya", "Özel kişiler, ismen", "Yeni Kaledonya", "Nijer", "Network", "Norfolk Adası", "Nijerya",
                "Nikaragua", "Hollanda", "Norveç", "Nepal", "Nauru", "Niue", "Yeni Zelanda", "Umman", "Kuruluş, örgüt", "Panama", "Peru", "Fransız Polonezyası",
                "Papua Yeni Gine", "Filipinler", "Pakistan", "Polonya", "Saint-Pierre ve Miquelon", "Pitcairn Adaları", "Porto Riko", "Professions", "Filistin",
                "Portekiz", "Palau", "Paraguay", "Katar", "Réunion", "Romanya", "Sırbistan", "Rusya", "Rwanda", "Suudi Arabistan", "Solomon Adaları", "Seyşeller",
                "Sudan", "İsveç", "Singapur", "Saint Helena", "Slovenya", "Svalbard veJan MayenAdaları", "Slovakya",  "Sierra Leone", "San Marino", "Senegal", 
                "Somali", "Surinam", "São Tomé ve Príncipe", "Eski Sovyetler Birliği", "El Salvador", "Suriye", "Svaziland", "Turks ve Caicos Adaları", "Çad",
                "Antartika'daki Fransız toprakları", "Togo",  "Tayland", "Tacikistan", "Tokelau", "Timor-Leste", "Türkmenistan", "Tunus", "Tonga", "Doğu Timor",
                "Türkiye", "Trinidad ve Tobago", "Tuvalu", "Çin Cumhuriyeti (Tayvan)", "Tanzanya", "Ukrayna", "Uganda", "Birleşik Krallık", 
                "United States Minor Outlying Islands", "Amerika Birleşik Devletleri", "Uruguay", "Özbekistan", "Vatikan", "Saint Vincent ve Grenadinler", 
                "Venezuela", "Birleşik Krallık Virgin Adaları", "ABD Virgin Adaları",  "Vietnam", "Vanuatu", "Wallis ve Futuna", "Samoa", "Yemen", "Mayotte",
                "Yugoslavya", "Güney Afrika(Zuid Afrika)", "Zambiya", "Zimbabwe"};

        System.out.println("Lütfen sorgulamak istediğiniz url adresini tam bir şekilde yazınız.");
        System.out.println("Sistemden çıkmak için lütfen x tuşuna basınız.");

        while (true) {
            System.out.println("***");
            System.out.print("Sorgulamak istediğiniz URL adresini giriniz: ");
            String url = scan.nextLine();
            if (url.equalsIgnoreCase("x")) {
                System.out.println("Sistemden Çıkılıyor...");
                break;
            }

            char[] urlKarakterler = new char[url.length()];
            url.getChars(0, url.length(), urlKarakterler, 0);

            int sayac = 0;
            for (char a : urlKarakterler) {
                if (a == '.') {
                    sayac++;
                }
            }

            int firstDot = url.indexOf(".");
            int lastDot = url.lastIndexOf(".");

            if (sayac == 2) {
                String domainAdi = url.substring(firstDot + 1, lastDot);
                String domainAdiUzantisi = url.substring(lastDot);

                System.out.println("Domain Adi: " + domainAdi);
                for (int i = 0; i < alanAdiUzantisi.length; i++) {
                    if (alanAdiUzantisi[i].equals(domainAdiUzantisi)) {

                        System.out.println("Alan Adi uzantisi: " + alanAdiUzantisi[i] + "\n"
                                + "Alan Uzantısının Ait Olduğu Ülke veya Durumu: " + ülkeYadaDurum[i]);
                    }
                }
            } else if (sayac == 3) {
                int middleDot = url.indexOf(".", firstDot + 1);
                String domainAdi = url.substring(firstDot + 1, middleDot);
                String domainAdiUzantisi1 = url.substring(middleDot, lastDot);
                String domainAdiUzantisi2 = url.substring(lastDot);
                System.out.println("Domain Adi: " + domainAdi);

                for (int i = 0; i < alanAdiUzantisi.length; i++) {
                    if (alanAdiUzantisi[i].equals(domainAdiUzantisi1)) {

                        System.out.println("Alan Adi uzantisi 1 = " + alanAdiUzantisi[i] + "\n"
                                + "Alan Uzantısının Ait Olduğu Ülke veya Durumu : " + ülkeYadaDurum[i]);
                    }

                }
                for (int i = 0; i < alanAdiUzantisi.length; i++) {
                    if (alanAdiUzantisi[i].equals(domainAdiUzantisi2)) {
                        System.out.println("Alan Adi uzantisi 2 = " + alanAdiUzantisi[i] + "\n"
                                + "Alan Uzantısının Ait Olduğu Ülke veya Durumu : " + ülkeYadaDurum[i]);
                    }
                }
            }
        }

    }
}
