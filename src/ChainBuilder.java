public class ChainBuilder {

    private Handler first;
    private Handler last;

    public ChainBuilder addHandler(Handler handler) {
        if (first == null) {
            first = handler;
            last = handler;
        } else {
            last.setNext(handler);
            last = handler;
        }
        return this;
    }

    public Handler build() { return first; }
}
