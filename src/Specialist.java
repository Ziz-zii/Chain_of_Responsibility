public class Specialist implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) { this.next = next; }

    @Override
    public void handle(Request request) {
        if (request.getSeverity() <= 3) {
            System.out.println("СПЕЦИАЛИСТ обработал: " + request);
        } else if (next != null) {
            System.out.println("СПЕЦИАЛИСТ:передаю дальше...");
            next.handle(request);
        } else {
            System.out.println("СПЕЦИАЛИСТ: не могу обработать!");
        }
    }
}