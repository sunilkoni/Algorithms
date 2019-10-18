/*
 * package com.data.structures;
 * 
 * 
 * 
 * class Node { int data; Node left, right; public Node(int item) { data = item;
 * left = right = null; } }
 * 
 * public class OwnQueueByLL {
 * 
 * Node head= null; Node current = null; public void add(String data) { if(head
 * == null) { head = new Node(data); current = head; return; } current.nextNode
 * = new Node(data); current = current.nextNode; }
 * 
 * public String peek() { String data = null; if(head != null) { data =
 * head.data; head = head.nextNode; } return data; }
 * 
 * public void showAll() {
 * 
 * } }
 */