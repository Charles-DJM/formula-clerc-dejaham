package main.stringfilter;

public class PostfixStringFilter implements StringFilter {

    int n ;

    public PostfixStringFilter (int n) { this.n = n; }

    @Override
    public String filter(String string) { return string.substring(n); }
}
