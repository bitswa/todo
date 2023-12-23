public class Item {
    private int id;
    private final String title;
    private boolean completed;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public boolean isCompleted() { return completed; }
    public void changeCompleted() { completed = !completed; }
    public Item(String title) {
        this.title = title;
        this.completed = false;
    }
}
