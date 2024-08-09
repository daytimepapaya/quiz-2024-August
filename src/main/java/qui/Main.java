package qui;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static final String[] problems = {"6+5*3/5/4", "1+3-7", "3+9/6*5"};

    public static void main(String[] args) {
        generatePriority();
    }

    static void parseProblem(String input) {
    }

    static List<String> generatePriority() {
        char[] shisoku = "+-*/".toCharArray();
        List<String> priority = new ArrayList<>();
        for (int i = 0; i < shisoku.length; i++) {
            char c1 = shisoku[i];
            for (int j = 0; j < shisoku.length; j++) {
                if (i == j) continue;
                char c2 = shisoku[j];
                for (int k = 0; k < shisoku.length; k++) {
                    if (i == k || j == k) continue;
                    char c3 = shisoku[k];
                    for (int l = 0; l < shisoku.length; l++) {
                        if (i == l || j == l || k == l) continue;
                        char c4 = shisoku[l];
                        priority.add("" + c1 + c2 + c3 + c4);
                    }
                }
            }
        }

        return priority;
    }
}
