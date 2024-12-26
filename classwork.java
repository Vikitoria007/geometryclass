import java.util.ArrayList;
import java.util.Collections;

class StringArray {
    private ArrayList<String> strings;

    public StringArray() {
        strings = new ArrayList<>();
    }

    public void addString(String string) {
        strings.add(string);
        Collections.sort(strings, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    public String maxLengthString() {
        if (strings.isEmpty()) return null;
        return Collections.max(strings, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }

    public double averageLength() {
        if (strings.isEmpty()) return 0;
        int totalLength = strings.stream().mapToInt(String::length).sum();
        return (double) totalLength / strings.size();
    }
}