package il.co.kotlintlv.solid.open_closed_principle;

/**
 * Created by galex on 15/07/2017.
 */
public class Main {

    public static void main(String... args) {

        JavaDeveloper developerA = new JavaDeveloper();
        KotlinDeveloper developerB = new KotlinDeveloper();

        System.out.println(developerA.writeCode());
        System.out.println(developerB.writeCode());

        System.out.println(developerA instanceof Developer);
        System.out.println(developerA instanceof JavaDeveloper);

        System.out.println(developerB instanceof Developer);
        System.out.println(developerB instanceof KotlinDeveloper);
    }
}
