package virtualmethod.grammar;

public class Grammar {

    public static void main(String[] args) {
        Verb verbPhrasalVerb = new PhrasalVerb("fest", "le");
        Verb verbPhrasalVerbWithSuffix = new PhrasalVerbWithSuffix("fest", "le", "em");
        Preposition prepositionPhrasalVerb = new PhrasalVerb("fest", "le");
        Preposition prepositionPhrasalVerbWithSuffix = new PhrasalVerbWithSuffix("fest", "le", "em");
        PhrasalVerb phrasalVerb = new PhrasalVerb("fest", "le");
        PhrasalVerb phrasalVerbPhrasalVerbWithSuffix = new PhrasalVerbWithSuffix("fest", "le", "em");
        Suffix suffix = new PhrasalVerbWithSuffix("fest", "le", "em");
        PhrasalVerbWithSuffix phrasalVerbWithSuffix = new PhrasalVerbWithSuffix("fest", "le", "em");

        System.out.println("verbPhrasalVerb.getWord(): " + verbPhrasalVerb.getWord());
        System.out.println("verbPhrasalVerbWithSuffix.getWord(): " + verbPhrasalVerbWithSuffix.getWord());
        System.out.println("prepositionPhrasalVerb.getPreposition(): " + prepositionPhrasalVerb.getPreposition());
        System.out.println("prepositionPhrasalVerb.getWholeWord(): " + prepositionPhrasalVerb.getWholeWord());
        System.out.println("prepositionPhrasalVerbWithSuffix.getPreposition(): " + prepositionPhrasalVerbWithSuffix.getPreposition());
        System.out.println("prepositionPhrasalVerbWithSuffix.getWholeWord(): " + prepositionPhrasalVerbWithSuffix.getWholeWord());
        System.out.println("phrasalVerb.getPreposition(): " + phrasalVerb.getPreposition());
        System.out.println("phrasalVerb.getWholeWord(): " + phrasalVerb.getWholeWord());
        System.out.println("phrasalVerbPhrasalVerbWithSuffix.getWord(): " + phrasalVerbPhrasalVerbWithSuffix.getWord());
        System.out.println("phrasalVerbPhrasalVerbWithSuffix.getPreposition(): " + phrasalVerbPhrasalVerbWithSuffix.getPreposition());
        System.out.println("phrasalVerbPhrasalVerbWithSuffix.getWholeWord(): " + phrasalVerbPhrasalVerbWithSuffix.getWholeWord());
        System.out.println("suffix.getSuffix(): " + suffix.getSuffix());
        System.out.println("phrasalVerbWithSuffix.getSuffix(): " + phrasalVerbWithSuffix.getSuffix());
        System.out.println("phrasalVerbWithSuffix.getPreposition(): " + phrasalVerbWithSuffix.getPreposition());
        System.out.println("phrasalVerbWithSuffix.getWord(): " + phrasalVerbWithSuffix.getWord());
        System.out.println("phrasalVerbWithSuffix.getWholeWord(): " + phrasalVerbWithSuffix.getWholeWord());
    }
}
