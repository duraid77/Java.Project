package coding_bat;

 public abstract class Anim implements CanFly{
     public abstract void eat();

}
class Bird extends Anim implements CanFly{

    @Override
    public void eat() {

    }

    @Override
    public boolean flying() {
        return false;
    }
}
interface CanFly{
     boolean flying();
}
interface CanLiveInCold{
     void LiveInCold();
}
