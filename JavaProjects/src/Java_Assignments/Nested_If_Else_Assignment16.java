package Java_Assignments;

public class Nested_If_Else_Assignment16 {

	public static void main(String[] args) {
		int age = 25;

        if (age < 18) {
            System.out.println("You are a cjild.");
        } else {
            if (age >= 18 && age <= 35) {
                System.out.println("You are a young adult.");
            } else {
                if (age > 35 && age <= 60) {
                    System.out.println("You are an adult.");
                } else {
                    System.out.println("You are a senior citizen.");
                }
            }
        }
	}

}
