import java.io.*;
class Stack {
private int top,arr[];

Stack(int s){
	top = -1;
	arr = new int[s];
}

private int isFull(int s){
	if(top == (s-1))
		return 0;
	else
		return 1;
}

private int isEmpty(){
	if(top == -1)
		return 0;
	else 
		return 1;
}

void PUSH(int item,int s){
if(isFull(s) == 0)
	System.out.println("Stack Overflow");
else {
	top++;
	arr[top] = item;
}
}

int POP(){
	if(isEmpty() == 0)
		return 0;
	else
		return arr[top--];
}

void displayStack(int sz){
	for(int j=0;j<=top;j++)
		System.out.println(">"+arr[j]);
}
}
class checkStack{
	public static void main(String []args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num,size,tpe,i,ch;
		System.out.println("Enter the size of the Stack");
		size = Integer.parseInt(br.readLine());
		Stack st1 = new Stack(size);
		System.out.println("Enter the Stack elements:");
		for(i=0;i<size;i++){
			num = Integer.parseInt(br.readLine());
			st1.PUSH(num,size);
		}
		st1.displayStack(size);
		tpe = st1.POP();
		if(tpe == 0)
			System.out.println("Stack Underflow");
		else
			System.out.println("The top most stack element is\t"+tpe);
		st1.displayStack(size);
		}
	}

