package LinkedList;

// Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
// Example 1:
// Input: head = [1,1,2]
// Output: [1,2]

// Example 2:
// Input: head = [1,1,2,3,3]
// Output: [1,2,3]
 

// Constraints:
// The number of nodes in the list is in the range [0, 300].
// -100 <= Node.val <= 100
// The list is guaranteed to be sorted in ascending order.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        while(current.next != null){
           if(current.val == current.next.val){
            current.next = current.next.next;
           }else{
            current = current.next;
           }
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedList solver = new RemoveDuplicatesFromSortedList();
        
        // Create list: 1 -> 1 -> 2 -> 3 -> 3
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3)))));
        
        System.out.print("Input list:  ");
        printList(head);
        
        ListNode result = solver.deleteDuplicates(head);
        
        System.out.print("Result list: ");
        printList(result);
    }
    
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
