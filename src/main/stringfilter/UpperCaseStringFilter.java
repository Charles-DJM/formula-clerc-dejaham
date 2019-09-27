package main.stringfilter;

public class UpperCaseStringFilter implements StringFilter {
    @Override
    public String filter(String string) {
        return string.toUpperCase();
    }
}
