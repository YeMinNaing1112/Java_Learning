package regex;

public class Regex2 {
    public static void main(String[] args) {
        String originalText,modifiedText;
        originalText="apple";
        modifiedText=originalText.replaceAll("[aeiou]","@");
        System.out.println(modifiedText);
    }
}
