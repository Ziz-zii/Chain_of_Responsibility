public class Request {

    private String description;
    private int severity;

    public Request(String description, int severity) {
        this.description = description;
        this.severity = severity;
    }

    public String getDescription() { return description; }
    public int getSeverity() { return severity; }

    @Override
    public String toString() {
        return "'" + description + "' (важность: " + severity + ")";
    }
}
