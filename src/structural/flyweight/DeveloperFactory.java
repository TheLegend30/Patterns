package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DeveloperFactory {
    private static final Map<String, Developer> developers = new HashMap<>();

    public Developer getDeveloperBySpeciality(String speciality) {
        Developer developer = developers.get(speciality);

        if (developer == null) {
            switch (speciality){
                case "java":
                    System.out.println("Hiring a Java Developer");
                    developer= new JavaDeveloper();
                    break;
                case "c++":
                    System.out.println("Hirirng a Cpp Developer");
                    developer = new CppDeveloper();
                    break;
            }
            developers.put(speciality, developer);
        }
        return developer;
    }
}
