public class Operator implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) { this.next = next; }

    @Override
    public void handle(Request request) {
        if (request.getSeverity() <= 1) {
            System.out.println("ОПЕРАТОР обработал: " + request);
        } else if (next != null) {
            System.out.println("ОПЕРАТОР:передаю дальше...");
            next.handle(request);
        } else {
            System.out.println("ОПЕРАТОР:не могу обработать!");
        }
    }
}
