import java.util.ArrayList

class UserIterator implements Iterator {

    List<BasicUser> userList;
    int index = 0;

    public UserIterator (ArrayList<BasicUser> userList) {
        this.userList = userList;
    }

    public Object next() {
        BasicUser basicUser = userList.get(index);
        index += 1;
        return basicUser;
    }

    public boolean hasNext() {
        return index < userList.size() - 1;
    }
}