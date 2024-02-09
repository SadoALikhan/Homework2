public class Main {
    public static void main(String[] args) {
        System.out.println("Задача номер 1:");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("1)" + dog);
        System.out.println("2)" + cat);
        System.out.println("3)" + paper);

        System.out.println("Задача номер 2:");
        dog = dog + 4;
        cat = cat +4;
        paper = paper + 4;
        System.out.println("1)" + dog);
        System.out.println("2)" + cat);
        System.out.println("3)" + paper);

        System.out.println("Задача номер 3:");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("1)" + dog);
        System.out.println("2)" + cat);
        System.out.println("3)" + paper);

        System.out.println("Задача номер 4:");
        var friend = 19;
        System.out.println("1)" + friend);
        friend = friend + 2;
        System.out.println("2)" + friend);
        friend = friend / 7;
        System.out.println("3)" + friend);

        System.out.println("Задача номер 5:");
        var frog = 3.5;
        System.out.println("1)" + frog);
        frog = frog * 10;
        System.out.println("2)" + frog);
        frog = frog / 3.5;
        System.out.println("3)" + frog);
        frog = frog + 4;
        System.out.println("4)" + frog);

        System.out.println("Задача номер 6:");
        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("1)Общая масса двух бойцов " + totalWeight + " кг.");
        var differenceWeight = secondBoxerWeight - firstBoxerWeight;
        System.out.println("2)Разница в весе бойцов равна " + differenceWeight + " кг.");

        System.out.println("Задача номер 7:");
        var boxerWeightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println("Остаток от деления между двумя весами равен " + boxerWeightDifference);

        System.out.println("Задача номер 8:");
        var workingHours = 640;
        var workingHoursPerPerson = 8;
        var totalEmployees = workingHours / workingHoursPerPerson;
        System.out.println("1)Всего работников в компании - " + totalEmployees + " человек.");
        totalEmployees = totalEmployees + 94;
        workingHours = totalEmployees * workingHoursPerPerson;
        System.out.println("2)Если в компании работает " + totalEmployees + " человек, то всего "
                + workingHours + " часов работы может быть поделено между сотрудниками.");
    }
}