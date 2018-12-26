package my.examples.javaexam.mywork;

public class Students implements Comparable<Students>{

    public Students(){
    }

    private String name;
    private int kor;
    private int eng;
    private int math;




        public Students(String name,int kor,int eng,int math){
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Students students = (Students) o;

        if (kor != students.kor) return false;
        if (eng != students.eng) return false;
        if (math != students.math) return false;
        return name != null ? name.equals(students.name) : students.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + kor;
        result = 31 * result + eng;
        result = 31 * result + math;
        return result;

    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", kor=" + kor +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }

    @Override
    public int compareTo(Students o) {
        return name.compareTo(o.name);
    }


}
