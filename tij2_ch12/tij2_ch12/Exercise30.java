// package tij2_ch12.tij2_ch12;
// import static custom_tools.print.Print.*;
// import java.util.*;

// class Pet {
//     public String toString(){
//         return hashCode()+" Pet";
//     }
// }

// class Pets{
//     static Pet[] createArray(int size){
//         Pet[] pets=new Pet[size];
//         for (int i = 0; i < pets.length; i++) {
//             pets[i]=new Pet(); 
//         }
//         return pets;
//     }
// }

// class CollectionSequence extends AbstractCollection<Pet> {   
//     private Pet[] pets = Pets.createArray(8);   
//     public int size() { 
//         return pets.length; 
//     }   
//     public Iterator<Pet> iterator() {     
//         return new Iterator<Pet>() {       
//             private int index = 0;       
//             public boolean hasNext() {         
//                 return index < pets.length;       
//             }       
//             public Pet next() { 
//                 return pets[index++]; 
//             }       
//             public void remove() { // Not implemented         
//                 throw new UnsupportedOperationException();
//             }
//         };
//     }
//     public static void main(String[] args) {     
//         CollectionSequence c = new CollectionSequence();     
//         InterfaceVsIterator.display(c);
//         InterfaceVsIterator.display(c.iterator());
//     }
// } 
// /**
//  * Modify CollectionSequence.java so that it does not inherit from AbstractCollection, but instead implements Collection. 
//  */
// public class Exercise30 implements Collection<Pet>{

//     @Override
//     public int size() {
//         return this.size();
//     }

//     @Override
//     public boolean isEmpty() {
//         return (this.size()==0);
//     }

//     @Override
//     public boolean contains(Object o) {
//         return false;
//     }

//     @Override
//     public Iterator<Pet> iterator() {
//         return new Iterator<Pet>() {
//             int index=0;
//             @Override
//             public boolean hasNext() {
//                 return (index<size());
//             }

//             @Override
//             public Pet next() {
//                 return pets[index++];
//             }
//         };
//     }

//     @Override
//     public Object[] toArray() {
//         
//         return null;
//     }

//     @Override
//     public Object[] toArray(Object[] a) {
//         
//         return null;
//     }

//     @Override
//     public boolean add(Object e) {
//         
//         return false;
//     }

//     @Override
//     public boolean remove(Object o) {
//         
//         return false;
//     }

//     @Override
//     public boolean containsAll(Collection c) {
//         
//         return false;
//     }

//     @Override
//     public boolean addAll(Collection c) {
//         
//         return false;
//     }

//     @Override
//     public boolean removeAll(Collection c) {
//         
//         return false;
//     }

//     @Override
//     public boolean retainAll(Collection c) {
//         
//         return false;
//     }

//     @Override
//     public void clear() {

//     }

//     @Override
//     public boolean add(Pet e) {
//         
//         return false;
//     }

// }