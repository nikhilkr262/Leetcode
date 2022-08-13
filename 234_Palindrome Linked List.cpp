class Solution {
public:
    bool isPalindrome(ListNode* head) {
        if(head==NULL){
            return true;
        }
        ListNode* mid=middle(head);
        ListNode* last=reverseList(mid);
        ListNode* curr=head;
        while(last!=NULL){
            if(last->val!=curr->val){
                return false;
            }
            last=last->next;
            curr=curr->next;
        }
        return true;        
    }
    ListNode* middle(ListNode* head){
        ListNode* slow=head;
        ListNode* fast=head;
        while(fast!=NULL && fast->next!=NULL){
            slow=slow->next;
            fast=fast->next->next;
        }
        return slow;
    }
    ListNode* reverseList(ListNode* head) {
        ListNode* prev=NULL;
        ListNode* curr=head;
        while(curr!=NULL){
            ListNode* temp=curr->next;
            curr->next=prev;
            prev=curr;
            curr=temp;
        }
        head=prev;
        return head;        
    }
};
