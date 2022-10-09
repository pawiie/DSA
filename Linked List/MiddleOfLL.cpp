// Find out the Middle Node in the Linked List

/*
-> Each time, slow go 1 steps while fast go 2 steps.
-> When fast arrives at the end, slow will arrive right in the middle.
*/

class ListNode
{
    int data;
    ListNode *next;
};

class Solution
{
public:
    ListNode *middleNode(ListNode *head)
    {

        ListNode *fast = head;
        ListNode *slow = fast;

        while (fast && fast->next)
        {
            slow = slow->next;
            fast = fast->next->next;
        }

        return slow;
    }
};