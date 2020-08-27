class Group {
    private long id;
    private String name;
    private UserCollection members;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public UserCollection getMembers() {
        return members;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMembers(UserCollection members) {
        this.members = members;
    }
}