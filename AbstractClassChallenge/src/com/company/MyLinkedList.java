package com.company;

public class MyLinkedList  {
    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }


    public ListItem getRoot() {
        return this.root;
    }


    public boolean addItem(ListItem item) {
        if(this.root == null){
            this.root = item;
            return true;
        }
        ListItem currentItem = this.root;
        while (currentItem != null){
            int comparison = currentItem.compareTo(item);
            if(comparison<0){
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                }else {
                    currentItem.setNext(item);
                    item.setPrevious(currentItem);
                    return true;
                }
            }else if (comparison > 0){
                if (currentItem != null){
                    currentItem.previous().setNext(item);
                    item.setPrevious(currentItem.previous());
                    item.setNext(currentItem);
                    currentItem.setPrevious(item)
                }
            }

        }
        return true;
    }


    public boolean removeItem(ListItem item) {
        return false;
    }


    public void traverse(ListItem root) {

    }
}
