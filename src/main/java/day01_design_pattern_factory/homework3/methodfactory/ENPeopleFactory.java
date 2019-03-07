package day01_design_pattern_factory.homework3.methodfactory;

public class ENPeopleFactory implements IPeopleFactory {

    public IPeople create() {
        return new ENPeople();
    }
}
