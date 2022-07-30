public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte ByzantineEmperor = 1;
        short ByzantineInfanrty = 60;
        int ByantineLatinkon = 120;
        long DismountedByzantineLancers = 120L;
        float OneAndAHalfSword = 1.5f;
        double TwoHandedSword = 2.2;
        boolean LengthOneAndAHalfSword = OneAndAHalfSword < 1.6;
        char c = 33;
        // Задание 2
        double boxer1 = 78.2;
        double boxer2 = 82.7;
        double Weight1 = boxer1 + boxer2;
        double Weight2 = boxer2 - boxer1;
        System.out.println("Общий вес боксеров " + Weight1);
        System.out.println("Разница веса боксеров " + Weight2);
        // Задание 3
        int banana = 5;
        int weightBanana = 80;
        int milk = 200 / 100;
        int weightMilk = 105;
        int icecream = 2;
        int weighticecream = 100;
        int eggs = 4;
        int weighteggs = 70;
        int AllWeightBanana = banana * weightBanana;
        int AllweightMilk = milk * weightMilk;
        int Allweighticecream = icecream * weighticecream;
        int Allweighteggs = eggs * weighteggs;
        int AllWeight = Allweighteggs + Allweighticecream + AllweightMilk + AllWeightBanana;
        System.out.println("Общий вес завтрака " + AllWeight + " грамм");
        float kg = 1000;
        float kgZavtrak = AllWeight/kg;
        System.out.println("Завтрак весит " +kgZavtrak + " кг");
        // Задание 4
        float DropWeight = 7;
        float DropWeightGramm = DropWeight * 1000;
        float Dieta1 = 250;
        float Dieta2 = 500;
        float Day250 = DropWeightGramm / Dieta1;
        float Day500 = DropWeightGramm / Dieta2;
        float Dayaverage = (Day250+Day500)/2;
        System.out.println("По первой диете спортсмен похудеет на 7 кг за " + Day250 + " дней");
        System.out.println("По второй диете спортсмен похудеет на 7 кг за " + Day500 + " дней");
        System.out.println("В среднем спортсмену понадобится " +  Dayaverage + " день чтобы похудеть");
        // Задание 5
        int ZPMasha = 67760;
        int ZPDen = 83690;
        int ZPKristi = 76230;
        int UPZP = 10;
        int UPZPMasha = ZPMasha / 100 * UPZP;
        int UPZPDen = ZPDen / 100 * UPZP;
        int UPZPKrisi = ZPKristi / 100 * UPZP;
        int year = 12;
        int NewZPMasha = ZPMasha + UPZPMasha;
        int NewZPDen = ZPDen + UPZPDen;
        int NewZPKristi = ZPKristi + UPZPKrisi;
        int OldZPMashainyear = ZPMasha * year;
        int OldZPDeninyear = ZPDen * year;
        int OldZPKristiinyear = ZPKristi * year;
        int NewZPMahsainyear = OldZPMashainyear + UPZPMasha * year;
        int NewZPDeninyear = OldZPDeninyear + UPZPDen * year;
        int NewZPKristiinyear = OldZPKristiinyear + UPZPKrisi * year;
        int DifferenceZPMahsa = NewZPMahsainyear - OldZPMashainyear;
        int DifferenceZPDen = NewZPDeninyear - OldZPDeninyear;
        int DifferenceZPKristi = NewZPKristiinyear - OldZPKristiinyear;
        System.out.println("Новая зарплата Маши будет " + NewZPMasha + " рублей, а годовой доход выростет на " + DifferenceZPMahsa + " рублей");
        System.out.println("Новая зарплата Дениса будет " + NewZPDen + " рублей, а годовой доход выростет на " + DifferenceZPDen + " рублей");
        System.out.println("Новая зарплата Кристины будет " + NewZPKristi + " рублей, а годовой доход выростет на " + DifferenceZPKristi + " рублей");



    }

}