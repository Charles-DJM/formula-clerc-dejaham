package main;

public class PrefixStringFilter implements StringFilter {

    int n;

    public PrefixStringFilter(int n) {
        this.n = n;
    }

    @Override
    public String filter(String string) {
        return string.substring(0,n);
    }
}
