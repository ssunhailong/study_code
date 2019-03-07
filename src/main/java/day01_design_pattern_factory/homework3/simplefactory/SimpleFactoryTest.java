package day01_design_pattern_factory.homework3.simplefactory;

import org.junit.Test;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        IPeople chPeople = new CHPeople();
        chPeople.color();
    }

    @Test
    public void testCreateByType(){
        PeopleFactory people = new PeopleFactory();
        people.createByType("CH").color();
    }

    @Test
    public void testCreateByClassName(){
        PeopleFactory peopleFactory = new PeopleFactory();
        IPeople people = peopleFactory.createByClassName("day01_design_pattern_factory.homework3.simplefactory.ENPeople");
        people.color();
    }

    @Test
    public void testCreateByClazz(){
        PeopleFactory peopleFactory = new PeopleFactory();
        IPeople people = peopleFactory.createByClass(CHPeople.class);
        people.color();
    }
}
