public class Main {
    public static void main(String[] args) {

        Post post = new Post();

        post.name = "Александр";
        post.patronymic = "Васильевич";
        post.surname = "Манохов";

        System.out.println(post.surname);

        Birthday birthday = new Birthday();

        birthday.day = 12;
        birthday.month = 1;
        birthday.year = 1995;

        System.out.println(birthday.year);

        FormDate formDate = new FormDate();

        formDate.passport = "54 56 № 93210321";
        formDate.phone = "+7 (977)-826-61-97";
        formDate.subscriptions = true;

        System.out.println(formDate.phone);
    }
}

