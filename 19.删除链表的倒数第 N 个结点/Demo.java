import java.util.ArrayList;

public class Demo {
    
    public static void main(String[] args) {
        // ArrayList<ListNode> linkList = new ArrayList<>();
        // linkList.add(new ListNode(0));
        // 假设删除倒是第二个 
        int n = 2;

        ListNode n4 = new ListNode(5);
        ListNode n3 = new ListNode(4,n4);
        ListNode n2 = new ListNode(3,n3);
        ListNode n1 = new ListNode(2,n2);
        ListNode head = new ListNode(1,n1);
        // 1，记录链表总数是多少
        int totalNum = 0;
        ListNode currentNode = head;
        while (currentNode != null) {
            totalNum++;
            System.out.println("链表打印:" + currentNode.getVal());
            currentNode = currentNode.next;
        }
        System.out.println("totalNum打印:" + totalNum);

        // 2，找到要删除元素的前一元素的的位置，前一元素位置 = 全部元素数 - 倒数位置数
        int beforeIndex = totalNum - n;
        System.out.println("beforeIndex打印:" + beforeIndex);

        // 3，从头开始遍历到删除元素的前一元素
        currentNode = head;
        int index = 0;
        while (currentNode != null) {
            System.out.println("index打印:" + index);
            if (n == totalNum && index == beforeIndex) {
                head = head.next;
                System.out.println("删除第一个后当前的值:" + head.getVal());
            }
            index++;
            
            if (beforeIndex == index) {
                System.out.println("前一位置找到:" + index);
                currentNode.next = currentNode.next.next;
            }
            currentNode = currentNode.next;
        }

        
        //输出检查结果
        currentNode = head;
        while (currentNode != null) {
            System.out.println("结果打印:" + currentNode.getVal());
            currentNode = currentNode.next;
        }
    }
}