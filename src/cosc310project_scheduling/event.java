package cosc310project_scheduling;

import java.text.SimpleDateFormat;
import java.util.Date;

public class event {
    private String name, description, location;
    private boolean fixed;
    private Date endDate; //holds endDate as a Date datatype
    private int rt; //remaining time to deadline in hours
    private int priority, length;//length is how long the task will take
    private String[] timeScheduled; //format from above extended with extra -xx which will go from 1-48 with each integer marking a half hour
    private boolean repeat;
    private String[] repeats; //format same as timeScheduled
    private static int num = 1;

    public event(String name, String desc, String loc, boolean f, boolean r, int p, int l, Date ed){
        setName(name);
        setDescription(desc);
    	setLocation(loc);
    	setFixed(f);
    	setRepeat(r);
    	setLength(l);
    	setEndDate(ed);
    	rt = getRT();
    	num++;
    }

    public String getCurrentDate(){
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        Date date = new Date(System.currentTimeMillis());
        return formatter.format(date);
    }

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
    
    public int getRT() {
        rt = calcRT();
        return rt;
    }
    
    private int calcRT() {
    	 return (int) (((endDate.getTime()) - (new Date().getTime()))/1000) / 3600;
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

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date currentDate) {
        endDate = currentDate;
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

