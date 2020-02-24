import java.util.*;

public class WeekFour {


public static void main (String [] args) {

	
List<String> employeeNames = new ArrayList<String>();	

Set<Integer> ids = new HashSet<Integer>();

HashMap <String, Integer> employeeMap = new HashMap<>();

employeeNames.add("Michelle");
employeeNames.add("John");
employeeNames.add("Demetri");
employeeNames.add("Mark");
employeeNames.add("Matthew");

ids.add(111);
ids.add(222);
ids.add(337);
ids.add(122);
ids.add(555);

int i = 0;
for (int id : ids) {
	employeeMap.put(employeeNames.get(i), id);
	i++;
}

for (String name : employeeMap.keySet()) {
	System.out.println(name + employeeMap.get(name));
}


System.out.println(employeeMap);

//Problem 7

StringBuilder idsBuilder = new StringBuilder();

//Problem 8

for (int id : ids) {
	idsBuilder.append(id + "" + "-");
}

//Problem 9

System.out.println(idsBuilder);

//Problem 10

StringBuilder namesBuilder = new StringBuilder();

//Problem 11

for (String employee : employeeNames ) {
	namesBuilder.append(employee + " ");
}

//Problem 12

System.out.println(namesBuilder);
}


}