package ocp.java_class_design.using_statics;

public  class StaticClass {

    private static String member;

    public static class Builder{
        private String member = StaticClass.member;

        public String getMember() {
            return member;
        }
    }


}
