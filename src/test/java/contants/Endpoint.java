package contants;

public enum Endpoint {
    LOGIN("/login"),
    REGISTER("/register");

    public final String url;

    Endpoint(String url) {
        this.url = url;
    }
}
