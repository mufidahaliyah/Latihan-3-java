public class Main {
        public static void main(String[] args) {
        VehicleController controller = new VehicleController();

        MobilListrik mobilListrik = new MobilListrik();
        MobilBensin mobilBensin = new MobilBensin();
        Sepeda sepeda = new Sepeda();

        controller.jalankan(mobilListrik);
        mobilListrik.nyalakan();
        mobilListrik.isiBaterai();

        controller.jalankan(mobilBensin);
        mobilBensin.nyalakan();
        mobilBensin.isiBahanBakar();

        controller.jalankan(sepeda);
    }
}

interface Vehicle {
    void bergerak();
}

interface Startable {
    void nyalakan();
}

interface Fuelable {
    void isiBahanBakar();
}

interface Rechargeable {
    void isiBaterai();
}

class MobilListrik implements Vehicle, Startable, Rechargeable {
    @Override
    public void bergerak() {
        System.out.println("Mobil listrik bergerak.");
    }

    @Override
    public void nyalakan() {
        System.out.println("Menyalakan sistem mobil listrik.");
    }

    @Override
    public void isiBaterai() {
        System.out.println("Mengisi baterai mobil listrik.");
    }
}

class MobilBensin implements Vehicle, Startable, Fuelable {
    @Override
    public void bergerak() {
        System.out.println("Mobil bensin bergerak.");
    }

    @Override
    public void nyalakan() {
        System.out.println("Menyalakan mesin mobil bensin.");
    }

    @Override
    public void isiBahanBakar() {
        System.out.println("Mengisi bahan bakar mobil bensin.");
    }
}

class Sepeda implements Vehicle {
    @Override
    public void bergerak() {
        System.out.println("Sepeda dikayuh.");
    }
}

class VehicleController {
    void jalankan(Vehicle vehicle) {
        vehicle.bergerak();
    }
}

