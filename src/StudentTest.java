public class StudentTest {

    public static void main(String[] args) {

        Student student = new Student();
        student.email = "mati@onet";
        student.imie = "Mateusz";
        student.nazwisko = "Kowalczyk";
        student.numerIndeksu = 1768594;
        student.nick = "Heyah";

        Student student2 = new Student();
        student2.email = "zony@onet";
        student2.imie = "Zenobiusz";
        student2.nazwisko = "Kryten";
        student2.numerIndeksu = 164534;
        student2.nick = "Zony";

        Student student3 = new Student();
        student3.email = "bernabeu@onet";
        student3.imie = "Estadia";
        student3.nazwisko = "Hugo";
        student3.numerIndeksu = 1768594;
        student3.nick = "Boss";

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
            System.out.println("_______________________");
        }
    }
}
