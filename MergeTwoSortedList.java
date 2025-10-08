public class MergeTwoSortedList {

    
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            next = null;
        }
    }

    
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        
        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        
        return dummy.next;
    }

    
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        
        ListNode list1 = new ListNode(4);
        list1.next = new ListNode(7);
        list1.next.next = new ListNode(0);

        
        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(7);

    
        ListNode mergedList = mergeTwoLists(list1, list2);

    
        System.out.print("Merged Sorted List: ");
        printList(mergedList);
    }
}