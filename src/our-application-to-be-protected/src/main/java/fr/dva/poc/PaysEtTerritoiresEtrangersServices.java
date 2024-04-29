package fr.dva.poc;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import reactor.core.publisher.Flux;

@Service
public class PaysEtTerritoiresEtrangersServices {

  private Collection<PaysEtTerritoiresEtrangers> tousLesPays = new HashSet<>();
  private PaysEtTerritoiresEtrangers current;

  public Optional<PaysEtTerritoiresEtrangers> findByCodeISO3166Alpha3(final String codeAlpha3) {
    return tousLesPays.stream().filter(pays -> codeAlpha3.equals(pays.getCodeIso3())).findAny();
  }

  public Flux<PaysEtTerritoiresEtrangers> findAll() {
    return Flux.fromIterable(tousLesPays);
  }

  @PostConstruct
  public void setup() {
    current = new PaysEtTerritoiresEtrangers("99319", "4", "", "99139", "", "ACORES, MADERE", "AÇORES, MADÈRE", "", "",
        "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99212", "1", "", "", "", "AFGHANISTAN", "ÉTAT ISLAMIQUE D'AFGHANISTAN",
        "", "AF", "AFG", "004");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99303", "1", "", "", "", "AFRIQUE DU SUD", "RÉPUBLIQUE D'AFRIQUE DU SUD",
        "UNION SUD-AFRICAINE", "ZA", "ZAF", "710");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99404", "3", "99432", "", "", "ALASKA", "ALASKA", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99125", "1", "", "", "", "ALBANIE", "RÉPUBLIQUE D'ALBANIE", "", "AL",
        "ALB", "008");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99352", "1", "XXXXX", "", "1962", "ALGERIE",
        "RÉPUBLIQUE ALGÉRIENNE DÉMOCRATIQUE ET POPULAIRE", "", "DZ", "DZA", "012");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99109", "1", "", "", "1990", "ALLEMAGNE",
        "RÉPUBLIQUE FÉDÉRALE D'ALLEMAGNE", "", "DE", "DEU", "276");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99130", "1", "", "", "", "ANDORRE", "PRINCIPAUTÉ D'ANDORRE", "", "AD",
        "AND", "020");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99395", "1", "99319", "", "1975", "ANGOLA", "RÉPUBLIQUE D'ANGOLA", "",
        "AO", "AGO", "024");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99425", "4", "", "99132", "", "ANGUILLA", "ANGUILLA", "", "AI", "AIA",
        "660");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99441", "1", "99425", "", "1981", "ANTIGUA-ET-BARBUDA",
        "ANTIGUA-ET-BARBUDA", "", "AG", "ATG", "028");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99431", "2", "", "99135", "", "ANTILLES NEERLANDAISES",
        "ANTILLES NÉERLANDAISES", "", "AN", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99201", "1", "", "", "", "ARABIE SAOUDITE", "ROYAUME D'ARABIE SAOUDITE",
        "", "SA", "SAU", "682");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99415", "1", "", "", "", "ARGENTINE", "RÉPUBLIQUE ARGENTINE", "", "AR",
        "ARG", "032");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99252", "1", "99123", "", "1991", "ARMENIE", "RÉPUBLIQUE D'ARMÉNIE", "",
        "AM", "ARM", "051");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99135", "3", "", "", "", "ARUBA", "ARUBA", "", "AW", "ABW", "533");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99501", "1", "", "", "", "AUSTRALIE", "AUSTRALIE", "", "AU", "AUS",
        "036");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99110", "1", "", "", "", "AUTRICHE", "RÉPUBLIQUE D'AUTRICHE", "", "AT",
        "AUT", "040");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99253", "1", "99123", "", "1991", "AZERBAIDJAN",
        "RÉPUBLIQUE AZERBAÏDJANAISE", "", "AZ", "AZE", "031");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99436", "1", "99425", "", "1973", "BAHAMAS", "COMMONWEALTH DES BAHAMAS",
        "ILES  LUCAYES", "BS", "BHS", "044");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99249", "1", "99221", "", "1971", "BAHREIN", "ÉTAT DE BAHREÏN", "", "BH",
        "BHR", "048");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99246", "1", "99213", "", "1972", "BANGLADESH",
        "RÉPUBLIQUE POPULAIRE DU BANGLADESH", "PAKISTAN ORIENTAL", "BD", "BGD", "050");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99434", "1", "99425", "", "1966", "BARBADE", "BARBADE", "", "BB", "BRB",
        "052");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99131", "1", "", "", "", "BELGIQUE", "ROYAUME DE BELGIQUE", "", "BE",
        "BEL", "056");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99429", "1", "", "", "1981", "BELIZE", "BELIZE", "HONDURAS BRITANNIQUE",
        "BZ", "BLZ", "084");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99327", "1", "98205", "", "1960", "BENIN", "RÉPUBLIQUE DU BÉNIN",
        "DAHOMEY", "BJ", "BEN", "204");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99425", "4", "99426", "99132", "", "BERMUDES", "BERMUDES", "", "BM",
        "BMU", "060");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99214", "1", "", "", "", "BHOUTAN", "ROYAUME DU BHOUTAN", "", "BT", "BTN",
        "064");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99148", "1", "99123", "", "1991", "BIELORUSSIE",
        "RÉPUBLIQUE DE BIÉLORUSSIE", "", "BY", "BLR", "112");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99224", "1", "", "", "1948", "BIRMANIE", "UNION DE BIRMANIE", "", "MM",
        "MMR", "104");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99418", "1", "", "", "", "BOLIVIE", "ÉTAT PLURINATIONAL DE BOLIVIE",
        "REPUBLIQUE DE BOLIVIE", "BO", "BOL", "068");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99443", "1", "99431", "", "2010", "BONAIRE, SAINT EUSTACHE ET SABA",
        "BONAIRE, SAINT EUSTACHE ET SABA", "", "BQ", "BES", "535");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99118", "1", "99121", "", "1992", "BOSNIE-HERZEGOVINE",
        "RÉPUBLIQUE DE BOSNIE-HERZÉGOVINE", "", "BA", "BIH", "070");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99347", "1", "99310", "", "1966", "BOTSWANA", "RÉPUBLIQUE DU BOTSWANA",
        "BECHUANALAND", "BW", "BWA", "072");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99103", "3", "", "", "", "BOUVET (ILE)", "BOUVET (ÎLE)", "", "BV", "BVT",
        "074");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99416", "1", "", "", "", "BRESIL", "RÉPUBLIQUE FÉDÉRATIVE DU BRÉSIL", "",
        "BR", "BRA", "076");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99225", "1", "", "", "1984", "BRUNEI", "NEGARA BRUNEI DARUSSALAM",
        "BORNEO BRITANNIQUE", "BN", "BRN", "096");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99111", "1", "", "", "", "BULGARIE", "RÉPUBLIQUE DE BULGARIE", "", "BG",
        "BGR", "100");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99331", "1", "98209", "", "1960", "BURKINA", "BURKINA FASO",
        "HAUTE-VOLTA", "BF", "BFA", "854");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99321", "1", "99312", "", "1962", "BURUNDI", "RÉPUBLIQUE DU BURUNDI",
        "URUNDI", "BI", "BDI", "108");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99425", "4", "99426", "99132", "", "CAIMANES (ILES)", "CAÏMANES (ÎLES)",
        "", "KY", "CYM", "136");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99234", "1", "98503", "", "1953", "CAMBODGE", "ROYAUME DU CAMBODGE",
        "KAMPUCHEA DEM.", "KH", "KHM", "116");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99322", "1", "99305", "", "1961", "CAMEROUN", "RÉPUBLIQUE DU CAMEROUN",
        "", "CM", "CMR", "120");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99305", "2", "", "", "", "CAMEROUN ET TOGO", "CAMEROUN ET TOGO", "", "",
        "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99401", "1", "", "", "", "CANADA", "CANADA", "", "CA", "CAN", "124");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99313", "4", "99314", "99134", "", "CANARIES (ILES)", "CANARIES (ÎLES)",
        "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99396", "1", "99319", "", "1975", "CAP-VERT", "RÉPUBLIQUE DU CAP-VERT",
        "", "CV", "CPV", "132");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99323", "1", "98303", "", "1960", "CENTRAFRICAINE (REPUBLIQUE)",
        "RÉPUBLIQUE CENTRAFRICAINE", "OUBANGUI-CHARI", "CF", "CAF", "140");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99417", "1", "", "", "", "CHILI", "RÉPUBLIQUE DU CHILI", "", "CL", "CHL",
        "152");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99216", "1", "", "", "", "CHINE", "RÉPUBLIQUE POPULAIRE DE CHINE", "",
        "CN", "CHN", "156");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99501", "3", "99229", "", "", "CHRISTMAS (ILE)", "CHRISTMAS (ÎLE)", "",
        "CX", "CXR", "162");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99254", "1", "99143", "", "1960", "CHYPRE", "RÉPUBLIQUE DE CHYPRE", "",
        "CY", "CYP", "196");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("XXXXX", "3", "", "", "", "CLIPPERTON (ILE)", "CLIPPERTON (ÎLE)", "", "",
        "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99501", "3", "99229", "", "", "COCOS ou KEELING (ILES)",
        "COCOS OU KEELING (ÎLES)", "", "CC", "CCK", "166");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99419", "1", "", "", "", "COLOMBIE", "RÉPUBLIQUE DE COLOMBIE", "", "CO",
        "COL", "170");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99397", "1", "98402", "", "1975", "COMORES",
        "RÉPUBLIQUE FÉDÉRALE ISLAMIQUE DES COMORES", "", "KM", "COM", "174");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99324", "1", "98302", "", "1960", "CONGO", "RÉPUBLIQUE DU CONGO",
        "CONGO-BRAZZAVILLE", "CG", "COG", "178");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99312", "1", "", "", "1960", "CONGO (REPUBLIQUE DEMOCRATIQUE)",
        "RÉPUBLIQUE DÉMOCRATIQUE DU CONGO", "ZAIRE", "CD", "COD", "180");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99502", "3", "99503", "", "", "COOK (ILES)", "COOK (ÎLES)", "", "CK",
        "COK", "184");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99237", "2", "99217", "", "", "COREE", "CORÉE", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99239", "1", "99237", "", "1945", "COREE (REPUBLIQUE DE)",
        "RÉPUBLIQUE DE CORÉE", "", "KR", "KOR", "410");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99238", "1", "99237", "", "1953",
        "COREE (REPUBLIQUE POPULAIRE DEMOCRATIQUE DE)", "RÉPUBLIQUE POPULAIRE DÉMOCRATIQUE DE CORÉE", "", "KP", "PRK",
        "408");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99406", "1", "", "", "", "COSTA RICA", "RÉPUBLIQUE DU COSTA RICA", "",
        "CR", "CRI", "188");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99326", "1", "98204", "", "1960", "COTE D'IVOIRE",
        "RÉPUBLIQUE DE CÔTE D'IVOIRE", "", "CI", "CIV", "384");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99119", "1", "99121", "", "1991", "CROATIE", "RÉPUBLIQUE DE CROATIE", "",
        "HR", "HRV", "191");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99407", "1", "", "", "", "CUBA", "RÉPUBLIQUE DE CUBA", "", "CU", "CUB",
        "192");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99444", "1", "99431", "", "2010", "CURAÇAO", "CURAÇAO", "", "CW", "CUW",
        "531");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99101", "1", "", "", "", "DANEMARK", "ROYAUME DU DANEMARK", "", "DK",
        "DNK", "208");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99399", "1", "98406", "", "1977", "DJIBOUTI", "RÉPUBLIQUE DE DJIBOUTI",
        "T.F. AFARS ET ISSAS", "DJ", "DJI", "262");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99408", "1", "", "", "", "DOMINICAINE (REPUBLIQUE)",
        "RÉPUBLIQUE DOMINICAINE", "SAINT-DOMINGUE", "DO", "DOM", "214");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99438", "1", "99425", "", "1978", "DOMINIQUE",
        "COMMONWEALTH DE DOMINIQUE", "", "DM", "DMA", "212");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99301", "1", "", "", "", "EGYPTE", "RÉPUBLIQUE ARABE D'ÉGYPTE", "", "EG",
        "EGY", "818");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99414", "1", "", "", "", "EL SALVADOR", "RÉPUBLIQUE DU SALVADOR", "",
        "SV", "SLV", "222");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99247", "1", "99221", "", "1971", "EMIRATS ARABES UNIS",
        "ÉMIRATS ARABES UNIS", "", "AE", "ARE", "784");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99420", "1", "", "", "", "EQUATEUR", "RÉPUBLIQUE DE L'ÉQUATEUR", "", "EC",
        "ECU", "218");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99317", "1", "99315", "", "1993", "ERYTHREE", "ÉTAT D'ÉRYTHRÉE", "", "ER",
        "ERI", "232");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99134", "1", "", "", "", "ESPAGNE", "ROYAUME D'ESPAGNE", "", "ES", "ESP",
        "724");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99106", "1", "99123", "", "1991", "ESTONIE", "RÉPUBLIQUE D'ESTONIE", "",
        "EE", "EST", "233");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99228", "2", "", "99227", "", "ETATS MALAIS NON FEDERES",
        "ÉTATS MALAIS NON FÉDÉRÉS", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99404", "1", "", "", "", "ETATS-UNIS", "ÉTATS-UNIS D'AMÉRIQUE", "", "US",
        "USA", "840");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99315", "1", "", "", "", "ETHIOPIE",
        "RÉPUBLIQUE DÉMOCRATIQUE FÉDÉRALE D'ÉTHIOPIE", "ABYSSINIE", "ET", "ETH", "231");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99156", "1", "99121", "", "1993", "EX-REPUBLIQUE YOUGOSLAVE DE MACEDOINE",
        "EX-RÉPUBLIQUE YOUGOSLAVE DE MACÉDOINE", "", "MK", "MKD", "807");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99101", "3", "99102", "", "", "FEROE (ILES)", "FÉROÉ (ÎLES)", "", "FO",
        "FRO", "234");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99508", "1", "99503", "", "1970", "FIDJI", "RÉPUBLIQUE DES FIDJI", "",
        "FJ", "FJI", "242");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99105", "1", "", "", "", "FINLANDE", "RÉPUBLIQUE DE FINLANDE", "", "FI",
        "FIN", "246");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("XXXXX", "1", "", "", "", "FRANCE", "RÉPUBLIQUE FRANÇAISE", "", "FR",
        "FRA", "250");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99328", "1", "98301", "", "1960", "GABON", "RÉPUBLIQUE GABONAISE", "",
        "GA", "GAB", "266");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99304", "1", "", "", "1965", "GAMBIE", "RÉPUBLIQUE DE GAMBIE", "", "GM",
        "GMB", "270");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99255", "1", "99123", "", "1991", "GEORGIE", "RÉPUBLIQUE DE GÉORGIE", "",
        "GE", "GEO", "268");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99427", "4", "", "99132", "",
        "GEORGIE DU SUD ET LES ILES SANDWICH DU SUD", "GÉORGIE DU SUD ET LES ÎLES SANDWICH DU SUD", "", "GS", "SGS",
        "239");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99329", "1", "99304", "", "1957", "GHANA", "RÉPUBLIQUE DU GHANA",
        "COTE-DE-L'OR", "GH", "GHA", "288");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99133", "4", "", "99132", "", "GIBRALTAR", "GIBRALTAR", "", "GI", "GIB",
        "292");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99223", "3", "99232", "", "", "GOA", "GOA", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99126", "1", "", "", "", "GRECE", "RÉPUBLIQUE HELLÉNIQUE", "", "GR",
        "GRC", "300");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99435", "1", "99425", "", "1974", "GRENADE", "GRENADE", "", "GD", "GRD",
        "308");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99430", "4", "", "99101", "", "GROENLAND", "GROENLAND", "", "GL", "GRL",
        "304");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("XXXXX", "3", "", "", "", "GUADELOUPE", "DÉPARTEMENT DE LA GUADELOUPE", "",
        "GP", "GLP", "312");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99505", "4", "99220", "99404", "", "GUAM", "GUAM", "", "GU", "GUM",
        "316");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99409", "1", "", "", "", "GUATEMALA", "RÉPUBLIQUE DU GUATEMALA", "", "GT",
        "GTM", "320");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99132", "3", "", "", "", "GUERNESEY", "GUERNESEY", "", "GG", "GGY",
        "831");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99330", "1", "XXXXX", "", "1958", "GUINEE", "RÉPUBLIQUE DE GUINÉE",
        "GUINEE FRANCAISE", "GN", "GIN", "324");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99314", "1", "", "", "1968", "GUINEE EQUATORIALE",
        "RÉPUBLIQUE DE GUINÉE ÉQUATORIALE", "GUINEE ESPAGNOLE", "GQ", "GNQ", "226");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99392", "1", "99319", "", "1974", "GUINEE-BISSAU",
        "RÉPUBLIQUE DE GUINÉE-BISSAU", "GUINEE PORTUGAISE", "GW", "GNB", "624");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99428", "1", "", "", "1966", "GUYANA", "RÉPUBLIQUE COOPÉRATIVE DE GUYANA",
        "GUYANE BRITANNIQUE", "GY", "GUY", "328");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("XXXXX", "3", "", "", "", "GUYANE", "DÉPARTEMENT DE LA GUYANE", "", "GF",
        "GUF", "254");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99410", "1", "", "", "", "HAITI", "RÉPUBLIQUE D'HAÏTI", "", "HT", "HTI",
        "332");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99504", "2", "", "99404", "", "HAWAII (ILES)", "HAWAII (ÎLES)", "", "",
        "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99501", "3", "", "", "", "HEARD ET MACDONALD (ILES)",
        "HEARD ET MACDONALD (ÎLES)", "", "HM", "HMD", "334");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99411", "1", "", "", "", "HONDURAS", "RÉPUBLIQUE DU HONDURAS", "", "HN",
        "HND", "340");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99230", "2", "99132", "99216", "", "HONG-KONG", "HONG-KONG", "", "HK", "",
        "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99112", "1", "", "", "", "HONGRIE", "RÉPUBLIQUE DE HONGRIE", "", "HU",
        "HUN", "348");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99320", "2", "", "", "", "ILES PORTUGAISES DE L'OCEAN INDIEN",
        "ÎLES PORTUGAISES DE L'OCÉAN INDIEN", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99223", "1", "", "", "1947", "INDE", "RÉPUBLIQUE DE L'INDE", "", "IN",
        "IND", "356");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99231", "1", "", "", "1945", "INDONESIE", "RÉPUBLIQUE D'INDONÉSIE",
        "INDES NEER. ET PORT.", "ID", "IDN", "360");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99204", "1", "", "", "", "IRAN", "RÉPUBLIQUE ISLAMIQUE D'IRAN", "PERSE",
        "IR", "IRN", "364");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99203", "1", "", "", "", "IRAQ", "RÉPUBLIQUE D'IRAQ", "", "IQ", "IRQ",
        "368");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99136", "1", "", "", "", "IRLANDE, ou EIRE", "IRLANDE", "", "IE", "IRL",
        "372");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99102", "1", "", "", "1944", "ISLANDE", "RÉPUBLIQUE D'ISLANDE", "", "IS",
        "ISL", "352");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99207", "1", "", "", "1948", "ISRAEL", "ÉTAT D'ISRAËL", "", "IL", "ISR",
        "376");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99127", "1", "", "", "", "ITALIE", "RÉPUBLIQUE ITALIENNE", "", "IT",
        "ITA", "380");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99426", "1", "", "", "1962", "JAMAIQUE", "JAMAÏQUE", "", "JM", "JAM",
        "388");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99217", "1", "", "", "", "JAPON", "JAPON", "", "JP", "JPN", "392");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99132", "3", "", "", "", "JERSEY", "JERSEY", "", "JE", "JEY", "832");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99222", "1", "", "", "1946", "JORDANIE", "ROYAUME HACHÉMITE DE JORDANIE",
        "TRANSJORDANIE", "JO", "JOR", "400");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99211", "2", "", "99123", "", "KAMTCHATKA", "KAMTCHATKA", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99256", "1", "99123", "", "1991", "KAZAKHSTAN",
        "RÉPUBLIQUE DU KAZAKHSTAN", "", "KZ", "KAZ", "398");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99332", "1", "99307", "", "1963", "KENYA", "RÉPUBLIQUE DU KENYA", "",
        "KE", "KEN", "404");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99257", "1", "99123", "", "1991", "KIRGHIZISTAN", "RÉPUBLIQUE KIRGHIZE",
        "", "KG", "KGZ", "417");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99513", "1", "", "", "1979", "KIRIBATI", "RÉPUBLIQUE DE KIRIBATI",
        "ILES GILBERT", "KI", "KIR", "296");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99157", "1", "99121", "", "2008", "KOSOVO", "RÉPUBLIQUE DU KOSOVO",
        "SERBIE", "XK", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99240", "1", "99221", "", "1961", "KOWEIT", "ÉTAT DU KOWEÏT", "", "KW",
        "KWT", "414");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("XXXXX", "3", "", "", "", "LA REUNION", "DÉPARTEMENT DE LA RÉUNION", "",
        "RE", "REU", "638");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99403", "2", "", "99401", "", "LABRADOR", "LABRADOR", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99241", "1", "98505", "", "1949", "LAOS",
        "RÉPUBLIQUE DÉMOCRATIQUE POPULAIRE LAO", "", "LA", "LAO", "418");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99348", "1", "99310", "", "1966", "LESOTHO", "ROYAUME DU LESOTHO",
        "BASUTOLAND", "LS", "LSO", "426");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99107", "1", "99123", "", "1991", "LETTONIE", "RÉPUBLIQUE DE LETTONIE",
        "", "LV", "LVA", "428");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99205", "1", "", "", "1943", "LIBAN", "RÉPUBLIQUE LIBANAISE", "", "LB",
        "LBN", "422");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99302", "1", "", "", "", "LIBERIA", "RÉPUBLIQUE DU LIBERIA", "", "LR",
        "LBR", "430");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99316", "1", "", "", "1951", "LIBYE",
        "JAMAHIRIYA ARABE LIBYENNE POPULAIRE ET SOCIALISTE", "CYRENAIQUE", "LY", "LBY", "434");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99113", "1", "", "", "", "LIECHTENSTEIN", "PRINCIPAUTÉ DE LIECHTENSTEIN",
        "", "LI", "LIE", "438");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99108", "1", "99123", "", "1991", "LITUANIE", "RÉPUBLIQUE DE LITUANIE",
        "", "LT", "LTU", "440");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99137", "1", "", "", "", "LUXEMBOURG", "GRAND-DUCHÉ DE LUXEMBOURG", "",
        "LU", "LUX", "442");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99232", "2", "99139", "99216", "", "MACAO", "MACAO", "", "MO", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99333", "1", "98401", "", "1960", "MADAGASCAR",
        "RÉPUBLIQUE DE MADAGASCAR", "", "MG", "MDG", "450");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99227", "1", "", "", "1957", "MALAISIE", "MALAISIE", "", "MY", "MYS",
        "458");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99334", "1", "99310", "", "1964", "MALAWI", "RÉPUBLIQUE DU MALAWI",
        "NYASSALAND", "MW", "MWI", "454");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99229", "1", "", "", "1965", "MALDIVES", "RÉPUBLIQUE DES MALDIVES",
        "ILES MALDIVES", "MV", "MDV", "462");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99335", "1", "98206", "", "1960", "MALI", "RÉPUBLIQUE DU MALI",
        "SOUDAN FRANCAIS", "ML", "MLI", "466");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99427", "4", "", "99132", "", "MALOUINES, OU FALKLAND (ILES)",
        "MALOUINES, OU FALKLAND (ÎLES)", "", "FK", "FLK", "238");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99144", "1", "99133", "", "1964", "MALTE", "RÉPUBLIQUE DE MALTE", "",
        "MT", "MLT", "470");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99132", "3", "", "", "", "MAN (ILE)", "MAN (ÎLE)", "", "IM", "IMN",
        "833");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99218", "2", "", "99216", "", "MANDCHOURIE", "MANDCHOURIE",
        "MANDCHOUKOUO", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99505", "4", "", "99404", "", "MARIANNES DU NORD (ILES)",
        "MARIANNES DU NORD (ÎLES)", "", "MP", "MNP", "580");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99350", "1", "XXXXX", "", "1956", "MAROC", "ROYAUME DU MAROC", "", "MA",
        "MAR", "504");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99515", "1", "99505", "", "1991", "MARSHALL (ILES)",
        "RÉPUBLIQUE DES ÎLES MARSHALL", "", "MH", "MHL", "584");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("XXXXX", "3", "", "", "", "MARTINIQUE", "DÉPARTEMENT DE LA MARTINIQUE", "",
        "MQ", "MTQ", "474");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99390", "1", "99308", "", "1968", "MAURICE", "RÉPUBLIQUE DE MAURICE", "",
        "MU", "MUS", "480");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99336", "1", "98201", "", "1960", "MAURITANIE",
        "RÉPUBLIQUE ISLAMIQUE DE MAURITANIE", "", "MR", "MRT", "478");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("XXXXX", "3", "", "", "", "MAYOTTE", "DÉPARTEMENT DE MAYOTTE", "", "YT",
        "MYT", "175");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99405", "1", "", "", "", "MEXIQUE", "ÉTATS-UNIS DU MEXIQUE", "", "MX",
        "MEX", "484");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99516", "1", "99505", "", "1991", "MICRONESIE (ETATS FEDERES DE)",
        "ÉTATS FÉDÉRÉS DE MICRONÉSIE", "", "FM", "FSM", "583");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99151", "1", "99123", "", "1991", "MOLDAVIE", "RÉPUBLIQUE DE MOLDAVIE",
        "", "MD", "MDA", "498");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99138", "1", "", "", "", "MONACO", "PRINCIPAUTÉ DE MONACO", "", "MC",
        "MCO", "492");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99242", "1", "99216", "", "1945", "MONGOLIE", "MONGOLIE",
        "MONGOLIE EXTERIEURE", "MN", "MNG", "496");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99120", "1", "99121", "", "2006", "MONTENEGRO",
        "RÉPUBLIQUE DU MONTÉNÉGRO", "SERBIE-ET-MONTENEGRO", "ME", "MNE", "499");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99425", "4", "", "99132", "", "MONTSERRAT", "MONTSERRAT", "", "MS", "MSR",
        "500");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99393", "1", "99320", "", "1975", "MOZAMBIQUE",
        "RÉPUBLIQUE DU MOZAMBIQUE", "", "MZ", "MOZ", "508");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99311", "1", "", "", "1990", "NAMIBIE", "RÉPUBLIQUE DE NAMIBIE",
        "SUD-OUEST AFRICAIN", "NA", "NAM", "516");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99507", "1", "99501", "", "1968", "NAURU", "RÉPUBLIQUE DE NAURU", "",
        "NR", "NRU", "520");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99215", "1", "", "", "", "NEPAL", "ROYAUME DU NÉPAL", "", "NP", "NPL",
        "524");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99412", "1", "", "", "", "NICARAGUA", "RÉPUBLIQUE DU NICARAGUA", "", "NI",
        "NIC", "558");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99337", "1", "98207", "", "1960", "NIGER", "RÉPUBLIQUE DU NIGER", "",
        "NE", "NER", "562");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99338", "1", "99304", "", "1960", "NIGERIA",
        "RÉPUBLIQUE FÉDÉRALE DU NIGÉRIA", "", "NG", "NGA", "566");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99502", "3", "", "", "", "NIUE", "NIUE", "", "NU", "NIU", "570");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99501", "3", "99503", "", "", "NORFOLK (ILE)", "NORFOLK (ÎLE)", "", "NF",
        "NFK", "574");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99103", "1", "", "", "", "NORVEGE", "ROYAUME DE NORVÈGE", "", "NO", "NOR",
        "578");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("XXXXX", "3", "", "", "", "NOUVELLE-CALEDONIE", "NOUVELLE-CALÉDONIE", "",
        "NC", "NCL", "540");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99502", "1", "", "", "", "NOUVELLE-ZELANDE", "NOUVELLE-ZÉLANDE", "", "NZ",
        "NZL", "554");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99308", "4", "", "99132", "",
        "OCEAN INDIEN (TERRITOIRE BRITANNIQUE DE L')", "OCÉAN INDIEN (TERRITOIRE BRITANNIQUE DE L')", "", "IO", "IOT",
        "086");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99250", "1", "99221", "", "1971", "OMAN", "SULTANAT D'OMAN",
        "MASCATE-ET-OMAN", "OM", "OMN", "512");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99339", "1", "99307", "", "1962", "OUGANDA", "RÉPUBLIQUE DE L'OUGANDA",
        "", "UG", "UGA", "800");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99258", "1", "99123", "", "1991", "OUZBEKISTAN",
        "RÉPUBLIQUE D'OUZBÉKISTAN", "", "UZ", "UZB", "860");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99213", "1", "", "", "1947", "PAKISTAN",
        "RÉPUBLIQUE ISLAMIQUE DU PAKISTAN", "", "PK", "PAK", "586");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99517", "1", "99404", "", "1994", "PALAOS (ILES)",
        "RÉPUBLIQUE DES ÎLES PALAOS", "BELAU", "PW", "PLW", "585");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99261", "1", "99207", "", "", "PALESTINE (Etat de)", "ÉTAT DE PALESTINE",
        "PALESTINE (Territoire de)", "PS", "PSE", "275");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99413", "1", "", "", "", "PANAMA", "RÉPUBLIQUE DU PANAMA", "", "PA",
        "PAN", "591");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99510", "1", "99501", "", "1975", "PAPOUASIE-NOUVELLE-GUINEE",
        "PAPOUASIE-NOUVELLE-GUINÉE", "", "PG", "PNG", "598");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99421", "1", "", "", "", "PARAGUAY", "RÉPUBLIQUE DU PARAGUAY", "", "PY",
        "PRY", "600");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99135", "1", "", "", "", "PAYS-BAS", "ROYAUME DES PAYS-BAS", "HOLLANDE",
        "NL", "NLD", "528");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99422", "1", "", "", "", "PEROU", "RÉPUBLIQUE DU PÉROU", "", "PE", "PER",
        "604");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99220", "1", "", "", "1946", "PHILIPPINES", "RÉPUBLIQUE DES PHILIPPINES",
        "", "PH", "PHL", "608");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99503", "4", "", "99132", "", "PITCAIRN (ILE)", "PITCAIRN (ÎLE)", "",
        "PN", "PCN", "612");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99122", "1", "", "", "", "POLOGNE", "RÉPUBLIQUE DE POLOGNE", "", "PL",
        "POL", "616");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("XXXXX", "3", "", "", "", "POLYNESIE FRANCAISE", "POLYNÉSIE FRANÇAISE", "",
        "PF", "PYF", "258");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99432", "4", "", "99404", "", "PORTO RICO", "PORTO RICO", "", "PR", "PRI",
        "630");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99139", "1", "", "", "", "PORTUGAL", "RÉPUBLIQUE PORTUGAISE", "", "PT",
        "PRT", "620");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99221", "2", "", "", "", "POSSESSIONS BRITANNIQUES AU PROCHE-ORIENT",
        "POSSESSIONS BRITANNIQUES AU PROCHE-ORIENT", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99313", "4", "", "99134", "", "PRESIDES", "PRÉSIDES", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99313", "4", "", "99134", "", "PROVINCES ESPAGNOLES D'AFRIQUE",
        "PROVINCES ESPAGNOLES D'AFRIQUE", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99248", "1", "99221", "", "1971", "QATAR", "ÉTAT DU QATAR", "", "QA",
        "QAT", "634");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99141", "2", "", "99109", "", "REPUBLIQUE DEMOCRATIQUE ALLEMANDE",
        "RÉPUBLIQUE DÉMOCRATIQUE ALLEMANDE", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99142", "2", "", "99109", "", "REPUBLIQUE FEDERALE D'ALLEMAGNE",
        "RÉPUBLIQUE FÉDÉRALE D'ALLEMAGNE", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99114", "1", "", "", "", "ROUMANIE", "ROUMANIE", "", "RO", "ROU", "642");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99132", "1", "", "", "", "ROYAUME-UNI",
        "ROYAUME-UNI DE GRANDE-BRETAGNE ET D'IRLANDE DU NORD", "", "GB", "GBR", "826");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99123", "1", "", "", "1991", "RUSSIE", "FÉDÉRATION DE RUSSIE", "U.R.S.S.",
        "RU", "RUS", "643");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99340", "1", "99312", "", "1962", "RWANDA", "RÉPUBLIQUE RWANDAISE",
        "RUANDA", "RW", "RWA", "646");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99389", "4", "", "", "", "SAHARA OCCIDENTAL", "SAHARA OCCIDENTAL", "",
        "EH", "ESH", "732");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("XXXXX", "3", "", "", "", "SAINT-BARTHELEMY",
        "COLLECTIVITÉ D'OUTRE-MER DE SAINT-BARTHÉLEMY", "", "BL", "BLM", "652");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99442", "1", "99425", "", "1983", "SAINT-CHRISTOPHE-ET-NIEVES",
        "FÉDÉRATION DE SAINT-CHRISTOPHE-ET-NIÉVÈS", "", "KN", "KNA", "659");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99306", "4", "", "99132", "",
        "SAINTE HELENE, ASCENSION ET TRISTAN DA CUNHA", "SAINTE-HÉLÈNE, ASCENSION ET TRISTAN DA CUNHA", "SAINTE HELENE",
        "SH", "SHN", "654");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99439", "1", "99425", "", "1979", "SAINTE-LUCIE", "SAINTE-LUCIE", "",
        "LC", "LCA", "662");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99128", "1", "", "", "", "SAINT-MARIN", "RÉPUBLIQUE DE SAINT-MARIN", "",
        "SM", "SMR", "674");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("XXXXX", "3", "", "", "", "SAINT-MARTIN",
        "COLLECTIVITÉ D'OUTRE-MER DE SAINT-MARTIN", "", "MF", "MAF", "663");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99445", "1", "99431", "", "2010", "SAINT-MARTIN (PARTIE NEERLANDAISE)",
        "SAINT-MARTIN (PARTIE NÉERLANDAISE)", "", "SX", "SXM", "534");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("XXXXX", "3", "", "", "", "SAINT-PIERRE-ET-MIQUELON",
        "COLLECTIVITÉ TERRITORIALE DE SAINT-PIERRE-ET-MIQUELON", "", "PM", "SPM", "666");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99440", "1", "99425", "", "1979", "SAINT-VINCENT-ET-LES GRENADINES",
        "SAINT-VINCENT-ET-LES GRENADINES", "", "VC", "VCT", "670");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99512", "1", "99503", "", "1978", "SALOMON (ILES)", "ÎLES SALOMON",
        "ILES SALOMON DU SUD", "SB", "SLB", "090");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99505", "4", "", "99404", "", "SAMOA AMERICAINES", "SAMOA AMÉRICAINES",
        "", "AS", "ASM", "016");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99506", "1", "99505", "", "1962", "SAMOA OCCIDENTALES",
        "ÉTAT INDÉPENDANT DES SAMOA OCCIDENTALES", "", "WS", "WSM", "882");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99394", "1", "99319", "", "1975", "SAO TOME-ET-PRINCIPE",
        "RÉPUBLIQUE DÉMOCRATIQUE DE SAO TOMÉ-ET-PRINCIPE", "", "ST", "STP", "678");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99341", "1", "98202", "", "1960", "SENEGAL", "RÉPUBLIQUE DU SÉNÉGAL", "",
        "SN", "SEN", "686");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99121", "1", "", "", "2006", "SERBIE", "RÉPUBLIQUE DE SERBIE",
        "SERBIE-ET-MONTENEGRO", "RS", "SRB", "688");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99398", "1", "99308", "", "1976", "SEYCHELLES",
        "RÉPUBLIQUE DES SEYCHELLES", "", "SC", "SYC", "690");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99209", "2", "", "99123", "", "SIBERIE", "SIBÉRIE", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99342", "1", "99304", "", "1961", "SIERRA LEONE",
        "RÉPUBLIQUE DE SIERRA LEONE", "", "SL", "SLE", "694");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99226", "1", "", "", "1965", "SINGAPOUR", "RÉPUBLIQUE DE SINGAPOUR",
        "ETABLS. DES DETROITS", "SG", "SGP", "702");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99117", "1", "99115", "", "1992", "SLOVAQUIE", "RÉPUBLIQUE SLOVAQUE", "",
        "SK", "SVK", "703");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99145", "1", "99121", "", "1991", "SLOVENIE", "RÉPUBLIQUE DE SLOVÉNIE",
        "", "SI", "SVN", "705");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99318", "1", "99308", "", "1951", "SOMALIE", "SOMALIE", "", "SO", "SOM",
        "706");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99343", "1", "99307", "", "1956", "SOUDAN", "RÉPUBLIQUE DU SOUDAN",
        "ANGLO-EGYPTIEN", "SD", "SDN", "729");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99307", "2", "", "", "", "SOUDAN ANGLO-EGYPTIEN, KENYA, OUGANDA",
        "SOUDAN ANGLO-ÉGYPTIEN, KENYA, OUGANDA", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99349", "1", "99343", "", "2011", "SOUDAN DU SUD",
        "RÉPUBLIQUE DU SOUDAN DU SUD", "", "SS", "SSD", "728");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99235", "1", "99223", "", "1948", "SRI LANKA",
        "RÉPUBLIQUE DÉMOCRATIQUE SOCIALISTE DU SRI LANKA", "CEYLAN", "LK", "LKA", "144");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99104", "1", "", "", "", "SUEDE", "ROYAUME DE SUÈDE", "", "SE", "SWE",
        "752");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99140", "1", "", "", "", "SUISSE", "CONFÉDÉRATION SUISSE", "", "CH",
        "CHE", "756");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99437", "1", "99431", "", "1975", "SURINAME", "RÉPUBLIQUE DU SURINAME",
        "GUYANE NEERLANDAISE", "SR", "SUR", "740");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99103", "3", "", "", "", "SVALBARD et ILE JAN MAYEN",
        "SVALBARD ET ÎLE JAN MAYEN", "", "SJ", "SJM", "744");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99391", "1", "99310", "", "1968", "SWAZILAND", "ROYAUME DU SWAZILAND", "",
        "SZ", "SWZ", "748");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99206", "1", "", "", "1944", "SYRIE", "RÉPUBLIQUE ARABE SYRIENNE", "",
        "SY", "SYR", "760");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99259", "1", "99123", "", "1991", "TADJIKISTAN",
        "RÉPUBLIQUE DU TADJIKISTAN", "", "TJ", "TJK", "762");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99236", "4", "99217", "", "1945", "TAIWAN", "TAÏWAN", "FORMOSE", "TW",
        "TWN", "158");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99325", "2", "", "99350", "", "TANGER", "TANGER", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99309", "1", "", "", "1961", "TANZANIE", "RÉPUBLIQUE UNIE DE TANZANIE",
        "TANGANYIKA, ZANZIBAR", "TZ", "TZA", "834");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99344", "1", "98304", "", "1960", "TCHAD", "RÉPUBLIQUE DU TCHAD", "",
        "TD", "TCD", "148");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99115", "2", "", "", "", "TCHECOSLOVAQUIE", "TCHÉCOSLOVAQUIE", "", "", "",
        "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99116", "1", "99115", "", "1992", "TCHEQUE (REPUBLIQUE)",
        "RÉPUBLIQUE TCHÈQUE", "", "CZ", "CZE", "203");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99432", "4", "", "99404", "",
        "TERR. DES ETATS-UNIS D'AMERIQUE EN AMERIQUE", "TERR. DES ÉTATS-UNIS D'AMÉRIQUE EN AMÉRIQUE", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99505", "4", "", "99404", "",
        "TERR. DES ETATS-UNIS D'AMERIQUE EN OCEANIE", "TERR. DES ÉTATS-UNIS D'AMÉRIQUE EN OCÉANIE", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99427", "4", "", "99132", "",
        "TERR. DU ROYAUME-UNI DANS L'ATLANTIQUE SUD", "TERR. DU ROYAUME-UNI DANS L'ATLANTIQUE_SUD", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99402", "2", "", "99401", "", "TERRE-NEUVE", "TERRE-NEUVE", "", "", "",
        "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("XXXXX", "3", "", "", "", "TERRES AUSTRALES FRANCAISES",
        "TERRES AUSTRALES FRANÇAISES", "", "TF", "ATF", "260");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99425", "4", "", "99132", "", "TERRITOIRES DU ROYAUME-UNI AUX ANTILLES",
        "TERRITOIRES DU ROYAUME-UNI AUX ANTILLES", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99219", "1", "", "", "", "THAILANDE", "ROYAUME DE THAÏLANDE", "SIAM",
        "TH", "THA", "764");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99262", "1", "99231", "", "2002", "TIMOR ORIENTAL",
        "RÉPUBLIQUE DÉMOCRATIQUE DU TIMOR ORIENTAL", "", "TL", "TLS", "626");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99345", "1", "99305", "", "1960", "TOGO", "RÉPUBLIQUE TOGOLAISE", "",
        "TG", "TGO", "768");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99502", "3", "", "", "", "TOKELAU", "TOKELAU", "", "TK", "TKL", "772");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99509", "1", "99503", "", "1970", "TONGA", "ROYAUME DES TONGA", "", "TO",
        "TON", "776");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99433", "1", "99426", "", "1962", "TRINITE-ET-TOBAGO",
        "RÉPUBLIQUE DE TRINITÉ-ET-TOBAGO", "", "TT", "TTO", "780");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99351", "1", "XXXXX", "", "1956", "TUNISIE", "RÉPUBLIQUE TUNISIENNE", "",
        "TN", "TUN", "788");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99210", "2", "", "99123", "", "TURKESTAN RUSSE", "TURKESTAN RUSSE", "",
        "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99260", "1", "99123", "", "1991", "TURKMENISTAN", "TURKMÉNISTAN", "",
        "TM", "TKM", "795");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99425", "4", "", "99132", "", "TURKS ET CAIQUES (ILES)",
        "TURKS ET CAÏQUES (ÎLES)", "", "TC", "TCA", "796");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99208", "1", "", "", "", "TURQUIE", "RÉPUBLIQUE TURQUE", "", "TR", "TUR",
        "792");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99124", "2", "", "99208", "", "TURQUIE D'EUROPE", "TURQUIE D'EUROPE", "",
        "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99511", "1", "99503", "", "1978", "TUVALU", "TUVALU", "ILES ELLICE", "TV",
        "TUV", "798");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99155", "1", "99123", "", "1991", "UKRAINE", "UKRAINE", "", "UA", "UKR",
        "804");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99423", "1", "", "", "", "URUGUAY", "RÉPUBLIQUE ORIENTALE DE L'URUGUAY",
        "", "UY", "URY", "858");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99514", "1", "99503", "", "1980", "VANUATU", "RÉPUBLIQUE DE VANUATU",
        "NOUVELLES-HEBRIDES", "VU", "VUT", "548");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99129", "1", "", "", "", "VATICAN, ou SAINT-SIEGE",
        "ÉTAT DE LA CITÉ DU VATICAN", "", "VA", "VAT", "336");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99424", "1", "", "", "", "VENEZUELA",
        "RÉPUBLIQUE BOLIVARIENNE DU VENEZUELA", "REPUBLIQUE DU VENEZUELA", "VE", "VEN", "862");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99425", "4", "", "99132", "", "VIERGES BRITANNIQUES (ILES)",
        "VIERGES BRITANNIQUES (ÎLES)", "", "VG", "VGB", "092");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99432", "4", "", "99404", "", "VIERGES DES ETATS-UNIS (ILES)",
        "VIERGES DES ÉTATS-UNIS (ÎLES)", "", "VI", "VIR", "850");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99243", "1", "", "", "1976", "VIET NAM",
        "RÉPUBLIQUE SOCIALISTE DU VIÊT NAM", "", "VN", "VNM", "704");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99244", "2", "98506", "99243", "1954", "VIET NAM DU NORD",
        "VIÊT NAM DU NORD", "TONKIN, ANNAM N.", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99245", "2", "XXXXX", "99243", "1954", "VIET NAM DU SUD",
        "VIÊT NAM DU SUD", "ANNAM S.,COCHINCHINE", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("XXXXX", "3", "", "", "", "WALLIS-ET-FUTUNA", "WALLIS-ET-FUTUNA", "", "WF",
        "WLF", "876");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99251", "1", "", "", "1990", "YEMEN", "RÉPUBLIQUE DU YÉMEN", "", "YE",
        "YEM", "887");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99202", "2", "", "99251", "", "YEMEN (REPUBLIQUE ARABE DU)",
        "YÉMEN (RÉPUBLIQUE ARABE DU)", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99233", "2", "", "99251", "", "YEMEN DEMOCRATIQUE", "YÉMEN DÉMOCRATIQUE",
        "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99346", "1", "99310", "", "1964", "ZAMBIE", "RÉPUBLIQUE DE ZAMBIE",
        "RHODESIE DU NORD", "ZM", "ZMB", "894");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99308", "2", "", "99309", "", "ZANZIBAR", "ZANZIBAR", "", "", "", "");
    tousLesPays.add(current);

    current = new PaysEtTerritoiresEtrangers("99310", "1", "", "", "1980", "ZIMBABWE", "RÉPUBLIQUE DU ZIMBABWE",
        "RHODESIE DU SUD", "ZW", "ZWE", "716");
    tousLesPays.add(current);

    current = null;
  }

}
