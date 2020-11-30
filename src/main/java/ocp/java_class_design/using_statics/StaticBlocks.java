package ocp.java_class_design.using_statics;

public class StaticBlocks {

    static {
        System.out.println("Bloco 1");
    }

    static {
        System.out.println("Bloco 2");
    }

    public static void print(){
        System.out.println("Static method");
    }

    public  void instancePrint(){
        System.out.println("Instance method");
    }


}
