package day01_design_pattern_factory.homework3.abstractfactory;

/**
 * 美国人
 */
public class ENPeopleFactory implements IPeopleFactory {

    public IEatFactory createEat() {
        return new ENEat();
    }

    public IColorFactory createColor() {
        return new ENColor();
    }
}
