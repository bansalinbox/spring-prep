package com.spring_prep.learning.dsa.kunal.vedios.heap56;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {

    public static void main(String[] args) throws Exception {

        Heap<Integer> hh = new Heap<>();
        hh.insert(44);
        hh.insert(34);
        hh.insert(55);
        hh.insert(22);
        hh.insert(1);
        System.out.println(hh.heapsort());
//        System.out.println(hh.remove());
//        System.out.println(hh.remove());
//        System.out.println(hh.remove());
    }

    private ArrayList<T> list;

    public Heap(){
        list = new ArrayList<>();
    }

    private void swap(int first, int second){
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index){
        return (index -1)/2;
    }

    private int left(int index){
        return (2 * index) + 1;
    }

    private int right(int index){
        return (2 * index) + 2;
    }

    public void insert(T value){
        list.add(value);
        upheap(list.size() -1);
    }

    private void upheap(int index){
        if(index == 0){
            return;
        }
        int p = parent(index);
        if(list.get(index).compareTo(list.get(p)) < 0){
            swap(p, index);
            upheap(p);
        }
    }

    public T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing from the empty list");
        }
        T temp = list.get(0);
        T last = list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0, last);
        }
        downheap(0);
        return temp;
    }

    private void downheap(int index){
        int min = index;
        int left = left(index);
        int right = right(index);
        if(left < list.size() && list.get(min).compareTo(list.get(left)) > 0){
            min = left;
        }

        if(right < list.size() && list.get(min).compareTo(list.get(right)) > 0){
            min = right;
        }
        if(min != index){
            swap(min, index);
            downheap(index);
        }
    }

    public ArrayList<T> heapsort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }
}
