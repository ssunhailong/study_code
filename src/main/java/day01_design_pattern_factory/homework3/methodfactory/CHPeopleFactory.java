package day01_design_pattern_factory.homework3.methodfactory;

public class CHPeopleFactory implements IPeopleFactory {

    public IPeople create() {
        return new CHPeople();
    }
}

