package com.DataStructure.Hashing;

import java.util.ArrayList;

public class HashMap<K, V> {
	ArrayList<HashNode<K, V>> bucketArray;
	int numBuckets;
	int size;
	
	public HashMap() {
		bucketArray = new ArrayList<HashNode<K,V>>();
		numBuckets = 10;
		size = 0;
		
		for(int i = 0; i < numBuckets; i++) {
			bucketArray.add(null);
		}
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size() == 0;
	}
	
	public int getBucketIndex(K key) {
		int hashcode = key.hashCode();
		int index = hashcode % numBuckets;
		return index;
	}
	
	public V remove(K key) {
		int bucketIndex = getBucketIndex(key);
		HashNode<K,V> head = bucketArray.get(bucketIndex);	//finds the head of the chain for the given key
		HashNode<K, V> prev = null;
		while(head != null) {
			if (head.key.equals(key)) {
				break;
			}
			prev = head;
			head = head.next;
		}
		
		if(head == null) {
			return null;
		}
		size--;
		
		if(prev != null) {
			prev.next = head.next;
		}
		else {
			bucketArray.set(bucketIndex, head.next);
		}
		return head.value;
	}
	
	public V getkey(K key) {
		
		//Finds the head of the chair for a given key
		int bucketIndex = getBucketIndex(key);
		HashNode<K, V> head = bucketArray.get(bucketIndex);
		
		while(head != null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		//if key is not found
		return null;
	}
	
	public void add(K key, V value) {
		int bucketIndex = getBucketIndex(key);
		HashNode<K, V> head = bucketArray.get(bucketIndex);
		
		//checks if the key is already present
		while(head != null) {
			if(head.key.equals(key)){
				head.value = value;
				return;
			}
			head = head.next;
		}
		
		//inserts the key chain
		size++;
		head = bucketArray.get(bucketIndex);
		HashNode<K, V> newNode = new HashNode<>(key, value);
		newNode.next = head;
		bucketArray.set(bucketIndex, newNode);
		
		
		//if the LoadFactor goes beyond 0.7, then we double the size of the hash table
		if((1.0 * size)/numBuckets >= 0.7) {
			ArrayList<HashNode<K, V>> temp = bucketArray;
			bucketArray = new ArrayList<>();
			numBuckets = 2 * numBuckets;
			size = 0;
			
			for (int i = 0; i < numBuckets; i++) {
				bucketArray.add(null);
			}
			
			for (HashNode<K, V> headNode : temp) {
				while(headNode != null) {
					add(headNode.key, headNode.value);
					headNode = headNode.next;
				}
			}
		}
	}
		
}
