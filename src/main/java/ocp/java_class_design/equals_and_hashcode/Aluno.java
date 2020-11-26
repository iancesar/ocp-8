package ocp.java_class_design.equals_and_hashcode;

import java.util.Objects;

public class Aluno {

    private int code;

    private String name;

    public Aluno(int code) {
        this.code = code;
    }

    public Aluno(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Aluno aluno = (Aluno) o;
//        return code == aluno.code;
//    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}

