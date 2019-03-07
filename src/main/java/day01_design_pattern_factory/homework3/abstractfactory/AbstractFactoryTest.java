package day01_design_pattern_factory.homework3.abstractfactory;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        //中国人
        IPeopleFactory chPeople = new CHPeopleFactory();
        chPeople.createEat().eat();
        chPeople.createColor().color();

        //美国人
        IPeopleFactory enPeople = new ENPeopleFactory();
        enPeople.createEat().eat();
        enPeople.createColor().color();
    }
}
