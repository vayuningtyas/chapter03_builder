public class Main {

    public static void main(String[] args) {

        // Build a Robot with all properties using setters
        Robot robot1 = new Robot();
        robot1.setShield("Energy Shield");
        robot1.setGun("Plasma Cannon");
        robot1.setSword("Vibroblade");
        robot1.setBrainchip("AI Core v3.0");
        System.out.println("Robot 1 details:\n" + robot1.toString());

        // Build a Robot with RobotBuilder using fluent interface
        Robot robot2 = new RobotBuilder()
                .shield("Titanium Alloy")
                .gun("Laser Rifle")
                .sword(null)  // Set sword to null
                .brainchip("Military Grade Processor")
                .getResult();
        System.out.println("\nRobot 2 details:\n" + robot2.toString());

        // Dengan Builder Director
        RobotDirector director = RobotDirector.getInstance();

        Robot casualRobot = director.CasualRobot();
        System.out.println("\nCasual Robot");
        System.out.println(casualRobot);

//computer
        System.out.println("\n");
        ComputerSetBuilder builder = new ComputerSetBuilder();
        builder.keyboard("Mechanical Keyboard");
        builder.mouse("Gaming Mouse");
        builder.speaker("Stereo Speaker");
        builder.monitor("27-inch LCD Monitor");

        ComputerSet computerSet = builder.getResult();

        System.out.println("Computer Set Details:");
        System.out.println("------------");
        System.out.println("Keyboard: " + computerSet.getKeyboard());
        System.out.println("Mouse: " + computerSet.getMouse());
        System.out.println("Speaker: " + computerSet.getSpeaker());
        System.out.println("Monitor: " + computerSet.getMonitor());

        System.out.println("\n");

                // Build Paket Makanan with setters (similar to Robot 1)
                PaketMakanan paket1 = new PaketMakanan();
                paket1.setNasi("Nasi Kuning");
                paket1.setLauk("Ayam Goreng");
                paket1.setSayur("Tumis Kacang Panjang");
                paket1.setMinuman("Es Teh");
                System.out.println("Paket Makanan 1:\n" + paket1.toString());

                // Build Paket Makanan with PaketMakananBuilder (similar to Robot 2)
                PaketMakanan paket2 = new PaketMakananBuilder()
                        .nasi("Nasi Goreng")
                        .lauk("Telur Ceplok dan Sosis Bakar")
                        .sayur("Kerupuk")
                        .minuman("Jus Mangga")
                        .getResult();
                System.out.println("\nPaket Makanan 2:\n" + paket2.toString());

                // Build Paket Makanan with PaketMakananDirector (similar to using RobotDirector)
                PaketMakananDirector direktor = PaketMakananDirector.getInstance();

                PaketMakanan paketNasiPadang = direktor.PaketNasiPadang();
                System.out.println("\nPaket Nasi Padang:\n" + paketNasiPadang.toString());

            }
        }






