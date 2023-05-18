/*
Create a function which answers the question "Are you playing banjo?".
If your name starts with the letter "R" or lower case "r", you are playing banjo!
The function takes a name as its only argument, and returns one of the following strings:
name + " plays banjo" 
name + " does not play banjo"
Names given are always valid strings.
*/

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Banjo {
    public static String areYouPlayingBanjo(String name) {
        List<String> names = Arrays.stream(name.split(" "))
                                    .map(s -> s.toLowerCase().startsWith("r") ? s + " plays banjo" : s + " does not play banjo")
                                    .collect(Collectors.toList());
        return String.join(" ", names);
    }
}
