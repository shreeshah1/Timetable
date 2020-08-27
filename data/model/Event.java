class Event {
    private long id;
    private String name;
    private TimeSlot timeSlot;
    private boolean repeatWeekly;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public TimeSlot getTimeSlot() {
        return timeSlot;
    }

    public boolean isRepeatWeekly() {
        return repeatWeekly;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTimeSlot(TimeSlot timeSlot) {
        this.timeSlot = timeSlot;
    }

    public void setRepeatWeekly(boolean repeatWeekly) {
        this.repeatWeekly = repeatWeekly;
    }
}