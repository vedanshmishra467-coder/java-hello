public class OOPSBannerApp07{

    /**
     * Inner class to store character and its pattern
     */
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        public char getCharacter() {
            return character;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    // Create mappings for O, P, S and space
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
            "  ***  ",
            " ** ** ",
            "**   **",
            "**   **",
            "**   **",
            " ** ** ",
            "  ***  "
        };

        String[] P = {
            "****  ",
            "**  **",
            "**  **",
            "****  ",
            "**    ",
            "**    ",
            "**    "
        };

        String[] S = {
            " **** ",
            "**    ",
            "**    ",
            " ***  ",
            "    **",
            "    **",
            " **** "
        };

        String[] SPACE = {
            "   ",
            "   ",
            "   ",
            "   ",
            "   ",
            "   ",
            "   "
        };

        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', O),
            new CharacterPatternMap('P', P),
            new CharacterPatternMap('S', S),
            new CharacterPatternMap(' ', SPACE)
        };
    }

    // Retrieve pattern for a character
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {
        for (CharacterPatternMap map : maps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null; // if not found
    }

    // Print message as banner
    public static void printMessage(String message, CharacterPatternMap[] maps) {

        int height = 7; // pattern height

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < message.length(); j++) {

                char ch = message.charAt(j);
                String[] pattern = getCharacterPattern(ch, maps);

                if (pattern != null) {
                    System.out.print(pattern[i] + " ");
                }
            }

            System.out.println(); // next line
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] maps = createCharacterPatternMaps();

        // Print OOPS
        printMessage("OOPS", maps);
    }
}