package day01_design_pattern_factory.homework3.abstractfactory;

/**
 * 美国人食物
 */
public class ENEat implements IEatFactory {

    public void eat() {
        System.out.println("hamburger");
    }
}
