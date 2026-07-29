package StreamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurence {
    static void main(String[] args) {
                String input="swissing";
Map<String,Long> characterccurence	= Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors
				.counting()));
System.out.println(characterccurence);

            }
}
//