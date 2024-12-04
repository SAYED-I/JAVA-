public class Test {
    public static void main(String[] args) {
        Singer me = new Singer("Sayed", 20);
        me.isAdult();
        if(me.isAdult()){
            System.out.println("Adult");
        }
        System.out.println(me.getName());

        Singer singer1  = new Singer("Ryan", 18);
        Singer singer2  = new Singer("Jack", 30);
        Duet duet1 = new Duet(singer1, singer2);
        System.out.println(duet1.getSinger2().getAge());

        Singer singer3 = new Singer("john", 25);
        Singer singer4 = new Singer("Ahmad", 19);
        Duet duet2 = new Duet(singer3, singer4);
        Quator band  = new Quator(duet1, duet2);

        System.out.println(band.getDuet1().getSinger1().getAge());
    }


}
