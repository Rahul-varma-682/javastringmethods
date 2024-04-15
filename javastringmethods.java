

public class javastringmethods {
    public static void main(String[] args) {
        // charAt
        String str1 = "Rahul";
        char ch = str1.charAt(1);
        System.out.println("charAt: " + ch); 

        // codePointAt
        int codePoint = str1.codePointAt(1);
        System.out.println("codePointAt: " + codePoint);

        // codePointBefore
        codePoint = str1.codePointBefore(2);
        System.out.println("codePointBefore: " + codePoint); 

        // codePointCount
        int count = str1.codePointCount(0, 3);
        System.out.println("codePointCount: " + count); 

        // compareTo
        String str2 = "Prasanth";
        int result = str1.compareTo(str2);
        System.out.println("compareTo: " + result); 
        // compareToIgnoreCase
        result = str1.compareToIgnoreCase("RaHUl");
        System.out.println("compareToIgnoreCase: " + result); 

        // concat
        String str3 = str1.concat(" World!");
        System.out.println("concat: " + str3); // "Hello World!"

        // contains
        boolean contains = str3.contains("Hello");
        System.out.println("contains: " + contains); 

        // contentEquals
        StringBuilder sb = new StringBuilder("Rahul");
        boolean equal = str1.contentEquals(sb);
        System.out.println("contentEquals: " + equal); 

        // copyValueOf
        char[] arr = {'H', 'e', 'l', 'l', 'o'};
        String copiedStr = String.copyValueOf(arr);
        System.out.println("copyValueOf: " + copiedStr); 

        // copyValueOf with offset and count
        copiedStr = String.copyValueOf(arr, 1, 3);
        System.out.println("copyValueOf with offset and count: " + copiedStr); 

        // endsWith
        boolean endsWith = str3.endsWith(" World!");
        System.out.println("endsWith: " + endsWith); 
        // equals
        boolean equals = str1.equals("Rahul");
        System.out.println("equals: " + equals); 

        // equalsIgnoreCase
        boolean equalsIgnoreCase = str1.equalsIgnoreCase("rahul");
        System.out.println("equalsIgnoreCase: " + equalsIgnoreCase); 

       

        // indexOf
        int index = str1.indexOf('l');
        System.out.println("indexOf: " + index); // 2

        // indexOf with fromIndex
        index = str1.indexOf('l', 3);
        System.out.println("indexOf with fromIndex: " + index); 

        // indexOf with substring
        index = str1.indexOf("lo");
        System.out.println("indexOf with substring: " + index); 

        // indexOf with substring and fromIndex
        index = str1.indexOf("l", 3);
        System.out.println("indexOf with substring and fromIndex: " + index);

        // intern
        String internedStr = new String("Hello").intern();
        boolean internedEqual = internedStr == str1;
        System.out.println("intern: " + internedEqual); 

        // isEmpty
        boolean empty = "".isEmpty();
        System.out.println("isEmpty: " + empty); 

        // lastIndexOf
        index = str1.lastIndexOf('l');
        System.out.println("lastIndexOf: " + index); 

        // length
        int length = str1.length();
        System.out.println("length: " + length); // 5

        // matches
        boolean matches = str1.matches("[a-zA-Z]+");
        System.out.println("matches: " + matches); // true

        // offsetByCodePoints
        int newIndex = str1.offsetByCodePoints(1, 2);
        System.out.println("offsetByCodePoints: " + newIndex); 

        // regionMatches
        boolean regionMatches = str1.regionMatches(true, 0, "rAh", 0, 3);
        System.out.println("regionMatches: " + regionMatches); 
        // replace
        String replaced = str1.replace('r', 'x');
        System.out.println("replace: " + replaced); 

      
    }
}
