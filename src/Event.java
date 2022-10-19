public class Event {
    private String name, description, location;
    private boolean fixed;
    private String endDate; //format given of xxxx/xx/xx which we can parse using '/' as the seperating character
    private int priority, length;
    private String[] timeScheduled; //format from above extended with extra /xx which will go from 1-48 with each integer marking a half hour
    private boolean repeat;
    private String[] repeats; //format same as timeScheduled


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isFixed() {
        return fixed;
    }

    public void setFixed(boolean fixed) {
        this.fixed = fixed;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String[] getTimeScheduled() {
        return timeScheduled;
    }

    public void setTimeScheduled(String[] timeScheduled) {
        this.timeScheduled = timeScheduled;
    }

    public boolean isRepeat() {
        return repeat;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }

    public String[] getRepeats() {
        return repeats;
    }

    public void setRepeats(String[] repeats) {
        this.repeats = repeats;
    }
}
