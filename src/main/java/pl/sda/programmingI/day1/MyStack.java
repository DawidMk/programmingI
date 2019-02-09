package pl.sda.programmingI.day1;

public class MyStack {

    private int peak = -1;
    private int size = 100;
    private Object[] stackArray = new Object[size];

    public boolean isEmpty() {
        return stackArray == null || stackArray.length == 0 ? true : false;
    }

    public boolean push(Object o) {
        if (peak >= (size - 1)) {
            System.out.println("stos przepełniony");
            return false;
        }
        stackArray[++peak] = o;
        System.out.println("dodano obiekt do stosu");
        return true;
    }
  /*  public boolean pop(){
        if(!isEmpty()){
            System.out.println("usunięto obiekt");
            System.out.println(stackArray[0]);
            stackArray[0] = null;
            return true;
        }
        System.out.println("nic tu nie ma");
        return false;
    }*/
  public Object pop(){
      if(peak<0){
          System.out.println("stos null");
          return 0;
      }
      else{
          Object z = stackArray[peak--];
          System.out.println("usuwanie obiektu "+stackArray[peak--]);
          return z;
      }
  }
//todo

    public void peek(){
        if(!isEmpty()){
            System.out.println(stackArray[peak]);
        }else{
            System.out.println("stos pusty");
        }

    }
}


