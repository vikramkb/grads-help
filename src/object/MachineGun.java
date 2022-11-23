package classes;

public class MachineGun {
    public void shoot() {
        System.out.println("Shooting only one bullet");
    }

    public void shoot(int bullets) {
        System.out.println("shooting " + bullets + " one by one");
    }

    public void shoot(boolean silencer) {
        if(silencer) {
            System.out.println("Shoot without noise");
        }else{
            shoot();
        }
    }
}
