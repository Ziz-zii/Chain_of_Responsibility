public class Expert implements Handler {
    private Handler next;

    @Override
    public void setNext(Handler next) { this.next = next; }

    @Override
    public void handle(Request request) {
        if (request.getSeverity() <= 5) {
            System.out.println("ЭКСПЕРТ обработал: " + request);
        } else {
            System.out.println("ЭКСПЕРТ: запрос слишком сложный!");
        }
    }
}