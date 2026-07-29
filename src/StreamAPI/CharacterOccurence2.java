package StreamAPI;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurence2 {
    static void main(String[] args) {
        String input="sunilgavaskar";
Map<String,Long> duplicate=	Arrays.stream(input.split("")).collect(Collectors
				.groupingBy(Function.identity(),Collectors.counting()));

duplicate.forEach((character,count)->
{
	if(count>1)
	{
	System.out.println(character+":"+count);
	}
});
    }
}
//arrays.streamit coverts string into character array;
//.coolect method is used to count the repeated characters of the CHARACTER ARRAY
//(Function.identity() isilie use hota h jisse ki every character every line me convert
// krne k liye
