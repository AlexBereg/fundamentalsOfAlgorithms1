package org.example;

import java.util.Arrays;

public class StringLisiIML implements StringList {

    //    @Override
    private String[] arrList;

    public String getArrList() {
        return Arrays.toString(arrList);
    }

    public String[] StringList(String[] arrList) {
        this.arrList = arrList;
        return arrList;
    }

    @Override
    public String add(String item) {
        String[] arrList2 = new String[arrList.length + 1];
        for (int i = 0; i < arrList.length; i++) {
            arrList2[i] = arrList[i];
        }
        arrList2[arrList.length] = item;
        String[] arrList = arrList2.clone();
        StringList(arrList);
        return arrList[arrList.length - 1];
    }

    @Override
    public String add(int index, String item) {
        if (index > arrList.length - 1) {
            throw new RuntimeException();
        } else arrList[index] = item;
        StringList(arrList);
        return arrList[index];
    }

    @Override
    public String set(int index, String item) {
        if (index > arrList.length - 1) {
            throw new RuntimeException();
        } else arrList[index] = item;
        StringList(arrList);
        return arrList[index];
    }

    @Override
    public String remove(String item) {
        for (int i = 0; i < arrList.length; i++) {
            if (arrList[i].equals(item)) {
                String[] arrList2 = new String[arrList.length - 1];
                for (int i1 = 0; i1 < i; i1++) {
                    arrList2[i1] = arrList[i1];
                }
                for (int i2 = i + 1; i2 < arrList.length; i2++) {
                    arrList2[i2 - 1] = arrList[i2];
                }
                String removeElement = arrList[i];
//                        String[] arrList = new String[arrList2.length];
                String[] arrList = arrList2.clone();
                StringList(arrList);
                return removeElement;
            }
        }
        throw new RuntimeException();
    }

    @Override
    public String remove(int index) {
        if (index < arrList.length) {
            String[] arrList2 = new String[arrList.length - 1];
            for (int i1 = 0; i1 < index; i1++) {
                arrList2[i1] = arrList[i1];
            }
            for (int i2 = index + 1; i2 < arrList.length; i2++) {
                arrList2[i2 - 1] = arrList[i2];
            }
            String removeElement = arrList[index];
            String[] arrList = new String[arrList2.length];
            arrList = arrList2.clone();
            StringList(arrList);
            return removeElement;
        }
        throw new RuntimeException();
    }

    @Override
    public boolean contains(String item) {
        for (int i = 0; i < arrList.length; i++) {
            if (arrList[i].equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int indexOf(String item) {
        int index = -1;
        for (int i = 0; i < arrList.length; i++) {
            if (arrList[i].equals(item)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(String item) {
        int index = -1;
        int i = arrList.length - 1;
        while (i >= 0) {
            if (arrList[i].equals(item)) {
                index = i;
                break;
            }
            i--;
        }
//                for (int i = arrList.length-1; i == 0; i--) {
//                    if (arrList[i].equals(item)) {
//                        index = i;
//                        break;
//                    }
//                }
        return index;
    }

    @Override
    public String get(int index) {
        if (arrList.length >= index) {
            return arrList[index];
        }
        throw new RuntimeException();
    }

    @Override
    public boolean equals(String[] otherList) {
        if (otherList == null) {
            throw new RuntimeException();
        }
        return otherList.equals(arrList);
    }

    @Override
    public int size() {
        return arrList.length;
    }

    @Override
    public boolean isEmpty() {
        if (arrList.length > 0) {
            return false;
        }
        return true;
    }

    @Override
    public void clear() {
        int i = arrList.length - 1;
        while (i >= 0) {
//            String[] arrList2 = new String[arrList.length - 1];
            String[] arrList2 = Arrays.copyOf(arrList, arrList.length - 1);
            StringList(arrList2);
            i--;
        }
    }

    @Override
    public String[] toArray(String[] arrays) {
        return StringList(arrays);
    }
}

