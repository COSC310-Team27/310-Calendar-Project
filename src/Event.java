public class Event {
    private String name, description, location;
    private boolean fixed;
    private String endDate; //format given of xxxx/xx/xx which we can parse using '/' as the seperating character
    private int priority, length;
    private String[] timeScheduled; //format from above extended with extra /xx which will go from 1-48 with each integer marking a half hour
    private boolean repeat;
    private String[] repeats; //format same as timeScheduled
}
