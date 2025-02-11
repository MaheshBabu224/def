import java.util.*;
class GenStack<T>{
static int top=-1;
public static void push(int s[], int a, int n){
if(top== n-1){
System.out.println("Stack overflow");
}
else{
s[++top]=a;
}
}


public static void pop(int s[]){
if(top==-1){
System.out.println("Stack is empty");
}
else{
int a= s[top--];
System.out.println("Top element deleted "+a);

}
}

public static void top(int s[]){
if(top==-1){
System.out.println("Stac empty");
}
else{
System.out.println("Top element is "+ s[top]);
}
}

public static void display(int s[], int n){
System.out.println("Stack elements are: ");
for(int i =0; i<=top; i++){
   System.out.print(s[i]+" ");
}
System.out.println();
}
}


class Main{
public static void main(String [] args){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of array");
int n= sc.nextInt();
int s[] = new int[n];
GenStack<Integer> x = new GenStack<>();
while(n>0){
System.out.println("\nEnter choice:\n1.Push\n2.Pop\n3.Display\n4.Top\n5.Exit\n");
int choice = sc.nextInt();
switch(choice){
   case 1: System.out.println("Enter element to be pushed: ");
               int a= sc.nextInt();
              x.push(s,a,n);
              break;
   case 2: x.pop(s);
              break;
    case 3: x.display(s, n);
              break;
    case 4: x.top(s);
        break;
   case 5: System.exit(0);
   }
}
}
}


 