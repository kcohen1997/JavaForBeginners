import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

    public void printAll() {
        System.out.println("EXAMPLE 1");
        RegexExample1();
        System.out.println();
        System.out.println("EXAMPLE 2");
        RegexExample2();
        System.out.println();
        System.out.println("EXAMPLE 3");
        RegexExample3();
        System.out.println();
        System.out.println("EXAMPLE 4");
        RegexExample4();
        System.out.println();
        System.out.println("EXAMPLE 5");
        RegexExample5();
        System.out.println();
    }

    public void RegexExample1() {
        // String to be scanned to find the pattern.
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(line);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
        } else {
            System.out.println("NO MATCH");
        }

    }

    private static final String REGEX = "\\bcat\\b";
    private static final String INPUT = "cat cat cat cattie cat";

    public void RegexExample2() {
        Pattern p = Pattern.compile(REGEX);
        Matcher m = p.matcher(INPUT); // get a matcher object
        int count = 0;

        while (m.find()) {
            count++;
            System.out.println("Match number " + count);
            System.out.println("start(): " + m.start());
            System.out.println("end(): " + m.end());
        }
    }

    private static final String REGEX2 = "foo";
    private static final String INPUT2 = "fooooooooooooooooo";
    private static Pattern pattern2;
    private static Matcher matcher2;

    public void RegexExample3() {
        pattern2 = Pattern.compile(REGEX2);
        matcher2 = pattern2.matcher(INPUT2);

        System.out.println("Current REGEX is: " + REGEX2);
        System.out.println("Current INPUT is: " + INPUT2);

        System.out.println("lookingAt(): " + matcher2.lookingAt());
        System.out.println("matches(): " + matcher2.matches());
    }

    private static String REGEX3 = "dog";
    private static String INPUT3 = "The dog says meow. " + "All dogs say meow.";
    private static String REPLACE3 = "cat";

    public void RegexExample4() {
        Pattern p = Pattern.compile(REGEX3);
        Matcher m = p.matcher(INPUT3);
        INPUT3 = m.replaceAll(REPLACE3);
        System.out.println(INPUT3);
    }

    private static String REGEX4 = "a*b";
    private static String INPUT4 = "aabfooaabfooabfoob";
    private static String REPLACE4 = "-";

    public void RegexExample5() {

        Pattern p = Pattern.compile(REGEX4);

        // get a matcher object
        Matcher m = p.matcher(INPUT4);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, REPLACE4);
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }

}