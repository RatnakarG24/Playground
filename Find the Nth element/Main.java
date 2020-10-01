#include <iostream>
using namespace std;

struct Node
{
  int data;
  struct Node *link;
};
void push_front(struct Node **head, int value)
{
  Node *newnode = new Node;
  newnode->data = value;
  newnode->link = *head;
  *head = newnode;
}
int printNthfromLast(struct Node *head, int n)
{
  int len=0,i;
  struct Node *temp=head;
  while(temp != NULL)
  {
    temp=temp->link;
    len++;
  }
  
  if(len<n)
    return 0;
  
  temp=head;
  for(i=1;i<len-n+1;i++)
    temp=temp->link;
  
  cout << temp->data;
  return 1;
}
int main() 
{
 struct Node *head=NULL;
  int total_element,temp,i,n;
  cin>>total_element;
  
  for(i=0;i<total_element;i++)
  {
    cin>>temp;
    push_front(&head,temp);
  }
  
  cin>>n;
  if(0==(printNthfromLast(head,n)))
    cout<<"No node found"<<endl;
  return 0;
}