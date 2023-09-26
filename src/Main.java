import com.workintech.Composition.*;

public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("Sağ");
        Wall wall2 = new Wall("Sol");
        Wall wall3 = new Wall("Alt");
        Wall wall4 = new Wall("Üst");
        Ceiling ceiling = new Ceiling(5, PaintColor.BLUE);
        Bed bed = new Bed("kare", 4, 5, 2, 3);
        Lamp lamp = new Lamp(LampType.AMPUL, true, 100);
        Wardrobe wardrobe = new Wardrobe(6, 4, 3.156);
        Carpet carpet = new Carpet(5, 10, PaintColor.BLACK);


        Bedroom bedroom = new Bedroom(100,500,true,"Oturma Odasi", wall1, wall2, wall3, wall4,
                ceiling, bed, lamp, wardrobe, carpet);


        System.out.println("Oturma Odası Adı: " + bedroom.getName());
        bed.make();
        System.out.println(bedroom);
        ceiling.create();
        wall2.create();
        lamp.turnOn();
    }
}
