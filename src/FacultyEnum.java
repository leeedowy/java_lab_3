import java.util.Arrays;
import java.util.Collections;

public enum FacultyEnum {
    ARTS,
    CLASSICS,
    COMMERCE,
    ECONOMICS,
    EDUCATION,
    ENGINEERING,
    GRADUATE_STUDIES,
    HUMANITIES,
    INFORMATION_TECHNOLOGY,
    LAW,
    MANAGEMENT_STUDIES,
    MUSIC,
    NATURAL_SCIENCES,
    PHILOSOPHY,
    POLITICAL_SCIENCE;

    @Override
    public String toString() {
        String lowerCaseName = name().toLowerCase();
        String [] splitNames = lowerCaseName.split("_");

        for (int i = 0; i < splitNames.length; i++) {
            splitNames[i] = splitNames[i].substring(0, 1).toUpperCase() + splitNames[i].substring(1);
        }

        return String.join(" ", splitNames);
    }
}
