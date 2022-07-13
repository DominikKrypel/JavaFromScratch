public class StudentTest {

    public static void main(String[] args) {

        String uczelnia = Student.nazwaUczelni;
        Student.testMetodyStatycznej();

        Student student = new Student();
        student.email = "mati@onet";
        student.imie = "Mateusz";
        student.nazwisko = "Kowalczyk";
        student.numerIndeksu = 1768594;
        student.nick = "Heyah";
        String uczelniaMateusza = student.nazwaUczelni;
        System.out.println("Moja uczlenia " + uczelniaMateusza);


        Student student2 = new Student();
        student2.email = "zony@onet";
        student2.imie = "Zenobiusz";
        student2.nazwisko = "Kryten";
        student2.numerIndeksu = 164534;
        student2.nick = "Zony";
        String uczelniaZenobiusza = student.nazwaUczelni;
        System.out.println("Moja uczlenia " + uczelniaZenobiusza);

        Student student3 = new Student();
        student3.email = "bernabeu@onet";
        student3.imie = "Estadia";
        student3.nazwisko = "Hugo";
        student3.numerIndeksu = 1768594;
        student3.nick = "Boss";
        String uczelniaBernabeu = student.nazwaUczelni;
        System.out.println("Moja uczlenia " + uczelniaBernabeu);

        Student[] tablica = new Student[3];
        tablica[0] = student;
        tablica[1] = student2;
        tablica[2] = student3;

        for (int i = 0;i < tablica.length;i++) {
            System.out.println("Imie: " + tablica[i].imie);
            System.out.println("Nazwisko: " + tablica[i].nazwisko);
            System.out.println("Adres email: " + tablica[i].email);
            System.out.println("Nick: " + tablica[i].nick);
            System.out.println("Numer indeksu: " + tablica[i].numerIndeksu);
            tablica[i].przedstawSie();
            tablica[i].zalogujSie();
            tablica[i].podajEmail();
            tablica[i].podajNumerIndeksu();
            tablica[i].testMetodyStatycznej();
            System.out.println("_______________________");
        }

        String name;



    }
}
