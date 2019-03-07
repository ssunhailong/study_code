package day01_design_pattern_factory.homework3.abstractfactory;

/**
 * 中国人食物
 */
public class CHEat implements IEatFactory {

    public void eat() {
        System.out.println("dumpling");
    }
}
