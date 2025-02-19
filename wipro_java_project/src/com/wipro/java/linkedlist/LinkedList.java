package com.wipro.java.linkedlist;



class Node {
    String userId;
    String userName;
    Node next;

    public Node(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
        this.next = null;
    }
}

class UserLinkedList 
{
    private Node head;

    // Add a new user to the linked list
    public void addUser(String userId, String userName) {
        Node newUser = new Node(userId, userName);
        if (head == null) {
            head = newUser;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newUser;
        }
        System.out.println("User added: " + userName);
    }

    // Display all users
    public void displayUsers() {
        if (head == null) {
            System.out.println("No users in the list.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.println("UserID: " + temp.userId + ", Name: " + temp.userName);
            temp = temp.next;
        }
    }

    // Delete a user by ID
    public void deleteUser(String userId) {
        if (head == null) {
            System.out.println("User list is empty.");
            return;
        }
        if (head.userId.equals(userId)) {
            head = head.next;
            System.out.println("User " + userId + " deleted.");
            return;
        }
        Node temp = head;
        while (temp.next != null && !temp.next.userId.equals(userId)) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("User not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("User " + userId + " deleted.");
        }
    }

    // Search for a user
    public void searchUser(String userId) {
        Node temp = head;
        while (temp != null) {
            if (temp.userId.equals(userId)) {
                System.out.println("User found: " + temp.userName);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found.");
    }
}

public class LinkedList {
    public static void main(String[] args) {
        UserLinkedList userList = new UserLinkedList();

        // Adding users
        userList.addUser("111", "David");
        userList.addUser("222", "John");
        userList.addUser("333", "Miller");

        // Display users
        System.out.println("\nUser List:");
        userList.displayUsers();

        // Search for a user
        System.out.println("\nSearching for User 222:");
        userList.searchUser("222");

        // Delete a user
        System.out.println("\nDeleting User 222:");
        userList.deleteUser("222");

        // Display users after deletion
        System.out.println("\nUpdated User List:");
        userList.displayUsers();
    }
}
