package Example;

 class InstanceOfDemo {
    public static  void main(String args[]) {
        InstanceOfDemo t = new InstanceOfDemo();
        if(t instanceof  InstanceOfDemo)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
