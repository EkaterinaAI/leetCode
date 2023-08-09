package src.Practice.Day11;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        System.out.println(warehouse + " " + courier + " " + picker);

        picker.doWork();
        courier.doWork();
        System.out.println(warehouse + " " + courier + " " + picker);

        for (int i = 1; i <= 1500; i++){
            picker.doWork();
            courier.doWork();
        }
        System.out.println(warehouse + " " + courier + " " + picker);

        picker.bonus();
        courier.bonus();
        System.out.println(warehouse + " " + courier + " " + picker);


//        picker.doWork();
//        picker.bonus();
//        courier.doWork();
//        courier.bonus();

//        System.out.println(picker.getCountOrder());
//        System.out.println(courier.getBalance());
//        System.out.println(picker.getSalary());
//        System.out.println(courier.getSalary());
//
//        for (int i = 0; i < 1500; i++) {
//            picker.doWork();
//            picker.bonus();
//        }
//
//        for (int i = 0; i < 1000; i++) {
//            courier.doWork();
//            courier.bonus();
//        }
//
//        System.out.println("--------------------------------");
//        System.out.println(picker.getCountOrder());
//        System.out.println(courier.getBalance());
//        System.out.println(picker.getSalary());
//        System.out.println(courier.getSalary());
    }
}
