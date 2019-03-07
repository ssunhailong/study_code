package day01_design_pattern_factory.homework3.methodfactory;

public class MethodFactoryTest {

    public static void main(String[] args) {
        IPeopleFactory factory = new CHPeopleFactory();
        factory.create().color();

        factory = new ENPeopleFactory();
        factory.create().color();
    }
}
