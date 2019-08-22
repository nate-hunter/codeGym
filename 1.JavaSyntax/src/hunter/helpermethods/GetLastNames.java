package hunter.helpermethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Can use `Collections.shuffle(names);`?

public class GetLastNames {

    public String getRandomLastName(){

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Hunter", "Melendez", "Ali", "Awaya", "McKissick", "Panda", "Kim", "Coffee", "Polar", "Suzuki", "Augusta", "Seltzer", "Avocado", "Diaz"));

        int randomIndex = (int) (Math.random() * names.size());

        String resultName = names.get(randomIndex);

        return resultName;
    }



}
