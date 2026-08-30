public interface Handler {
    void setNext(Handler next);
    void handle(Request request);
}
