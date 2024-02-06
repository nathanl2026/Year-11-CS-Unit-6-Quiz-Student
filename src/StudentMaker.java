public class StudentMaker {
  ///The district should be Causeway Bay, street Tung Lo Wan Road, and street number 180.
  public static void main(String[] args) {
  Address address = new Address("Causeway Bay", "Tung Lo Wan Road", 180);

  //The Student’s name should be Belinda Yu, age 17, year 12,
    // address 180 Tung Lo Wan Road, Causeway Bay. This should be done in a single statement.
  Student student = new Student(17, "Belinda", "Yu", 12, address);
  student.setFirstName("Bella");
    System.out.println(student.getAge());
    int age = student.birthday();
    System.out.println(age);
    System.out.println(student);
  }
  
}
