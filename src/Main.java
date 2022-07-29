public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Trước khi gán " + student);
        student.setName("Tengteng");
        student.setClasses("lớp 1234");
        System.out.println("Sau khi gán" +student);
    }
}
