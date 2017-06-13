class Pq{
  int im;
  Pq paddr;
}
class Priority_Q{
  int max;
  Pq pq[];
  public Priority_Q(int max){
    this.max=max;
    this.pq=new Pq[max];
    for(int i=0;i<max;i++){
      this.pq[i]=new Pq();
    }
  }
  void add(int p){
    int last=1;
    for(int i=1;i<this.max;i++){
      if(this.pq[i].im==0 && this.pq[i].paddr==null){
        this.pq[i].im=p;
        last=i;
        if(last%2==0){
          this.pq[i].paddr=this.pq[(last/2)];
        }else{
          this.pq[i].paddr=this.pq[(last-1)/2];
        }
        break;
      }
    }

    int a=last;
    while(a!=1){
      int pad;
      if(last%2==0){
         pad=(last/2);
      }else{
        pad=(last-1)/2;

      }
      if(this.pq[a].im<this.pq[pad].im){
        int temp;
        temp=this.pq[a].im;
        this.pq[a].im=this.pq[pad].im;
        this.pq[pad].im=temp;
      }
      else{
        break;
      }
    }

  }
  void deletemin(){
    int last=1;
    for(int i=1;i<this.max;i++){
      if(this.pq[i].im==0 && this.pq[i].paddr==null){
        last=i-1;
        break;
      }
    }
    this.pq[1].im=this.pq[last].im;
    this.pq[last].paddr=null;
    this.pq[last].im=0;
    int a=1;
    while(a!=last && a<last){
    if(this.pq[a].im>this.pq[2*a].im && this.pq[2*a].paddr!=null){
      int temp;
      temp=this.pq[a].im;
      this.pq[a].im=this.pq[2*a].im;
      this.pq[2*a].im=temp;
      a=2*a;
    }
      else if(this.pq[a].im>this.pq[2*a+1].im && this.pq[2*a+1].paddr!=null){
        int temp;
        temp=this.pq[a].im;
        this.pq[a].im=this.pq[2*a+1].im;
        this.pq[2*a+1].im=temp;
        a=2*a+1;
      }
      else{
        break;
      }
  }
  }
}
class Priority{
  public static void main(String[] args){
    Priority_Q pk=new Priority_Q(10);
    pk.add(1);
    pk.add(2);
    pk.add(3);
    pk.add(4);
    pk.add(5);
    pk.add(6);
    pk.add(7);
    for(int i=0;i<10;i++){
      System.out.println(pk.pq[i].im);
    }
    System.out.println("\n\n\n\n");
    pk.deletemin();
    for(int i=0;i<10;i++){
      System.out.println(pk.pq[i].im);
    }
  }

}
