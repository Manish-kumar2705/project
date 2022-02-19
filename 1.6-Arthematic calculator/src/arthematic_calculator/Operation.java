package arthematic_calculator;

final class Operation{	//final keyword--> this class can't be overridden
	
	double first,second;
	
	Operation(double first_num,double second_num){  //parameterized constructor definition
		this.first = first_num ;					//this keyword--> refers to the current instance of the class.
		this.second = second_num;
	}

	void addition(double first,double second){ 		
        int answer = (int) (first + second); 				//explicit type casting
        System.out.printf("Sum of %.2f and %.2f is: %d ", first, second ,answer);
    }

    public void subtraction(double first,double second){	//public access specifier
        double answer = first - second;
        System.out.printf("Subtraction of %.2f and %.2f is: %.2f ", first, second ,answer);
    }

    public void division(double first,double second){			
        double answer = first/second;						
        System.out.printf("Division of %.2f and %.2f is: %.2f ", first, second ,answer);
    }

    public void multiplication(double first,double second){
        double answer =first * second;
        System.out.printf("Multiplication of %.2f and %.2f is: %.2f ", first, second ,answer);
    }
    
}
