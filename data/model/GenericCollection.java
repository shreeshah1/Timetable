class GenericCollection<E> implements Collection {

    List<E> list;

    public GenericCollection()
    {
        list = new ArrayList<E>();
    }

    public void addItem(<E> item)
    {
        list.add(item);
    }

    public Iterator createIterator()
    {
        return new GenericCollection(list);
    }

}