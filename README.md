# MyMatrix - Calculator
 A Matrix Calculator built using Java that is capable of performing _FOUR main math operations_ on _TWO Matrices_. The program has been implemented using the OOP principles and it uses the LAMA library in order to perform a few steps of the Division Operation. 
***
## Class and Method Explanations

**1. MyMatrix Class:**
MyMatrix is the most and the Main class of the Program. This class contains all the necessary
methods in order to perform the asked operations. The program creates two Objects of this Class named
matrix1 and matrix2 respectively, each containing the dimensions of its array[][] variable.

**2. Constructor**
The constructor will be invoked when the two named objects above, are created. The
constructor accepts 2 Integer variable named row and column, and also, 2-dimensional double type
array. Once all three of these parameters are received successfully, they will be passed to Setter
methods.

**3. Setters:** _setRow, setColumn & setArray_
As their names suggest, each of these methods will set the passed variables to the instance
variables of the class. All of these methods are void and private methods so that they can’t be accesses
unless they are called by its own class.

**4. Setter:** _setElements_
The setElements method is only used when the Constructor is invoked. Whenever the new
object created, the constructor will call this Setter method to get the elements of the Array of the created
object.

**5. Getters:** _getElements, getDimension_
These two methods are used to print the elements of the Array of the used object and the
Dimension of the array whenever they are called.

**6. Operation Methods**

_- matrixAddition:_ This method is used to Add two Matrices. The method accepts
two objects of MyMatrix type as a parameter. Once the operation is Successful, the
method will print the newly created array, else, it will Print an Error Message.

_- matrixSubtraction:_ This method is used to Subtract two Matrices. The method
accepts two objects of MyMatrix type as a parameter. Once the operation is
Successful, the method will print the newly created array, else, it will Print an Error
Message.

_- matrixMultiplication:_ This method is used to Multiple two Matrices as its name
suggests. The method accepts two objects of MyMatrix type as a parameter. Once
the operation is Successful, the method will print the newly created array, else, it
will Print an error Message.

_- matrixDivision:_ This method is used to Divide two Matrices. The method accepts
two objects of MyMatrix type as a parameter. In Theory the Division is not really a
division but rather Multiplication of one matrix with the Inverse of the second
matrix. So, what I did is, import the Matrix Library called JAMA and used its, det(),
determinant method, inverse(), inverse method and print(), Print method to get the
result. Once the operation is Successful, the method will print the newly created
array, else, it will Print an error Message.

**7. Main Class**
Main Class obviously has the main method, also additional getArrayDimension and Public
Scanner object, input. main method is used to create an object by calling the MyMatrix and invoking
the Constructor. The passed parameters are instantiated in this main method. The getArrayDimension
method is used to get the Row and Column of the Object Array, later on which are passed to MyMatrix
class.

***

## Build Instructions

1. Make sure you have successfully installed the Latest Version of Java JDK. You may download it [_here_](https://www.oracle.com/my/java/technologies/downloads/).
2. Download the Repo source code files, including the JAMA library. 
3. Import the LAMA library to your IDE. 
4. If you have completed the above steps correctly, then you should be able to run it successfully. 

***

If you have suggestions, please feel free to contribute, looking forward to practice and learn more.
