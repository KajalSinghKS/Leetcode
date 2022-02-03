/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    ListNode* middleNode(ListNode* head) 
    {        
        int count1=1;
        ListNode* temp=head;
        
        while(temp->next!=NULL)
        {
            temp= temp->next;
            count1++;
        }
        
        int count2=1;
        
        while(count2!=(count1/2)+1)
        {
            head=head->next;
            count2++;
        }
        
        return head;
    }
};