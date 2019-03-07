package day01_design_pattern_factory.homework3.simplefactory;

public class PeopleFactory {

    public IPeople createByType(String type){
        if (type.equals("EN")){
            return new ENPeople();
        }else if (type.equals("CH")){
            return new CHPeople();
        } else {
            return null;
        }
    }

    public IPeople createByClassName(String className){
        try {
            if (!(className ==null || className.equals(""))){
                return (IPeople) Class.forName(className).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public IPeople createByClass(Class<? extends IPeople> clazz){
        try {
            if (clazz != null){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
