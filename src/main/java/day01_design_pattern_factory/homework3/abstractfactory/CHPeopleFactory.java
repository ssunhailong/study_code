package day01_design_pattern_factory.homework3.abstractfactory;

/**
 * 中国人
 */
public class CHPeopleFactory implements IPeopleFactory {

    public IEatFactory createEat() {
        return new CHEat();
    }

    public IColorFactory createColor() {
        return new CHColor();
    }
}
