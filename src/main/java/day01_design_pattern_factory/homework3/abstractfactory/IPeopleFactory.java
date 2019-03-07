package day01_design_pattern_factory.homework3.abstractfactory;

/**
 * 人
 */
public interface IPeopleFactory {

    public IEatFactory createEat();

    public IColorFactory createColor();
}
