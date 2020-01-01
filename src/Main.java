import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student sArray[] = makeStudent();


        Scanner scanner = new Scanner(System.in);
        System.out.println("etelaAte daneshji ra vared konid :");
        String name = scanner.nextLine();

        Student s = checkExist(sArray ,name);

        if (s == null)
        {
            System.out.println("hamchin daneshjoyee vojod nadarad");
            return;
        }else
        {
            System.out.println(s.toString());
            if (!checkQaboli(s))
            {
                System.out.println("shoma nomre qaboli khoby nadarud : "+s.getGhaboli());
            }
        }

    }

    private static Student checkExist(Student[] db ,String value){
        for (int i = 0; i < db.length; i++) {
            if (db[i].getName().equals(value))
            {
                return db[i];
            }
        }

        return null;
    }

    private static boolean checkQaboli(Student student)
    {
        if (student.getGhaboli() < 12){
            return false;
        }

        return true;
    }

    public static Student[] makeStudent()
    {
        Student s1 = new Student("ali" , 14 , "gholi" , 22);
        Student s2 = new Student("taghi" , 10 , "amiiriii" , 23);
        Student s3 = new Student("mamad" , 9 , "yakarim" , 26);
        Student s4 = new Student("nima" , 20 , "kaftar" , 18);

        Student sArray[] = new Student[4];
        sArray[0] = s1;
        sArray[1] = s2;
        sArray[2] = s3;
        sArray[3] = s4;

        return sArray;
    }
}
