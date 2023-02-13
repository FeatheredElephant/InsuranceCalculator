package app.view;

public class Option {
    private String option;
    private String description;
    private Runnable method;

    public Option(String option, String description, Runnable method) {
        this.option = option;
        this.description = description;
        this.method = method;
    }

    public String getOption() {
        return option;
    }

    public String getDescription() {
        return description;
    }

    public Runnable getMethod() {
        return method;
    }
}
