package CoreJava.DsImplementation;

import com.sun.jdi.Value;

import java.util.HashMap;
import java.util.LinkedList;

/**
 *  hashmap is array of linkedList
 *  each index in array consists of bucket
 *
 *
 * */

public class HashMapCode{
    static class HashMap<K,V>{
        private class Node {
            K key;
            V value;

            public Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

            private int n; // node
            private int N; // bucket size
            private LinkedList<Node> buckets[];

            @SuppressWarnings("unchecked")
            public HashMap(){
                this.n = 0;
                this.N = 4;
                this.buckets = new LinkedList[N];

                for(int i=0; i<N;i++){
                    buckets[i] = new LinkedList<>();
                }

            }

            public int hashFunction(K key){
                int bi = key.hashCode();
                // look into hashCode function , this return some hashValue
                // for Key could we negative value hence we use abs()

                return Math.abs(bi) % N; // mod N because we want index to be lie in 0 to N-1;

            }

            public int searchInLL(K key, int bi){
                LinkedList<Node> ll = buckets[bi]; // it will return linkedList associated with bucket index
                for(int i=0;i<ll.size();i++){
                    if(ll.get(i).key == key){
                        return i;
                    }
                }
                return -1;
            }

            public void reHash(){
                LinkedList<Node> oldBucket[] = buckets;
                buckets = new LinkedList[N*2];// increasing existing size of array;

                for(int i=0;i<N*2;i++){
                    buckets[i] = new LinkedList<>(); // newly assigning linked list
                }

                // now coping old data back to new linked list

                for(int i=0;i<oldBucket.length;i++){
                    LinkedList<Node> ll = oldBucket[i]; // getting linked list from bucket one by one
                    for(int j=0;j<ll.size();j++){
                        Node node = ll.get(j);// getting each node from linked list one by one
                        put(node.key,node.value); // putting back value in linked list
                    }
                }
            }

            public void put(K key, V value){
                int bi = hashFunction(key); // bucket index
                int di = searchInLL(key,bi); // di = data index

                if(di == -1){
                    buckets[bi].add(new Node(key,value));
                    n++; // increasing index of bucket
                }else{
                    Node data = buckets[bi].get(di); // if data is already present then just replace it with new one.
                    data.value =value;
                }

                double lamda = (double) n/N; // this is just to check if array is full or not
                if(lamda > 2.0){
                    reHash();
                }
            }

            public V get(K key){
                int bi = hashFunction(key); // bucket index
                int di = searchInLL(key,bi); // di = data index

                if(di == -1){ // if data not found
                    return null;
                }else{
                    Node data = buckets[bi].get(di); // checking data in bucket
                    return data.value;
                }

            }
            public boolean containsKey(K key){
                return false;
            }

            public V remove(V value){
                return null;
            }


    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>(); // this is implemented hash map
        map.put("Amit",001);
        map.put("Mandar",1002);
        Integer a = map.get("Amit");
        System.out.println(a);
    }


}
