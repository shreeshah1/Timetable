public class FullUser extends BasicUser {

    GenericCollection<Group> groups;
    GenericCollection<BasicUser> friends;
    Schedule schedule;
    boolean publicAccount;
    boolean signedTos;
    GenericCollection<BasicUser> friendRequests;

    public GenericCollection<Group> getGroups() {
        return groups;
    }

    public void setGroups(GenericCollection<Group> groups) {
        this.groups = groups;
    }

    public GenericCollection<BasicUser> getFriends() {
        return friends;
    }

    public void setFriends(GenericCollection<BasicUser> friends) {
        this.friends = friends;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public boolean isPublicAccount() {
        return publicAccount;
    }

    public void setPublicAccount(boolean publicAccount) {
        this.publicAccount = publicAccount;
    }

    public boolean isSignedTos() {
        return signedTos;
    }

    public void setSignedTos(boolean signedTos) {
        this.signedTos = signedTos;
    }

    public GenericCollection<BasicUser> getFriendRequests() {
        return friendRequests;
    }

    public void setFriendRequests(GenericCollection<BasicUser> friendRequests) {
        this.friendRequests = friendRequests;
    }
}