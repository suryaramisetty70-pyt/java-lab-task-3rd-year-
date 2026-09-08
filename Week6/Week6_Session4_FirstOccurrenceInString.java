public class Week6_Session4_FirstOccurrenceInString {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        int index = strStr(haystack, needle);

        System.out.println("Haystack: \"" + haystack + "\", Needle: \"" + needle + "\"");
        System.out.println("First Occurrence Index: " + index);
    }
}

/*
OUTPUT:
Haystack: "sadbutsad", Needle: "sad"
First Occurrence Index: 0
*/
