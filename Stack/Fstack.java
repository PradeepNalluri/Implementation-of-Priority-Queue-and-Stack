interface Stack{
  void push(String s);
  void pop();
  boolean isempty();
  boolean isfull();
}
interface Sitack{
  void push(int i);
  void pop();
  boolean isempty();
  boolean isfull();
}
//Linked list for String
class Stackf{
  String node;
  Stackf next;
}
//Linked list for Int
class Stacki{
  int node;
  Stacki next;
}
class Sstack implements Stack{
  int max;//Max Size of the stack
  final Stackf stackarr[];
  public Sstack(int max){
    int i;
    this.max=max;
    this.stackarr=new Stackf[max];
    for(i=0;i<max;i++){
      this.stackarr[i]=new Stackf();
    }
  }
  public boolean isfull(){
    int count=0;
    while(count<this.max-1){
      if(this.stackarr[count].next==null){
        return false;
      }
      else{
        count+=1;
      }
    }
    return true;
  }
  public boolean isempty(){
      if(this.stackarr[0].node==null && this.stackarr[0].next==null){
        return true;
      }
      else{
        return false;
      }
  }
  //Push for a stack
  public void push(String s){
    if(this.isfull()){
      System.out.println("The Stack is full");
    }
    else if(this.isempty()){
      this.stackarr[0].node=s;
    }
    else{
      int count=0;
      while(count<this.max){
        if(this.stackarr[count].next==null){
          this.stackarr[count+1].node=s;
          this.stackarr[count].next=this.stackarr[count+1];
          break;
        }
        else{
          count+=1;
        }
      }
    }
  }
  //Pop for the Stack
  public void pop(){
    if(this.isempty()){
      System.out.println("The Stack is Empty");
    }
    else{
      int count=this.max-1;
      while(count>=0){
        if(this.isfull()){
          System.out.println(this.stackarr[count].node);
          this.stackarr[count].next=null;
          this.stackarr[count].node=null;
          count-=1;
          break;
        }
        else if(this.stackarr[count].next==null && this.stackarr[count].next==null){
          count-=1;
        }
        else{
          System.out.println(this.stackarr[count].node);
          this.stackarr[count].next=null;
          this.stackarr[count].node=null;
          count-=1;
          break;
        }

      }
    }
    }

  }
class Istack implements Sitack{
  int max;//Max Size of the stack
  final Stacki stackarr[];
  public Istack(int max){
    int i;
    this.max=max;
    this.stackarr=new Stacki[max];
    for(i=0;i<max;i++){
      this.stackarr[i]=new Stacki();
    }
  }
  public boolean isfull(){
    int count=0;
    while(count<this.max-1){
      if(this.stackarr[count].next==null){
        return false;
      }
      else{
        count+=1;
      }
    }
    return true;
  }
  public boolean isempty(){
      if(this.stackarr[0].node==0 && this.stackarr[0].next==null){
        return true;
      }
      else{
        return false;
      }
  }
  //Push for a stack
  public void push(int i){
    if(this.isfull()){
      System.out.println("The Stack is full");
    }
    else if(this.isempty()){
      this.stackarr[0].node=i;
    }
    else{
      int count=0;
      while(count<this.max){
        if(this.stackarr[count].next==null){
          this.stackarr[count+1].node=i;
          this.stackarr[count].next=this.stackarr[count+1];
          break;
        }
        else{
          count+=1;
        }
      }
    }
  }
  //Pop for the Stack
  public void pop(){
    if(this.isempty()){
      System.out.println("The Stack is Empty");
    }
    else{
      int count=this.max-1;
      while(count>=0){
        if(this.isfull()){
          System.out.println(this.stackarr[count].node);
          this.stackarr[count].next=null;
          this.stackarr[count].node=0;
          count-=1;

        }
        else if(this.stackarr[count].node==0 && this.stackarr[count].next==null){
          count-=1;
        }
        else{
          System.out.println(this.stackarr[count].node);
          this.stackarr[count].next=null;
          this.stackarr[count].node=0;
          count-=1;

        }

      }
    }
    }
  }



class Fstack{
  public static void main(String[] args) {
    Sstack pk=new Sstack(10);
    pk.push("pradeep");
    pk.push("kumar");
    pk.push("nalluri");
    pk.push("ravi");
    pk.push("teja");
    pk.push("nalluri");
    pk.push("srinivasa rao");
    pk.push("nalluri");
    pk.push("udaya");
    pk.push("Nalluri");
    pk.pop();
    Istack pik=new Istack(10);
    pik.push(1);
    pik.push(2);
    pik.push(3);
    pik.push(4);
    pik.push(5);
    pik.push(6);
    System.out.println("\n\n\n\n");
    pik.pop();

}
}
