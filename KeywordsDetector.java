public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        String[]  lowsentences = new String[sentences.length];
        String[]  lowskeywords = new String[keywords.length];
        for (int i = 0; i < keywords.length; i++){
            lowskeywords[i]=MyString.lowerCase(keywords[i]);
        }
        for (int t = 0 ; t < sentences.length; t++){
            lowsentences[t]= MyString.lowerCase(sentences[t]);
        }
      
        for (int i = 0 ; i < sentences.length; i ++){
            for(int g = 0; g < keywords.length; g++)
            if (MyString.contains(lowsentences[i],lowskeywords[g])){
                System.out.println(sentences[i]);
            }


        }
    }
}
